public class Computer {

    private int storage;
    private String model;


    public Computer(int storage, String model){
        this.storage = storage;
        this.model = model;
    }

    public int dispStorage(){
        return this.storage;
    }

    public void addStorage(int addition){
        this.storage = this.storage + addition;
    }

    public String printerInfo(){
        return this.model;
    }
}
