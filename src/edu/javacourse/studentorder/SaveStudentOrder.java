package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.Adult;
import edu.javacourse.studentorder.domain.StudentOrder;

public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder studentOrder = new StudentOrder();

        long ans = saveStudentOrder(studentOrder);
        System.out.println(ans);

    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder: ");
        return answer;
    }

    static StudentOrder buildStudentOrder() {
        StudentOrder studentOrder = new StudentOrder();
        Adult husband = new Adult();
        studentOrder.setHusband(husband);
        husband.setGivenName("Andrew");

        return studentOrder;
    }
}
