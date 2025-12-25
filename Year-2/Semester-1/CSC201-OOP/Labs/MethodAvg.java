import java.util.Scanner;
public class MethodAvg {

    public static double average(double m1,double m2,double m3){

        return (m1+m2+m3)/3;
    }

    public static void main(String[] args){
        int m1,m2,m3 ;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter m1: ");
        m1 = input.nextInt();
        System.out.print("Enter m2: ");
        m2 = input.nextInt();
        System.out.print("Enter m3: ");
        m3 = input.nextInt();

        System.out.println("Average is " + average( m1, m2, m3));


    }
}
