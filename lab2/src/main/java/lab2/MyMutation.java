package lab2;

import org.uncommons.watchmaker.framework.EvolutionaryOperator;

import java.util.List;
import java.util.Random;

public class MyMutation implements EvolutionaryOperator<double[]> {
    public List<double[]> apply(List<double[]> population, Random random) {
        for (double[] individual : population)
            for (int i = 0; i < individual.length; i++) // all dimensions
            {
                individual[i] = (random.nextDouble() * 10) -5; // setting a new value from -5.0 to 5.0

            }

        return population;
    }
}
