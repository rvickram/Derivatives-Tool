package com.ryan.options;

public class Call implements Option {

    private int premium;
    private int strikePrice;

    public Call(int premium, int strikePrice) {
        this.premium = premium;
        this.strikePrice = strikePrice;
    }


    public int calculatePayoff(int currentPrice) {
        return Math.max(0, currentPrice - strikePrice);
    }


    public int calculatePrice(int currentPrice) {
        int priceDiff = Math.max(0, currentPrice - strikePrice);

        return (priceDiff > 0) ? (priceDiff - premium) : (0 - premium);
    }


    public String getOptionType() {
        return "Call";
    }
}
