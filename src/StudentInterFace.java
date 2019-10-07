
import java.util.Scanner;

public class StudentInterFace {

    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
        Scanner s = new Scanner(System.in);

        String name;
        int score, stu1average, stu2average;
        //Input first Student's data
        while (true) {
            System.out.print("Enter name for first student (min 1 letter): ");
            name = s.nextLine();
            stu1.setName(name);
            for (int i = 1; i <= 3; i++) {
                System.out.format("Enter test score %d for %s> ", i, stu1.getName());
                score = s.nextInt();
                stu1.setMark(i, score);
            }
            String errormsg = stu1.validateData();
            if (errormsg == null) {
                break;
            } else {
                System.out.println(errormsg);
                s.nextLine();
            }
        }
        s.nextLine(); //clear scanner buffer
        System.out.println("\n--------------------------\n");
        //input the second student's data
        //input first student's data
        while (true) {
            System.out.print("Enter name for second student: ");
            name = s.nextLine();
            stu2.setName(name);
            for (int i = 1; i <= 3; i++) {
                System.out.format("Enter test score %d for %s> ", i, stu2.getName());
                score = s.nextInt();
                stu2.setMark(i, score);
            }
            String errormsg = stu2.validateData();
            if (errormsg == null) {
                break;
            } else {
                System.out.println(errormsg);
                s.nextLine();
            }
        }
        System.out.println("\n--------------------------\n");
        //output the Student's info
        System.out.println(stu1);
        System.out.println(stu2);

        stu1average = stu1.getAverage();
        stu2average = stu2.getAverage();

        Student bestmark = stu1.getHighest() > stu2.getHighest() ? stu1 : stu2;
        Student bestaverage = stu1.getAverage() > stu2.getAverage() ? stu1 : stu2;
        System.out.format("The student with the higest score is %s with a mark of %d.\n", bestmark.getName(), bestmark.getHighest());
        System.out.format("The student with the higest average is %s with an average of %d.", bestaverage.getName(), bestaverage.getAverage());
    }

}
