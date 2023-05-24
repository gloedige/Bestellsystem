package de.iav.repository;

import de.iav.exception.ProductNotFoundException;
import de.iav.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepo {

    private List<Product> products;

    public ProductRepo() {
        products=new ArrayList<>();
    }

    public ProductRepo(List<Product> products) {
        this.products = products;
    }

    // Rückgabe eines Einzelnen Produkts
    public Product getProductById(String idOfRequestedProduct) {
        for (Product singleProductFromList : products) {
            if (singleProductFromList.getId().equals(idOfRequestedProduct)) {
                return singleProductFromList;
            }
        }
        //Wenn for-Schleife durchlaufen ist, aber nichts gefunden hat...
        //Soll eine Exception geworfen werden
        throw new ProductNotFoundException(idOfRequestedProduct);
    }
    //Rückgabe aller Produkte
    public List<Product> allProducts(){
        return this.products;
    }


}
