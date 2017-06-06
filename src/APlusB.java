import java.util.Scanner;

class APlusB {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.nextLine();
        String[] input = in.split(" ");

        if(input.length > 2) {
            System.out.println("Invalid input!");
            System.exit(0);
        }
        else if(Integer.parseInt(input[0]) < 0 || Integer.parseInt(input[0]) > 9 || Integer.parseInt(input[1]) < 0 || Integer.parseInt(input[1]) > 9 ){
            System.out.println("Invalid input!!");
            System.exit(0);
        }
        else{
            System.out.println( Integer.parseInt(input[0]) + Integer.parseInt(input[1]));
        }
    }
}