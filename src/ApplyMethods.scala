/**
 * This sample shows how to use "apply" methods.
 *
 * When you have a class implementation with only one method you can invoke it just adding "()" to the class instance.
 * To do this you have to declare a class with an apply method that only can be named "apply" and can't be used with
 * parameters.
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
object ApplyMethods {

  def main(args: Array[String]) {

    val doSomething = new DoSomething
    println(doSomething())

  }

  class DoSomething {
    def apply() = 2
  }

}
