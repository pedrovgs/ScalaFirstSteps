/**
 * This sample shows how to currify a function to use it in different moments. Curried mechanism are similar to partial
 * applications. In this file you can see how to declare the function timesTwo using a partial application of timesTwo
 * and how to curry a sum function to declare an addTwo function and apply it later.
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
object CurriedFunctions {

  def main(args: Array[String]) = {

    println("Multiply 2 and 3 -> " + multiply(2, 3))

    /*
     * Partial application of multiply.
     */
    val timesTwo = multiply(2, _: Int)

    println("Two times three -> " + timesTwo(3))

    /*
     * Curried version of add
     */
    val curriedAdd = (sum _).curried
    /*
     * Define addTwo function based on curried add function.
     */
    val addTwo = curriedAdd(2)

    /*
     * Apply addTwo function with the last parameter.
     */
    println("Add two to 4 -> " + addTwo(4))
  }

  /**
   * This function defines how to multiply two int.
   * @param m
   * @param n
   * @return m * n
   */
  def multiply(m: Int, n: Int): Int = m * n

  /**
   * This function defines how to sum two int.
   * @param a
   * @param b
   * @return a + b
   */
  def sum(a: Int, b: Int) = a + b
}
