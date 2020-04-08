package org.ihmconfinee.application;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.ihmconfinee.core.IhmConfineeVersion;

/**
 * This class controls all aspects of the application's execution
 */
public class Application implements IApplication {

   @Override
   public Object start(IApplicationContext context) throws Exception {
      System.out.println("Hello RCP World!");
      System.out.println("Version of core is : ");
      IhmConfineeVersion.printVersion();
      return IApplication.EXIT_OK;
   }

   @Override
   public void stop() {
      // nothing to do
   }
}
