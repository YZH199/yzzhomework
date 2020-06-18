package day03;

import java.util.Arrays;

public class czf {
    public static void main(String[] args) {
        char [] chs = generate();
        char [] input={'a','t','e','g','f'};
        int [] result=check(chs,input);
        System.out.println("原本"+Arrays.toString(input));
        System.out.println("随机"+Arrays.toString(chs));
        System.out.println("有"+result[0]+"个一样"
        +"位置一样有"+result[1]+"个");

    }

    private static int[] check(char[] chs, char[] input) {
        int [] result={0,0};
        for(int i=0;i<chs.length;i++){
            for(int j=0;j<input.length;j++){
                if(chs[i]==input[j]){
                    result[0]++;
                    if(i==j)
                        result[1]++;
                }break;
            }
        }

        return result;
    }


    private static char[] generate(){
        char [] chs = new char[5];
        char [] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M'
                ,'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        boolean [] flages = new boolean[letters.length];
        int index=0;
        for(int i=0;i<chs.length;i++){
            do{
                index= (int) (Math.random()*letters.length);
            }while(flages[index]);
         chs[i] =letters[index];
         flages[index]=true;
        }
        return chs;
    }
}
