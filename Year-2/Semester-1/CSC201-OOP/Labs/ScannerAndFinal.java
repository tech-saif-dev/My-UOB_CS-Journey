import java.util.Scanner;

public class ScannerAndFinal {
    public static void main(String [] args){
        double r,area;
        final double PI =3.14;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter R: ");
        r = sc.nextDouble();
        area = PI*r*r;
        System.out.println("Area = "+area);
    }
}
