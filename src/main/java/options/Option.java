package options;

abstract public class Option {

    private int premium;
    private int strikePrice;

    public Option(int premium, int strikePrice) {
        this.premium = premium;
        this.strikePrice = strikePrice;
    }

    abstract int calculatePayoff(int currentPrice);

    abstract int calculateProfit(int currentPrice);

    abstract String getOptionType();
}
