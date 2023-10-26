package com.ixns.domain;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Item implements Component {
    private final String name;
    private final BigDecimal price;
    public Item(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String getDescription() {
        return "\t".repeat(Math.max(0, Container.iteration )) +
                name + "\t\t" +
                NumberFormat.getCurrencyInstance(Locale.US).format(price);
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }
}
