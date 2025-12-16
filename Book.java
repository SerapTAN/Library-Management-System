public class Book extends Item {
    private static final double MAX_BOOK_PRICE = 100.00;
    private String title;
    private String author;
    private int date;
    private static int bookCount = 0;
    
    public Book() { bookCount++; }
    
    public Book(String title, String author, int date, double price, int inStock) {
        setTitle(title);
        setAuthor(author);
        setDate(date);
        setPrice(price);
        setInStock(inStock);
        bookCount++;
    }
    
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getDate() { return date; }
    public static int getBookCount() { return bookCount; }
    
    public String setTitle(String title) { 
        this.title = title;
        return this.title;
    }
    
    public String setAuthor(String author) { 
        this.author = author;
        return this.author;
    }
    
    public int setDate(int date) { 
        this.date = date;
        return this.date;
    }
    
    @Override
    public double setPrice(double price) {
        if (price < 0) {
            this.price = 0.00;
            System.out.println("Negative price not allowed");
        }
        else if (price > MAX_BOOK_PRICE) {
            this.price = MAX_BOOK_PRICE;
            System.out.println("Attempted to set price too high");
        }
        else {
            this.price = price;
        }
        return this.price;
    }
    
    @Override
    public String toString() {
        return String.format("%6.2f %s, by %s", getPrice(), getTitle(), getAuthor());
    }
}