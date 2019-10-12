package lab2;

import org.uncommons.watchmaker.framework.EvolutionaryOperator;

import java.util.List;
import java.util.Random;

public class MyMutation implements EvolutionaryOperator<double[]> {
    private int counter = 0;
    private int converge;

    public MyMutation(int converge) {
        this.converge = converge;
    }

    public List<double[]> apply(List<double[]> population, Random random) {
        //int size = population.get(0).length;
        counter++;
        double mut_proba = 0.4;
        double mut_strength = 0.15 * (1.0 - (double) counter / (double)converge) +0.01;
        double sigma = 0.5 *(1.0 - (double) counter / (double)converge) +0.01;

        for (double[] individual : population)
            if (random.nextDouble() < mut_proba)
                for (int i = 0; i < individual.length; i++) // all dimension
                    if (random.nextDouble() < mut_strength)
                        individual[i] = random.nextGaussian() * sigma;

        return population;
    }
}
