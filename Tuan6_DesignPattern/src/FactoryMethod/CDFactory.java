package FactoryMethod;

public class CDFactory extends ProductFactory {
    public Product createProduct() {
        return new CD();
    }
}
