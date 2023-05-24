package de.iav.repository;

import de.iav.model.Product;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTest {

    @Test
    void getProductById() {
    }

    @Test
    void allProducts() {
    }

    @Test
    void list_whenProductMapIsEmpty_thenReturnNoProducts() {
        //Given
        ProductRepo productRepo = new ProductRepo();
        List<Product> expexctedProductList = new ArrayList<>();
        int expectedListLength =0;
        //when
        List<Product> actualPrductList = productRepo.allProducts();
        //then
        assertEquals(actualPrductList, expexctedProductList);
        assertEquals(expectedListLength, actualPrductList.size());
    }

    @Test
    void list_whenProductMapHasOneProduct_thenReturnListWithOneProduct() {
        //Given

        Product appleKeyboard = new Product("1", "Apple Tastatur");

        List<Product> expectedProductList = new ArrayList<>();
        expectedProductList.add(appleKeyboard);
        ProductRepo productRepo = new ProductRepo(expectedProductList);

        //When
        List<Product> actualPrductList = productRepo.allProducts();
        //Then
        assertEquals(actualPrductList, expectedProductList);
        //assertEquals(expectedListLength, actualProductList.size());
    }
}