package designpatterns.durgesh.builderdesignpattern;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setEmailId("radhe@krishna.in")
                .setUserName("Radhe")
                .setUserId("radhe1233")
                .build();
        System.out.println(user);

        User user1 = User.UserBuilder.builder().setUserId("HarebKrishna").setEmailId("Jai").build();
        System.out.println(user1);
    }
}
