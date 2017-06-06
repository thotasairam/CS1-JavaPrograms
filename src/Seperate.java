import java.util.ArrayList;
import java.util.Scanner;

public class Seperate {
    public  static  void  main(String[] args){

        String below5 ="" ,above5 = "";

        String input = "" ;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter some digits only  (integers): ");

        input = scan.nextLine();

        for(int i = 0; i < input.length(); i++){

            if(Integer.parseInt(input.charAt(i)+"") <= 4){
                below5 = below5 + input.charAt(i) + " ";
            }
            else {
                above5 = above5 + input.charAt(i)+ " ";
            }
        }

        System.out.println(below5);
        System.out.println(above5);
    }


}

//    15
//    public static boolean adjacentX(char[][] b){
//
//        boolean result = false;
//
//        for(int i = 0; i < b.length-1; i++){
//            for(int j = 0 ; j < b[i].length-1;j++){
//                if(b[i][j] == 'X' && b[i][j+1] == 'X'){
//                    result = true;
//                }
//            }
//        }
//
//        return result;
//    }

//    public static String listToString (ArrayList<Character> b){
//        String result = "";
//        double x = 0;
//
//        if(x >= 3 || x<=7){
//            System.out.println("between");
//        }
//
//        for(int i =0; i>b.size(); i++){
//            result = result + b.get(i);
//        }
//
//        return result;
//    }


//    public static void swapCornners(char[][] b){
//        char temp = b[b.length-1][b.length-1];
//
//        b[b.length-1][b.length-1] = b[0][0];
//
//        b[0][0] = temp;
//    }
//        int d;
//        d = (int)93.93;
//        d = 24 / 8 + 3 + 4;
//        d = 59 %  8;
//        d = 3 + 2 * (12 / (5*2)) + 1;
//        System.out.println(d);




//        19
//        for(int i = 0; i < s.length()-4; i++) {
//            int counter = 0;
//
//            if (s.substring(i, i + 3).toLowerCase().equals("oak")) {
//                counter++;
//            }
//
//            System.out.println(counter);
//        }