package validators;

public class Validator {
    public boolean validate(int optionMenu) {
        return (optionMenu >= 1 && optionMenu <= 6);
    }

    public boolean isDivideByZero(int divisor) {
       return (divisor == 0);
    }
}
