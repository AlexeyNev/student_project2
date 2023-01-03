
public class StudentOrderVaidator {
    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll() {

        while (true) {
            StudentOrder so = readStudentOrder();

            if (so == null) {
                break;
            }

            AnswerCityRegister cityAnswer = checkCityRegister(so);
            if (!cityAnswer.success) {
//               continue;
                break;
            }

            AnswerWedding answerWedding = checkWedding(so);
            AnswerChildren answerChildren = checkChildren(so);
            AnswerStudent answerStudent = checkStudent(so);

            sendMail(so);
        }
    }


    static StudentOrder readStudentOrder() {
        StudentOrder studentOrder = new StudentOrder();
        return studentOrder;
    }

    static AnswerCityRegister checkCityRegister (StudentOrder studentOrder) {
        CityRegisterValidator crv = new CityRegisterValidator();
        crv.hostName = "host1";
        crv.login = "log";
        crv.password = "1234";

        CityRegisterValidator crv2 = new CityRegisterValidator();
        crv2.hostName = "host2";
        crv2.login = "login";
        crv2.password = "5678";

        AnswerCityRegister ans = crv.checkCityRegister(studentOrder);
        AnswerCityRegister ans2 = crv2.checkCityRegister(studentOrder);

        return ans;
    }

    static AnswerWedding checkWedding(StudentOrder studentOrder) {
        return WeddingValidator.checkWedding(studentOrder);
    }

    static AnswerChildren checkChildren(StudentOrder studentOrder) {
        return ChildrenValidator.checkChildren(studentOrder);
    }

    static AnswerStudent checkStudent(StudentOrder studentOrder) {
        return StudentValidator.checkStudent(studentOrder);
    }

    static void sendMail(StudentOrder studentOrder) {
        System.out.println("почта отправлена");
    }
}
