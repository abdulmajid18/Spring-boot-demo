package com.rozz.CodeDI;

public class CartService2 {
    private CartRepository repository;

    public CartService2(CartRepository repository) {
        this.repository = repository;
    }
}
