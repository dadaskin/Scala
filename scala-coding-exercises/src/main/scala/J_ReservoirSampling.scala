import scala.util.Random

// From: https://www.baeldung.com/scala/option-type
// Options[A] - A type that allows for absence of data of type A.
//      (Similar to Nullable(T) in C#.)
//     Example:  val o1: Option[Int] = None   // o1 is an Int of value Null
//               val o2 = Some(10)            // o2 has the Int value 10
//
//     Tests whether an Option is Some or None:
//        .isDefined    true if object is Some
//        .nonEmpty     true if object is Some
//        .isEmpty      true if object is None
//

object J_ReservoirSampling {
  final case class State[A](result: Option[A], count: Int)

  object State {
    def empty[A]: State[A] = State(None, 0)
  }


  def sample[A](elts: List[A]): Option[A] = {
    val State(result, _) =
      elts.foldLeft(State.empty[A]) { (state, elt) =>
        val State(result, count) = state
        val p = 1.0 / (count + 1).toDouble
        if (Random.nextDouble() < p)
          State(Some(elt), count + 1)
        else State(result, count + 1)
      }
    result

  }

  def main(args: Array[String]): Unit = {
    println(J_ReservoirSampling.sample(List(0, 1, 2, 3, 4)))
  }
}
