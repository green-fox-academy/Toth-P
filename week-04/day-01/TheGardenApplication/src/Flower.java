public class Flower extends Plant {

    public Flower( String color) {
        super( color);

    }

    @Override
    public String getType() {
        return "Flower";
    }

    @Override
    public double GetAbsorb(){
        return 0.75;
    }
    @Override
    public double GetNeedWater(){
        return 5;
    }

}
