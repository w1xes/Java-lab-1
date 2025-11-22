package ua.model;

import ua.util.ValidationUtil;

public class Product {
    private String name;
    private Category category;
    private double price;
    private int stock;

    public Product(String name, Category category, double price, int stock) {
        setName(name);
        setCategory(category);
        setPrice(price);
        setStock(stock);
    }

    public static Product of(String name, Category category, double price, int stock) {
        return new Product(name, category, price, stock);
    }

    public String getName() { return name; }
    public void setName(String name) {
        ValidationUtil.validateNotEmpty(name, "Product name");
        this.name = name;
    }

    public Category getCategory() { return category; }
    public void setCategory(Category category) {
        ValidationUtil.validateNotNull(category, "Category");
        this.category = category;
    }

    public double getPrice() { return price; }
    public void setPrice(double price) {
        ValidationUtil.validateNotNegative(price, "Price");
        this.price = price;
    }

    public int getStock() { return stock; }
    public void setStock(int stock) {
        ValidationUtil.validateNotNegative(stock, "Stock");
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", category=" + category.getName() +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                stock == product.stock &&
                name.equals(product.name) &&
                category.equals(product.category);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + category.hashCode();
        result = 31 * result + Double.hashCode(price);
        result = 31 * result + stock;
        return result;
    }
}
