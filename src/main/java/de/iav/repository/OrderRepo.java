package de.iav.repository;

import de.iav.model.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRepo {

    private Map<String, Order> orders;

    public OrderRepo() {
        orders=new HashMap<>();
    }

    //Rückgabe aller Bestellungen
    public List<Order> listAllOrders() {
        return new ArrayList<>(orders.values());
    }
    // Rückgabe einer einzelnen Bestellung
    public Order getOrderById(String id) {
        return orders.get(id);
    }
    //Hinzufügen einer Bestellung
    public Order addOrder(Order orderToAdd){
        return orders.put(orderToAdd.getId(), orderToAdd);
    }


}
