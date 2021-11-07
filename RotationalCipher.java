import java.util.*;
// Add any extra import statements you may need here


class Main {

  // Add any helper functions you may need here
  

 String rotationalCipher(String input, int rotationFactor) {
    // Write your code here
    int charc;
    int tempInt;
    int newRot;
    char tempChar; 
    String tempString; 
    String outString = "";
    
    
    for (int i = 0; i < input.length(); i++)
    {
     newRot = rotationFactor;
      System.out.println(newRot);
       charc = (int)input.charAt(i);
       //System.out.println(charc);
       if (charc>=48 && charc<= 57)
       {
         if (newRot > 9){
         newRot = newRot % 10; 
         }
         System.out.println(newRot);
            charc += newRot;
              
            if(charc > 57)
            {
              tempInt = charc - 57;
              charc = 47 + tempInt;
            }
       }
      
      if (charc>=65 && charc<= 90)
       {
        if (newRot > 25) {
         newRot = newRot % 26;
        }
        System.out.println(newRot);
          charc += newRot;
        
        
            if(charc > 90)
            {
              tempInt = charc - 90;
              charc = 64 + tempInt;
            }
       }
      
      if (charc>=97 && charc<= 122)
       {
          if (newRot > 25) {
         newRot = newRot % 26;
        }
        System.out.println(newRot);
          charc += newRot;
             
            if(charc > 122)
            {
              tempInt = charc - 122;
              charc = 96 + tempInt;
            }
       }
       tempChar = (char)charc;
       tempString = Character.toString(tempChar);
       outString = outString.concat(tempString);
    
    }
   System.out.println(outString);
    return outString;
  }











  // These are the tests we use to determine if the solution is correct.
  // You can add your own at the bottom.
  int test_case_number = 1;
  void check(String expected, String output) {
    boolean result = (expected.equals(output));
    char rightTick = '\u2713';
    char wrongTick = '\u2717';
    if (result) {
      System.out.println(rightTick + " Test #" + test_case_number);
    }
    else {
      System.out.print(wrongTick + " Test #" + test_case_number + ": Expected ");
      printString(expected); 
      System.out.print(" Your output: ");
      printString(output);
      System.out.println();
    }
    test_case_number++;
  }
  void printString(String str) {
    System.out.print("[\"" + str + "\"]");
  }
  
  public void run() {
    String input_1 = "All-convoYs-9-be:Alert1.";
    int rotationFactor_1 = 4;
    String expected_1 = "Epp-gsrzsCw-3-fi:Epivx5.";
    String output_1 = rotationalCipher(input_1, rotationFactor_1);
    check(expected_1, output_1);

    String input_2 = "abcdZXYzxy-999.@";
    int rotationFactor_2 = 800;
    String expected_2 = "stuvRPQrpq-999.@";
    String output_2 = rotationalCipher(input_2, rotationFactor_2);
    check(expected_2, output_2);

    // Add your own test cases here
    
  }
  
  public static void main(String[] args) {
    new Main().run();
  }
}