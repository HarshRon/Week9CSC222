import java.util.*;
public class Main {
    public static void main(String[] args){
        int[] codes;
        codes = new int[5];
        codes[0] = 321;
        codes[1]=432;
        codes[2]=543;
        codes[3]=654;
        codes[4]=765;
        int i;
    for(i=0;i <5;++i) {
        System.out.println(codes[i]);
    }
        int[] codesAgain = {24, 36, 48, 51, 62};
        double[] sales = new double[10];
        System.out.println("Some codes: " + codesAgain[0] + "  " + codesAgain[1]);
        System.out.println("Some sales: " + sales[0] + "  "  + sales[9]);

        int[] codesWow = {24, 36, 48, 51, 62};
        int x;
        System.out.println("Forwards:");
        for(x = 0; x < codesWow.length; ++x)
            System.out.print(codesWow[x] + "   ");
        System.out.println("\nBackwards:");
        for(x = codesWow.length - 1; x >=0; --x)
            System.out.print(codesWow[x] + "   ");
        int[] zipCodes = {14903,24060,14901,23456,24053};
        System.out.println("\n" + zipCodes[2]);



        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String monthEntered;
        int y;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a three-letter month name abbreviation >> ");
        monthEntered = in.nextLine();
        for(y = 0; y < months.length; ++y)
            if(months[y].equals(monthEntered))
                System.out.println(months[y] + " can have " + days[y] + " days");


        String[] bananas = new String[10];
        for(int bananaCount = 0; bananaCount < bananas.length; ++bananaCount) {
            bananas[bananaCount] = "Bananananana! " + bananaCount;
            System.out.println(bananas[bananaCount]);
        }


        int[] scores = {76, 82, 90, 75, 92, 88};
        int z;
        System.out.println("Before giving each score a bonus:");
        for(z= 0; z < scores.length; ++z)
            System.out.print(scores[z] + "  ");
        System.out.println();
        giveBonus(scores);
        System.out.println("After giving each score a bonus:");
        for(z = 0; z < scores.length; ++z)
            System.out.print(scores[z] + "  ");
        System.out.println();


    }
    public static void giveBonus(int[] testScores)
    {
        int i;
        final int ADJUSTMENT = 6;
        for(i = 0; i < testScores.length; ++ i)
            testScores[i] += ADJUSTMENT;
    }
}
