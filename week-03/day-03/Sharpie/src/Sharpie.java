public class Sharpie {

//      - We should know about each sharpie their `color` (which should be a string),
//            `width` (which will be a floating point number), `inkAmount` (another
//             floating point number)
//       - When creating one, we need to specify the `color` and the `width`
//       - Every sharpie is created with a default 100 as `inkAmount`
//       - We can `use()` the sharpie objects
//           - which decreases inkAmount

    String color;
    double width;
    double inkAmount = 100.0;

    public Sharpie(String color, double width) {
        this.color = color;
        this.width = width;
    }

    public void use() {
        inkAmount--;
    }

    public static void main(String[] args) {
        var pen1 = new Sharpie("orange", 20.0);
        pen1.use();
        Sharpie pen2 = new Sharpie("black", 20.0);
        Sharpie pen3 = new Sharpie("black", 20.0);
        Sharpie pen4 = new Sharpie("black", 20.0);
        Sharpie pen5 = new Sharpie("black", 20.0);

        pen5.inkAmount = 0;

        System.out.println(pen1.inkAmount);
        System.out.println(pen1.color);
        System.out.println(pen1.width);

        SharpieSet sharpieSet = new SharpieSet();
        sharpieSet.addSharpie(pen1);
        sharpieSet.addSharpie(pen2);
        sharpieSet.addSharpie(pen3);
        sharpieSet.addSharpie(pen4);
        sharpieSet.addSharpie(pen5);


        System.out.println(sharpieSet.countUsuable());
        sharpieSet.removeTrash();
        System.out.println(sharpieSet.getSize());

    }
}
