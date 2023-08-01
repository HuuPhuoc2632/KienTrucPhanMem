package Decorator;

public class CompleteOrder extends OrderDecorator {

    public CompleteOrder(Order order) {
        super(order);
    }

    public void completeOrder(){
        System.out.println("Your order is shipping successfull");
    }

    @Override
    public void doTask() {
        completeOrder();
    }
}
