/**
 *
 * This is a sample created to show how to use implicit classes.
 *
 * When you want to extend the behaviour of a class and you can't or don't want to extend that class you can use an
 * implicit class. An implicit class will allow you to add more methods to a class and use it in different context only
 * importing the class where it's declared.
 *
 * In this sample we are going to extend the contract of String adding a method to increment each char of a String.
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
object ImplicitClasses {

  def main(args: Array[String]) {
    println("hello wolrd".increment)
    println(4.multiplyByTwo)
  }

  implicit class StringImprovements(s: String) {
    def increment = s.map(c => (c + 1).toChar)
  }

  implicit class IntImprovements(i: Int) {
    def multiplyByTwo = i * 2
  }

}
