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
    
    public void addToCart(String itemName, double price, int quality)
    {
        if (itemCount >= cart.length) {
            increaseSize();
        }
        Item temp = new Item(itemName,price,quality);
        cart[itemCount] = temp;
        totalPrice += price;
        itemCount++;
    }
    private void increaseSize() {
        Item[] temp = new Item[cart.length + 3];
        for (int i = 0; i < cart.length; i++) {
            temp[i] = cart[i];
        }
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
