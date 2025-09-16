import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your assignment grade in percent: ");
        String input = in.nextLine();
        String percent = input.replace("%","");
        float grade = Float.parseFloat(percent);

    if(grade>=0.0){

        if(grade<=110.0){


            if(grade>=93.0){
                System.out.println("Your Grade is an A");

            }else if(grade>=89.0){
                System.out.println("Your Grade is a AB");

            }else if(grade>=85.0){
                System.out.println("Your Grade is a B");

            }else if(grade>=81.0){
                System.out.println("Your Grade is a BC");

            }else if(grade>=77.0){
                System.out.println("Your Grade is a C");

            }else if(grade>=74.0){
                System.out.println("Your Grade is a CD");

            }else if(grade>=70.0){
                System.out.println("Your Grade is a D");
            }
        }
    }
}



}

