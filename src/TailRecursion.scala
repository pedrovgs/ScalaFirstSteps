import scala.annotation.tailrec

/**
 *
 * This is a sample created to show how tail recursion works.
 *
 * Each time you use recursion into a function you have to know that you are creating a new frame in the stack call.
 * If you add too many frames to the stack you will get a StackOverflowException. To fix this problem you can use
 * tail recursion in Scala.
 *
 * If you can write a recursive function that only returns calls to itself you are writing a tail recursive function.
 * You can annotate this functions with @tailrec annotation and the compiler will transform your recursive function
 * into a loop avoid adding new frames to the stack.
 *
 * If you are using a modern IDE you will see how your IDE mark tail recursive and not tail recursive functions with
 * different icons.
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
object TailRecursion {

  def main(args: Array[String]) {

    println("Recursive factorial of 5: " + factorial(5))
    println("Tail recursive factorial of 5: " + factorial(1, 5))

  }


  def factorial(number: Int): Int = {
    if (number == 1)
      return 1
    number * factorial(number - 1)
  }

  @tailrec
  def factorial(accumulator: Int, number: Int): Int = {
    if (number == 1)
      return accumulator
    factorial(number * accumulator, number - 1)
  }

}