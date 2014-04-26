/**
 *
 * This sample shows a simple example of pattern machine usage.
 *
 * Given an integer we are going to apply pattern machine to return some string values depending on the integer value.
 * If the integer is one we are going to return "one", if the integer is two we are going to return "two" else if
 * we are going to return "some other number".
 *
 * The "_" case is used as default.
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
object SimplePatternMachine {

  def main(args: Array[String]) {
    val times = 1

    val res = times match {
      case 1 => "one"
      case 2 => "two"
      case _ => "some other number"
    }

    println(res)

    val times2 = 4

    /*
     * Take a look to see how the pattern machine applies here to capture the times 2 value into the i variable.
     */
    val res2 = times2 match {
      case i if i == 1 => "one"
      case i if i == 2 => "two"
      case _ => "some other number"
    }

    println(res2)

    println(bigger(-1))
    println(bigger(3))
    println(bigger(4.5))
    println(bigger(-6.8))
    println(bigger("Car"))
  }

  /*
   * Pattern machine can also be used with more complex cases. In this function if the parameter of type "Any" applies
   * with int or double types this is going to increment or decrement the value. If the type is an String this function
   * is going to add an s.
   *
   * Each case is evaluated in order and if the patter match, the right hand expression is applied.
   */
  def bigger(o: Any): Any = {
    o match {
      case i: Int if i < 0 => i - 1
      case i: Int => i + 1
      case d: Double if d < 0.0 => d - 0.1
      case d: Double => d + 0.1
      case text: String => text + "s"
    }
  }

}
