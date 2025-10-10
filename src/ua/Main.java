package ua;

import ua.model.*;

public class Main {
    public static void main(String[] args) {
        // Успішне створення об'єктів через конструктор
        Category category1 = new Category("Electronics", "Devices and gadgets");
        Supplier supplier1 = new Supplier("TechSupplier", "tech@supplier.com");
        Product product1 = new Product("Smartphone", category1, 599.99, 50);
        Customer customer1 = new Customer("John", "Doe", "john.doe@email.com");
        Order order1 = new Order(customer1, java.util.Arrays.asList(product1), new java.util.Date());

        // Успішне створення об'єктів через factory-методи
        Category category2 = Category.of("Books", "Printed and digital books");
        Supplier supplier2 = Supplier.of("BookSupplier", "info@books.com");
        Product product2 = Product.of("Book", category2, 19.99, 100);
        Customer customer2 = Customer.of("Alice", "Smith", "alice.smith@email.com");
        Order order2 = Order.of(customer2, java.util.Arrays.asList(product2), new java.util.Date());

        System.out.println(product1);
        System.out.println(category2);
        System.out.println(supplier2);
        System.out.println(customer2);
        System.out.println(order2);

        System.out.println("product1.equals(product2): " + product1.equals(product2));
        System.out.println("product1.hashCode(): " + product1.hashCode());
        System.out.println("product2.hashCode(): " + product2.hashCode());

        try {
            Product invalidProduct = new Product("", category1, -10, -5);
        } catch (IllegalArgumentException e) {
            System.out.println("Validation failed for Product: " + e.getMessage());
        }
        try {
            Customer invalidCustomer = Customer.of("", "", "invalidemail");
        } catch (IllegalArgumentException e) {
            System.out.println("Validation failed for Customer: " + e.getMessage());
        }
        try {
            Order invalidOrder = Order.of(null, java.util.Collections.emptyList(), null);
        } catch (IllegalArgumentException e) {
            System.out.println("Validation failed for Order: " + e.getMessage());
        }

        // Форматування даних (toString)
        System.out.println("Order info: " + order1);
    }
}
