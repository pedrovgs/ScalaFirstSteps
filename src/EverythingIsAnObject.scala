/**
 * This sample shows how everything is an object in Scala.
 *
 * Scala is a pure object oriented languaje. In this sample, first four sentences shows how to work with integers
 * like a primitive entity or an object. "+", "-", "*" and other chars are valid operators to work with numbers
 * because they are objects.
 *
 * Functions are also declared as objects. This is one of the most interesting part of the functional paradigm.
 * Working with functions as objects you are able to store funcions in vars, pass it as arguments of other functions.
 * This is a powerful mechanism to create callbacks.
 *
 * This sample shows how to create a timer using functions passed as objects. The function "oneTimePerSecond" is
 * declared with a parameter called callback that is going to return nothing - in Scala Unit is the equivalent to
 * void -. oneTimePerSecond is called with printMessageFunction and is going to be executed each second. In the
 * callback declaration "()" is used to represent functions that doesn't receive.
 *
 * Take a look how the sleep method of the Thread class is called without "." sintax.
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
object EverythingIsAnObject {

  def main(args: Array[String]) {

    println(1 + 2 + 3)
    println((1).+(2).+(3))
    println((1).+(((2).*(3))./(2)))
    println(1.+(2))

    oneTimePerSecond(printMessage)
  }

  def oneTimePerSecond(callback: () => Unit) {
    while (true) {
      callback();
      Thread sleep 1000
    }
  }

  def printMessage() {
    println("Tick")
  }

}
