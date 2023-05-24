package de.iav.repository;

import de.iav.model.Order;
import de.iav.model.Product;

import java.util.*;

public class OrderRepo {

    private Map<String ,Order> orders;

    public OrderRepo() {
        orders=new HashMap<>();
    }

    //Rückgabe aller Bestellungen
    public List<Order> listAllOrders() {
        return new ArrayList<>(orders.values());
    }
    // Rückgabe einer einzelnen Bestellung

    public Order getOrderById(String idOfRequestedOrder) {
        for (Order singleOrderFromMap : orders.values()) {
            if (singleOrderFromMap.getId().equals(idOfRequestedOrder)) {
                return singleOrderFromMap;
            }
        }

        throw new NoSuchElementException();
    }
    //Hinzufügen einer Bestellung
    public Order addOrder(Order order){
        return orders.put(order.getId(),order);
            //orders.put(orderToAdd.getId(), orderToAdd);
    }


}
