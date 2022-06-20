import java.awt.*;
import java.util.Scanner;
import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>(); 
        boolean programLoop = true;
        while(programLoop){
            System.out.println("Enter numbers. Type 'STOP' to calculate sum.");
            String input = scn.nextLine();
            if(input == "stop" || input == "STOP"){
                programLoop = false;
            }
            else{
                if(!numberOrNot(input)){
                    System.out.println("Not a number...");
                    continue;
                }
                else{
                    numbers.add(Integer.parseInt(input));
                }
            }

            
            

        }
        Integer sum = 0;
        Integer sumEquals = 0;
        scn.close();
        
        for (Integer number : numbers) {
            sum += number;
            sumEquals = sumEquals + number;
        }
        System.out.println("SUM OF NUMBERS: " + sum);
        System.out.println("SUM OF NUMBERS: " + sumEquals);


    }

    static boolean numberOrNot(String input){
        try{
            Integer.parseInt(input);
        }
        catch(Exception e){
            return false;
        }
        return true;
    }
}
