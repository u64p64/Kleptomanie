import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        AufgabeZwei();

    }

    //Aufgabe 2
    public static void AufgabeZwei(){

        //Teilaufgabe 1
        String[] zeichenKette = new String[5];
        Scanner eingabe = new Scanner(System.in);


        out.println("Bitte geben Sie 5 Strings ein: ");
        for (int i = 0; i < zeichenKette.length; i++) {
            out.print((i+1)+". Element: ");
            zeichenKette[i] = eingabe.nextLine();
        }

        for (int i = 0; i < zeichenKette.length; i++) {
            out.println(zeichenKette[i]);
        }

        out.println("-------------------------------");
        Arrays.sort(zeichenKette);

        for (int i = 0; i < zeichenKette.length; i++) {
            out.println(zeichenKette[i]);
        }

        //Teilaufgabe 2

        out.println("Geben Sie ein neues Wort ein: ");
        String wort = eingabe.nextLine();
        boolean wortGefunden = true;

        for (int i = 0; i < zeichenKette.length; i++) {
            if(wort.equals(zeichenKette[i])){
                out.println("Das Wort "+wort+" wurde auf der "+ i +". Stelle im Array gefunden");
                wortGefunden = false;
            }
        }

        if(wortGefunden){
            out.println("Das Wort "+wort+" wurde nicht gefunden");
        }
    }


    //Aufgabe 3



    static int binarySearch(int[] array, int target) {

        return target;
    }


}