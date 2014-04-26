/**
 *
 * This sampel shows how to use case classes.
 *
 * Case classes are used to conveniently store and match on the contents of a class. You can construct them without
 * using new. Case classes automatically have equality and nice toString methods based on the constructor arguments.
 * Case classes can have methods just like normal classes. Are designed to be used with pattern matching.
 *
 * In this sample you can see how we have created a function to apply pattern machine over a calculator instance.
 * The calcType function will return the known types and if not a default message.
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
object CaseClasses {

  def main(args: Array[String]) {

    val myCalculator = Calculator("hp", "30B")
    println(calcType(myCalculator))

  }

  case class Calculator(brand: String, model: String)

  def calcType(calc: Calculator) = calc match {
    case Calculator("hp", "20B") => "financial"
    case Calculator("hp", "48G") => "scientific"
    case Calculator("hp", "30B") => "business"
    case Calculator(ourBrand, ourModel) => "Calculator: %s %s is of unknown type".format(ourBrand, ourModel)
  }

  /*
   * There are other different approaches to implement the default case:
   * 
   * case Calculator(_, _) => "Calculator of unknown type"
   * case _ => "Calculator of unknown type"
   * case c@Calculator(_, _) => "Calculator: %s of unknown type".format(c)
   */
}
