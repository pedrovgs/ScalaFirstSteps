//You can auto complete val methods using TAB inside Scala REPL
//3.TAB -> AUTO COMPLETE
3

//In Scala REPL or Scala worksheet you can use math instead of
// import math to use math functions like sqrt(num:Double)
val number = 17
math.sqrt(number)

//You can't redefine the variable value if you used "val" to declare it
//to override a variable value you have to use "var" instead of "val"
//number2 = 4
val number2 = 2
var number3 = 3
number3 = 4

//In Scala, operators are method and you can use some interesting one
//like StringOpt * method
val crazyness = "crazy" * 3

//To calculate max of two numbers you can use max method implemented
//in RichInt class
val maxNumber = 10 max 3

//You can call methods without parenthesis if your method have just
//one argument. See pow method in BigInt class.
BigInt(2) pow 140

//Some interesting methods can be used in BigInt classes like
//Java static methods.
BigInt.probablePrime(100, scala.util.Random)

//To get chars from a String you can use substring method or take.
//take and takeRight can be used to get first and last chars.
"pedro" take 1
"pedro" takeRight 1
"pedro" substring(0, 3)
"pedro" take 3

//take and drop methods are more interesting than substring methods
//because first one doesn't throw IndexOutOfBoundExecptions
"pedro" drop 1
"pedro" dropRight 1



