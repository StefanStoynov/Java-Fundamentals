package p05_PizzaCalories;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dough {
    private static final List<String> FLOUR_TYPES = List.of("White", "Wholegrain");
    private static final List<String> DOUGH_TEXHNIQUES = List.of("Crispy", "Chewy", "Homemade");
    private static final Map<String, Double> DOUGH_MODIFIRE = new HashMap<>() {{
        put("White", 1.5);
        put("Wholegrain", 1.0);
        put("Crispy", 0.9);
        put("Chewy", 1.1);
        put("Homemade", 1.0);
    }};

    private String flourType;
    private String bakingTehnique;
    private double weight;

    public Dough(String flourType, String bakingTehnique, double weight) {

        this.setFlourType(flourType);
        this.setBakingTehnique(bakingTehnique);
        this.setWeight(weight);
    }

    public void setFlourType(String flourType) {
        if (!FLOUR_TYPES.contains(flourType)) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.flourType = flourType;

    }

    public void setWeight(double weight) {
        if (weight < 1 || weight > 200){
            throw new IndexOutOfBoundsException("Dough weight should be in the range [1..200].");
        }
            this.weight = weight;
    }

    public void setBakingTehnique(String bakingTehnique) {
        if (!DOUGH_TEXHNIQUES.contains(bakingTehnique)) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.bakingTehnique = bakingTehnique;
    }

    public double calculateCalories() {
        return PizzaConstants.DEFAULT_CALORIES
                * this.weight
                * DOUGH_MODIFIRE.get(this.flourType)
                * DOUGH_MODIFIRE.get(this.bakingTehnique);
    }
}
