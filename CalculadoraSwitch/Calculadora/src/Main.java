import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opcionUsuario;

        do{
            System.out.println("1-Suma\n2-Resta\n3-Multiplicacion\n4-Division");
            System.out.print("Ingrese opcion: ");
            opcionUsuario = input.nextInt();

            // Comprobar que este dentro de las opciones
            if (opcionUsuario >= 1 && opcionUsuario <= 4) {
                int[] nums = Operacion.PedirNums();
                switch (opcionUsuario) {
                    case 1:
                        System.out.println(nums[0] + " + " + nums[1] + " = " + (nums[0] + nums[1]));
                        break;
                    case 2:
                        System.out.println(nums[0] + " - " + nums[1] + " = " + (nums[0] - nums[1]));
                        break;
                    case 3:
                        System.out.println(nums[0] + " * " + nums[1] + " = " + (nums[0] * nums[1]));
                        break;
                    case 4:
                        System.out.println(nums[0] + " / " + nums[1] + " = " + (nums[0] / nums[1]));
                        break;
                }
            } else {
                System.out.println("Valor incorrecto!\n");
            }

        } while (opcionUsuario >= 1 && opcionUsuario <= 4);// Fin while

    } // Fin main
}