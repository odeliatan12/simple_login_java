package simpleLogin;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String username = sc.nextLine();

        Map<String, String> map = new HashMap<>();
        map.put("username", username);
        map.put("Odelia", "s9711243f");

        Integer numberoftimes = 0;
        while(numberoftimes < 3){
            System.out.println("Enter your password:");
            String password = sc.nextLine();

            if(password.equals(map.get("Odelia"))){
                System.out.println("Password is correct");
                break;
            } else if (password.equals("q")){
                System.out.println("quit");
                break;
            } else {
                System.out.println("Password is incorrect");
                continue;
            }
        }
    }
}