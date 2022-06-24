/*
 * This code is sample code, provided AS-IS, and we make NO
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.thread;

public class MessagePrinterClient {

  public static void main(String[] args) {
    // TODO: create two instances of your thread subclass and start them up
    MessagePrinter messagePrinter1 = new MessagePrinter("This is Megans's Message");
    MessagePrinter messagePrinter2 = new MessagePrinter("This is Shaq's Message");
    messagePrinter1.start();
    messagePrinter2.start();

  }
}