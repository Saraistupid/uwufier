import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner uwu = new Scanner(System.in);
        System.out.println("e-entew tewxt to uwufy >-<");

        //TODO: Find a better way to do this other than this long code
        String uwuText = uwu.nextLine();
        uwuText = uwuText.toLowerCase().replace('r', 'w').replace('l', 'w').replace('v', 'f').replaceAll("i", "i-i").replaceAll("l", "l-l").replaceAll("e", "e-e") + " >-<";

        System.out.println(uwuText);
    }

}
