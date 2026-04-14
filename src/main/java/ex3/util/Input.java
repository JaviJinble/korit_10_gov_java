package ex3.util;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {

    public static String nextLine() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print(" ");
            return bufferedReader.readLine();
        } catch (IOException e) {
            return null;
        }
    }
}
