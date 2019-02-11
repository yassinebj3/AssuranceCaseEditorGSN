package validators;

import java.util.List;
import java.util.HashMap;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

import validators.interfaces.Validator;

public class AssociationValidator implements Validator {
	private final int ORIGIN_ID = 1;
	private final int TARGET_ID = 0;
	
	private HashMap<String, List<String>> allowed;
	
	public AssociationValidator(HashMap<String, List<String>> allowedAssociations) {
		this.allowed = allowedAssociations;
	}

	@Override
	public boolean validate(Association a) {
		// this condition is only true when deleting an association. 
		// returning false would generate an infinite deletion cycle
		if (a.getMemberEnds().size() < 2) {
			return true;
		}
		if (isNary(a)) {
			return validateNary(a);
		}
		boolean result = validateOriginAndTarget(originStereotype(a), targetStereotype(a));
		/*if (! result) {
			System.err.println("STEREOTYPES: " + originStereotype(a) + " " + targetStereotype(a));
			System.err.println("ORIGIN: " + a.getMemberEnds().get(ORIGIN_ID));
			System.err.println("TARGET: " + a.getMemberEnds().get(TARGET_ID));
		}*/
		return validateOriginAndTarget(originStereotype(a), targetStereotype(a));
	}
	
	private boolean validateNary(Association a) {
		if (! isNary(a)) {
			return false;
		}
		Association baseAssociation = ((Association) a.getMemberEnds().get(ORIGIN_ID).getType());
		if (isNary(baseAssociation)) {
			return false;
		}
		return validateOriginAndTarget(originStereotype(baseAssociation), targetStereotype(a));
	}
	
	/*
	 * Checks the origin's and the target's names against the set of allowed (origin, target) pairs. 
	 */
	private boolean validateOriginAndTarget(String origin, String target) {
		if (origin.isEmpty() || target.isEmpty() || origin == null || target == null) {
			return true;
		}
		if (allowed.keySet().contains(origin)) {
			return false;
		}
		return allowed.get(origin).contains(target);
	}
	
	/*
	 * Returns true if the origin of a is an association.
	 */
	private boolean isNary(Association a) {
		return (a.getMemberEnds().get(ORIGIN_ID).getType() instanceof Association);
	}
	
	/*
	 * Returns a list of the names of the stereotypes applied to the origin of
	 * the association.
	 */
	protected String originStereotype(Association a) {
		return endStereotypes(a, ORIGIN_ID);
	}
	
	/*
	 * Returns a list of the names of the stereotypes applied to the target of
	 * the association.
	 */
	protected String targetStereotype(Association a) {
		return endStereotypes(a, TARGET_ID);
	}
	
	/*
	 * Returns a list of the names of the stereotypes applied to the end of index 'end'.
	 */
	private String endStereotypes(Association a, int end) {
		if (a == null || a.getMemberEnds().get(end) == null) {
			return "";
		}
		Type endType = a.getMemberEnds().get(end).getType();
		if (endType.getAppliedStereotypes().size() == 0) {
			return "";
		} else {
			return endType.getAppliedStereotypes().get(0).getName();
		}
	}
}