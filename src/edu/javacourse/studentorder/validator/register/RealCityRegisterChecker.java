package edu.javacourse.studentorder.validator.register;

import edu.javacourse.studentorder.exception.CityRegisterException;
import edu.javacourse.studentorder.domain.register.CityRegisterResponse;
import edu.javacourse.studentorder.domain.Person;

public class RealCityRegisterChecker implements CityRegisterChecker {

    @Override
    public CityRegisterResponse checkPerson(Person person) throws CityRegisterException {
        return null;
    }
}