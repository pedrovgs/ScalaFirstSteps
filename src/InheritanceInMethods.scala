import java.io.FileInputStream
import scala.io.Source

/** 
 *
 * This sample shows how to define that a type is a type that inherits from another
 *
 * It also shows how to automatically close a resource that can be closed!
 */
object InheritanceInMethods {
	type Closable = {
		def close(): Unit
	}

	/** 
	 * A is any type that is like the type Closable! Which simply must have a method called close that returns Unit and takes no parameters
	 *
	 * The main point is that A is any type that could be considered to inherit from Closable
	 */
	def withResource[A <: Closable, B](resource: A)(f: A => B): B = {
		try { 
			f(resource) 
		} finally { 
			resource.close() 
		}
	}

	def main(): Unit = {
		val in = new FileInputStream(".gitignore")

		/* No need to manually call in.close after, it's already been done! */
		val ignoreFile = withResource(in) { resource =>
			Source.fromInputStream(resource).getLines().mkString(f"%n")
		}
		println(f"%n$ignoreFile%n")

	}
}