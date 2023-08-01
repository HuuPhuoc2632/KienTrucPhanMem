package Decorator;

public abstract class OrderDecorator implements Order {
    protected Order order;

    public OrderDecorator(Order order) {
        this.order = order;
    }
    @Override
    public String getId() {
        return order.getId();
    }

}
