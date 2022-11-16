package Racing;

public class Date {

    private Date() {

    }
    public static boolean validate(String login, String password, String confirmPassword) {
        try {
            check(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
    private static void check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (validate(login)) {
            throw new WrongLoginException("Логин не верный");
        }
        if (validate(password)) {
            throw new WrongPasswordException("Пароль не верный");
        }
        if (!confirmPassword.equals(password)) {
            throw new WrongPasswordException("Пароли не совпадают");
        } else {
            System.out.println("Введенные данные корректны");
        }
    }
    public static boolean validate(String check) {
        return !check.matches("[A-Za-z0-9_]{1,20}");
    }
}

