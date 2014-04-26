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
  }

}
