package day42_ExceptionsContinue;

class ReadyException extends RuntimeException { // once you extend the class  to parent class it passes all the characters to the child; in this case the class becomes  an Exception class;


    public ReadyException(String message) {// call the constructor of parent class;
        //System.out.println("It is time for break.");// this directly prints but not in the message of exception way;
        super(message);// we have the message variable from the parent class you can pass this message to the grandchild class and has right to create a message below;
    }

    public ReadyException() {
        super("Time for a short break.");//if you directly pass the message it is accepted as  the unchecked exception message below and print it out;
    }

}

class NoBreakException extends Exception {// cannot throw the exceptions unless you handle the checked exception;

}

public class CustomExceptions {
    public static void main(String[] args) {

        //throw new ReadyException(" It is time to go");// once you directly pass the String argument it gives you error here;

        //throw new ReadyException("It is time for break now.");// call the  first constructor from ReadyException Class;
        //throw new ReadyException();// this default constructor calls the second constructor from the parent class and passes the message what the super() contains;
        try {
            throw new NoBreakException(); //checked exception cannot be called unless handled thus the fastest way to handle it using throws keyword;


        } catch (NoBreakException e) {
            e.printStackTrace();
        }


    }
}
