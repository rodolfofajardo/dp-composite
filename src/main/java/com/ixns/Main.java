package com.ixns;

import com.ixns.domain.Container;
import com.ixns.domain.Item;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Container container1 = new Container(1);

        Container container2 = new Container(2);
        container2.add(new Item("Hammer", new BigDecimal("12.5")));

        Container container3 = new Container(3);

        Container container4 = new Container(4);
        container4.add(new Item("Mobile", new BigDecimal(567)));
        container4.add(new Item("Earplugs", new BigDecimal("8.25")));

        Container container5 = new Container(5);
        container5.add(new Item("Charger", new BigDecimal("3.3")));

        container3.add(container4);
        container3.add(container5);

        container1.add(container2);
        container1.add(container3);
        container1.add(new Item("Surprise Item", new BigDecimal(0)));

        System.out.println(container1.getDescription());
    }
}