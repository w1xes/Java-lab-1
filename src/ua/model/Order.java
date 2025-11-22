package ua.model;

import ua.util.ValidationUtil;

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
        ValidationUtil.validateNotNull(customer, "Customer");
        this.customer = customer;
    }

    public List<Product> getProducts() { return products; }
    public void setProducts(List<Product> products) {
        ValidationUtil.validateNotEmpty(products, "Products");
        this.products = products;
    }

    public Date getOrderDate() { return orderDate; }
    public void setOrderDate(Date orderDate) {
        ValidationUtil.validateNotNull(orderDate, "Order date");
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
