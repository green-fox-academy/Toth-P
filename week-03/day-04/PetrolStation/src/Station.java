public class Station {
    int gasAmount;


    public void refil(Car car) {
        int fuelNeed = car.capacity - car.gasAmount;
        if (gasAmount == 0) {
            System.out.println("Out of Fuel.");
        } else if (gasAmount - fuelNeed > 0) {
            gasAmount = gasAmount - fuelNeed;

            car.gasAmount = car.gasAmount + fuelNeed;
        } else {
            car.gasAmount = car.gasAmount + gasAmount;
            gasAmount = gasAmount - gasAmount;
        }
    }

    public static void main(String[] args) {
        Station station1 = new Station();
        station1.gasAmount = 120;
        Car car1 = new Car();
        Car car2 = new Car();
        car2.gasAmount = 50;

        System.out.println(station1.gasAmount);
        station1.refil(car1);
        System.out.println(station1.gasAmount);
        station1.refil(car2);
        System.out.println(station1.gasAmount);
        station1.refil(car2);
        System.out.println(station1.gasAmount);

    }
}