package util;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Karel Vandenberghe
 * Vraagt een gebruiker om input (int, double of String) en rekent af met InputMismatch en IllegalArgument Exceptions.
 * Bij integers en doubles zijn de opties "groter dan", "kleiner dan" en "tussen" beschikbaar.
 */


public class InputHandler {

    private String vraag;
    private String foutmelding;
    private int antwoordInt;
    private int antwoordIntGroterDan;
    private int antwoordIntKleinerDan;
    private int antwoordIntTussen;
    private double antwoordDouble;
    private double antwoordDoubleGroterDan;
    private double antwoordDoubleKleinerDan;
    private double antwoordDoubleTussen;
    private String antwoordString;


    public InputHandler(String foutmelding) {
        this.foutmelding = foutmelding;
    }

    public InputHandler() {
        this("\nOngeldige invoer");
    }

    public String getFoutmelding() {
        return foutmelding;
    }

    public void setFoutmelding(String foutmelding) {
        this.foutmelding = foutmelding;
    }

    public int getAntwoordInt() {
        return antwoordInt;
    }

    public double getAntwoordDouble() {
        return antwoordDouble;
    }

    public String getAntwoordString() {
        return antwoordString;
    }

    public int getAntwoordIntGroterDan() {
        return antwoordIntGroterDan;
    }

    public double getAntwoordDoubleGroterDan() {
        return antwoordDoubleGroterDan;
    }

    public int getAntwoordIntKleinerDan() {
        return antwoordIntKleinerDan;
    }

    public int getAntwoordIntTussen() {
        return antwoordIntTussen;
    }

    public double getAntwoordDoubleKleinerDan() {
        return antwoordDoubleKleinerDan;
    }

    public double getAntwoordDoubleTussen() {
        return antwoordDoubleTussen;
    }

    public void vraagInt(String vraag) {
        Scanner invoerVrager = new Scanner(System.in);
        boolean onjuisteInvoer = true;
        while (onjuisteInvoer) {
            try {
                System.out.print(vraag);
                antwoordInt = invoerVrager.nextInt();
                onjuisteInvoer = false;
            } catch (InputMismatchException e) {
                System.out.println(getFoutmelding());
                invoerVrager.nextLine();
            }
        }
    }

    public void vraagIntGroterDan(String vraag, int getal) {
        Scanner invoerVrager = new Scanner(System.in);
        boolean onjuisteInvoer = true;
        while (onjuisteInvoer) {
            try {
                System.out.print(vraag);
                antwoordIntGroterDan = invoerVrager.nextInt();
                onjuisteInvoer = false;
                if (antwoordIntGroterDan <= getal) {
                    onjuisteInvoer = true;
                    throw new IllegalArgumentException();
                }
            } catch (InputMismatchException e) {
                System.out.println(getFoutmelding());
                invoerVrager.nextLine();
            } catch (IllegalArgumentException i) {
                System.out.printf("\nHet getal moet groter zijn dan %d.\n", getal);
                invoerVrager.nextLine();
            }
        }
    }

    public void vraagIntKleinerDan(String vraag, int getal) {
        Scanner invoerVrager = new Scanner(System.in);
        boolean onjuisteInvoer = true;
        while (onjuisteInvoer) {
            try {
                System.out.print(vraag);
                antwoordIntKleinerDan = invoerVrager.nextInt();
                onjuisteInvoer = false;
                if (antwoordIntKleinerDan >= getal) {
                    onjuisteInvoer = true;
                    throw new IllegalArgumentException();
                }
            } catch (InputMismatchException e) {
                System.out.println(getFoutmelding());
                invoerVrager.nextLine();
            } catch (IllegalArgumentException i) {
                System.out.printf("\nHet getal moet kleiner zijn dan %d.\n", getal);
                invoerVrager.nextLine();
            }
        }
    }

