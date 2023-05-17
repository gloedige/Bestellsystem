package de.iav.repository;

import de.iav.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepo {

    private Map<String, Product> products;

    public ProductRepo() {
        products=new HashMap<>();
    }

    // Rückgabe eines Einzelnen Produkts
    public Product getProductById(String id){
        return products.get(id);
    }
    //Rückgabe aller Produkte
    public List<Product> allProducts(){
        return new ArrayList<>(products.values());
    }

}
