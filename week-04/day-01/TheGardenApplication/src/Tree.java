public class Tree extends Plant {

    public Tree(String color) {
        super(color);

    }

    @Override
    public String getType() {
        return "Tree";
    }

    @Override
    public double GetAbsorb() {
        return 0.4;
    }

    @Override
    public double GetNeedWater() {
        return 10.0;
    }


}
