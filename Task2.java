//2. Напишите метод, который составит строку,
// состоящую из 100 повторений слова TEST и метод,
// который запишет эту строку в простой текстовый файл, обработайте исключения.
package Java;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Task2 {
    public static void main(String[] args) {
        String s = "TEST";
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 101; ++i) {
            sb.append(s);
        }

        System.out.println(sb);
        File file = new File("file.txt");
        try {
            if(!file.exists()){
                file.createNewFile();
            }
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());
            try{
                out.print(sb);
            }
            finally {
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
