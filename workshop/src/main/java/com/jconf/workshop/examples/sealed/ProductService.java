package com.jconf.workshop.examples.sealed;

public sealed interface ProductService permits ForeignProductServiceImpl,
        PeruvianProductsServiceImpl{
    void printProduct();
}