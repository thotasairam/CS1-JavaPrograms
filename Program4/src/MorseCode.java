/**
 * Sai Ram Thota
 * CWID 11573236
 *
 */
import java.util.*;

public class MorseCode {


    //Initializing variables

    final static String A = ".-";
    final static String B = "-...";
    final static String C = "-.-.";
    final static String D = "-..";
    final static String E = ".";
    final static String F = "..-.";
    final static String G = "--.";
    final static String H = "....";
    final static String I = "..";
    final static String J = ".---";
    final static String K = "-.-";
    final static String L = ".-..";
    final static String M = "--";
    final static String N = "-.";
    final static String O = "---";
    final static String P = ".--.";
    final static String Q = "--.-";
    final static String R = ".-.";
    final static String S = "...";
    final static String T = "-";
    final static String U = "..-";
    final static String V = "...-";
    final static String W = ".--";
    final static String X = "-..-";
    final static String Y = "-.--";
    final static String Z = "--..";
    final static String one = ".----";
    final static String two = "..---";
    final static String three = "...--";
    final static String four = "....-";
    final static String five = ".....";
    final static String six = "-....";
    final static String seven = "--...";
    final static String eight = "---..";
    final static String nine = "----.";
    final static String zero = "-----";
    final static String period = ".-...";
    final static String questionMark = ".-..-";
    final static String exclamationMark = ".-.-.";
    final static String space = ".-.--";

    //class for Encryption

    public static String encrypt(String d) {
        d = d.toLowerCase();

        String result = "";

        for (int i = 0; i < d.length(); i++) {
            switch (d.charAt(i)) {
                case 'a':
                    result = result + A +" ";
                    break;
                case 'b':
                    result = result + B +" ";
                    break;
                case 'c':
                    result = result + C +" ";
                    break;
                case 'd':
                    result = result + D +" ";
                    break;
                case 'e':
                    result = result + E +" ";
                    break;
                case 'f':
                    result = result + F +" ";
                    break;
                case 'g':
                    result = result + G +" ";
                    break;
                case 'h':
                    result = result + H +" ";
                    break;
                case 'i':
                    result = result + I +" ";
                    break;
                case 'j':
                    result = result + J + " ";
                    break;
                case 'k':
                    result = result + K +" ";
                    break;
                case 'l':
                    result = result + L +" ";
                    break;
                case 'm':
                    result = result + M +" ";
                    break;
                case 'n':
                    result = result + N +" ";
                    break;
                case 'o':
                    result = result + O +" ";
                    break;
                case 'p':
                    result = result + P +" ";
                    break;
                case 'q':
                    result = result + Q +" ";
                    break;
                case 'r':
                    result = result + R +" ";
                    break;
                case 's':
                    result = result + S +" ";
                    break;
                case 't':
                    result = result + T +" ";
                    break;
                case 'u':
                    result = result + U +" ";
                    break;
                case 'v':
                    result = result + V +" ";
                    break;
                case 'w':
                    result = result + W +" ";
                    break;
                case 'x':
                    result = result + X +" ";
                    break;
                case 'y':
                    result = result + Y +" ";
                    break;
                case 'z':
                    result = result + Z +" ";
                    break;
                case '1':
                    result = result + one +" ";
                    break;
                case '2':
                    result = result + two +" ";
                    break;
                case '3':
                    result = result + three +" ";
                    break;
                case '4':
                    result = result + four+" ";
                    break;
                case '5':
                    result = result + five +" ";
                    break;
                case '6':
                    result = result + six +" ";
                    break;
                case '7':
                    result = result + seven +" ";
                    break;
                case '8':
                    result = result + eight + " ";
                    break;
                case '9':
                    result = result + nine + " ";
                    break;
                case '0':
                    result = result + zero + " ";
                    break;
                case '.':
                    result = result + period+ " ";
                    break;
                case '?':
                    result = result + questionMark + " ";
                    break;
                case '!':
                    result = result + exclamationMark + " ";
                    break;
                case ' ':
                    result = result + space + " ";
                    break;

            }
        }
        return result;
    }

    //add a class to Decryption

    public static String decrypt(String d) {
        String result = "";
        String[] temD = d.split("\\s");

        for (int i = 0; i < temD.length; i++) {
            switch (temD[i]) {
                case A:
                    result = result + "A";
                    break;
                case B:
                    result = result + "B";
                    break;
                case C:
                    result = result + "C";
                    break;
                case D:
                    result = result + "D";
                    break;
                case E:
                    result = result + "E";
                    break;
                case F:
                    result = result + "F";
                    break;
                case G:
                    result = result + "G";
                    break;
                case H:
                    result = result + "H";
                    break;
                case I:
                    result = result + "I";
                    break;
                case J:
                    result = result + "J";
                    break;
                case K:
                    result = result + "K";
                    break;
                case L:
                    result = result + "L";
                    break;
                case M:
                    result = result + "M";
                    break;
                case N:
                    result = result + "N";
                    break;
                case O:
                    result = result + "O";
                    break;
                case P:
                    result = result + "P";
                    break;
                case Q:
                    result = result + "Q";
                    break;
                case R:
                    result = result + "R";
                    break;
                case S:
                    result = result + "S";
                    break;
                case T:
                    result = result + "T";
                    break;
                case U:
                    result = result + "U";
                    break;
                case V:
                    result = result + "V";
                    break;
                case W:
                    result = result + "W";
                    break;
                case X:
                    result = result + "X";
                    break;
                case Y:
                    result = result + "Y";
                    break;
                case Z:
                    result = result + "Z";
                    break;
                case one:
                    result = result + "1";
                    break;
                case two:
                    result = result + "2";
                    break;
                case three:
                    result = result + "3";
                    break;
                case four:
                    result = result + "4";
                    break;
                case five:
                    result = result + "5";
                    break;
                case six:
                    result = result + "6";
                    break;
                case seven:
                    result = result + "7";
                    break;
                case eight:
                    result = result + "8";
                    break;
                case nine:
                    result = result + "9";
                    break;
                case zero:
                    result = result + "0";
                    break;
                case period:
                    result = result + ".";
                    break;
                case questionMark:
                    result = result + "?";
                    break;
                case exclamationMark:
                    result = result + "!";
                    break;
                case space:
                    result = result + " ";
                    break;

            }
        }
        return result;
    }


    //Main class

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        if (args.length > 0) {
            switch (args[0]) {
                case "-d":
                    //Call encrypt method
                    while (n.hasNext()) {
                        System.out.println(decrypt(n.nextLine()));
                    }
                    break;
                case "-e":
                    //Call decrypt method
                    while (n.hasNext()) {
                        System.out.println(encrypt(n.nextLine()));
                    }
                    break;
                default:
                    System.out.println("Morse code program by Sai Ram Thota\n" +
                            "usage: java MorseCode [-e, -d] < inputFile > outputFile");
                    System.exit(0);
            }

        }
        else {
            System.out.println("Morse code program by Sai Ram Thota");
            System.out.println("Please enter \"-d\" for decode and \"-e\" for encode: ");
            String instruction = n.nextLine();

            if (instruction.equals("-d")) {
                System.out.println("Please enter the string you want to decode: ");
                String temp = n.nextLine();
                System.out.println("Decoded string: " + decrypt(temp));
            } else if (instruction.equals("-e")) {
                System.out.println("Please enter the string you want to encode: ");
                String temp = n.nextLine();
                System.out.println("Encoded string: " + encrypt(temp));
            } else {
                System.out.println("Invalid input, please try again!");
                System.out.println("Please enter \"-d\" for decode and \"e\" for encode: ");
                System.exit(0);
            }

        }


    }
}
