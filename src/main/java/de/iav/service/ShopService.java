package de.iav.service;

import de.iav.model.Order;
import de.iav.model.Product;
import de.iav.repository.OrderRepo;
import de.iav.repository.ProductRepo;

import java.util.List;

public class ShopService {

        private OrderRepo orderRepo;
        private ProductRepo productRepo;

    public ShopService(OrderRepo orderRepo, ProductRepo productRepo) {
        this.orderRepo = orderRepo;
        this.productRepo = productRepo;
    }
    public Order addOrder(Order orderToAdd){
        return orderRepo.addOrder(orderToAdd);
    }
    public Order getOrderById(String id){
        return orderRepo.getOrderById(id);
    }
    public List<Order> listAllOrders(){
        return orderRepo.listAllOrders();
    }
    public Product getProductById(String id){
        return productRepo.getProductById(id);
    }
    public List<Product> allProducts(){
        return productRepo.allProducts();
    }
}
