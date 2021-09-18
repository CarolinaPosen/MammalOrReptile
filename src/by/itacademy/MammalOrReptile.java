package by.itacademy;

public class MammalOrReptile {
    public static void main(String[] args) {
        System.out.println(determineClassOfOrganism(""));
    }

    private static String determineClassOfOrganism(String organism) {
        String classOfOrganism = "";
        if (organism == null || organism.equals("")) {
            classOfOrganism = "incorrect input";
        } else {
            classOfOrganism = (true) ? "Mammal" : "Reptile";
        }
        return classOfOrganism;
    }
}
