/**
 *
 * In Scala we can use types to define a new ambit used to create functions in the future. For example. We can define
 * the Set type like one type that transform integers in booleans. The we can use this type to create functions
 * or expressions evaluated like that type declared.
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
object Types {

  def main(args: Array[String]) {

    /*
     * This expression is a Set type implementation that given one int returns a boolean if the int is even.
     */
    val isEven: Set = _ % 2 == 0


    println(isEven(4))
    println(isEven(5))

    val sizeMultipleOfTwo: ListToBoolean = _.size % 2 == 0

    println(sizeMultipleOfTwo(List(7)))
    println(sizeMultipleOfTwo(List(7, 8)))
  }

  type Set = Int => Boolean

  type ListToBoolean = List[Int] => Boolean

}