    public void vraagIntTussen(String vraag, int min, int max) {
        Scanner invoerVrager = new Scanner(System.in);
        boolean onjuisteInvoer = true;
        while (onjuisteInvoer) {
            try {
                System.out.print(vraag);
                antwoordIntTussen = invoerVrager.nextInt();
                onjuisteInvoer = false;
                if (antwoordIntTussen < min || antwoordIntTussen > max) {
                    onjuisteInvoer = true;
                    throw new IllegalArgumentException();
                }
            } catch (InputMismatchException e) {
                System.out.println(getFoutmelding());
                invoerVrager.nextLine();
            } catch (IllegalArgumentException i) {
                System.out.printf("\nHet getal moet tussen %d en %d liggen (inclusief uitersten).\n", min, max);
                invoerVrager.nextLine();
            }
        }
    }

    public void vraagDouble(String vraag) {
        Scanner invoerVrager = new Scanner(System.in);
        boolean onjuisteInvoer = true;
        while (onjuisteInvoer) {
            try {
                System.out.print(vraag);
                antwoordDouble = invoerVrager.nextDouble();
                onjuisteInvoer = false;
            } catch (InputMismatchException e) {
                System.out.println(getFoutmelding());
                invoerVrager.nextLine();
            }
        }
    }

    public void vraagDoubleGroterDan(String vraag, double getal) {
        Scanner invoerVrager = new Scanner(System.in);
        boolean onjuisteInvoer = true;
        while (onjuisteInvoer) {
            try {
                System.out.print(vraag);
                antwoordDoubleGroterDan = invoerVrager.nextDouble();
                onjuisteInvoer = false;
                if (antwoordDoubleGroterDan <= getal) {
                    onjuisteInvoer = true;
                    throw new IllegalArgumentException();
                }
            } catch (InputMismatchException e) {
                System.out.println(getFoutmelding());
                invoerVrager.nextLine();
            } catch (IllegalArgumentException i) {
                System.out.printf("\nHet getal moet groter zijn dan %.2f.\n", getal);
                invoerVrager.nextLine();
            }
        }
    }

    public void vraagDoubleKleinerDan(String vraag, double getal) {
        Scanner invoerVrager = new Scanner(System.in);
        boolean onjuisteInvoer = true;
        while (onjuisteInvoer) {
            try {
                System.out.print(vraag);
                antwoordDoubleKleinerDan = invoerVrager.nextDouble();
                onjuisteInvoer = false;
                if (antwoordDoubleKleinerDan >= getal) {
                    onjuisteInvoer = true;
                    throw new IllegalArgumentException();
                }
            } catch (InputMismatchException e) {
                System.out.println(getFoutmelding());
                invoerVrager.nextLine();
            } catch (IllegalArgumentException i) {
                System.out.printf("\nHet getal moet kleiner zijn dan %.2f.\n", getal);
                invoerVrager.nextLine();
            }
        }
    }

    public void vraagDoubleTussen(String vraag, double min, double max) {
        Scanner invoerVrager = new Scanner(System.in);
        boolean onjuisteInvoer = true;
        while (onjuisteInvoer) {
            try {
                System.out.print(vraag);
                antwoordDoubleTussen = invoerVrager.nextDouble();
                onjuisteInvoer = false;
                if (antwoordDoubleTussen < min || antwoordDoubleTussen > max) {
                    onjuisteInvoer = true;
                    throw new IllegalArgumentException();
                }
            } catch (InputMismatchException e) {
                System.out.println(getFoutmelding());
                invoerVrager.nextLine();
            } catch (IllegalArgumentException i) {
                System.out.printf("\nHet getal moet tussen %.2f en %.2f liggen (inclusief uitersten).\n", min, max);
                invoerVrager.nextLine();
            }
        }
    }


    public void vraagString(String vraag) {
        Scanner invoerVrager = new Scanner(System.in);
        boolean onjuisteInvoer = true;
        while (onjuisteInvoer) {
            try {
                System.out.print(vraag);
                antwoordString = invoerVrager.nextLine();
                onjuisteInvoer = false;
            } catch (InputMismatchException e) {
                System.out.println(getFoutmelding());
                invoerVrager.nextLine();
            }
        }
    }
} // Class InputWithExceptionHandler

