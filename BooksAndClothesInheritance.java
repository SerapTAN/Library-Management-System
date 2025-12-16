public class BooksAndClothesInheritance {
    private static final Book[] BOOK_LIST = {
        new Book("ULYSSES", "James Joyce", 1918, 32.95, 16),
        new Book("THE GREAT GATSBY", "F. Scott Fitzgerald", 1925, 13.95, 30),
        new Book("BRAVE NEW WORLD", "Aldous Huxley", 1931, 14.95, 28)
    };
    
    private static final Shirt[] SHIRT_LIST = {
        new Shirt("T-shirt", "Guess", "M", "Blue", 14.95, 23),
        new Shirt("Dress shirt", "Ralph Lauren", "L", "White", 39.95, 5),
        new Shirt("Blouse", "Versace", "S", "Yellow", 44.95, 6)
    };
    
    private static final Pants[] PANTS_LIST = {
        new Pants("Jeans", "Levi's", "32", "30", "Blue", 59.95, 8),
        new Pants("Chinos", "Dockers", "34", "32", "Khaki", 49.95, 12),
        new Pants("Sweatpants", "Adidas", "M", "L", "Black", 34.95, 15)
    };
    
    public static void main(String[] args) {
        // Display books
        System.out.println("Books:");
        for (int i = 0; i < BOOK_LIST.length; i++) {
            System.out.printf("%3d  %7.2f  %-30.30s\n", 
                BOOK_LIST[i].getInStock(), BOOK_LIST[i].getPrice(), BOOK_LIST[i].getTitle());
        }
        
        // Display shirts
        System.out.println("\nShirts:");
        for (Shirt s : SHIRT_LIST) {
            System.out.printf("%3d  %7.2f  %-30.30s\n", 
                s.getInStock(), s.getPrice(), s.getType());
        }
        
        // Display pants
        System.out.println("\nPants:");
        for (Pants p : PANTS_LIST) {
            System.out.printf("%3d  %7.2f  %-30.30s\n", 
                p.getInStock(), p.getPrice(), p.getType());
        }
        
        // Display using toString()
        System.out.println("\nBooks in the array:");
        for (Book b : BOOK_LIST) { System.out.println(b); }
        
        System.out.println("\nShirts in the array:");
        for (Shirt s : SHIRT_LIST) { System.out.println(s); }
        
        System.out.println("\nPants in the array:");
        for (Pants p : PANTS_LIST) { System.out.println(p); }
        
        // Display counts
        System.out.println("\nTotal books: " + Book.getBookCount());
        System.out.println("Total shirts: " + Shirt.getShirtCount());
        System.out.println("Total pants: " + Pants.getPantsCount());
    }
}