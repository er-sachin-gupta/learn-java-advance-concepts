package designpatterns.telusko.adapterdesignpattern.com.adap;

public class School {

    public static void main(String[] args) {
        AssignmentWork aw = new AssignmentWork();
        Pen p = new PenAdapter();
        aw.setP(p);
        aw.writeAssignment("Im bit tired to write an Assignment.");

    }

}
