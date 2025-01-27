package math;

public class Mathematics {

    public int add(int sumando1, int sumando2) {
        return sumando1 + sumando2;
    }

    public float add(float sumando1, float sumando2) { return sumando1 + sumando2; }

    public int sub(int minuendo, int sustraendo) {
        return minuendo  - sustraendo;
    }

    public int mult(int multiplicando, int multiplicador) {
        int resultado = 0;

        int mult = multiplicador;
        if (mult < 0) {
            mult = Math.abs(multiplicador);
        }

        for(int i = 0; i < mult; i++) {
            resultado = add(resultado, multiplicando);
        }

        return resultado;
    }

    public int div(int dividendo, int divisor) {
        int cociente;
        int result = dividendo;

        for(cociente = 0; result >= divisor; cociente++) {
            result = sub(result, divisor);
        }

        return cociente;
    }

    public Vector add(Vector v1, Vector v2) {
        Vector resultado;

        float resultadoC1 = add(v1.getComponente1(),v2.getComponente1());
        float resultadoC2 = add(v1.getComponente2(),v2.getComponente2());

        resultado = new Vector(resultadoC1, resultadoC2);

        return resultado;
    }

    public ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
        ComplexNumber complexNumberResult;

        float real = add(c1.real(),c2.real());
        float imaginary = add(c1.imaginary(),c2.imaginary());

        complexNumberResult = new ComplexNumber(real, imaginary);

        return complexNumberResult;
    }
}
