/*
import cats.effect.unsafe.implicits.global
import doodle.image.Image
import doodle.core.Color
import doodle.image.syntax.all.*
import doodle.java2d.*
import scala.annotation.tailrec

// Note:  IntelliJ has some problem importing org.creativescala.doodle (per StackOverflow.com)
//        I Changed build.sbt from Notepad++ and ran it from the command line without a problem
//        Now when I start IntelliJ it runs here, too.
//        Same thing with the corresponding test.
//
//        To get sbt from the command prompt:
//        - CD to the project folder.
//        - type "sbt" to start the sbt shell.
//        - tyoe "run" to build and run the project.
//          Sbt will prompt you with a list of all the main classes found.   Select "drawHBlocks"
//        - Type "test" to run the unit tests
//

object ColoredBlocks {
  // The block used to create the stack of blocks
  val block = Image.square(40).fillColor(Color.crimson)

  // Example showing how to create a stack of blocks
  val stack = block.above(block.above(Image.empty))

  @tailrec
  def helper(count: Int, image: Image): Image =
    if (count == 0) image
    else
      helper(count - 1, block.above(image))

  def stack(count: Int): Image =
    helper(count, Image.empty)

  // Call this to draw a stack of blocks
  @main def drawBlocks(): Unit =
    stack(5).draw()
}
*/