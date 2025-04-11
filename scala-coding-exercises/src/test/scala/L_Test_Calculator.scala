import munit.*

class L_Test_Calculator extends FunSuite {
  test("literals evaluate to themselves") {
    assertEquals(L_Calculator(Expression(1.0)), 1.0)
    assertEquals(L_Calculator(Expression(3.0)), 3.0)
    assertEquals(L_Calculator(Expression(5.0)), 5.0)
    assertEquals(L_Calculator(Expression(7.0)), 7.0)
  }

  test("complex expressions evaluate correctly") {
    assertEquals(L_Calculator(Expression(1.0) + Expression(3.0)), 4.0)
    assertEquals(L_Calculator(Expression(1.0) * Expression(3.0)), 3.0)
    assertEquals(L_Calculator(Expression(4.0) / Expression(2.0) + Expression(2.0)), 4.0)
    assertEquals(L_Calculator(Expression(1.0) * Expression(3.0) - Expression(2.0)), 1.0)
  }
}
