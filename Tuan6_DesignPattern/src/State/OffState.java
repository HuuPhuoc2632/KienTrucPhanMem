package State;

public class OffState implements FanState{
    public OffState() {
    }

    public void switchOn() {
        System.out.println("Da bat quat.");

    }

    public void switchOff() {
        System.out.println("Quat dang trong trang thai tat!!");
    }

    public void adjustSpeed() {
        System.out.println("Khong the dieu chinh toc do khi quat dang tat");
    }
}