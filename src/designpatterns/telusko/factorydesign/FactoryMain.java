package designpatterns.telusko.factorydesign;

import designpatterns.telusko.factorydesign.com.phone.OS;
import designpatterns.telusko.factorydesign.com.phone.OperatingSystemFactory;

public class FactoryMain {
    public static void main(String[] args) {
        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("Open");
        obj.spec();
    }
}
