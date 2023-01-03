
public class StudentOrderVaidator {
    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll() {

        while (true) {
            StudentOrder so = readStudentOrder();
            System.out.println("Start");

            if (so == null) {
                break;
            }

            System.out.println("finish");

            AnswerCityRegister cityAnswer = checkCityRegister(so);
            if (!cityAnswer.success) {
               continue;
            }

            AnswerWedding answerWedding = checkWedding(so);
            AnswerChildren answerChildren = checkChildren(so);
            AnswerStudent answerStudent = checkStudent(so);

            sendMail(so);
        }
        System.out.println("finish2");
    }


    static StudentOrder readStudentOrder() {
        StudentOrder studentOrder = new StudentOrder();
        return studentOrder;
    }

    static AnswerCityRegister checkCityRegister (StudentOrder studentOrder) {
        System.out.println("checkCityRegister is running");
        AnswerCityRegister ans = new AnswerCityRegister();
        ans.success = false;
        return ans;
    }

    static AnswerWedding checkWedding(StudentOrder studentOrder) {
        System.out.println("checkWedding is running");
        return new AnswerWedding();
    }

    static AnswerChildren checkChildren(StudentOrder studentOrder) {
        System.out.println("checkChildren is running");
        return new AnswerChildren();
    }

    static AnswerStudent checkStudent(StudentOrder studentOrder) {
        System.out.println("checkStudent is running");
        return new AnswerStudent();
    }

    static void sendMail(StudentOrder studentOrder) {
        System.out.println("почта отправлена");
    }
}
