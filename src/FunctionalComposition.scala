/**
 * This is a sample to show how to compose functions in Scala using "compose" and "andThen".
 *
 * If you want to define functions that are the result of the composition of other functions you can use "compose" or
 * "andThen" key words.
 *
 * "compose" is going to create a new function with the result of apply two different functions in the order they are
 * declared.
 *
 * "andThen" is going to create a new function with the result of apply two different functions in the reverse declaration
 * order.
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
object FunctionalComposition {

  def main(args: Array[String]) {

    val fComposeG = f _ compose g _

    println(fComposeG("yay"))

    val fAndThenG = f _ andThen g _

    println(fAndThenG("yay"))
  }

  def f(s: String) = "f(" + s + ")"


  def g(s: String) = "g(" + s + ")"

}
