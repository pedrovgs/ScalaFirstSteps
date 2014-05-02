/**
 *
 * This is a sample to show how to use Thread and Runnable.
 *
 * The simplest way to work with asynchronous elements in scala is to use the concurrent API built in top of Java
 * concurrency model.
 *
 * We can use Runnable to execute an asynchronous task.
 * We can use Thread to create a new thread and execute Runnables inside.
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
object ThreadAndRunnable {

  def main(args: Array[String]) {

    val hello = new Thread(new Runnable {
      def run() {
        println("hello world")
      }
    })

    hello.start()
  }


}
