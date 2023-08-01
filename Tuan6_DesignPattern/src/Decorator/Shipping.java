package Decorator;

public class Shipping extends OrderDecorator{
    public Shipping(Order order) {
        super(order);
    }
    public void getInforShipping(){
        System.out.println("information of order on shipping");
    }
    @Override
    public void doTask() {
        getInforShipping();
    }
}
