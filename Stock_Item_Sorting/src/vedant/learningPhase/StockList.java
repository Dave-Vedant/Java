package vedant.learningPhase;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
    private final Map<String, StockItem> list;

    public StockList() {
        this.list = new LinkedHashMap<>();
    }

    public int addStock(StockItem item){
        if(item != null){
            // check the item in list
            StockItem inStock = list.getOrDefault(item.getName(),item);
            if(inStock != item){
                item.adjustStock(inStock.quantityInStock());  // if there is already stock in the list , then adjust the quantity
            }
            list.put(item.getName(),item);
            return item.quantityInStock();
        }
        return 0;
    }

    public int sellStock(String item, int quantity){
        StockItem inStock = list.getOrDefault(item, null);

        if((inStock != null) && (inStock.quantityInStock() >= quantity) && (quantity >0)){
            inStock.adjustStock(-quantity);
            return quantity;
        }
        return 0;
    }

    public StockItem get(String key){
        return list.get(key);
    }

    public Map<String, Double> PriceList(){
        Map<String, Double>prices = new LinkedHashMap<>();
        for(Map.Entry<String,StockItem> item: list.entrySet()){
            prices.put(item.getKey(), item.getValue().getPrice());
        }
        return Collections.unmodifiableMap(prices);
    }

    public Map<String,StockItem>Items(){                   // just to see map
        System.out.println("Your Items(Map) is unmodifiable");
        return Collections.unmodifiableMap(list);           // give readonly access to internal map
    }

    @Override
    public String toString() {
        String s = "\nStock List\n";
        double totalCost = 0.0;
        for (Map.Entry<String, StockItem> item : list.entrySet()){
            StockItem sellingItem = item.getValue();

            double itemValue = sellingItem.getPrice() * sellingItem.quantityInStock();

            s = s + ">> " +  sellingItem + ". There are " + sellingItem.quantityInStock() + " in stock. Value of items: ";
            s = s + String.format("%.2f",itemValue)+ "\n";
            totalCost += itemValue;
        }
        return s + "Total Stock value: " + totalCost;
    }
}
