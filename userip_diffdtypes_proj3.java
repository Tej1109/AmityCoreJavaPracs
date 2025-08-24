import  java.util.Scanner;
public class userip_diffdtypes_proj3 {
    public  static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name : ");
        String name = scanner.nextLine();
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Please enter your marks: ");
        double marks = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Please enter your gender : ");
        char gender = scanner.nextLine().toUpperCase().charAt(0);

        System.out.println("Name    Age    Gender    Marks");
        System.out.println(name + "    " +age+"    "+gender+ "    "  + marks);
        scanner.close();
    }
}
