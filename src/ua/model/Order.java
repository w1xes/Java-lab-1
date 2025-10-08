package ua.model;

import java.util.Date;
import java.util.List;

public class Order {
    private Customer customer;
    private List<Product> products;
    private Date orderDate;

    public Order(Customer customer, List<Product> products, Date orderDate) {
        this.customer = customer;
        this.products = products;
        this.orderDate = orderDate;
    }

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }

    public List<Product> getProducts() { return products; }
    public void setProducts(List<Product> products) { this.products = products; }

    public Date getOrderDate() { return orderDate; }
    public void setOrderDate(Date orderDate) { this.orderDate = orderDate; }
}
