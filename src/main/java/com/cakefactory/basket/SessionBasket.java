package com.cakefactory.basket;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
class SessionBasket implements Basket {

    private int totalItems = 0;

    @Override
    public void add(String sku) {
        totalItems += 1;
    }

    @Override
    public int getTotalItems() {
        return this.totalItems;
    }

}