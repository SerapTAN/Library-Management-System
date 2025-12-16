public class Clothing extends Item {
    private String type;
    private String brand;
    private String color;
    
    public Clothing() { }
    
    public Clothing(String type, String brand, String color, double price, int inStock) {
        setType(type);
        setBrand(brand);
        setColor(color);
        setPrice(price);
        setInStock(inStock);
    }
    
    public String getType() { return type; }
    public String getBrand() { return brand; }
    public String getColor() { return color; }
    
    public String setType(String type) { 
        this.type = type;
        return this.type;
    }
    
    public String setBrand(String brand) { 
        this.brand = brand;
        return this.brand;
    }
    
    public String setColor(String color) { 
        this.color = color;
        return this.color;
    }
    
    @Override
    public String toString() {
        return String.format("%6.2f %s, by %s", getPrice(), getType(), getBrand());
    }
}