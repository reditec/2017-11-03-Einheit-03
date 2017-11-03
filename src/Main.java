import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Aufgabe 1
        zahlenAusgeben();
        zahlenAusgebenSgl();
        System.out.println("");
        zahlenAusgebenRev();
        System.out.println("");
        zahlenAusgebenReihe();
        System.out.println("");
        zahlenAusgebenZweiteReihe();
        System.out.println("");

        // Aufgabe 2
        enterDetails();

        // Aufgabe 3
        basketballA();
        basketballB();
        basketballC();
        pinA();
        pinB();
    }

    // Aufgabe 1

    private static void zahlenAusgeben() {
        for(int i =1; i<=100; i++)
        {
            System.out.println(i);
        }
    }

    private static void zahlenAusgebenSgl()
    {
        System.out.print(1);
        for(int i =2; i <= (100); i++)
        {
            System.out.print(" " + i);
        }
    }

    private static void zahlenAusgebenRev()
    {
        int max = 100;
        System.out.print(max);
        for(int i = max - 1; i >= 1; i--)
        {
            System.out.print(" " + i);
        }
    }

    private static void zahlenAusgebenReihe()
    {
        for(int i = 1; i <= 20; i++)
        {
            System.out.print((int) Math.pow (2, i - 1) + " ");
        }
    }

    private static void zahlenAusgebenZweiteReihe()
    {
        long x = 1, y = 1, sum = 0;
        for(int i = 1; i <= 50; i++)
        {
            x = y;
            y = sum;
            sum = x + y;
            System.out.print(sum + " ");
        }
    }

    // Aufgabe 2

    private static String input(String output) {
        System.out.println(output);
        Scanner myScanner = new Scanner(System.in);
        return myScanner.nextLine();
    }

    private static void enterDetails() {
        String eingabe = ":";
        while(eingabe.contains(":")) {
            eingabe = input("Erzähle mir etwas über Dich:");
            if(eingabe.contains(":"))
            {
                if(eingabe.contains("Lieblingsfach"))
                    System.out.println("Schön. Du beschäftigst Dich gerne mit " + eingabe.substring(eingabe.indexOf(":") + 2)+ "!");
                else
                    System.out.println("Aha. Du magst also " + eingabe.substring(eingabe.indexOf(":") + 2) + ".");
            }
        }
        System.out.println("Dann halt nicht!");
    }

    // Aufgabe 3

    private static void basketballA() {
        int teamA = 0, teamB = 0;

        while(teamA  <= 99)
        {
            if(teamA != 1)
            {
                teamB = 0;
                while(teamB <= 99)
                {
                    if(teamB != 1)
                        System.out.println(teamA + " : " + teamB);
                    teamB++;
                }
            }
            teamA++;
        }
    }

    private static void basketballB() {
        int teamA = 0, teamB = 0;

        while(teamA  <= 3)
        {
            teamB = 0;
            while(teamB <= 3)
            {
                System.out.println(teamA + " : " + teamB);
                teamB++;
            }
            teamA++;
        }
    }

    private static void basketballC() {
        int teamA = 0, teamB = 0, max = 3;

        while(teamA  <= max)
        {
            teamB = 0;
            while(teamB <= max)
            {
                System.out.println(teamA + " : " + teamB);
                teamB++;
            }
            teamA++;
        }
    }

    private static void pinA() {
        for(int i=0; i <= 9999; i++)
        {
            if(! String.valueOf(i).contains("0"))
                System.out.println(i);
        }
    }

    private static void pinB() {
        for(int i=0; i <= 9999; i++)
        {
            if(String.valueOf(i).contains("0"))
                System.out.println(i);
        }
    }


}
