public class Pants extends Clothing {
    private String waist;
    private String length;
    private static int pantsCount = 0;
    
    public Pants() { pantsCount++; }
    
    public Pants(String type, String brand, String waist, String length, 
                String color, double price, int inStock) {
        setType(type);
        setBrand(brand);
        setWaist(waist);
        setLength(length);
        setColor(color);
        setPrice(price);
        setInStock(inStock);
        pantsCount++;
    }
    
    public String getWaist() { return waist; }
    public String getLength() { return length; }
    public static int getPantsCount() { return pantsCount; }
    
    public String setWaist(String waist) { 
        this.waist = waist;
        return this.waist;
    }
    
    public String setLength(String length) { 
        this.length = length;
        return this.length;
    }
    
    @Override
    public String toString() {
        return super.toString() + " (Waist: " + waist + ", Length: " + length + ")";
    }
}