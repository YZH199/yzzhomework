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
    }
}
