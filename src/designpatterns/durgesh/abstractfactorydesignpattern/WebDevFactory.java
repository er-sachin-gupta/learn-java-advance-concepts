package designpatterns.durgesh.abstractfactorydesignpattern;

public class WebDevFactory extends EmployeeAbstractFactory {

    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }

}
