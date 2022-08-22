import java.io.*;
import java.util.*;

public class dictionaries_and_map {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        Map<String,Integer> tempPhoneBook=new HashMap<>();
        for(int i=0;i<n;i++){
            String name=scan.next();
            int phone=scan.nextInt();
            tempPhoneBook.put(name,phone);
        }
        
        while(scan.hasNext()){
            String str=scan.next();
            
            if(tempPhoneBook.containsKey(str)){
                System.out.println(str+"="+tempPhoneBook.get(str));        
            }
            else{
                System.out.println("Not found");
            }
        }
        scan.close();
    }
}