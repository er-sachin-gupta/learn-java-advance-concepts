package com.semanticsquare.oop;

public class UserTest {

    public void printUserType(User u) {
        u.printUserType();
    }

    public static void main(String[] args) {
        User user = new User();
        User staff = new Staff();
        User editor = new Editor();

        UserTest ut = new UserTest();
        /*ut.printUserType(user);
        ut.printUserType(staff);
        ut.printUserType(editor);*/

//        editor.approveReview();   /*will not work compiler is looking at reference type not assigning object type*/
//        editor.postAReview();
        editor.saveWebLink();
    }

}
