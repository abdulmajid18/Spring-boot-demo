package com.rozz.CodeDI;

public class CartService1 {
    private CartReository repository;

    public CartService1() {
        this.repository = new CartRepositoryImpl();
    }
}
