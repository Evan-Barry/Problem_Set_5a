public class Book {
    private String title;
    private int numPages;
    private String isbn;
    private double price;

// accessor and mutator methods

    // accessor method
    public String getTitle() {
        return title;
    }

    //mutator method
    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public Book(String title, int numPages)
    {
        setTitle(title);
        setNumPages(numPages);
    }

    public String toString()
    {
        return "Name of book:\t" + getTitle() +
                "\nNumber of pages:\t" + getNumPages();
    }
}
