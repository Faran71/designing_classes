public class Rectangle {

    private final int length;
    private final int width;

    public Rectangle(int length,int width){
        this.length = length;
        this.width = width;
    }

    public int areaRectangle(){
        return (this.length * this.width);
    }

    public boolean ifSquare(){
        return this.length == this.width;
    }
}
