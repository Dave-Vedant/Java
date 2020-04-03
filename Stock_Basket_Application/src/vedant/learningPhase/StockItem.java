package vedant.learningPhase;

public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    int quantityInStock = 0;
    private int reserved;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityInStock = 0;
    }

    public StockItem(String name, double price, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int availableQuantity() {
        return quantityInStock - reserved;
    }

    public void setPrice(double price) {
        if (price > 0.0) {
            this.price = price;
        }
    }

    public void adjustStock(int quantity){
        int newQuantity = quantityInStock + quantity;
        if(newQuantity > 0) {
            this.quantityInStock = newQuantity;
        }
    }

    public int reserveStock(int quantity){
        if(quantity <= availableQuantity()){
            reserved += quantity;
            return quantity;
        }
        return 0;
    }

    public int unReserveStock(int quantity){
        if(quantity <= reserved){
            reserved -= quantity;
            return reserved;
        }
        return 0;
    }

    public int finalizeStock(int quantity){
        if(quantity<= reserved){
            quantityInStock  -= quantity;
            reserved -= quantity;
            return quantity;
        }
        return 0;
    }




    @Override
    public boolean equals(Object obj) {
        System.out.println("Entering to stock.equal ");
        if(obj== this){
            return true;
        }
        if((obj == null) || (obj.getClass() != this.getClass())){
            return false;
        }
        String objName = ((StockItem) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 99;
    }

    @Override
    public int compareTo(StockItem o) {
//        System.out.println("Entering stockItem.compareTo()"); // showing too wordy output
        if(this == o){
            return 0;
        }
        if(o != null){
            return this.name.compareTo(o.getName());
        }
        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name + " : " + this.price + "Reserved : " + this.reserved;
    }


}
