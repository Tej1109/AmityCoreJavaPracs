

import java.util.Scanner;
public class user_input_name_proj2 {
    public  static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + "! Welcome to JAVA Programming!!" );
        scanner.close();
    }
}

