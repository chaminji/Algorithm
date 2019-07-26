package _0617;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

class Testt {
    void a() throws Exception {
        InputStream in = new FileInputStream("a.mp3");
        OutputStream out = new FileOutputStream("b.mp3");
        int l = 0;
        while ((l = in.read()) != -1) {
            out.write(l);
        }
    }
}