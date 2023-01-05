
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
        WeddingValidator weddingValidator = new WeddingValidator();
        return weddingValidator.checkWedding(studentOrder);
    }

    static AnswerChildren checkChildren(StudentOrder studentOrder) {
        ChildrenValidator childrenValidator = new ChildrenValidator();
        return childrenValidator.checkChildren(studentOrder);
    }

    static AnswerStudent checkStudent(StudentOrder studentOrder) {
        StudentValidator studentValidator = new StudentValidator();
        return studentValidator.checkStudent(studentOrder);
    }

    static void sendMail(StudentOrder studentOrder) {
        MailSender mailSender = new MailSender();
        mailSender.sendMail(studentOrder);
    }
}
