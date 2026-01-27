public class ShoppingCart {
    private Item[] cart;
    private int itemCount;
    private double totalPrice;
    private int capacity;
    
    public ShoppingCart(int capacity) {
        this.capacity = capacity;
        cart = new Item[capacity];
        itemCount = 0;
        totalPrice = 0.0;
    }
    
    public void addToCart(Item item) {
        if (itemCount >= cart.length) {
            increaseSize();
        }
        cart[itemCount] = item;
        totalPrice += item.getTotalPrice();
        itemCount++;
    }
    
    private void increaseSize() {
        // Create a new array with size increased by 3 elements
        Item[] temp = new Item[cart.length + 3];
        
        // Copy existing items to the new array
        for (int i = 0; i < cart.length; i++) {
            temp[i] = cart[i];
        }
        
        // Replace old array with new array
        cart = temp;
        this.capacity = temp.length;
    }
    
    public double getTotalPrice() {
        return totalPrice;
    }
    
    public int getItemCount() {
        return itemCount;
    }
    
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < itemCount; i++) {
            result.append(cart[i].toString()).append("\n");
        }
        return result.toString();
    }
}
