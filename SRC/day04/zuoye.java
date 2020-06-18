package day04;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class zuoye {
    public static void main(String[] args) {
        int[] a = new int[8];
        for (int i = 0; i < 8; i++) {
            Scanner sc = new Scanner(System.in);
            a[i] = sc.nextInt();
        }
        int m = 0, n =0;
        for (int j = 0; j < 8; j++) {
            if (a[j] % 2 == 0) {
                ++n;
            } else {
                ++m;
            }
        }
            int[] os = new int[n];
            int[] js = new int[m];
            int f=0,g=0;
            for (int k = 0; k < 8; k++) {
                if (a[k] % 2 == 0) {
                    os[f] = a[k];
                    f++;
                } else{
                    js[g] = a[k];
                    g++;
                }
            }
            System.out.println(Arrays.toString(os));
            System.out.println(Arrays.toString(js));
            for (int v = 0; v< 8; v++) {
                if (v<g && v<f) {
                    System.out.print(js[v]+" ");
                    System.out.print(os[v]+" ");
                } else if (v>=g && v<f) {
                    System.out.print(os[v]+" ");
                } else if (v<=g && v>f) {
                    System.out.print(js[v]+" ");
                }


            }


        }


    }


