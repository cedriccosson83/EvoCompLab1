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

        int size = p1.length;
        double[] C1 = new double[size];
        double[] C2 = new double[size];

        int indice = random.nextInt(size-1);

        for(int j=0; j<size; j++) {
            if (j < indice) {
                C1[j] = p1[j];
                C2[j] = p2[j];
            } else {
                C2[j] = p1[j];
                C1[j] = p2[j];
            }
        }

        children.add(C1);
        children.add(C2);
        return children;
    }
}