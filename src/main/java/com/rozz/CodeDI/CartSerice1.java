package com.rozz.CodeDI;

public class CartSerice1 {
    private CartReository repository;

    public CartSerice1() {
        this.repository = new CartRepositoryImpl();
    }
}
