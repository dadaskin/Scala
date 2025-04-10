import munit.*

class J_Test_ReservoirSampling extends FunSuite {
  test("sampling empty list returns None") {
    assertEquals(J_ReservoirSampling.sample(List.empty[Int]), None)
  }

  test("sampling one element list returns single element") {
    assertEquals(J_ReservoirSampling.sample(List(1)), Some(1))
  }

  test("sampling larger list returns an element within the list") {
    val Some(result) = J_ReservoirSampling.sample(List(0, 1, 2, 3, 4)) 
        assert(result >= 0 && result <= 4, s"Result is $result")
  }
}