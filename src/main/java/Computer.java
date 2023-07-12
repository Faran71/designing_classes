public class Computer {

    private int storage;
    private String printer;


    public Computer(int storage){
        this.storage = storage;
        this.printer = null;
    }

    public int dispStorage(){
        return this.storage;
    }

    public void addStorage(int addition){
        this.storage = this.storage + addition;
    }

    public void addPrinter(String printerName){
        this.printer = printerName;
    }

    public String printerInfo(){
        return this.printer;
    }

    public String printMessage(){
        if (this.printer == (null)){
            return "";
        } else {
            return "Printer Connected";
        }
    }


}
