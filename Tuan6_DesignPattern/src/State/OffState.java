package State;

public class OffState implements FanState{
    public OffState() {
    }

//    public void switchOn(Fan state) {
//        System.out.println("Da bat quat.");
//        state.setState(this);
//
//    }

    @Override
    public void switchOn() {

    }

    public void switchOff() {
        System.out.println("Quat dang trong trang thai tat!!");
    }

    public void adjustSpeed() {
        System.out.println("Khong the dieu chinh toc do khi quat dang tat");
    }
}