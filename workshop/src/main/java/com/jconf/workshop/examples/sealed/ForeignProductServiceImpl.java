package com.jconf.workshop.examples.sealed;

public non-sealed class ForeignProductServiceImpl implements ProductService{
    @Override
    public void printProduct() {
        System.out.println("Foreign products");
    }
}
