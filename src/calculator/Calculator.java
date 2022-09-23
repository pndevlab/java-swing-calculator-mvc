package calculator;

public final class Calculator {

    /**
     * The main function: starts the application.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Assemble all the pieces of the MVC
        new CalculatorController(new CalculatorModel(), new CalculatorView());
    }
}
