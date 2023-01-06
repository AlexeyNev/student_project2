package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.StudentOrder;

public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder studentOrder = new StudentOrder();
        studentOrder.setHusbandFirstName("Alex");
        studentOrder.setHusbandLastName("Nevredimov");
        studentOrder.setWifeFirstName("Alla");
        studentOrder.setWifeLastName("Nevredimova");

        long ans = saveStudentOrder(studentOrder);
        System.out.println(ans);

    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder: " + studentOrder.getHusbandLastName());
        return answer;
    }
}
