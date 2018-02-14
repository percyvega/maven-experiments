package com.percyvega.mavenexperiments.plugins.exec_maven_plugin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Greeter {

  private static final Logger log = LogManager.getLogger(Greeter.class);

  public static void main(String[] args) {
    Greeter greeter = new Greeter();

    if(args.length == 0) {
      greeter.printThis(greeter.getGreeting("Hello"));
    } else {
      for (int i = 0; i < args.length; i++) {
        greeter.printThis(greeter.getGreeting(args[i]));
      }
    }
  }

  public void printThis(String toPrint) {
    log.trace(toPrint);
    log.debug(toPrint);
    log.info(toPrint);
    log.warn(toPrint);
    log.error(toPrint);
    log.fatal(toPrint);
  }

  public String getGreeting(String greeting) {
    return greeting + " World!";
  }
}
