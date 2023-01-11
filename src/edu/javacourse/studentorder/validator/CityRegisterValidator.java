package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.Exception.CityRegisterException;
import edu.javacourse.studentorder.domain.*;

import java.util.Iterator;
import java.util.List;

/**
 * protected - уровень доступа, видимость которого в пределах всех классов,
 * находящихся в том же пакете, что и наш и в пределах всех классов-наследников нашего класса.
 */

public class CityRegisterValidator {

    private CityRegisterChecker personChecker;

    public CityRegisterValidator() {
        personChecker = new FakeCityRegisterChecker();
    }


    public AnswerCityRegister checkCityRegister (StudentOrder studentOrder) {
        try {
            CityRegisterCheckerResponse hus = personChecker.checkPerson(studentOrder.getHusband());
            CityRegisterCheckerResponse wif = personChecker.checkPerson(studentOrder.getWife());

            List<Child> children = studentOrder.getChildren();

            for (Child child : children) {
                CityRegisterCheckerResponse chil = personChecker.checkPerson(child);
            }

//            for (Iterator<Child> it = children.iterator(); it.hasNext();) {
//                Child child = it.next();
//                CityRegisterCheckerResponse chil = personChecker.checkPerson(child);
//            }

//            for (int i = 0; i < studentOrder.getChildren().size(); i++) {
//                CityRegisterCheckerResponse chil =
//                        personChecker.checkPerson(children.get(i));
//            }

        } catch (CityRegisterException ex) {
            ex.printStackTrace(System.out);
        }
        AnswerCityRegister ans = new AnswerCityRegister();
        return ans;
    }
}
