public class SimpleDotCom {

  int[] locationCells;
  int numOfHits = 0;

  int hitIndex = 0;
  int[] hitCounter = {111, 111, 111};

  public static void main(String[] args) {

    int numOfGuesses = 0;
    GameHelper helper = new GameHelper();
    SimpleDotCom theDotCom = new SimpleDotCom();

    // test random code:
    double testRandom = (Math.random());
    int randomNum = (int)(testRandom * 5);
    System.out.println(testRandom);
    System.out.println(randomNum);

    // creat starting position of the target array using Math.random
    // (Math.random() * 5) creat a number between 0 and 4
    // int randomNum = (int) (Math.random() * 5);
    int[] locations = {randomNum, randomNum+1, randomNum+2};

    theDotCom.setLocationCells(locations);

    // creat a boolen to control the loop
    boolean isAlive = true;

    while(isAlive == true) {

      //get the string entered by the user
      String guess = helper.GetUserInput("make your bet: enter a number");
      // get the result and store it in the string "result"

      String result = theDotCom.checkYourself(guess);
      numOfGuesses++;

      if(result.equals("kill")){
        isAlive = false;
        System.out.println("Congrationlation! You took " + numOfGuesses + " guesses to kill the target.");
      }
    }
  }

  //encapsulation: setter
  public void setLocationCells(int[] locs) {
    locationCells = locs;
  }

  public String checkYourself(String stringGuess) {

    // convert: string to int
    int guess = Integer.parseInt(stringGuess);

    String result = "miss";

    for(int hitCount : hitCounter){
      if(guess == hitCount){
        // System.out.println("You've hit this one. Try another number.");
        result = "You've hit this one. Try another number.";
        break;
      }
      else{
        for(int cell : locationCells){

          if(guess == cell){
            result = "hit";
            numOfHits++;

            hitCounter[hitIndex] = guess;
            hitIndex++;
            break;
          }
        }
        break;
      }
    }

    // // a new kind of "for" loop
    // for(int cell : locationCells){
    //   if(guess == cell){
    //     result = "hit";
    //     numOfHits++;
    //     break;
    //   }
    // }

    if(numOfHits == locationCells.length) {
      result = "kill";
    }

    System.out.println(result);
    return result;
  }

}
