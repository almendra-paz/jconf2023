package com.jconf.workshop.examples.sealed;

public class ProductsMain {

    public static void main(String args[]){
        ProductService productService = new PeruvianProductsServiceImpl();
        productService.printProduct();
    }
}
