import java.util.Scanner;

import static java.lang.System.out;

public class PartC {



    private static String reverseString(){
        Scanner myScanner = new Scanner(System.in);

        out.print("Please input your sentence. ");

        String statement = myScanner.nextLine();
        String reverse = "";
        String words[] = statement.split(" ");
        for (String eachWord : words){
            for(int i=eachWord.length()-1; i>-1; i--){
                reverse = reverse.concat("" + eachWord.charAt(i));
            }
            reverse = reverse.concat(" ");
        }
        return reverse;
    }

    private static void circumArea(double radius){
        double circumference = 2*Math.PI*radius;
        double area = Math.PI*radius*radius;
        System.out.println("Area: " + area + " units square\nCircumference: "+ circumference +" units\n");
    }

    public static void main(String[] args) {
        System.out.println(reverseString());
        System.out.println("\n ********************************************* \n");
        circumArea(7);
    }
}
