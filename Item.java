public class Item {
    protected double price;
    protected int inStock;
    
    public Item() { }
    
    public double getPrice() { return price; }
    public int getInStock() { return inStock; }
    
    public double setPrice(double price) { 
        this.price = price;
        return this.price;
    }
    
    public int setInStock(int inStock) { 
        this.inStock = inStock;
        return this.inStock;
    }
}
