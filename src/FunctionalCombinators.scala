/**
 *
 * This sample shows how to use functional combinators with collections.
 *
 * There are some important functional combinators everybody has to know:
 *
 * - map: Apply an expression in all the collection elements.
 * - foreach: Similar to map but returning Unit.
 * - filter: Removes any elements where the function you pass in evaluates to false.
 * - zip: Aggregates the contents of two lists into a single list of pairs.
 * - partition: Splits a list based on where it falls with respect to a predicate function.
 * - find: Returns the first element of a collection that matches a predicate function.
 * - drop: Drops the first i elements.
 * - dropWhile: Drops elements that matchs with a predicate while the predicate is valid.
 * - foldLeft: Go over a collection from left to right and apply one expression.
 * - foldRight: Go over a collection from right to left and apply one expression.
 * - flatten: Collapses one level of nested structure.
 * - flatMap: Combines mapping and flattening. flatMap takes a function that works on the nested lists and then
 * concatenates the results back together.
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
object FunctionalCombinators {

  def main(args: Array[String]) {

    val numbers = List(1, 2, 3, 4, 5)

    // map
    val mapResult = numbers.map((i: Int) => i * 2)
    println(mapResult)

    // foreach
    val foreachResult = numbers.foreach((i: Int) => i + 1)
    println(foreachResult)

    // filter
    val filterResult = numbers.filter((i: Int) => i % 2 == 0)
    println(filterResult)

    // zip
    val secondList = List("one", "two", "three", "four", "five")
    val zipResult = numbers.zip(secondList)
    println(zipResult)

    // partition
    val splitResult = numbers.partition(_ % 2 == 0)
    println(splitResult)

    // find
    val findResult = numbers.find((i: Int) => {
      i % 2 == 0 && i > 2
    })
    println(findResult)

    // drop
    val dropResult = numbers.drop(2)
    println(dropResult)

    // dropWhile
    val dropWhileResult = numbers.dropWhile((i: Int) => i % 2 != 0)
    println(dropWhileResult)

    // foldLeft
    val foldLeftResult = numbers.foldLeft(0) {
      (m: Int, n: Int) => println("m: " + m + " n: " + n)
        m + n
    }
    println(foldLeftResult)

    // foldRight
    val foldRightResult = numbers.foldRight(0) {
      (m: Int, n: Int) => println("m: " + m + " n: " + n)
        m + n
    }
    println(foldRightResult)

    // flatten
    val tuples = List(List(1, 2), List(1, 2), List(1, 2), List(1, 2), List(1, 2), List(1, 2), List(1, 2))
    val flattenResult = tuples.flatten
    println(flattenResult)

    // flatMap
    val flatMapResult = tuples.flatMap(x => x.map(_ * 2))
    println(flatMapResult)

  }

}
