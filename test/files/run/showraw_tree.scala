import scala.reflect.runtime.universe._

object Test extends App {
  val tree1 = reify(new collection.immutable.ArraySeq.ofRef[String](Array()))
  val tree2 = reify(new collection.mutable.HashMap[String, String])
  println(showRaw(tree1.tree))
  println(showRaw(tree2.tree))
}
