import java.util.Scanner;

public class Chuyendoitiente {
    public static void main(String[] args) {
        double usd,vnd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao gia usd: ");
        usd = sc.nextDouble();
        vnd = usd*23000;
        System.out.println(usd+ " usd = " + vnd + " vnd");
    }
}
