/**
 * This sample shows hwo to create some collections in Scala.
 *
 * We have some interesting collections to use:
 * - Lists
 * - Sets
 * - Tuple
 * - Maps
 * - Option
 *
 * Pay an special attention to the option usage with maps.
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
object Collections {

  def main(args: Array[String]) {
    //List creation
    List(1, 2, 3, 4)
    //Set creation, this collection doesn't allow duplication.
    Set(1, 1, 2)
    //Tuple creation
    (1, 2)
    1 -> 2
    val tuple = "a" -> "b"

    //Tuple usage accessing by element or using pattern machine
    println(tuple._1 + " - " + tuple._2)
    val tupleResult = tuple match {
      case ("a", "b") => true
      case _ => false
    }
    println(tupleResult)

    //Map creation
    Map(1 -> 9)
    Map(1 -> 2, 3 -> 4)
    Map(1 -> {
      println("Hello map!")
    })

    //Map usage getting options as elemnts
    val map = Map(1 -> "one", 2 -> "two")

    //Options usage
    println(map.get(2).get)
    println(map.get(3).getOrElse(0))

  }

}
