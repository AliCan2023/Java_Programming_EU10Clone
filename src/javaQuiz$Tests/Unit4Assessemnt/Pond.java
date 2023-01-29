package javaQuiz$Tests.Unit4Assessemnt;

public class Pond {
    static Water water;

    public Pond (String color){
        water = new Water(color);
    }
}
class Water{
    String color;
    public Water(String color){
        this.color = color;
    }
}
