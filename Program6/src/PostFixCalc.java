/**
 * Sai Ram Thota
 * CWID 11573236
 *
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;


public class PostFixCalc {

    //Global Variables
    public static boolean isCommandPromptOn = true;

    public static HashMap<String,Integer> myVariables = new HashMap<String, Integer>();

    public static String[] input;

    public static boolean variableCalcuation = false;

    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Integer postfix calculator with memory by Sai Ram Thota");

        do
        {
            System.out.print("\n> ");
            input = myScanner.nextLine().split("\\s");
            commandOperator(input);

        }while(isCommandPromptOn);
    }

    /**
     * commandOperator is void method. This method manages the calculator commands and
     * assignment.
     *
     * @param command is a Array of the words of the line read by the myScanner
     */

    public static void commandOperator(String[] command)
    {
        variableCalcuation = false;

        if(command.length > 1)
        {
            //Assignment passed to postFixExpr and "put" myVariables(HashMap)
            if(command[1].equals("="))
            {
                variableCalcuation = true;
                int temp = postFixExpr(Arrays.copyOfRange(command,2,command.length));
                if(temp != -123) {
                    myVariables.put(command[0], temp);
                }
                return;
            }
        }

        for (int i = 0; i < command.length; i++)
        {
            switch (command[i])
            {

                case "quit":
                    isCommandPromptOn = false;
                    break; //check command.length==0
                case "clear":
                    myVariables.clear();
                    break;
                case "delete":
                    myVariables.remove(command[i + 1]);
                    break;
                case "var":
                    System.out.println(myVariables);
                    break;
                case "":
                    System.out.println("Invalid input!");
                    break;
                default:
                    postFixExpr(command);
                    return;
            }
        }

    }

    //Calculating Post-Fix Expression called by commandAssignment
    public static int postFixExpr(String[] exprArray)
    {
        int result = -123;
        Stack<Integer> exprStack = new Stack <Integer>();

        for (int i =0; i < exprArray.length;i++)
        {
            try {
                switch (exprArray[i]) {
                    //add more boolean checks for operators and numbers
                    case "+":
                        int sum = exprStack.pop() + exprStack.pop();
                        exprStack.push(sum);
                        break;

                    case "-":
                        int b = exprStack.pop();
                        int a = exprStack.pop();
                        exprStack.push(a - b);
                        break;

                    case "*":
                        exprStack.push(exprStack.pop() * exprStack.pop());
                        break;

                    case "/":
                        double b1 = exprStack.pop();
                        double a1 = exprStack.pop();
                        if (b1 == 0) {
                            System.out.println("Division by zero. Undefined.");
                            result = -123;
                            break;
                        }
                        exprStack.push((int) (a1 / b1));
                        break;

                    case "^":
                        int b2 = exprStack.pop();
                        int a2 = exprStack.pop();
                        exprStack.push((int) (Math.pow(a2, b2)));
                        break;

                    case "!":
                        int a3 = exprStack.pop();
                        exprStack.push(factorialCalculator(a3));
                        break;

                    case "":
                        System.out.println("Invalid Input. Please try again!");
                        break;

                    default:

                        if (myVariables.containsKey(exprArray[i])) {

                            exprStack.push(myVariables.get(exprArray[i]));

                        } else {//New variable or Number

                            try {//number

                                exprStack.push(Integer.parseInt(exprArray[i]));

                            } catch (Exception e) {

                                myVariables.put(exprArray[i], 0);

                                try {//initialize new variable and "push" it in myVariables

                                    exprStack.push(myVariables.get(exprArray[i]));

                                } catch (Exception e1) {
                                    System.out.println("Error: " + e);
                                }

                            }
                        }
                        break;
                }
            }
            catch (Exception e){
                if(!variableCalcuation){

                    System.out.println("Error! Too many operators.");

                }else
                {
                    System.out.println("Error! Too many operators. ");
                    return -123;
                }
            }

        }

        if(exprStack.size() == 0){
            if(variableCalcuation){
                return -123;
            }
            return result;
        }
        else if(exprStack.size() == 1 ){
            result = exprStack.pop();
            System.out.println(result);
            return result;
        }
        else
        {
            if(variableCalcuation){
                System.out.println("Error! Not enough operators.");
                return -123;
            }

            System.out.println("Error! Not enough operators.");
            return result;
        }

    }

    public static int factorialCalculator(int num){

        if(num == 0){
            return 1;
        }
        else{
            return num * factorialCalculator(num -1);
        }

    }


}