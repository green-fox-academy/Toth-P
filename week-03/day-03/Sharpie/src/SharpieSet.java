import java.util.ArrayList;

public class SharpieSet {
        //    it contains a list of Sharpie
        //    countUsable() -> sharpie is usable if it has ink in it
        //    removeTrash() -> removes all unusable sharpies


    public ArrayList<Sharpie> sharpieSetList;

    public SharpieSet(){
        sharpieSetList = new ArrayList<>();
    }

    public void addSharpie (Sharpie sharpie){
        sharpieSetList.add(sharpie);
    }

    public int countUsuable(){
        int usuable=0;
        for (Sharpie sharpie : sharpieSetList){
            if(sharpie.inkAmount>0){
                usuable++;
            }
        }
        return usuable;
    }

    public void removeTrash(){
        for(int i = 0; i< sharpieSetList.size(); i++){
            if(sharpieSetList.get(i).inkAmount==0){
                sharpieSetList.remove(i);
            }
        }
    }

    public int getSize()
    {
        return sharpieSetList.size();
    }
}
