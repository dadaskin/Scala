package com.rockthejvm.playground.part3fp

object AnonymousFunctions {

  val doubler1:Function1[Int, Int] = new Function1[Int, Int] {
    override def apply(n: Int) = n * 2
  }

  // Function Types as lambdas:
  // Single arg
  val doubler2: Int => Int = (n: Int) => n * 2

  // Two args
  val adder: (Int, Int) => Int  = (a: Int, b: Int) => a + b

  // Zero args
  val justDoIt: () => Int = () => 42

  // Alternative syntax with curly braces
  val stringToInt = { (s: String) =>
     val sLength = s.length
     sLength + 45
  }

  // Type inference
  var doubler3: Int => Int = n => n *2              //  compier infers n to be an Int
  var adder2: (Int, Int) => Int = (a, b) => a + b   //  compier infers a and b  to be Ints

  // Shortest notation possible:
  var doubler4: Int => Int = _ * 2
  var adder3: (Int, Int) => Int = _ + _      // Can't reuse arguments is this variation



  def main(args: Array[String]): Unit = {
    println(doubler1(4))
    println(doubler2(4))
    println(adder3(2,3))
  }
}
