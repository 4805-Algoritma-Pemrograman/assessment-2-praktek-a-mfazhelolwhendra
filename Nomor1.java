import java.util.Scanner;

public class Ganjilangka {

   
    public static void angkaGanjil(int n) {
        System.out.println("Angka ganjil dari 0 hingga " + n + " adalah:");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Masukkan bilangan n: ");
        int n = scanner.nextInt();

        
        angkaGanjil(n);

        
        scanner.close();
    }
}
