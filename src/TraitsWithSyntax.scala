/**
 *
 * This sample shows how to use traits with the "with" syntax.
 *
 * Whe one class wants to extend more than one trait it has to use "with" keyword. Take into account that we should
 * try to use traits always we can, but if the trait declaration has to use parameters in the constructor we will
 * have to use an abstract class.
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
object TraitsWithSyntax {

  def main(args: Array[String]) {
    val car = new BMW()
    println(car)
  }

  trait Car {
    val brand: String
  }

  trait Shiny {
    val shineRefraction: Int
  }

  class BMW extends Car with Shiny {
    val brand = "BMW"
    val shineRefraction = 12

    override def toString: String = "brand: " + brand + " shineRefraction: " + shineRefraction
  }

}
