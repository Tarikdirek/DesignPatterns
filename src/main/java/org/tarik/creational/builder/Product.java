package org.tarik.creational.builder;

public class Product {
    private String name;
    private String category;
    private int unitsInStock;
    private String color;
    private int unitPrice;

    private Product(Builder builder) {
        this.name = builder.name;
        this.category = builder.category;
        this.unitsInStock = builder.unitsInStock;
        this.color = builder.color;
        this.unitPrice = builder.unitPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", unitsInStock=" + unitsInStock +
                ", color='" + color + '\'' +
                ", unitPrice=" + unitPrice +
                '}';
    }

    public static class Builder {
        private String name;
        private String category;
        private int unitsInStock;
        private String color;
        private int unitPrice;

        public Builder name(String name)
        {
            this.name = name;
            return this;
        }
        public Builder category(String category)
        {
            this.category = category;
            return this;
        }
        public Builder unitsInStock(int unitsInStock)
        {
            this.unitsInStock = unitsInStock;
            return this;
        }
        public Builder color(String color)
        {
            this.color = color;
            return this;
        }
        public Builder unitPrice(int unitPrice)
        {
            this.unitPrice = unitPrice;
            return this;
        }

        public Product build()
        {
            return new Product(this);
        }
    }
}
