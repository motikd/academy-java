package com.bptn.course._13_week2_hackday_friday;

public class Stock {

    // Create instance variables
    private String tickerSymbol;
    private String companyName;
    private int price;
    private double percentChange;
    private int totalShares;
    private long marketCap;

    // Constructor
    public Stock(String tickerSymbol, String companyName, int price, int totalShares) {
        this.tickerSymbol = tickerSymbol.toUpperCase();
        this.companyName = companyName;
        this.price = price;
        this.totalShares = totalShares;
        this.percentChange = 0.0;
        this.marketCap = calculateMarketCap();
    }

    // Method to calculate market cap
    private long calculateMarketCap() {
        return (long) price * totalShares;
    }

    // Method to adjust the price
    public void adjustPrice(int change) {
        int oldPrice = price; 
        price += change; 
        percentChange = ((double) change / oldPrice) * 100; 
        marketCap = calculateMarketCap(); 
    }

    // Method to convert to string
    @Override
    public String toString() {
        return "Ticker Symbol: " + tickerSymbol + "\n" +
               "Company: " + companyName + "\n" +
               "Current Price: $" + price + " (" + percentChange + "%)\n" +
               "Market Cap: " + marketCap;
    }

    // Don't modify the code below:
    public static void main(String[] args) {
        Stock stock = new Stock("GOOG", "Google, Inc.", 802, 6700);
        System.out.println(stock);
        stock.adjustPrice(20);
        System.out.println(stock);
    }
}
