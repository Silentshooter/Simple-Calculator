import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        float number_1, number_2;
        System.out.println("Enter number 1");
        Scanner scan= new Scanner(System.in);
        number_1= scan.nextFloat();
        System.out.println("Enter number 2");
        Scanner scan2= new Scanner(System.in);
        number_2= scan.nextFloat();
        System.out.print("You have entered: ");
        System.out.print(number_1);
        System.out.print(" and ");
        System.out.println(number_2);
        String prompt= "Enter 0 for addition , 1 for substraction, 2 multiplication, 3 for divisiobn ";
        System.out.println(prompt);
        int input= scan.nextInt();
        switch (input){
            case 0:
                System.out.println("Adding two numbers");
                System.out.print("The result is: ");
                System.out.println(number_1+number_2);
                break;
                case 1:
                    System.out.println("Substracting two numbers");
                    System.out.print("The result is: ");
                    System.out.println(number_1-number_2);
                    break;
                case 2:
                    System.out.println("Multiplying two numbers");
                    System.out.print("The result is : ");
                    System.out.println(number_1*number_2);
                    break;
                case 3:
                    System.out.println("Divding two numbers");
                    System.out.print("The result is: ");
                    System.out.println(number_1/number_2);
                    break;
            default:
                System.out.println("Invalid input");

        }

}
}