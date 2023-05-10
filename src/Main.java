
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




