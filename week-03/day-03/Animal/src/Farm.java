import java.util.ArrayList;

public class Farm {
    //    it has list of Animals
    //    it has slots which defines the number of free places for animals
    //    breed() -> creates a new animal if there's place for it
    //    slaughter() -> removes the least hungry animal

    int slots = 20;


    public ArrayList<Animal> AnimalsList;

    public Farm() {
        AnimalsList = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        AnimalsList.add(animal);
        slots = slots - 1;
    }

    public void breed() {
        if (slots > 0) {
            AnimalsList.add(new Animal());
            slots = slots - 1;
        } else {
            System.out.println("No room");
        }
    }

    public void slaughter() {
        int hungry = AnimalsList.get(0).hunger;

        for (int i = 0; i < AnimalsList.size(); i++) {

            int animalToSlaught = 0;
            if (hungry < AnimalsList.get(i).hunger) {
                hungry = AnimalsList.get(i).hunger;
                animalToSlaught = i;
            }
            AnimalsList.remove(animalToSlaught);
            slots++;

        }
    }

}
