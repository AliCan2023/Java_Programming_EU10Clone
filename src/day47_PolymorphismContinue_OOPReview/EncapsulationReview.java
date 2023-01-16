package day47_PolymorphismContinue_OOPReview;

public class EncapsulationReview {
    private String bookTitle;
    private final String publishedDate;

    public EncapsulationReview(String bookTitle, String publishedDate) {
        //this.bookTitle = bookTitle;// this passes that it has;
        setBookTitle(bookTitle);// you can check the condition;
        this.publishedDate = publishedDate;
    }

    public String getBookTitle() {
        if ((bookTitle==null)){//null keyword means there is no object at all and throws NullPointerException;
            return ""; // returning empty string it is at least an object that you can call or read the instances of the object;
                      // preventing the NullPointerException;
        }
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        if (bookTitle ==null || bookTitle.isEmpty()){
            throw new RuntimeException("Invalid Book Title.");
        }
        this.bookTitle = bookTitle;
    }

    public String getPublishedDate() {
        return publishedDate;
    }
}
