package FactoryMethod;

public class BookFactory extends ProductFactory {
    public Product createProduct() {
        return new Book();
    }
}
