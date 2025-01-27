package main;

import input.Input;
import math.ComplexNumber;
import output.Output;
import validators.Validator;
import math.Mathematics;
import math.Vector;

public class CalculatorApp {


    private static Input input;
    private static Mathematics math;

    private static int optionMenu;

    public static final int ADD = 1;
    public static final int SUBTRACT = 2;
    public static final int MULTIPLICATION = 3;
    public static final int DIVISION = 4;
    public static final int ADD_VECTORS = 5;
    private static final int ADD_COMPLEX_NUMBERS = 6;
    public static final int EXIT = 7;

    public static void main(String[] args) {

        int numero = (int) (Math.random() * 3) + 1;
        System.out.println(numero);

        input = new Input();
        math = new Mathematics();

        boolean userWantsToExit;

        do {

            validationProcess();

            userWantsToExit = (optionMenu == EXIT);
            if (!userWantsToExit) {
                executeOperation();
            }

        } while(!userWantsToExit);

        exit();
    }

    private static void exit() {
        Output.showFarewellMessage();
        System.exit(0);
    }

    private static void validationProcess() {
        boolean isValid;
        do {

            showMenu();

            getOptionMenu();

            isValid = validateOptionMenu();

        } while(!isValid);
    }

    private static void executeOperation() {
        switch(optionMenu) {
            case ADD:
                add();
                break;
            case SUBTRACT:
                sub();
                break;
            case MULTIPLICATION:
                multiplication();
                break;
            case DIVISION:
                division();
                break;
            case ADD_VECTORS:
                addVectors();
                break;
            case ADD_COMPLEX_NUMBERS:
                addComplexNumbers();
                break;
        }
    }

    private static void add() {
        int[] operandos = askForOperands();
        int resultado = math.add(operandos[0], operandos[1]);
        Output.showResult(resultado);
    }

    private static void sub() {
        int[] operandos = askForOperands();
        int resultado = math.sub(operandos[0], operandos[1]);
        Output.showResult(resultado);
    }

    private static void multiplication() {
        int[] operandos = askForOperands();
        int resultado = math.mult(operandos[0], operandos[1]);
        Output.showResult(resultado);
    }

    private static void division() {
        int[] operandos = askForOperands();
        Validator validator = new Validator();
        boolean isDivideByZero = validator.isDivideByZero(operandos[1]);
        if (!isDivideByZero) {
            int resultado = math.div(operandos[0], operandos[1]);
            Output.showResult(resultado);
        } else {
            Output.divisionBetweenZero();
        }
    }

    private static void addVectors() {
        Vector v1 = populateVector();
        Vector v2 = populateVector();

        Vector v3 = math.add(v1, v2);

        Output.showVector(v3);
    }

    private static Vector populateVector() {
        Output.askForValue();
        float c1 = input.getFloatValue();
        Output.askForValue();
        float c2 = input.getFloatValue();

        return new Vector(c1, c2);
    }

    private static int[] askForOperands() {
        int[] operandos = new int[2];

        Output.askForOperands();
        operandos[0] = input.getIntValue();

        Output.askForOperands();
        operandos[1] = input.getIntValue();

        return operandos;
    }

    private static void showMenu() {
        Output.showMenu();
    }

    private static void getOptionMenu() {
        optionMenu = input.getOptionMenu();
    }

    private static boolean validateOptionMenu() {
       Validator validator = new Validator();
       return validator.validate(optionMenu);
    }

    private static void addComplexNumbers() {
        ComplexNumber cn1 = populateComplexNumber();
        ComplexNumber cn2 = populateComplexNumber();

        ComplexNumber cn3 = math.add(cn1, cn2);

        Output.showComplexNumber(cn3);
    }

    private static ComplexNumber populateComplexNumber() {
        Output.askForValue();
        float c1 = input.getFloatValue();
        Output.askForValue();
        float c2 = input.getFloatValue();

        return new ComplexNumber(c1, c2);
    }
}
