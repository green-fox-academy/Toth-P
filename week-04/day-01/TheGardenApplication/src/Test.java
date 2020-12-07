import java.sql.SQLOutput;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {


        Flower flower1 = new Flower("yellow");
        Flower flower2 = new Flower("blue");
        Tree tree1 = new Tree("purple");
        Tree tree2 = new Tree("orange");

        Garden garden = new Garden();
        garden.addPlant(flower1);
        garden.addPlant(flower2);
        garden.addPlant(tree1);
        garden.addPlant(tree2);


        garden.wateringWith(40);
        garden.gardenInfo();
        System.out.println();

        garden.wateringWith(70);
        garden.gardenInfo();

    }

}
