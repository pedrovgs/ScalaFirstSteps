import scala.util.matching.Regex

/**
 *
 * This sample shows how to use Strings in Scala.
 *
 * To work with String objects you can use different tools to evaluate each Char inside. Some of them are available
 * thanks to the Scala implicit conversion to StringOpt or StringLike.
 *
 * To work with String objects you can use functional combinators like map filter or partition. All this functional
 * combinators are available and ready to be used with "_" wildcard.
 *
 * Some interesting functions available in Scalla Collection framework are available to be used with String objects, like
 * drop or take.
 *
 * Remember how in Scala "==" is used to evaluate if two objects are equals and not only to evaluate if are the same
 * object in memory. With String objects you can use "==" or "string.equalsIgnoreCase(otherString)" to compare two Strings.
 * "==" will return false if some of the variables are null, but .equalsIgnoreCase will throw a NullPointerException if
 * the first String is NULL.
 *
 * To work with multiline strings in Scala you can use triple " operator. If you use "|" your string will not count with
 * tabs in your IDE and you will have to add ".stripMargin" methods. If you want to work with multiline strings in
 * Scala but in only one line you can replace "\n" characters with spaces.
 *
 * To split Strings you can use "split" method. Split method will return an Array[String] that you can use to map or
 * apply different expressions.
 *
 * To substitute variables into strings you can use string interpolation. With string interpolation you can even apply
 * expressions inside your strings. Use "s" keyword or "f" to use string interpolation with or without format. You can
 * also use raw interpolator to show all the String content or use the String java format method to format your strings
 * like in Java code.
 *
 * To find patterns in strings and get the result we can use regular expressions and pattern machine. A regular expression
 * can be obtained from the ".r" method in a Strin object or using the RegEx object directly. Remember that in Scala
 * some methods to get information from others will return an Option object. Find methods will return an Interable
 * object that is not ready to work with functional combinators. If you want to work with functional combinators and
 * regex results you will have to transform the result into a collection.
 *
 * To replace values inside a String we can use ".replaceAll" method or create a regex and use the method ".replaceAllIn".
 *
 * To extract only some parts of an String that matches with something we can use a mix of pattern machine and
 * regular expressions.
 *
 * To access randomly to different chars inside a String we can use "()" notation or "charAt()" method. The "()" notation
 * is possible because String class declares an "apply" method that is used to get one char from one position in a String.
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
object Strings {

  def main(args: Array[String]) {

    "hello world".foreach(println)
    "hello world".map(println)
    for (c <- "hello world") println(c)
    println(for (c <- "hello world") yield c.toUpper)

    println("hello world".filter(_ != 'l'))
    println("hello world".partition(_ < 'l'))

    println("hello world".drop(2))
    println("hello world".take(2))
    println("hello world".drop(2).take(2).capitalize)

    val one = "one"
    val secondOne = "one"
    val ONE = "ONE"

    println(one == secondOne)
    println(one == ONE)
    println(one.equalsIgnoreCase(ONE))

    val multiline1 =
      """a
        |b
        |c
      """.stripMargin
    println(multiline1)

    val multiline2 =
      """a
        |b
        |c
      """.stripMargin.replaceAll("\n", " ")
    println(multiline2)

    "hello, world".split(",").map(_.toUpperCase).map(println)

    val name = "Pedro"
    val age = 23
    val weight = 200.00
    println(s"$name is $age years old")
    println(s"${name + " Vicente"} is ${age + 1} years old")
    println(f"$name, you weigh $weight%.0f pounds")
    println(f"$name, you weigh $weight%.2f pounds")
    println("hello\n\t\rworld")
    println(raw"hello\n\t\rworld")
    println("%s is %d years old".format(name, age))

    val address = "123 Main Street Suite 101"
    val numPattern = "[0-9]+".r
    val otherPattern = new Regex("a")
    println(numPattern.findFirstIn(address).get)
    numPattern.findAllIn(address).foreach(println)
    println(numPattern.findAllIn(address).toArray.size)
    println(otherPattern.findFirstIn(address).getOrElse("Pattern not found"))

    println(numPattern.replaceAllIn(address, "^^"))
    println(address.replaceAll("[0-9]+", "`"))
    println(numPattern.replaceFirstIn(address, "__"))

    val pattern = "([0-9]+) ([A-Za-z]+)".r
    val pattern(count, fruit) = "100 bananas"
    println(count + " - " + fruit)

    val numberPattern = "([0-9]+)".r
    val wordPattern = "([A-Za-z]+)".r
    val sentence = "100 bananas"
    sentence match {
      case numberPattern(number) => println(number)
      case wordPattern(word) => println(word)
      case _ => println("pattern not found")
    }

    val hello = "hello world"
    println(hello(4))
    println(hello.charAt(3))


  }

}
