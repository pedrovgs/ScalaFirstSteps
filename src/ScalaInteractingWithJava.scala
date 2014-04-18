import java.util.{Date, Locale}
import java.text.DateFormat._;

/**
 * This sample shows how the language is able to execute java code. This object declares a main function to print
 * the date based on the localization passed as argument.
 *
 * Take a look how the import sentences uses braces to import more than one class from the same package or how the "_"
 * character is used to import all the classes inside one package - it's similar to the "*" usage in java imports-.
 * The "import java.text.DateFormat._" declaration imports all the static members, functions and the class to be used
 * without the class name - "LONG" and "getDateInstance(...)" are statics inside DateFormat -.
 *
 * In this sample we also introduce the "val" concept. "val" is used in Scala to declare immutable variables.
 *
 * To print the result of the date format uses one part of the Scala sintax to avoid the usage of "." to call methods.
 * If the method to call only uses one parameter you can use the sintax "object method param" to call it. It's equivalent
 * to object.method(param).
 *
 * Take into account that the Scala interaction with Java can be used to implement Java interfaces or to extend
 * Java classes.
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
object ScalaInteractingWithJava {
  def main(args: Array[String]) {
    val now = new Date
    val dateFormat = getDateInstance(LONG, Locale.FRANCE)
    println(dateFormat format now)
  }
}
