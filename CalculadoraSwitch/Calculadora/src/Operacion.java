import java.util.Scanner;

public class Operacion {

    static Scanner input = new Scanner(System.in);
    static int num1;
    static int num2;

    public static int[] PedirNums () {
        System.out.println("Ingrese el primer valor: ");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        num2 = input.nextInt();
        return new int[]{num1, num2};
    }

} // Fin Operacion