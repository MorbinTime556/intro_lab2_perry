package HelloWorld;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      // Forgot to add comments as I was coding, as I was just stitching this program together until the code completed all of the checks
      // Too lazy to prod at this code until I remember what each part does, hope it still works when I transfer to Eclipse.
      // Note to self: When coding for companies, don't forget comments; even I will forget what does what after a bit.
      
      boolean[] chptList = new boolean[16]; // Valid chapters are 1-15. 1 means include, 0 exclude. Element 0 unused. 
      int includeChpt;
      int i, j = 0;
      boolean chapters = false;
      
      // Get the chapter selections
      for (i = 1; i <= 15; ++i) {
         includeChpt = scnr.nextInt(); 
         if (includeChpt==1) {
            chptList[i] = true;
         }
         else {
            chptList[i] = false;
         }
      }
      
      
      // Checks if there are any chapter selected, if none, it will print out None.
      for (i = 1; i <= 15; ++i){
         if (chptList[i]){
            chapters = true;
            if (i < 13){
               if(chptList[i+1] && chptList[i+2]){
                  j = i;
                  while (chptList[j]){
                     if (j < 15){
                        j++;
                     }
                     else{
                        j++;
                        break;
                     }
                  }
                  if ( (j - 1) < 15){
                     System.out.print((i) + "-" + ((j -1 )) + " ");
                  }
                  else{
                     System.out.print((i) + "-" + 15 + " ");
                  }
                  i = j;
               }
               else{
                  System.out.print(i + " ");
               }
            }
            else{
                System.out.print(i + " ");
            }
         }
      }
      
      if (!chapters){
         System.out.println("None ");
      }
      else{
            System.out.print("\n");
      }
         
         
   }
}
