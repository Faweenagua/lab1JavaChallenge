import java.util.Scanner;

import static java.lang.System.out;

public class PartC {



    private static String reverseString(){
        Scanner myScanner = new Scanner(System.in);

        out.print("Please input your sentence. ");
// allows user to enter info
        String statement = myScanner.nextLine();
        String reverse = "";//empty string to allow concatination
        String words[] = statement.split(" ");//spliting the word
        //the for look allows the reversal of each letter in the word
        for (String eachWord : words){
            for(int i=eachWord.length()-1; i>-1; i--){
                reverse = reverse.concat("" + eachWord.charAt(i));
            }
            reverse = reverse.concat(" ");
        }
        return reverse;
    }
    public static void findLength() {
			//stores string data
			String input="programming";
			//finds the length of the string above
			int strlength=input.length();
			System.out.println("string length:"+ strlength);
		}
//the method below calculates the area of a circle and circumference of a circle
    private static void circumArea(double radius){
        double circumference = 2*Math.PI*radius;//calculates the circumference of the circle
        double area = Math.PI*radius*radius;//calculates the area of a circle
        System.out.println("Area: " + area + " units square\nCircumference: "+ circumference +" units\n");
    }

    public static void main(String[] args) {
        System.out.println(reverseString());
        System.out.println("\n ********************************************* \n");
        circumArea(7);
        findLength();
    }
}
