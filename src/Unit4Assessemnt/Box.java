package Unit4Assessemnt;

public class Box {
    double width;
    double length;

    public String print (){
        return "width: " + width + ", Length:" + length;
    }
    public void setInfo(double width,double length){
        this.width = width;
        this.length= length;
    }
}
class UseBox {
    public static void main(String[] args) {
        Box box = new Box();
        box.setInfo(5,11);
        System.out.println(box);
    }
}
