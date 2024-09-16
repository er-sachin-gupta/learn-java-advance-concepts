package durgesh.abstractfactorydesignpattern;

public class ManagerFactory extends EmployeeAbstractFactory {


    @Override
    public Employee createEmployee() {
        return new Manager();
    }
}
