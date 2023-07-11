public class Rectangle {

    private int length;
    private int width;

    public Rectangle(int length,int width){
        this.length = length;
        this.width = width;
    }

    public int areaRectangle(){
        return this.length * this.width;
    }
    public boolean ifSquare(){
        if (this.length == this.width){
            return true;
        } else{
            return false;
        }
    }
}
