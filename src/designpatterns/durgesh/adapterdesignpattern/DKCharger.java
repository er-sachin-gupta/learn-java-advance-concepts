package designpatterns.durgesh.adapterdesignpattern;

public class DKCharger implements AndroidCharger {
    @Override
    public void chargeAndroidPhone() {
        System.out.println("Your android phone is charging.");
    }
}
