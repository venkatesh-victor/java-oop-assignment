package inheritance;

class Student{
    private String name;
    private int rollNO;
    private int age;

    public Student (String name, int rollNO, int age) {
        this.name = name;
        this.rollNO = rollNO;
        this.age = age;
    }
}

class ZSGSStudent extends Student {

    private String traineeId;
    public ZSGSStudent(String name, int rollNO, int age) {
        super(name, rollNO, age);
    }

    public ZSGSStudent(String name, int rollNO, int age, String traineeId) {
        this(name, rollNO, age);
        this.traineeId = traineeId;
    }

}

public class StudentDemo {
    public static void main(String[] args) {
        ZSGSStudent zsgsStudent1 = new ZSGSStudent("venkatesh", 7, 21, "ZSGS-07");
        ZSGSStudent zsgsStudent2 = new ZSGSStudent("victor", 3, 22, "ZSGS-03");
    }
}
