import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        int a;
        int b;
        System.out.print("Nhap so a: ");
        Scanner nhap = new Scanner(System.in);
        a = nhap.nextInt();
        System.out.print("Nhap so b: ");
        b = nhap.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.print("Khong co uoc chung lon nhat");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("UCLN la " + a);

    }
}
