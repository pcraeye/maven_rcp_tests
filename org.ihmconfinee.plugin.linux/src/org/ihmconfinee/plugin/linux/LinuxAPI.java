package org.ihmconfinee.plugin.linux;

public class LinuxAPI {

   public static void print(String message_p) {
      System.out.println("I should be in a linux env as I specified this in my Manifest !");
      System.out.println("The message is: " + message_p);
   }

}
