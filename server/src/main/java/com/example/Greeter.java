package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
	* Parameter someone: the name of some person to say hello to.
	* returns greeting string
	*/
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
