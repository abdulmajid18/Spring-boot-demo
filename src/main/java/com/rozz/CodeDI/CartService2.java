package com.rozz.CodeDI;

public class CarService2 {
    private CartRepository repository;

    public CarService2(CartRepository repository) {
        this.repository = repository;
    }
}
