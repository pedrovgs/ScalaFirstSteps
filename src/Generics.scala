/**
 *
 * This sample how to use generics in Scala.
 *
 * In this sample we have crated a class "Reference" that can be empty or contains a reference to other object.
 * This class contains a mutable variable - mutable variables are declared with the key word "var" -. The content
 * it's declared using the key word "_" that is associated to default values. It means that content is going to be
 * initialized with the default of the generic implementation used.
 *
 * To use generics you have to declare the implementation that is going to replace the generic while the object
 * instantiation. You don't need to cast the usage of the reference to Int to use it.
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
object Generics {

  def main(args: Array[String]) {

    val ref = new Reference[Int]
    ref set 13
    println("The reference contains the half of " + (ref.get * 2))

  }

  class Reference[T] {
    private var content: T = _

    def set(valor: T) {
      content = valor
    }

    def get: T = content
  }

}
