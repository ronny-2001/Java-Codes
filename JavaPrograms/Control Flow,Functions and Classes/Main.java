import java.util.Scanner;

public class Main {
    public static boolean announceDeveloperTeaTime(){
        System.out.println("Waiting for developer tea time.....");
        //boolean value=true;
        while (true) {

            System.out.print("Type a first name and enter to start developer tea time:");
            Scanner input = new Scanner(System.in);
            String name=input.next();

            if (name.equals("Rohan")) {
                System.out.println("It's developer tea time "+name+" .....");
                //value=false;
                //return value=false;
                return false;
            } else {
                System.out.println("Sorry please enter correct name.");

            }

        }
    }
    public static void main(String[] arguments){
        announceDeveloperTeaTime();
    }
}