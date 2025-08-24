import java.util.Scanner;

// Program uses methods/functions.
public class MenuDriven {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int arraySize;
        System.out.print("How many students do you want: ");
        arraySize = scanner.nextInt();
        int choice;
        int[] marks = new int[arraySize];
        String[] names = new String[arraySize];
        char[] grades = new char[arraySize];
        int count = 0;
        System.out.println("Enter your choice:\n1. Add Student\n2. Display Student\n3. Search Student\n4. Exit");
        do{
            System.out.print("Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1 :
                    addStudent(marks,names,grades,count);
                    count ++;
                    break;
                case 2 :
                    displayStudent(marks,names,grades,count);
                    break;
                case 3 :
                    searchStudent(marks,names,grades,count);
                    break;
                default :
                    if (choice != 4){
                        System.out.println("Please enter a valid choice:");}
                    else {
                        System.out.println("Thanks for using our program!");
                    }
            } } while (choice!=4);}

    static void addStudent(int[] arr1,String[] arr2,char[] grades,int count){
        System.out.print("Enter student name: ");
        arr2[count] = scanner.nextLine();
        System.out.print("Enter marks : ");
        arr1[count] = scanner.nextInt();
        if (arr1[count] > 90){
            grades[count] ='A';
        }
        else if (arr1[count]  > 80){
            grades[count] = 'B';
        }
        else  if (arr1[count] > 70) {
            grades[count] = 'C';
        }
        else{
            grades[count] = 'F';
        }
    }
    static void displayStudent(int[] arr1, String[] arr2, char[] grades,int count){
        for (int i = 0; i <count ; i++){
            System.out.println(arr2[i] + " - " + "Marks: " + arr1[i] + " - " + "grade: " + grades[i]);
        }
    }

    static void searchStudent(int[] arr1, String[] arr2, char[] grades, int count ){
        boolean found = false;
        System.out.print("Enter the name of the Student you want to search : ");
        String name = scanner.nextLine();
        for (int i = 0 ; i< count ; i++){
            if (arr2[i].equalsIgnoreCase(name)){
                System.out.println(arr2[i] + " - " + "Marks : "+arr1[i]  + " - " + "grade : " + grades[i]);
                found = true;
                break;}
        }
        if (!found){
            System.out.println("Not Found!");
        }
    }}
