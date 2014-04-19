/**
 * This sample shows how to override methods in Scala.
 *
 * To override methods the new method must be declared with the "override" word. It's similar to the @Override annotation
 * used in java.
 *
 * In this sample you can see how the ComplexNumber overrides "toString()" method to print the real and the imaginary
 * part.
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
object OverrideMethods {

  def main(args: Array[String]) {
    val complexNumber = new ComplexNumber(1.2, 3.4);
    println(complexNumber)
  }

  class ComplexNumber(real: Double, imaginary: Double) {

    def realPart = real

    def imaginaryPart = imaginary

    override def toString() =
      "" + realPart + (if (imaginaryPart < 0) "" else " + ") + imaginaryPart + "i"
  }

}
