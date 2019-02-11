package validators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ValidatorsFactory {
	private static final String GOAL = "Goal";
	private static final String STRATEGY ="Strategy";
	private static final String SOLUTION = "Solution";
	private static final String CONTEXT ="Context";
	private static final String ASSUMPTION ="Assumption";
	private static final String JUSTIFICATION ="Justification";
	private static final String AWAY_GOAL ="AwayGoal";
	private static final String AWAY_CONTEXT ="AwayContext";
	private static final String AWAY_SOLUTION = "AwaySolution";
	private static final String MODULE ="Module";
	private static final String CONTRACT_MODULE = "CONTRACT_MODULE";
	
	public static AssociationValidator inContextOfValidator() {
		HashMap<String, List<String>> relations = new HashMap<>();
		ArrayList<String> goalTargets = new ArrayList<>(Arrays.asList(
				CONTEXT, ASSUMPTION, JUSTIFICATION, AWAY_GOAL, AWAY_CONTEXT, MODULE
		));
		ArrayList<String> strategyTargets = new ArrayList<>(Arrays.asList(
				CONTEXT, ASSUMPTION, JUSTIFICATION, AWAY_GOAL, AWAY_CONTEXT, MODULE
		));
		relations.put(GOAL, goalTargets);
		relations.put(AWAY_GOAL, goalTargets);
		relations.put(STRATEGY, strategyTargets);
		return new AssociationValidator(relations);
	}
	
	public static AssociationValidator supportedByValidator() {
		HashMap<String, List<String>> relations = new HashMap<>();
		ArrayList<String> goalTargets = new ArrayList<>(Arrays.asList(
				GOAL, STRATEGY, SOLUTION, AWAY_GOAL, AWAY_SOLUTION, MODULE, CONTRACT_MODULE
		));
		ArrayList<String> strategyTargets = new ArrayList<>(Arrays.asList(
				GOAL, AWAY_GOAL, AWAY_SOLUTION, MODULE, CONTRACT_MODULE
		));
		relations.put(GOAL, goalTargets);
		relations.put(AWAY_GOAL, goalTargets);
		relations.put(STRATEGY, strategyTargets);
		return new AssociationValidator(relations);
	}
}
