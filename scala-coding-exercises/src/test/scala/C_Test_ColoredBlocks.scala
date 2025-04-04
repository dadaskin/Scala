import munit.*
import doodle.image.Image
import ColoredBlocks.*

class ColoredBlocksSuite extends FunSuite {
  test("stack correctly constructs a stack of blocks") {
    assertEquals(stack(0), Image.empty)
    assertEquals(stack(1), ColoredBlocks.block.above(Image.empty))
    assertEquals(
      stack(2),
      block.above(ColoredBlocks.block.above(Image.empty))
    )
    assertEquals(
      stack(3),
      block.above(
        block.above(ColoredBlocks.block.above(Image.empty))
      )
    )
  }
}
