import java.util.ArrayList;

public class ShoppingTrolley {

    ArrayList<String> trolley ;

    public ShoppingTrolley(){
        this.trolley = new ArrayList<String>();

    }

    public void addToTrolley(String newItem){
        this.trolley.add(newItem);
    }

    public int counterItems(){
        return this.trolley.size();
    }

    public boolean checkItem(String item){
        if (this.trolley.contains(item)){
            return true;
        } else {
            return false;
        }
    }
}
