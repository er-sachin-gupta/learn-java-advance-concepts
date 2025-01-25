package com.semanticsquare.oop;

public class UserTest {

    public void printUserType(User u) {
        u.printUserType();
    }

    public void approveReview(Staff s) {
//        s.approveReview();
//        ((Editor)s).approveReview();
        if (s instanceof Editor) {
            ((Editor) s).approveReview();
        } else {
            System.out.println("Invalid object passed !!");
        }

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
//        editor.saveWebLink();

//        ut.approveReview(new Staff());
        ut.approveReview(new Editor());
    }

}
