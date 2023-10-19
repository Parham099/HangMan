import java.util.Random;
import java.util.Scanner;

public class HangmMan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

//     datas
        boolean a = true;
        byte point = 0;
//      Lobby
        while (a) {
            point++;
            System.out.println("             Lobby             ");
            System.out.println("          Play  = Use 1        ");
            //      Lobby Menu
            System.out.println("          Point = Use 2        ");
            System.out.println("          Exit  = Use 3        ");
            byte selection = input.nextByte();
            if (selection == 1) {
                word();
            } else if (selection == 2) {
                System.out.println("=============================");
                System.out.println("           Your Point        ");
                System.out.println("           Point = " + point);
                System.out.println("=============================");
                point--;
            } else if (selection == 3) {
                a = false;
            }
        }
    }
    public static void word() {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        String[] Words1 = {"Airpod", "Paint", "Good", "Book", "Minecraft", "Sheep", "Table", "First", "Wall"};
        int wordselector = random.nextInt(Words1.length);

        int c = 2;
        int d = 1;

        int Word1 = random.nextInt(Words1[wordselector].length() / 2);
        int Word2 = random.nextInt(Words1[wordselector].length());
        if (Word1 == Word2) {
            Word2++;
        }
        boolean a = false;
        boolean b = false;

        for (int i = 0; i < Words1[wordselector].length(); i++) {

            if (i == Word1) {
                System.out.print("_");
            } else if (i == Word2) {
                System.out.print("_");
            } else {
                System.out.print(Words1[wordselector].charAt(i));
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("");
            char vorodi = input.next().charAt(0);

            if (vorodi == Words1[wordselector].charAt(Word1)) {
                System.out.println("afarin");
                c = 3;
            }
            if (vorodi == Words1[wordselector].charAt(Word2)) {
                System.out.println("afarin");
                d = 3;
            } else if (vorodi != Words1[wordselector].charAt(Word2) && vorodi != Words1[wordselector].charAt(Word1)) {
                System.out.println("eshtebahe :(");
            }
            if (c == d) {
                System.out.println("afarin bordi");
                break;
            }
        }
    }
}
/*


         Created By Parham099


 */
