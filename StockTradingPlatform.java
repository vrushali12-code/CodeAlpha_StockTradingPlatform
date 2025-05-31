import java.util.*;

class Stock {
    String symbol;
    double price;

    Stock(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
    }
}

class Portfolio {
    Map<String, Integer> holdings = new HashMap<>();

    void buy(Stock stock, int quantity) {
        holdings.put(stock.symbol, holdings.getOrDefault(stock.symbol, 0) + quantity);
        System.out.println("Bought " + quantity + " shares of " + stock.symbol);
    }

    void show() {
        System.out.println("\nPortfolio:");
        for (Map.Entry<String, Integer> entry : holdings.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " shares");
        }
    }
}

public class StockTradingPlatform {
    public static void main(String[] args) {
        Stock apple = new Stock("AAPL", 180);
        Stock google = new Stock("GOOG", 2500);

        Portfolio portfolio = new Portfolio();
        portfolio.buy(apple, 10);
        portfolio.buy(google, 5);
        portfolio.show();
    }
}