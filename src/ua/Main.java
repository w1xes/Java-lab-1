package ua;

import ua.model.*;

public class Main {
    public static void main(String[] args) {
        // Створення категорії
        Category category = new Category("Electronics", "Devices and gadgets");

        // Створення постачальника
        Supplier supplier = new Supplier("TechSupplier", "tech@supplier.com");

        // Створення продукту
        Product product = new Product("Smartphone", category, 599.99, 50);

        // Створення покупця
        Customer customer = new Customer("John", "Doe", "john.doe@email.com");

        // Створення замовлення
        java.util.List<Product> products = java.util.Arrays.asList(product);
        Order order = new Order(customer, products, new java.util.Date());

        // Вивід інформації
        System.out.println("Product: " + product.getName() + ", Category: " + product.getCategory().getName() + ", Price: " + product.getPrice() + ", Stock: " + product.getStock());
        System.out.println("Supplier: " + supplier.getName() + ", Contact: " + supplier.getContactInfo());
        System.out.println("Customer: " + customer.getFirstName() + " " + customer.getLastName() + ", Email: " + customer.getEmail());
        System.out.println("Order: " + order.getCustomer().getFirstName() + " ordered " + order.getProducts().size() + " product(s) on " + order.getOrderDate());
    }
}
