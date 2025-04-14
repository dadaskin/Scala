import munit.*
import M_ErrorHandling.Fulfillment

class M_Test_ErrorHandling extends FunSuite {
  test("Successful order fulfilled as expected") {
    val result = M_ErrorHandling.processOrderForUser(1)
    assertEquals(result, Some(Fulfillment("Today")))
  }

  test("Unsuccessful orders fail") {
    assertEquals(M_ErrorHandling.processOrderForUser(0), None)
    assertEquals(M_ErrorHandling.processOrderForUser(2), None)
    assertEquals(M_ErrorHandling.processOrderForUser(3), None)
    assertEquals(M_ErrorHandling.processOrderForUser(4), None)
  }
}
