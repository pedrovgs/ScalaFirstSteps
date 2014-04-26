/**
 * This is a sample to show how to use partial application with functions.
 *
 * You can partially apply a function with an underscore, which gives you another function. Scala uses the underscore
 * to mean different things in different contexts, but you can usually think of it as an unnamed magical wildcard.
 * In the context of { _ + 2 } it means an unnamed parameter. You can use it like so:
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
object PartialApplication {

  def main(args: Array[String]) = {

    /*
     * This partial application of the function sum is creating other function called sum2 that will use only one
     * parameter to sum always two to the value passed as parameter.
     *
     * This function is a partial application of sum function.
     */
    val sum2 = sum(2, _: Int)
    println("Apply sum 2 with value = 3 ->" + sum2(3))
  }

  /**
   * This function defines how to sum two vars.
   * @param a
   * @param b
   * @return a+b
   */
  def sum(a: Int, b: Int) = a + b

}
