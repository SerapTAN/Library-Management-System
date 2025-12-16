public class Shirt extends Clothing {
    private String size;
    private static int shirtCount = 0;
    
    public Shirt() { shirtCount++; }
    
    public Shirt(String type, String brand, String size, String color, double price, int inStock) {
        setType(type);
        setBrand(brand);
        setSize(size);
        setColor(color);
        setPrice(price);
        setInStock(inStock);
        shirtCount++;
    }
    
    public String getSize() { return size; }
    public static int getShirtCount() { return shirtCount; }
    
    public String setSize(String size) { 
        this.size = size;
        return this.size;
    }
    
    @Override
    public String toString() {
        return String.format("%6.2f %s, by %s", getPrice(), getType(), getBrand());
    }
}