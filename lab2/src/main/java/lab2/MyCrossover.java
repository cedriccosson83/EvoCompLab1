package lab2;

import org.uncommons.watchmaker.framework.operators.AbstractCrossover;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyCrossover extends AbstractCrossover<double[]> {
    protected MyCrossover() {
        super(1);
    }

    protected List<double[]> mate(double[] p1, double[] p2, int i, Random random) {
        ArrayList children = new ArrayList();


        for(int j=0; j<i; j++) {
            int indice = random.nextInt(p1.length - 1 );
            double p1Temp = p1[indice];
            p1[indice] = p2[indice];
            p2[indice] = p1Temp;
        }

        // your implementation:

        children.add(p1);
        children.add(p2);
        return children;
    }
}