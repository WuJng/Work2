package JAVA2.src.com.company.Transport;

/**
 * @description:
 * @author: wj
 * @date: Created in 2020/4/3 15:13
 * @version: v1.0
 * @modified By:
 */

public class LTrain extends LandTransport{
    @Override
    public void behaviorDirection() {
        System.out.println("You are judging an Train's direction.");
        super.behaviorDirection();
    }

    @Override
    public void behaviorDrive() {
        System.out.println("You are driving an Train.");
        super.behaviorAccelerator();
    }

    @Override
    public void behaviorBrake() {
        System.out.println("You are braking an Train.");
        super.behaviorAccelerator();
    }

    @Override
    public void behaviorAccelerator() {
        System.out.println("You are accelerating an Train.");
        super.behaviorAccelerator();
    }
}
