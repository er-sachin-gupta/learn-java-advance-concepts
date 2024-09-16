package durgesh.iteratordesignpattern;

public class Main {
    public static void main(String[] args) {
        UserManagement userManagement = new UserManagement();
        userManagement.addUser(new User("Radhe", "1"));
        userManagement.addUser(new User("MereRadhe", "2"));
        userManagement.addUser(new User("RadheShri", "3"));
        userManagement.addUser(new User("RadheRadhe", "4"));
        userManagement.addUser(new User("RadheKrishna", "5"));

        MyIterator myIterator = userManagement.getIterator();
        while(myIterator.nasNext()) {
            User user = (User) myIterator.next();
            System.out.println(user.getName());
        }
    }
}
