import java.util.ArrayList;

public class Garden {

    private ArrayList<Plant> garden;

    public Garden() {
        garden = new ArrayList<>();
    }

    public void addPlant(Plant plant) {
        garden.add(plant);
    }

    public int numberOfPlantsToWater() {
        int number = 0;
        for (int i = 0; i < garden.size(); i++) {
            if (garden.get(i).shouldBeWatered()) {
                number++;
            }
        }
        return number;
    }

    public void wateringWith(int liter) {
        double literPerPlant = (double)liter / numberOfPlantsToWater();
        for (int i = 0; i < garden.size(); i++) {
            if (garden.get(i).shouldBeWatered()) {
                double literAbsorbed = literPerPlant * garden.get(i).GetAbsorb();
                int waterAmount = garden.get(i).getCurrentWaterAmount() + (int)literAbsorbed;
                garden.get(i).setCurrentWaterAmount(waterAmount);
            }
        }
    }

   public void gardenInfo(){
       for (int i = 0; i < garden.size() ; i++) {
           garden.get(i).info();
       }
   }


}
