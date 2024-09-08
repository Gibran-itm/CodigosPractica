import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Arrays para elegir aleatoriamente
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] symbols = {'@', '!', '#', '$', '%', '^', '&', '*', '-', '_', ',', '.', '?'};

        // Variables
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        String password;
        int op;


        System.out.println("Password Generator");

        do {
            password = "";

            // Generar letras
            for (int i = 0; i < 4; i++) {
                password = password.concat(String.valueOf(letters[rand.nextInt(24)]));
            }

            // Generar caracteres
            for (int i = 0; i < 4; i++) {
                password = password.concat(String.valueOf(symbols[rand.nextInt(12)]));
            }

            // Generar numeros
            password = password.concat(String.valueOf(rand.nextInt(999)));

            // Mostrar password
            System.out.println(password);

            // Preguntas si seguir programa
            do {
                System.out.println("1.Generate Password\n2.Close Program");
                op = sc.nextInt();
            } while(op != 1 && op != 2);


        } while(op == 1);

        System.out.println("See you!");

    }
}