package ua.model;

import ua.util.ValidationUtil;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;

    public Customer(String firstName, String lastName, String email) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
    }

    public static Customer of(String firstName, String lastName, String email) {
        return new Customer(firstName, lastName, email);
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) {
        ValidationUtil.validateNotEmpty(firstName, "First name");
        this.firstName = firstName;
    }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) {
        ValidationUtil.validateNotEmpty(lastName, "Last name");
        this.lastName = lastName;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) {
        ValidationUtil.validateEmail(email);
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return firstName.equals(customer.firstName) && lastName.equals(customer.lastName) && email.equals(customer.email);
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + email.hashCode();
        return result;
    }
}
