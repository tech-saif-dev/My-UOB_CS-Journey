import java.util.Scanner;
public class Fact {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x ,fact=1;

        System.out.print("Enter the value of x: ");
        x = sc.nextInt();

        for (int i = x; i > 0; i--){
            fact*=i;
        }

        System.out.println("Fact = "+fact);
    }
}
