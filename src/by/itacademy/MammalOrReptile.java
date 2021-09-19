package by.itacademy;

import java.util.Arrays;
import java.util.List;

public class MammalOrReptile {

    private static final List<String> mammals = Arrays.asList("Dog", "Monkey", "Platypus");
    private static final List<String> reptiles = Arrays.asList("Snake", "Lizard", "Turtle");

    public static void main(String[] args) {
        System.out.println(determineClassOfOrganism("Platypus"));
    }

    /**
     *
     * @param organism
     * @return Answer who is Platypus mammal or reptile.
     */
    private static String determineClassOfOrganism(String organism) {
        String classOfOrganism = "";
        if (organism == null || organism.equals("")) {
            classOfOrganism = "incorrect input";
        } else {
            if(mammals.stream().anyMatch(e -> e.contains(organism))){
                classOfOrganism = "mammals";
            }
            if(reptiles.stream().anyMatch(e -> e.contains(organism))){
                classOfOrganism = "reptiles";
            }
        }
        return classOfOrganism;
    }
}
