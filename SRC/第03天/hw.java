package day03;

public class hw {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                int m=i*j;
                System.out.print(j+" * "+i+" = "+m+" ");
            }
            System.out.println(" ");
        }
        int m=5;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
           System.out.println(" ");
        }
    }
}
