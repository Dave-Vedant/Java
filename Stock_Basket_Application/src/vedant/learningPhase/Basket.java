package vedant.learningPhase;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Basket {
    private final String name;
    private Map<StockItem, Integer> list;

    public Basket(String name) {
        this.name = name;
        this.list  = new TreeMap<>();
    }

    public int addToBasket (StockItem items, int quantity){
        if ((items != null) && (quantity > 0)) {
            int inBasket  = list.getOrDefault(items, 0);
            list.put(items, inBasket + quantity);
            return inBasket;
        }
        return 0;
    }

    public int removeFromBasket(StockItem item, int quantity){
        if((item != null) && (quantity >0)){
            int inBasket = list.getOrDefault(item,0);
            int newQuantity = inBasket - quantity;
            if(newQuantity > 0){
                return quantity;
            } else if (newQuantity ==0){
                list.remove(item);
                return quantity;
            }
        }
        return 0;
    }

    public void clearBasket(){
        this.list.clear();
    }

    public Map<StockItem, Integer> Items(){
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\n Shopping Basket : " + name + " contains " + list.size() + ((list.size() ==1) ? " item" : " items") + "\n";    //if size == 1 them print word item or print items.
        double totalCost  = 0.0;
        for(Map.Entry<StockItem,Integer> items : list.entrySet()){
            s =s + "* "+ items.getKey() + " -->> " + items.getValue() + " purchased\n";
            totalCost += items.getKey().getPrice() * items.getValue();
        }
        return s + " Total cost : " + totalCost;
    }
}
