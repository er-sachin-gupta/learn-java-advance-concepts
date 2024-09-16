package designpatterns.durgesh.adapterdesignpattern;

public class Iphone13 {

    private AppleCharger appleCharger;

    public Iphone13(AppleCharger appleCharger) {
        this.appleCharger = appleCharger;
    }

    public void chargeIPhone() {
        appleCharger.chargePhone();
    }

}
