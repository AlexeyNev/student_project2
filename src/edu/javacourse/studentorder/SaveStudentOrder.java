package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.other.Adult;
import edu.javacourse.studentorder.domain.StudentOrder;

public class SaveStudentOrder {
    public static void main(String[] args) {
        buildStudentOrder();

//        StudentOrder studentOrder = new StudentOrder();
//        long ans = saveStudentOrder(studentOrder);
//        System.out.println(ans);

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
        husband.setSurname("Katkov");
        husband.setPassportNumber("225613");

        String ans = husband.getPersonString();
        System.out.println(ans);

        return studentOrder;
    }
}
