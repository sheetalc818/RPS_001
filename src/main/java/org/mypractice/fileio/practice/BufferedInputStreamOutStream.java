package org.mypractice.fileio.practice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputStreamOutStream {
    public static void main(String args[]){
        try{
            FileInputStream fin=new FileInputStream("src/main/java/org/mypractice/fileio/practice/input.txt");
            BufferedInputStream bin=new BufferedInputStream(fin);
            FileOutputStream out = new FileOutputStream("output1.txt");
            BufferedOutputStream bout = new BufferedOutputStream(out);
            int i;
            while((i=bin.read())!=-1){
                System.out.print((char)i);
                bout.write(i);
            }
            bin.close();
            fin.close();
            bout.close();
            out.close();
        }catch(Exception e){System.out.println(e);}
    }
}
