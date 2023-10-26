package com.ixns.domain;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Container implements Component {
    private final int id;
    private final List<Component> contents = new ArrayList<>();
    protected static int iteration = 0;

    public Container(int id) {
        this.id = id;
    }

    public void add(Component newContent) {
        contents.add(newContent);
    }

    public void remove(Component content) {
        contents.remove(content);
    }

    @Override
    public String getDescription() {
        StringBuilder description =
                new StringBuilder("\t".repeat(Math.max(0, iteration)));
        description.append("Container id: ")
                .append(id)
                .append(" === Contents total price: ")
                .append(NumberFormat
                        .getCurrencyInstance(Locale.US).format(getPrice()))
                .append(" ===");
        iteration++;
        for(Component component: contents) {
            description
                    .append("\n")
                    .append(component.getDescription());
        }
        iteration--;
        description
                .append("\n")
                .append("\t".repeat(Math.max(0, iteration)))
                .append("==========");

        return description.toString();
    }

    @Override
    public BigDecimal getPrice() {
        BigDecimal price = new BigDecimal(0);
        for (Component component: contents) {
            price = price.add(component.getPrice());
        }
        return price;
    }
}
