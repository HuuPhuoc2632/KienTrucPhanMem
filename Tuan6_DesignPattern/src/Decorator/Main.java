package Decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("ORDER BASE");
        Order orderBase = new OrderBase("HD0001");
        System.out.println(orderBase.getId());


        System.out.println("NEW ORDER");
        Order newOrder = new NewOrder(orderBase);
        newOrder.doTask();

        System.out.println("SHIPPING");
        Order shipping = new Shipping(orderBase);
        shipping.doTask();

        System.out.println("COMPLETE");
        Order complete = new CompleteOrder(orderBase);
        complete.doTask();
    }
}
