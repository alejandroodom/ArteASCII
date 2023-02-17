import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anchura, altura;
        char caracter;
        System.out.print("¿Anchura? \n");
        anchura = sc.nextInt();
        System.out.print("¿Altura? \n");
        altura = sc.nextInt();
        System.out.print("¿Carácter? \n");
        caracter = sc.next().charAt(0);

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
}

