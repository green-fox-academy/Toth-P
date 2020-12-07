public class Plant {

    private String color;
    private double currentWaterAmount = 0.0;

    public Plant(String color) {
        this.color = color;
    }

    public String getType() {
        return "no type";
    }

    public double GetAbsorb() {
        return 0.0;
    }

    public double GetNeedWater() {
        return 0.0;
    }

    public double currentWaterAmount() {
        return this.currentWaterAmount;
    }

    public void waterAmountAdder(double water) {
        this.currentWaterAmount = this.currentWaterAmount + water;
    }


    public boolean shouldBeWatered() {
        if (this.currentWaterAmount() < this.GetNeedWater()) {
            return true;
        }
        return false;
    }

    public String need() {
        if (this.currentWaterAmount < this.GetNeedWater()) {
            return "need water";
        }
        return "doesn't need water";
    }

    public void info() {
        System.out.println("The " + this.color + " " + this.getType() + " " + this.need());
    }


}
