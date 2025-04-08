package Pr8;

import java.util.TreeSet;

public class ForestManagement {
    public static void main(String[] args) {
        TreeSet<AbstractTree> forest = new TreeSet<>();

        forest.add(new ConiferousTree("Сосна", 5.0));
        forest.add(new DeciduousTree("Береза", 6.0));
        forest.add(new ConiferousTree("Ель", 4.5));

        for (AbstractTree tree : forest) {
            System.out.println(tree);
        }
    }
}