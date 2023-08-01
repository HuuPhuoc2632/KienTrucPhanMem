package State;

public class FanMain {
    public static void main(String[] args) {
        Fan fan = new Fan();

        fan.switchOn();
        fan.setState(new RunningState());

        fan.adjustSpeed();
        fan.setState(new SlowState());

        fan.adjustSpeed();
        fan.setState(new SlowState());

        fan.switchOff();
        fan.setState(new OffState());
        fan.adjustSpeed();

        fan.switchOn();
        fan.setState(new RunningState());
    }
}
