public class ForPattren3 {
    public static void main(String[] args) {
        int n=3;

        for(int i=0;i<3;i++){
            for(int j=0;j<n;j++) {
                if(i==1&&j==i){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
