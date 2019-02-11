package validators;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Property;

import gsn.gsn.Associations.InContextOf;
import gsn.gsn.Associations.NaryInContextOf;
import gsn.gsn.Associations.NarySupportedBy;
import gsn.gsn.Associations.OptionnalInContextOf;
import gsn.gsn.Associations.OptionnalSupportedBy;
import gsn.gsn.Associations.SupportedBy;
import validators.interfaces.Validator;

public class ValidatorUtils {
	public static void checkAndRegister(InContextOf inContextOf) {
		if (inContextOf == null || inContextOf.getBase_Association() == null) {
			return;
		}
		checkAndRegister(inContextOf.getBase_Association(), ValidatorsFactory.inContextOfValidator());
	}
	
	public static void checkAndRegister(OptionnalInContextOf inContextOf) {
		if (inContextOf == null || inContextOf.getBase_Association() == null) {
			return;
		}
		checkAndRegister(inContextOf.getBase_Association(), ValidatorsFactory.inContextOfValidator());
	}
	
	public static void checkAndRegister(NaryInContextOf inContextOf) {
		if (inContextOf == null || inContextOf.getBase_Association() == null) {
			return;
		}
		checkAndRegister(inContextOf.getBase_Association(), ValidatorsFactory.inContextOfValidator());
	}
	
	public static void checkAndRegister(SupportedBy supportedBy) {
		if (supportedBy == null || supportedBy.getBase_Association() == null) {
			return;
		}
		checkAndRegister(supportedBy.getBase_Association(), ValidatorsFactory.supportedByValidator());
	}
	
	public static void checkAndRegister(OptionnalSupportedBy supportedBy) {
		if (supportedBy == null || supportedBy.getBase_Association() == null) {
			return;
		}
		checkAndRegister(supportedBy.getBase_Association(), ValidatorsFactory.supportedByValidator());
	}
	
	public static void checkAndRegister(NarySupportedBy supportedBy) {
		if (supportedBy == null || supportedBy.getBase_Association() == null) {
			return;
		}
		checkAndRegister(supportedBy.getBase_Association(), ValidatorsFactory.supportedByValidator());
	}
	
	private static void checkAndRegister(Association a, Validator validator) {
		if (! validator.validate(a)) {
			deleteAssociation(a);
		} else {
			Adapter adapter = newAdapter(a, validator);
			for (Property p: a.getMemberEnds()) {
				p.eAdapters().add(adapter);
			}
		}
	}
	
	public static Adapter newAdapter(Association monitoredAssociation, Validator validator) {
		return new Adapter() {
			@Override
			public void notifyChanged(Notification notification) {
				System.err.println("notification: " + notification);
				if (notification.getEventType() != Notification.SET ||
					!(notification.getNotifier() instanceof Property)) {
					return;
				}
				Association a = ((Property) notification.getNotifier()).getAssociation();
				if (a != null && a == monitoredAssociation && ! validator.validate(a)) {
					deleteAssociation(a);
				}
			}

			@Override
			public Notifier getTarget() { return null; }

			@Override
			public void setTarget(Notifier newTarget) { }

			@Override
			public boolean isAdapterForType(Object type) { return false; }
		};
	}
	
	public static void deleteAssociation(Association a) {
		for (Property p: a.getMemberEnds()) {
			EcoreUtil.delete(p);
		}
		EcoreUtil.delete(a);
	}
}
