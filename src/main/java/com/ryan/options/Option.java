package com.ryan.options;

public interface Option {

    int calculatePayoff(int currentPrice);

    int calculatePrice(int currentPrice);

    String getOptionType();
}
