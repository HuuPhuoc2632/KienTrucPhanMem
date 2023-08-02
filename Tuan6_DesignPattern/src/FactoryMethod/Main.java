package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        ProductFactory bookFactory = new BookFactory();
        ProductFactory cdFactory = new CDFactory();

        Product book = bookFactory.createProduct();
        Product cd = cdFactory.createProduct();

        book.showInfo();
        cd.showInfo();
    }
}
