import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r, α;
        double pi = 3.14, alan;

        Scanner input = new Scanner(System.in);
        System.out.print("Daire diliminin yarı çapını giriniz : ");
        r = input.nextInt();
        System.out.print("Daire diliminin merkez açısını giriniz : ");
        α = input.nextInt();

        alan = (pi * (r * r) * α) / 360;
        System.out.println("Daire Diliminin Alanı : " + alan);

    }
}
