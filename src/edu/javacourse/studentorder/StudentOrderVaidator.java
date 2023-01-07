package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.*;
import edu.javacourse.studentorder.mail.MailSender;
import edu.javacourse.studentorder.validator.ChildrenValidator;
import edu.javacourse.studentorder.validator.CityRegisterValidator;
import edu.javacourse.studentorder.validator.StudentValidator;
import edu.javacourse.studentorder.validator.WeddingValidator;

public class StudentOrderVaidator {

    private CityRegisterValidator cityRegisterVal;
    private WeddingValidator weddingVal;
    private ChildrenValidator childrenVal;
    private StudentValidator studentVal;
    private MailSender mailSender;

    public StudentOrderVaidator() {
        cityRegisterVal = new CityRegisterValidator();
        weddingVal = new WeddingValidator();
        childrenVal = new ChildrenValidator();
        studentVal = new StudentValidator();
        mailSender = new MailSender();
    }


    public static void main(String[] args) {
        StudentOrderVaidator studentOrderVaidator = new StudentOrderVaidator();
        studentOrderVaidator.checkAll();
    }

    public void checkAll() {

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


    public StudentOrder readStudentOrder() {
        StudentOrder studentOrder = new StudentOrder();
        return studentOrder;
    }

    public AnswerCityRegister checkCityRegister (StudentOrder studentOrder) {
        return cityRegisterVal.checkCityRegister(studentOrder);
    }

    public AnswerWedding checkWedding(StudentOrder studentOrder) {
        return weddingVal.checkWedding(studentOrder);
    }

    public AnswerChildren checkChildren(StudentOrder studentOrder) {
        return childrenVal.checkChildren(studentOrder);
    }

    public AnswerStudent checkStudent(StudentOrder studentOrder) {
        return studentVal.checkStudent(studentOrder);
    }

    public void sendMail(StudentOrder studentOrder) {
        mailSender.sendMail(studentOrder);
    }
}
