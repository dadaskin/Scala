package com.rockthejvm.playground.part3fp

object ListsDemo {

  // Singly linked list
  val aList: List[Int] = List(1, 2, 3)

  val first: Int = aList.head
  val rest = aList.tail

  val biggerList1 = 0 :: aList // Prepend 0:  returns new list with 0,1,2,3
  val biggerList2 = aList :+ 4 // Append 4:    ...

  val foox5 = List.fill(5)("Foo")

  val reversedList = aList.reverse
  val concatenation = aList ++ List(4, 5, 6)
  val sRep1 = aList.mkString(",")
  val sRep2 = aList.mkString("[", ",", "]")

  val total1 = aList.reduce((a, b) => a + b)
  var total2 = aList.reduce(_ + _)

  // Higher-order functions  take functions as args and/or return functions
  // Map transforms list by applying function on every element
  val tenxList = aList.map(x => x*10)
  val scalaList = aList.map(x => s"Scala $x")

  // Filter transforms list by keeping elements that satisfy a function.
  val evens = aList.filter(x => x %2 == 0)

  // FlatMap transforms list by applying function to every element
  val expandedList = aList.map(x => List(x, x + 1))
  val expandedListFlat = aList.flatMap(x => List(x, x + 1))

  // Exercises
  // Ex 1. Given a list of numbers return a list of "Scala" repeated each element number of times.
  def repeater(s: String, n: Int): String = {
    if (n <= 0) ""
    else repeater(s, n-1) + s
  }
  def repeatString(s: String, numbers:List[Int]): List[String] = numbers.map(n => repeater(s, n))

  // Ex 2. Generated first 100 numbers with recursive function.
  def countN(n: Int ): List[Int] = {
    if (n <= 0)  List()
    else  countN(n-1) :+ n
  }

  // Ex 3. From first N numbers return just the primes.
  def isPrime(n: Int): Boolean = {
    def testDivisors(d: Int): Boolean =
      if (d > n / 2) true
      else if (n % d == 0) false
      else testDivisors(d + 1)

    if (n <= 0) false
    else if (n == 1) false
    else testDivisors(2)
  }

  def firstNprimes(n: Int): List[Int] = countN(n).filter(n => isPrime(n))

  // Ex4. Return a list of all the digits of the numbers in a list  [13, 24, 987] => [1,3,2,4,9,8,7]
  def listDigits(n : Int ): List[Int] = {
    if (n % 10 < 1) List()
    else listDigits(n/10) :+ n % 10
  }

  def digitize(inputList: List[Int]): List[Int] = inputList.flatMap(n => listDigits(n))
  def digitize2(inputList: List[Int]): List[Int] = inputList.flatMap(listDigits(_))

  // Example of "for compositions"  Not a loop, an expression!
  val numbers = List(1,2,3,4)
  val colors = List("black", "white", "blue")

  // => "Cross product" of these lists ["1-black", "2-black", "1-blue", "3-white", ...]
  val combinations1 = numbers.flatMap(n => colors.map(c => s"$n-$c"))

  // easier to read
  val combinations2 = for {
    n <- numbers  // a generator
    c <- colors   // another generator
  } yield(s"$n-$c")

  // Exercise
  // Generate a chessboard from 1-8 and a-h
  val chessboard = for {
    row <- List("a", "b", "c", "d", "e", "f", "g", "h")
    col <- List(1,2,3,4,5,6,7,8)
  } yield(s"$row$col")

  def main(args: Array[String]): Unit = {
//    println(aList)
//    println(biggerList1)
//    println(biggerList2)
//    println(foox5)
//    println(sRep1)
//    println(sRep2)
//    println(total1)
//    println(total2)
//    println(scalaList)
//    println(evens)
//    println(expandedList)
//    println(expandedListFlat)
//    println(repeatString("Scala", List(2,3,4)))
//    println(countN(30))
//    println(firstNprimes(100))
//    println(digitize2(List(13, 24, 987)))
    println(combinations1)
    println(combinations2)
    println(chessboard)
  }
}