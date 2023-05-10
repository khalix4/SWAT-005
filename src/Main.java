
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
    }



}




