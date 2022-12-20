package day40_ProtectedAccesModifier_FinalKeyword;

import day39_Recap.shapeTask.Circle;
import day39_Recap.shapeTask.Square;

public class EncapsulationReview {
    private Circle circle;
    private Square square;

    public Circle getCircle(){ // getter return type has to match with private data type;
        return circle;
    }
    public void setCircle(Circle circle){// what is the rule of the setter  parameter?: Data type of the parameter has to match with its private variable data type;
        if (circle.getRadius()< 5){ // argument radius is: circle.getRadius();

        }
        this.circle= circle;

    }

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }
    // why the getters and setters Access Modifier is public? if we use the default access modifier the visibility is only within the package;
    // only the way get through the private variable with more visibility  is by getter and setter method the type of the Access Modifier of the  method must be public;

}
