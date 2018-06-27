package p17_PizzaCalories;


import java.util.HashMap;
import java.util.Map;

public class Dough {
    private static final Map<String, Double> DOUGH_MODIFIERES = new HashMap<>() {{
        put("White", 1.5);
        put("Wholegrain", 1.0);
        put("Crispy", 0.9);
        put("Chewy", 1.1);
        put("Homemade", 1.0);

    }};
    private String flourType;
    private String bakingTechnique;
    private double weight;

    protected Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    private void setFlourType(String flourType) {
        if (DOUGH_MODIFIERES.containsKey(flourType)) {
            this.flourType = flourType;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setBakingTechnique(String bakingTechnique) {
        if (DOUGH_MODIFIERES.containsKey(bakingTechnique)) {
            this.bakingTechnique = bakingTechnique;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    public double getDoughCalories() {
        double calories;
        calories = (2 * this.weight) * DOUGH_MODIFIERES.get(flourType) * DOUGH_MODIFIERES.get(bakingTechnique);
        return calories;
    }
}
