package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.Exception.CityRegisterException;
import edu.javacourse.studentorder.domain.AnswerCityRegister;
import edu.javacourse.studentorder.domain.CityRegisterCheckerResponse;
import edu.javacourse.studentorder.domain.Person;
import edu.javacourse.studentorder.domain.StudentOrder;

/**
 * protected - уровень доступа, видимость которого в пределах всех классов,
 * находящихся в том же пакете, что и наш и в пределах всех классов-наследников нашего класса.
 */

public class CityRegisterValidator {
    public String hostName;
    protected int port;
    private String login;
    String password;
    private CityRegisterChecker personChecker;

    public CityRegisterValidator() {
        personChecker = new RealCityRegisterChecker();
    }


    public AnswerCityRegister checkCityRegister (StudentOrder studentOrder) {
        try {
            CityRegisterCheckerResponse hus = personChecker.checkPerson(studentOrder.getHusband());
            CityRegisterCheckerResponse wif = personChecker.checkPerson(studentOrder.getWife());
            CityRegisterCheckerResponse chil = personChecker.checkPerson(studentOrder.getChild());
        } catch (CityRegisterException ex) {
            ex.printStackTrace();
        }

        AnswerCityRegister ans = new AnswerCityRegister();
        return ans;
    }
}
