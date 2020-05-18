package JAVA2.src.com.company.Transport;

/**
 * @description:
 * @author: wj
 * @date: Created in 2020/4/3 15:13
 * @version: v1.0
 * @modified By:
 */
public class MHovercraft extends MaritimeMeansOfTransport{
    @Override
    public void behaviorDirection() {
        System.out.println("You are judging an Hovercraft's direction.");
        super.behaviorDirection();
    }

    @Override
    public void behaviorDrive() {
        System.out.println("You are driving an Hovercraft.");
        super.behaviorAccelerator();
    }

    @Override
    public void behaviorBrake() {
        System.out.println("You are braking an Hovercraft.");
        super.behaviorAccelerator();
    }

    @Override
    public void behaviorAccelerator() {
        System.out.println("You are accelerating an Hovercrafte.");
        super.behaviorAccelerator();
    }
}
