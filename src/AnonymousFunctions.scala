/**
 *
 * This sample shows how to use Anonymous functions to avoid declare one function that is going to be used only one
 * time. Is the same concept that java already implements.
 *
 * Take a look to see how "onTimePerSecond" function declares the callback with a anonymous function. "callback: ()"
 * declare that receives one function without parameters and "=> Unit" specify that that function is going to
 * return nothing. In the implementation we are going to implement an anonymous function replacing the "Unit" key word
 * with the implementation.
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
object AnonymousFunctions {

  def main(args: Array[String]) {

    oneTimePerSecond(
      () => {
        print("Tick")
        println(" Tack")
      }
    )

  }

  def oneTimePerSecond(callback: () => Unit) {
    while (true) {
      callback()
      Thread sleep 1000
    }
  }

}

