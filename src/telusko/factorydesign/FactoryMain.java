package telusko.factorydesign;

import telusko.factorydesign.com.phone.OS;
import telusko.factorydesign.com.phone.OperatingSystemFactory;

public class FactoryMain {
    public static void main(String[] args) {
        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("Open");
        obj.spec();
    }
}
