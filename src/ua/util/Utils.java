package ua.util;

import ua.model.*;
import java.util.Date;
import java.util.List;

public class Utils {
    public static Product createProduct(String name, Category category, double price, int stock) {
        return new Product(name, category, price, stock);
    }

    public static Category createCategory(String name, String description) {
        return new Category(name, description);
    }

    public static Supplier createSupplier(String name, String contactInfo) {
        return new Supplier(name, contactInfo);
    }

    public static Customer createCustomer(String firstName, String lastName, String email) {
        return new Customer(firstName, lastName, email);
    }

    public static Order createOrder(Customer customer, List<Product> products, Date orderDate) {
        return new Order(customer, products, orderDate);
    }
}
