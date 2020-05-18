package JAVA2.src.com.company.Transport;

/**
 * @description:
 * @author:
 * @date:Created in 2020-03-26 19:08
 * @version:0.0.1
 * @modified By:
 */

public class AirHotballon extends AirTransport {
    @Override
    public void behaviorDirection() {
        System.out.println("You are judging an airHotballon's direction.");
        super.behaviorDirection();
    }

    @Override
    public void behaviorDrive() {
        System.out.println("You are driving an airHotballon.");
        super.behaviorAccelerator();
    }

    @Override
    public void behaviorBrake() {
        System.out.println("You are braking an airHotballon.");
        super.behaviorAccelerator();
    }

    @Override
    public void behaviorAccelerator() {
        System.out.println("You are accelerating an airHotballon.");
        super.behaviorAccelerator();
    }


}
