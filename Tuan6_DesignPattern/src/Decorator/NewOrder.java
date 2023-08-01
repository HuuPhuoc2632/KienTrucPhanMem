package Decorator;

public class NewOrder extends OrderDecorator{
    public NewOrder(Order order) {
        super(order);
    }
    public void notifyToShop(){
        System.out.println("You have a new order, please check now");
    }

    @Override
    public void doTask() {
        notifyToShop();
    }
}
