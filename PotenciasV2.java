import java.util.Scanner;
public class PotenciasV2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, exponente;
        System.out.print("Ingresa el primer número base: ");
        base = sc.nextInt();
        System.out.print("Ingresa el exponente: ");
        exponente = sc.nextInt();
        int resultado = 1;
        for (int i = 1; i <= exponente; i++) {
            resultado = resultado * base;
        }
        
        System.out.println(base + " elevado a la " + exponente + " es: " + resultado);
    }
}
