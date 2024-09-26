public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private double price;
    private boolean isPaperback;  // true if the book is paperback, false if it is hardcover

    public Book(String title, String author, int yearPublished, double price, boolean isPaperback) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
        this.isPaperback = isPaperback;
        
        // Use validity methods during construction
        validateBookDetails();
    }

    // Getter and Setter methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        if (!isTitleValid()) {
            System.out.println("Invalid title!");
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
        if (!isAuthorValid()) {
            System.out.println("Invalid author!");
        }
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
        if (!isYearPublishedValid()) {
            System.out.println("Invalid year published!");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        if (!isPriceValid()) {
            System.out.println("Invalid price!");
        }
    }

    public boolean isPaperback() {
        return isPaperback;
    }

    public void setPaperback(boolean isPaperback) {
        this.isPaperback = isPaperback;
    }

    // Method to print book details
    public void printBookDetails() {
        if (validateBookDetails()) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Year Published: " + yearPublished);
            System.out.println("Price: $" + price);
        } else {
            System.out.println("Cannot print book details. Some fields are invalid.");
        }
    }

    // Validity checks
    public boolean isPriceValid() {
        return price > 0;
    }

    public boolean isTitleValid() {
        return title != null && !title.isEmpty();
    }

    public boolean isAuthorValid() {
        return author != null && !author.isEmpty();
    }

    public boolean isYearPublishedValid() {
        return yearPublished > 0;
    }

    // General validation method that checks all fields
    private boolean validateBookDetails() {
        boolean isValid = true;
        
        if (!isTitleValid()) {
            System.out.println("Invalid title!");
            isValid = false;
        }

        if (!isAuthorValid()) {
            System.out.println("Invalid author!");
            isValid = false;
        }

        if (!isYearPublishedValid()) {
            System.out.println("Invalid year published!");
            isValid = false;
        }

        if (!isPriceValid()) {
            System.out.println("Invalid price!");
            isValid = false;
        }

        return isValid;
    }
}
