
public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder studentOrder = new StudentOrder();
        studentOrder.husbandFirstName = "Alex";
        studentOrder.husbandLastName = "Nevredimov";
        studentOrder.wifeFirstName = "Alla";
        studentOrder.wifeLastName = "Nevredimova";

        StudentOrder studentOrder2 = new StudentOrder();
        studentOrder2.husbandFirstName = "Mars";
        studentOrder2.husbandLastName = "Marsov";
        studentOrder2.wifeFirstName = "Zuzzha";
        studentOrder2.wifeLastName = "Zuzzheva";

        long ans = saveStudentOrder(studentOrder);
        System.out.println(ans);

        long ans2 = saveStudentOrder(studentOrder2);
        System.out.println(ans2);
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder: " + studentOrder.husbandLastName);
        return answer;
    }
}
