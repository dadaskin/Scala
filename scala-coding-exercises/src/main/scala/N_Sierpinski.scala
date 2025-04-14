import cats.effect.unsafe.implicits.global
import doodle.image.Image
import doodle.core.Color
import doodle.image.syntax.all.*
import doodle.java2d.*

object N_Sierpinski {
  val triangle: Image = Image.equilateralTriangle(20).fillColor(Color.lawnGreen)

  private def sierpinski(depth: Int): Image =
    if (depth == 1) triangle
    else {
      val previous = sierpinski(depth - 1)
      previous.above(previous.beside(previous))
    }

  @main def drawSierpinski(): Unit =
    sierpinski(5).draw()
}
