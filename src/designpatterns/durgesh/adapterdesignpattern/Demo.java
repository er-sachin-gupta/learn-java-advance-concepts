package designpatterns.durgesh.adapterdesignpattern;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Program Started ");
//        AppleCharger charger = new ChargerXYZ();
        AppleCharger charger = new AdapterCharger(new DKCharger());
        Iphone13 iphone13 = new Iphone13(charger);
        iphone13.chargeIPhone();

    }
}
