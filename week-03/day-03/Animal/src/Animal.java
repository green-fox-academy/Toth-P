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
        System.out.println(animal1.hunger);
        System.out.println(animal1.thirst);

        animal1.play();
        System.out.println(animal1.hunger);
        System.out.println(animal1.thirst);

        animal1.eat();
        System.out.println(animal1.hunger);
        System.out.println(animal1.thirst);


        animal1.drink();
        System.out.println(animal1.hunger);
        System.out.println(animal1.thirst);

    }

}
