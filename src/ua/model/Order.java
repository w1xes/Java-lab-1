package ua.model;

import java.util.Date;
import java.util.List;

public class Order {
    private Customer customer;
    private List<Product> products;
    private Date orderDate;

    public Order(Customer customer, List<Product> products, Date orderDate) {
        setCustomer(customer);
        setProducts(products);
        setOrderDate(orderDate);
    }

    public static Order of(Customer customer, List<Product> products, Date orderDate) {
        return new Order(customer, products, orderDate);
    }

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) {
        if (customer == null) {
            throw new IllegalArgumentException("Customer cannot be null");
        }
        this.customer = customer;
    }

    public List<Product> getProducts() { return products; }
    public void setProducts(List<Product> products) {
        if (products == null || products.isEmpty()) {
            throw new IllegalArgumentException("Products cannot be null or empty");
        }
        this.products = products;
    }

    public Date getOrderDate() { return orderDate; }
    public void setOrderDate(Date orderDate) {
        if (orderDate == null) {
            throw new IllegalArgumentException("Order date cannot be null");
        }
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customer=" + customer +
                ", products=" + products +
                ", orderDate=" + orderDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return customer.equals(order.customer) && products.equals(order.products) && orderDate.equals(order.orderDate);
    }

    @Override
    public int hashCode() {
        int result = customer.hashCode();
        result = 31 * result + products.hashCode();
        result = 31 * result + orderDate.hashCode();
        return result;
    }
}
