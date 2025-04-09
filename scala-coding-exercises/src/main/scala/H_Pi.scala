import scala.annotation.tailrec
import scala.util.Random

object H_Pi {
  private def isPointInCircle(x:  Double, y: Double): Boolean = {
    x*x + y*y < 1.0
  }

  def pi(iterations: Long): Double = {
     @tailrec
     def loop(inside: Long, total:Long): Double = {
       if (total == iterations) 4 * inside.toDouble/total.toDouble
       else {
          if (isPointInCircle(Random.nextDouble(), Random.nextDouble()))
            loop(inside+1, total+1)
          else
            loop(inside, total+1)
       }
     }

    loop(0L, 0L)
  }

  def main(args: Array[String]): Unit = {
    println("100:     " + Math.abs(pi(100) - 3.14159))
    println("1000:    " + Math.abs(pi(1000) - 3.14159))
    println("10000:   " + Math.abs(pi(10000) - 3.14159))
    println("100000:  " + Math.abs(pi(100000) - 3.14159))
    println("1000000: " + Math.abs(pi(1000000) - 3.14159))

  }
}