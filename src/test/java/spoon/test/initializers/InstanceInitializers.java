package spoon.test.initializers;

import java.util.ArrayList;
import java.util.List;

public class InstanceInitializers {
	
	List<Double> l = new ArrayList<Double>() {
        final static double PI = 3.14;
        final double PI2 = 3.14;
        double PI3 = 3.14;
        { add(12.0); add(15.0); add(PI); add(PI2); add(PI3); }};
	
}
