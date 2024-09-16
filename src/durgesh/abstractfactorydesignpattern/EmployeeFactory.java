package durgesh.abstractfactorydesignpattern;

public class EmployeeFactory {

    public static Employee getEmployee(EmployeeAbstractFactory factory) {
       return factory.createEmployee();
    }

}
