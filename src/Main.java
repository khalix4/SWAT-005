
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Energy energy = new Energy();
        energy.accessingGravity();

        Scanner input = new Scanner(System.in);
        try {
            float mass = input.nextFloat();
            float height = input.nextFloat();

            System.out.println(PotentialEnergy(mass, height));
        } catch (InputMismatchException ime) {
            System.out.println("Enter a valid number");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
        public static void main(String[] args) {
        Energy energy = new Energy();
       

        Scanner input = new Scanner(System.in);
        try {
            float force= input.nextFloat();
            float distance = input.nextFloat();
         System.out.println(Workdone(force, distance));
        } catch (InputMismatchException ime) {
            System.out.println("Enter a valid number");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
        
    }
        public static void main(String[] args) {
        Energy energy = new Energy();
       

        Scanner input = new Scanner(System.in);
        try {
            float distance = input.nextFloat();
            float time = input.nextFloat();

            System.out.println(speed(distance, time));
        } catch (InputMismatchException ime) {
            System.out.println("Enter a valid number");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }



}
     public static void main(String[] args) {
        Energy energy = new Energy();
       

        Scanner input = new Scanner(System.in);
        try {
            float mass = input.nextFloat();
            float acceleration = input.nextFloat();

            System.out.println(Force(mass, acceleration));
        } catch (InputMismatchException ime) {
            System.out.println("Enter a valid number");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }



}
     public static void main (string[] args) {
         Energy energy = new Energy();
         
         
         scanner input = new scanner(System.in);
         try{
             float force = input.nextfloat();
             float area = input.nextfloat();
             
             system.out.printIn(pressure(force, area));
         } catch (InputMismatchException ime) {
             system.out.printIn("Enter a valid number");
         } catch (Excepton e) {
             system.out,printIn("something went wrong");
         }
     }



