import java.util.Scanner;
public class FactRecurMeth {

    public static int Fact(int n){
        if (n==0)
            return 1;

        return Fact(n-1)*n;
    }


    public static void main(String[] args) {
        int n , f;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        n = sc.nextInt();

        f = Fact(n);

        System.out.println("Fact = "+f);

    }
}
