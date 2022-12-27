package Unit4Assessemnt;

public class Book {
    int pages;
    static String author;

    static {
        // Initialize the static variable 'author' to "Stephen King"
        author = "Stephen King";
    }

    public void set (int pages) {
        // Set the value of the 'pages' instance variable
        this.pages = pages;
    }

    public static void main(String[] args) {
        // Create two objects of the class 'Book'
        Book b1 = new Book();
        Book b2 = new Book();

        // Set the value of the 'pages' instance variable for the first object to 500
       // b1.set(500);
        b1.pages=500;
        b2.pages=500;

        // Set the value of the 'author' instance variable for the first object to "Christopher Paolini"
        b1.author = "Christopher Paolini";

        // Compare the values of the 'author' instance variables for the two objects
        System.out.print(b1.author.equals(b2.author) + " ");

        // Compare the values of the 'pages' instance variables for the two objects
        System.out.print(b1.pages == b2.pages);
    }
}

