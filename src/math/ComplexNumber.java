package math;

public record ComplexNumber(float imaginary, float real) {

    @Override
    public String toString() {
        return real + imaginary + "i";
    }
}
