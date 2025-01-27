package output;

import math.ComplexNumber;
import math.Vector;

public class Output {

    public static void showMenu() {
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Sumar dos vectores");
        System.out.println("6. Sumar dos números complejos");
        System.out.println("7. Salir");

        System.out.println("Por favor, seleccione una opción:");
    }

    public static void askForOperands() {
        System.out.println("Por favor, introduzca un operando:");
    }

    public static void divisionBetweenZero() {
        System.err.println("División entre cero");
    }

    public static void showResult(int resultado) {
        System.out.println("El resultado es:" + resultado);
    }

    public static void showFarewellMessage() {
        System.out.println("Gracias por usar esta espléndida calculadora");
    }

    public static void askForValue() {
        System.out.println("Por favor, introduzca el valor:");
    }

    public static void showVector(Vector v3) {
        System.out.println(v3.toString());
    }

    public static void showComplexNumber(ComplexNumber cn) {
        System.out.println(cn.toString());
    }
}
