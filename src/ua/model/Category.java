package ua.model;

import ua.util.ValidationUtil;

public class Category {
    private String name;
    private String description;

    public Category(String name, String description) {
        setName(name);
        setDescription(description);
    }

    public static Category of(String name, String description) {
        return new Category(name, description);
    }

    public String getName() { return name; }
    public void setName(String name) {
        ValidationUtil.validateNotEmpty(name, "Category name");
        this.name = name;
    }

    public String getDescription() { return description; }
    public void setDescription(String description) {
        ValidationUtil.validateNotNull(description, "Description");
        this.description = description;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return name.equals(category.name) && description.equals(category.description);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + description.hashCode();
        return result;
    }
}
