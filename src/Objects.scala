/**
 *
 * This sample shows how to use objects in scala.
 *
 * Object is the mechanism of the language to provide only one instance of one class to all the system. To declare an
 * object you have to use "object" instead of "class" in the class declaration. To invoke an object you don't need to
 * create a new instance. Just use the "." notation to call the method.
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
object Objects {

  def main(args: Array[String]) {
    println("1 ->" + Timer.currentCount())
    println("2 ->" + Timer.currentCount())
    println("3 ->" + Timer.currentCount())
  }
}

object Timer {
  var count = 0

  def currentCount(): Long = {
    count += 1
    count
  }
}
