/**
 * This sample shows how to use Traits in scala.
 *
 * In addition to extensions in Scala you can use import code from one or different traits. To use traits in Scala
 * is similar to use interfaces in Java. In Scala, if your class extends one Trait that class is going to declare
 * the methods from the Trait and also implement that code.
 *
 * In this sample we are going to see how to compare objects, we have defined one Trait called Ord that defines
 * different functions to compare any element. The Any type is used like the super type of all the types in Scala.
 *
 * We have created a class named CustomDate that can be instantiated with three values to represent the year, month and
 * day. In this class we have override toString and equals methods. This class extends from Ord that is the equivalent
 * to implement comparable in Java.
 *
 * The Ord trait declared in this sample defines some operations to be used in the classes that extend it. Take a look
 * that the Ord trait defines "<" operation and implements the other operations based on the equals and < implementation.
 * All operators declared in Ord are implemented based on "<" operator overriden in CustomClass.
 *
 * Take a look how in Scala "==" operator is routed to equals. In scala, if you want to compare references you have to
 * use "eq" instead of "==" or "equals".
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
object Traits {

  def main(args: Array[String]) {
    val date1 = new CustomDate(1, 2, 1990)
    val date2 = new CustomDate(2, 2, 1990)
    val date3 = new CustomDate(2, 2, 1990)

    println(date1)
    println(date2)
    println("date1 is less than date2: " + (date1 < date2))
    println("date2 is grater than date1: " + (date2 > date1))
    println("date2 is equals to date2: " + (date2 equals date3))
    println("date2 is the same that date2: " + (date2 == date2))
    println("date2 is the same that date3: " + (date2 eq date3))
    println("date2 is grater or equals than date2: " + (date2 >= date2))
    println("date1 is less or equals than date2: " + (date1 <= date2))
  }

  trait Ord {
    def <(that: Any): Boolean

    def <=(that: Any): Boolean = (this < that) || (this == that)

    def >(that: Any): Boolean = !(this <= that)

    def >=(that: Any): Boolean = !(this < that)
  }

  class CustomDate(d: Int, m: Int, y: Int) extends Ord {
    def year = y

    def month = m

    def day = d

    override def toString(): String = year + "-" + month + "-" + day

    override def equals(other: Any): Boolean = other.isInstanceOf[CustomDate] && {
      val o = other.asInstanceOf[CustomDate]
      o.day == day && o.month == month && o.year == year
    }

    def <(that: Any): Boolean = {
      if (!that.isInstanceOf[CustomDate])
        error("You can't compare" + that + " and a Date object")
      val o = that.asInstanceOf[CustomDate]
      (year < o.year) ||
        (year == o.year && (month < o.month ||
          (month == o.month && day < o.day)))
    }

  }

}
