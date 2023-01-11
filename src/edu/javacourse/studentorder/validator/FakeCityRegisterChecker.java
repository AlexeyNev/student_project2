package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.Exception.CityRegisterException;
import edu.javacourse.studentorder.domain.Adult;
import edu.javacourse.studentorder.domain.Child;
import edu.javacourse.studentorder.domain.CityRegisterCheckerResponse;
import edu.javacourse.studentorder.domain.Person;

public class FakeCityRegisterChecker implements CityRegisterChecker{

    public static final String GOOD_1 = "1000";
    public static final String GOOD_2 = "2000";
    public static final String BAD_1 = "1001";
    public static final String BAD_2 = "2001";
    public static final String ERROR_1 = "1002";
    public static final String ERROR_2 = "2002";

    @Override
    public CityRegisterCheckerResponse checkPerson(Person person) throws CityRegisterException {
        CityRegisterCheckerResponse res = new CityRegisterCheckerResponse();

        if (person instanceof Adult) {
            Adult tmp = (Adult) person;
            String ps = tmp.getPassportSeria();
            if (ps.equals(GOOD_1) || ps.equals(GOOD_2)) {
                res.setExisting(true);
                res.setTemporal(false);
            }
            if (ps.equals(BAD_1) || ps.equals(BAD_2)) {
                res.setTemporal(false);
            }
            if (ps.equals(ERROR_1) || ps.equals(ERROR_2)) {
                CityRegisterException ex = new CityRegisterException("FAKE ERROR " + ps);
                throw ex;
            }
        }
            if (person instanceof Child) {
                res.setExisting(true);
                res.setTemporal(true);
            }
        System.out.println(res);
        return res;
    }
}
