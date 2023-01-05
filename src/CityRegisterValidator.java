/**
 * protected - уровень доступа, видимость которого в пределах всех классов,
 * находящихся в том же пакете, что и наш и в пределах всех классов-наследников нашего класса.
 */

public class CityRegisterValidator {
    public String hostName;
    public String login;
    public String password;

     AnswerCityRegister checkCityRegister (StudentOrder studentOrder) {
        System.out.println("checkCityRegister is running: "
                + hostName + ", " + login + ", " + password);
        AnswerCityRegister ans = new AnswerCityRegister();
        ans.success = false;
        return ans;
    }
}
