package model;

import util.InputHandler;

/**
 * @author Karel Vandenberghe
 * Vraagt een gebruiker om input (int, double of String) en rekent af met InputMismatch en IllegalArgument Exceptions.
 * Bij integers en doubles zijn de opties "groter dan", "kleiner dan" en "tussen" beschikbaar.
 */


public class InputHandlerTester {
    public static void main(String[] args) {
        // Initialiseer het object en geef de gewenste foutmelding (default: "Ongeldige invoer")
        InputHandler input = new InputHandler("\nDit is geen geldige invoer.");

        // Vraag om een int, string en double totdat de correcte invoer is ingevoerd

        input.vraagIntGroterDan("Geef een geheel getal groter dan 0: ", 0);
        input.vraagIntKleinerDan("Geef een geheel getal kleiner dan 4: ", 4);
        input.vraagIntTussen("Geef een geheel getal tussen -20 en 34: ", -20, 34);

        input.vraagString("Geef een string: ");

        // Verander desgewenst tussendoor de foutmelding
        input.setFoutmelding("\nDit is geen geldig getal (gebruik een komma in plaats van een punt).");

        input.vraagDoubleGroterDan("Geef een decimaal getal (met ',') groter dan 4,34: ",4.34);
        input.vraagDoubleKleinerDan("Geef een decimaal getal (met ',') kleiner dan 4,34: ",4.34);
        input.vraagDoubleTussen("Geef een decimaal getal tussen -2,45 en 34,56: ", -2.45, 34.56);

        // Gebruik de getter om de invoer te gebruiken in de applicatie
        System.out.println("\nHet geheel getal was: " + input.getAntwoordIntGroterDan());
        System.out.println("De string was: " + input.getAntwoordString());
        System.out.println("De int tussen was: " + input.getAntwoordIntTussen());
        System.out.println("Het decimaal getal groter dan was: " + input.getAntwoordDoubleGroterDan());
        System.out.println("Het decimaal getal kleiner dan was: " + input.getAntwoordDoubleKleinerDan());
        System.out.println("Het decimaal getal tussen was: " + input.getAntwoordDoubleTussen());
    }
}
