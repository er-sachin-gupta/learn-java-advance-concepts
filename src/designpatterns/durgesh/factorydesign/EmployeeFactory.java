package designpatterns.durgesh.factorydesign;

public class EmployeeFactory {

    // get the employee
    public static Employee getEmployee(String empType) {
        if (empType.trim().equalsIgnoreCase("ANDROID DEVELOPER"))
            return new AdroidDeveloper();
        else if (empType.trim().equalsIgnoreCase("WEB DEVELOPER"))
            return new WebDeveloper();
        else
            return null;
    }

}
