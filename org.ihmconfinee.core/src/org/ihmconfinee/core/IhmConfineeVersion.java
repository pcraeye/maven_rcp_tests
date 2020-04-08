package org.ihmconfinee.core;

import org.osgi.framework.FrameworkUtil;

public class IhmConfineeVersion {

   public static void printVersion() {
      System.out.println(FrameworkUtil.getBundle(IhmConfineeVersion.class).getVersion());
   }

}
