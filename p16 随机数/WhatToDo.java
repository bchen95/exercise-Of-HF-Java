public class WhatToDo

{

  public static void main(String[] args)
  {

    // creat three String
    String[] Reading =
    {
      "arts and literature","psychology","economy","philosophy","reading ramdonly","English learing","history and humanity","self-help"
    };

    String[] Sports =
    {
     "crawling","swimming","running","walking"
    };

    String[] Core =
    {
      "CS 61A","CS 61B","Head First Java","Udacity Front-end nano degree","reading CS,an overview","reading Data Structure by ChengJie","Head First C"
    };

    //find out how many elements a string has
    int ReadingLength = Reading.length;
    int SportsLength = Sports.length;
    int CoreLength = Core.length;

    //Method "random()"" returns a value between 0 and 1，thus times the number of string elemnts, then "(int)"(well, I don't know how to translate the process in English, and it seems the java cannot intrepret with Chinese in the comment lines).
    int ranReading = (int) (Math.random() * ReadingLength);
    int ranSports = (int) (Math.random() * SportsLength);
    int ranCore = (int) (Math.random() * CoreLength);

    System.out.println("1. writing");
    System.out.println("2. " + Reading[ranReading]);
    System.out.println("3. " + Sports[ranSports]);
    System.out.println("4. " + Core[ranCore]);
	}
}
