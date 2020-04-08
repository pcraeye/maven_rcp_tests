package org.ihmconfinee.plugin.win;

public class WinAPI {

   public static void print(String message_p) {
      System.out.println("I should be in a windows env as I specified this in my Manifest !");
      System.out.println("The message is: " + message_p);
   }

}
