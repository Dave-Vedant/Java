package vedant.learningPhase;

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread" , 1.64, 500);
        stockList.addStock(temp);

        temp = new StockItem("oil" , 7.49, 250);
        stockList.addStock(temp);

        temp = new StockItem("oats" , 1.99, 1000);
        stockList.addStock(temp);

        temp = new StockItem("yogurts" , 1.49, 400);
        stockList.addStock(temp);

        temp = new StockItem("beans" , 6.49, 200);
        stockList.addStock(temp);

        temp = new StockItem("snacks" , 1.68, 1000);
        stockList.addStock(temp);

        System.out.println(stockList);

        for(String s : stockList.Items().keySet()){
            System.out.println(s);
        }

        Basket myBasket = new Basket("Vedant");
        sellItem(myBasket,"bread", 2);
        if(sellItem(myBasket,"oil", 1) !=1){
            System.out.println("There is no more oil in the store");
        };
        sellItem(myBasket, "oats" ,4);
        sellItem(myBasket,"snacks", 10);
        sellItem(myBasket,"book (asking 0)" ,0);
        sellItem(myBasket,"cycle", 1);
        System.out.println(myBasket);

//        temp = new StockItem("oil", 6.49);            //unmodifiable;
//        stockList.Items().put("oil" , temp);
        StockItem oil = stockList.Items().get("oil");
        if(oil != null){
            oil.adjustStock(200);
        }
        if(oil == null){
            oil.adjustStock(-20);

        }

        System.out.println(stockList);
        System.out.println("================");

        Basket new_basket = new Basket("customer");
        sellItem(new_basket, "bread" ,100);
        sellItem(new_basket,"oil", 10);
        removeItem(new_basket,"bread", 80);
        System.out.println(new_basket);

        removeItem(myBasket,"cycle",1);
        removeItem(myBasket,"snacks",10);
        removeItem(myBasket,"snacks",10);
        removeItem(myBasket,"oats", 4);
        System.out.println("oats removed " + removeItem(myBasket,"oats", 4));
        System.out.println(myBasket);

        // remove All items
        removeItem(myBasket,"oil",1);
        removeItem(myBasket,"bread", 2);

        System.out.println("");
        System.out.println("  ==============================================");
        System.out.println("|| Display stock list before and after checkout ||");
        System.out.println("  ==============================================");
        System.out.println(myBasket);
        System.out.println("--------");
        System.out.println(stockList);
        checkOut(myBasket);
        System.out.println(myBasket);
        System.out.println("--------");
        System.out.println(stockList);


//        for(Map.Entry<String,Double> price: stockList.PriceList().entrySet()){
//            System.out.println(price.getKey() + " costs " + price.getValue());
//        }
    }

//                                         =-=-=-=-=-=-=-=-=-=-=-=-=-=-=
// new methods outside of psvm
    private static int sellItem(Basket basket, String item, int quantity){
        StockItem stockItem = stockList.get(item);
        if(stockItem == null){
            System.out.println("Sorry, We do not sell " + item );
        }
        if(stockList.reservedStock(item,quantity) != 0){
            return basket.addToBasket(stockItem,quantity);
        }
        return 0;
    }

    private static int removeItem(Basket basket, String item, int quantity){
        StockItem stockItem = stockList.get(item);
        if(stockItem == null){
            System.out.println("Sorry, We do not sell " + item );
        }
        if(basket.removeFromBasket(stockItem,quantity) == quantity){
            return stockList.unReservedStock(item, quantity);
        }
        return 0;
    }

    public static void checkOut(Basket basket){
        for(Map.Entry<StockItem,Integer> item: basket.Items().entrySet()){
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }



}


