package DesignPatterns.Observer;

/**
 * Created by hjw on 16/8/27.
 */
public class ObserverSub1 implements Observer {
    @Override
    public void update() {
        System.out.println("this is update of ObserverSub1");
    }
}
