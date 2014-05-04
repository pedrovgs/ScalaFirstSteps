import scala.util.Random

/**
 *
 * This sample shows how to work with numbers in Scala.
 *
 * Some classes are ready to work as numbers. Every numeric lass is ready to evaluate the max and min representable
 * value.
 *
 * To transform strings to number classes you can use to* methods ready in String classes. You can use the same approach
 * with number classes.
 *
 * To create numbers you have to remember that the default value is Int but you can declare the type of the number.
 *
 * ++ and -- are not available because remember that in Scala is usual to work with unmutable objects. Insted of use
 * ++ or -- you can use += -= *= or /= .
 *
 * To generate random numbers you can use scala.util.Random. With this class you can generate a random value or a random
 * value between 0 and n-1.
 *
 * To create ranges between numbers this is so easy like use "to" method. This return an object Range you can transform
 * to other collection with "to*" methods. This ranges can be configured to use steps with the method "by".
 *
 *
 * @author Pedro Vicente Gómez Sánchez.
 */

object Numbers {

  def main(args: Array[String]) {

    println(Char.MinValue)
    println(Char.MaxValue)
    println(Byte.MinValue)
    println(Byte.MaxValue)
    println(Short.MinValue)
    println(Short.MaxValue)
    println(Int.MinValue)
    println(Int.MaxValue)
    println(Long.MinValue)
    println(Long.MaxValue)
    println(Float.MinValue)
    println(Float.MaxValue)
    println(Double.MinValue)
    println(Double.MaxValue)
    println(BigInt.MinLong)
    println(BigInt.MaxLong)
    println(BigDecimal.MinLong)
    println(BigDecimal.MaxLong)

    println("100".toInt)
    println("100".toDouble)
    println("100".toLong)
    println("100".toFloat)

    val number = 100.toFloat
    val number1 = 100L
    val number2 = 100f
    val number3 = 100d.toInt
    val float = 100: Float
    val bigInt = BigInt("1")
    val bigDec = BigDecimal("1.0")

    var a = 1
    a += 1
    println(a)

    val random = Random
    println(random.nextInt)
    println(random.nextInt(5))
    println(random.nextDouble())

    val range = 0 to 10
    val range2 = 0 to 10 by 2
    for (i <- 0 to 5) println(i)
    val x = 1 to 10 toList
    val result = for (i <- 0 to 5) yield i * 2
    val result2 = for (i <- 0 to 10) yield i.toDouble

  }

}
