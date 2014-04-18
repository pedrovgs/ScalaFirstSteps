/**
 * This sample shows how Scala is a mixed object-oriented / functional language. In scala you are able to create
 * classes in a similar way you do it in Java. There are some differences like the class parameters delcarations.
 *
 * ComplexNumber class declare two Double parameters that are going to be used as the default constructor. This class
 * also declare two methods to get the real part or the imaginary part of the number. This methods don't declare the
 * return type because the Scala compiler is able to infer it.
 *
 * The compiler is not always able to infer the return value, but there is no a simple rule to know when you have to
 * declare the return value or not. The compiler will evaluate the left part of the method declaration to infer the
 * return value - in this sample the return value is Double -.
 *
 * If you want to declare methods without use "()" you only have to declare it without "()" and you will be able to
 * call this methods like if the client code is accessing directly to the class members.
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
object ClassesUsage {

  def main(args: Array[String]) {

    val complexNumber = new ComplexNumber(1.2, 3.4)
    println("Real part: " + complexNumber.getRealPart())
    println("Imaginary part: " + complexNumber.getImaginaryPart())
    println("Real value: " + complexNumber.realPart)
    println("Imaginary value: " + complexNumber.imaginaryPart)

  }

  class ComplexNumber(real: Double, imaginary: Double) {

    def getRealPart() = real

    def getImaginaryPart() = imaginary

    def realPart = real

    def imaginaryPart = imaginary

  }


}
