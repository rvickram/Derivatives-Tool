package options;

public interface Option {

    int calculatePayoff(int currentPrice);

    int calculatePrice(int currentPrice);

    int getOptionType();
}
