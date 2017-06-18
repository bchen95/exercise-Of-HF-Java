// test code, not the final code
public class SimpleDotComTestDrive {
  public static void main(String[] args) {

    // what should be tested:
    // 1. make a new SimpleDotCom instance
    SimpleDotCom dot = new SimpleDotCom();

    // 2. set up the location of DotCom
    int[] locations = {2,3,4};
    dot.setLocationCells(locations);

    // 3.creat the user's guess
    String userGuess = "5";

    // 4. check the result to see if the test code is workable
    String result = dot.checkYourself(userGuess);
  }
}
