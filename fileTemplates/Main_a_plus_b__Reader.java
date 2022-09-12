import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class ${NAME} {
public static void main(String[] args) throws IOException {
  // the object for reading
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  // it takes a string and splits it by whitespaces
  String[] values = reader.readLine().split("\\s+");
  int a = Integer.parseInt(values[0]); 
  int b = Integer.parseInt(values[1]); 
  System.out.println(a + b);
}
}
