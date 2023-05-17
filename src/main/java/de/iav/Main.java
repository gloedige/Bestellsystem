package de.iav;

import de.iav.model.Order;
import de.iav.repository.OrderRepo;

import java.util.List;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        OrderRepo orderRepo = new OrderRepo();
        System.out.println(orderRepo.addOrder(new Order("123", List.of("34", "45"))));
        System.out.println(orderRepo.getOrderById("123"));
    }
}