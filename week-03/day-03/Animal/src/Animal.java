public class Animal {

//      - Every animal has a `hunger` value, which is a whole number
//      - Every animal has a `thirst` value, which is a whole number
//      - when creating a new animal object these values are created with the default
//          `50` value
//      - Every animal can `eat()` which decreases their hunger by one
//      - Every animal can `drink()` which decreases their thirst by one
//      - Every animal can `play()` which increases both by one

    int hunger = 50;
    int thirst = 50;

    public void eat() {

        hunger = hunger - 1;
    }

    public void drink() {

        thirst = thirst - 1;
    }

    public void play() {

        hunger = hunger + 1;
        thirst = thirst + 1;
    }

    public static void main(String[] args) {

        Animal animal1 = new Animal();

        animal1.play();

        animal1.eat();

        animal1.drink();

        Farm animalList = new Farm();
        animalList.addAnimal(animal1);

        animalList.breed();

        System.out.println(animalList.slots);
        System.out.println(animalList.AnimalsList.size());

        animalList.slaughter();
        System.out.println(animalList.slots);
        System.out.println(animalList.AnimalsList.size());
    }

}
