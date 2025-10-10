package ua.model;

public class Supplier {
    private String name;
    private String contactInfo;

    public Supplier(String name, String contactInfo) {
        setName(name);
        setContactInfo(contactInfo);
    }

    public static Supplier of(String name, String contactInfo) {
        return new Supplier(name, contactInfo);
    }

    public String getName() { return name; }
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Supplier name cannot be empty");
        }
        this.name = name;
    }

    public String getContactInfo() { return contactInfo; }
    public void setContactInfo(String contactInfo) {
        if (contactInfo == null || contactInfo.trim().isEmpty()) {
            throw new IllegalArgumentException("Contact info cannot be empty");
        }
        this.contactInfo = contactInfo;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "name='" + name + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Supplier supplier = (Supplier) o;
        return name.equals(supplier.name) && contactInfo.equals(supplier.contactInfo);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + contactInfo.hashCode();
        return result;
    }
}
