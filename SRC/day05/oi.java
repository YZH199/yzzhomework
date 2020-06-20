package day05;

import java.io.*;

public class oi {
    public static void main(String[] args) throws Exception {
        FileInputStream f = new FileInputStream("a.txt");
        InputStreamReader i = new InputStreamReader(f);
        BufferedReader b = new BufferedReader(i);

        FileOutputStream f1 = new FileOutputStream("c.txt");
        OutputStreamWriter o = new OutputStreamWriter(f1);
        BufferedWriter n = new BufferedWriter(o);
        PrintWriter pw = new PrintWriter(n);

        String k;
        while ( (k=b.readLine())!= null) {
            pw.write(k);
            pw.write("\n");
        }




        pw.close();
        o.close();
        f1.close();
        b.close();
        i.close();
        f.close();


    }
}
