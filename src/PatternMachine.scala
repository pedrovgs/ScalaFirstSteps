/**
 *
 * This sample shows how to implement a little calculator based on a tree structure.
 *
 * In this file you can see how 4 classes has been declared, 1 abstract called Tree and three implementations. Review
 * how the key word "extends" is used to create a class extending from other.
 *
 * The "case" key word is used to declare classes with some restrictions:
 *
 * - It's not mandatory to use "new" key word to create an instance you can do just Var(4) instead of new Var(4).
 * - Getter methods are automatically created for all the patterns declared at class level.
 * - "equals" and "hashCode" methods are declared by default.
 * - "toString" method is implemented with a default implementation.
 * - This classes can be decomposed using pattern machine. This is the most importan part of the "case" usage.
 *
 * To apply pattern machine we are going to use "{}" braces to declare functions that are going to be evaluated
 * in the future. Functions like "{ case "x" => 5 }" represents that given an string "x" that function returns 5 and
 * fails with an exception if the pattern doesn't match.
 *
 * In scala we can create "types" to define spaces with some rules to accept parameters and declare return values.
 * In this sampel we are going to define a new type called "Environment" defining that for one String parameter
 * the type is going to return an Integer. Once you have declared the new type this can be used to declare functions
 * structures. Use this type to define one function that transform strings in integers.
 *
 * This sample shows how to create a method to evaluate an expresion with vars constants and sums and evaluate the result.
 * Take a look to the pattern machine used in the eval function. The "eval" function receives two parameters, one
 * Tree and one function that matches with "Environment". Once the "eval" function is called is going to map the
 * tree value to an integer and apply the pattern machine to resolve some special cases.
 *
 * The "eval" function could be explained in some different steps:
 *
 * - First checks if the tree is a Sum, if it associate to the left branch of the tree a new var called i and do the
 * same with the right branch and a var d. After that applies the expression at the right of "=>" sentence applyig
 * two eval calls more with the left and the right part created.
 *
 * - If the tree is not a "Sum" try to check if the tree is a "Var". If it is, apply the "Environment" type with the
 * tree obtained.
 *
 * - If the tree is a "Const" the eval function returns the same value.
 *
 * - If no pattern is matched this method will throw an exception.
 *
 * We can use this eval method to evaluate one expresion created with sums, vars or constants.
 * We have also defined the derived of a sum like the sum of the derived
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
object PatternMachine {

  def main(args: Array[String]) {

    val exp: Tree = Sum(Sum(Var("x"), Var("x")), Sum(Const(7), Var("y")))
    println("Expression: " + exp)

    val env: Environment = {
      case "x" => 5
      case "y" => 7
    }
    println("Expression with x = 5 and y = 7 =" + eval(exp, env))

    println("Derived on x: " + derived(exp, "x"))
    println("Derived on y: " + derived(exp, "y"))

  }

  def eval(t: Tree, env: Environment): Int = t match {
    case Sum(l, r) => eval(l, env) + eval(r, env)
    case Var(n) => env(n)
    case Const(v) => v
  }

  def derived(t: Tree, v: String): Tree = t match {
    case Sum(l, r) => Sum(derived(l, v), derived(r, v))
    case Var(n) if (v == n) => Const(1)
    case _ => Const(0)
  }

  abstract class Tree

  case class Sum(left: Tree, right: Tree) extends Tree

  case class Var(num: String) extends Tree

  case class Const(value: Int) extends Tree

  type Environment = String => Int
}
