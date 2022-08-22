import java.util.Scanner;

public class Fortune_Teller {
    public static void main(String[] args){

        while(true){
            System.out.print("Please enter number between 1 to 10:");
            Scanner input=new Scanner(System.in);
            int n=input.nextInt();
            if (n<=5){
                System.out.println("Enjoy the good luck a friend brings you.....");
            }
            else {
                System.out.println("Your shoe selection will make you very happy today.....");
            }
        }

    }
}