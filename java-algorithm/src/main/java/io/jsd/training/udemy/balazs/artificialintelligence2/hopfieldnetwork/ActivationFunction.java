package io.jsd.training.udemy.balazs.artificialintelligence2.hopfieldnetwork;

public class ActivationFunction {

	public static int stepFunction(double x) {
		
		if( x >= 0 )
			return 1;
		
		return -1;
	}
}
