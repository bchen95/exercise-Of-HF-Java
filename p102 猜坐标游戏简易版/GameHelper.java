import java.io.*;
public class GameHelper {
  public String GetUserInput(String prompt) {
    String inputLine = null;
    System.out.print(prompt + " ");

    // the first time to encounter "try" "BufferedReader" "InputStreamReader" "catch" "IOException", but not hard to guess their function
    try{
      BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
      inputLine = is.readLine();
      if(inputLine.length() == 0) return null;
    } catch (IOException e) {
      System.out.println("IOException: " + e);
    }
    return inputLine;
  }
}
