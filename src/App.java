import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Double metro, centrimetros;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira quantidade em metros");
        metro = sc.nextDouble();
        centrimetros = metro * 100;
        System.out.println("Esse quantidade em centrimetos é: " +centrimetros +"cm");
        sc.close();
    }
}
