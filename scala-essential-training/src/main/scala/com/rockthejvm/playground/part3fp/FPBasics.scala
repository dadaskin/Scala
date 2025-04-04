package com.rockthejvm.playground.part3fp

object FPBasics {

  // apply
  case class Person(name: String, favMovie: String) {
    def apply(n:Int): String = s"$name watched $favMovie $n times."
  }

  val daniel = Person("Daniel", "Interstellar")
  val dStatement1 = daniel.apply(4)
  val dStatement2 = daniel(4)

  // Create "function" types
  trait SimpleMathFunction {
    def apply(n:Int): Int
  }

  val doubler:SimpleMathFunction = new SimpleMathFunction {
    override def apply(n: Int): Int = n * 2
  }

  val six = doubler(3)

  trait MyFunction[A, B] {
    def apply(arg: A): B
  }

  val doubler2 = new MyFunction[Int, Int] {
    override def apply(arg: Int) = arg * 2
  }

  val six2 = doubler2(3)

  // In FP we work with functions as "first class" elements of the language
  //    - We can pass functions as args,
  //    - We can return them as results
  //    Ex: Int => Int can be expressed as a trait that has an apply(Int): Int
  //        (String, Int) => String     ...   apply(String, Int): String

  trait MyStringIntFunction {
    def apply(s: String, i: Int): String
  }

  val myCombinator = new MyStringIntFunction {
    override def apply(s: String, i: Int) =
      s"$s, ($i)"
  }

  // Scala already has function traits
  val doubler3 = new Function1[Int, Int] {
    override def apply(arg: Int): Int = arg * 2
  }

  val myCombinator2 = new Function2[String, Int, String] {
    override def apply(s: String, i: Int) =
      s"$s, ($i)"
  }

  val superFunc = new Function4[Int, String, Double, Boolean, Int] {
    override def apply(v1: Int, v2: String, v3: Double, v4: Boolean): Int = v1 * 10
  }

  // All function values are instances of FunctionN traits with apply methods

  def main(args: Array[String]): Unit = {
    println(six2)
    println(myCombinator("Scala", 99))
    println(myCombinator2("Scala", 99))
    println(superFunc(4, "foo", 3.14, true))
  }
}
