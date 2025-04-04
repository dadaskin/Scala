package com.rockthejvm.playground.part3fp

object CollectionsDemo{

  // Ranges: Collection of iterable numbers or chars.
  val first10numbers = 1 to 10           // This is similar to a C# Enumerator type
  val first10 = first10numbers.toList    // This is the resulting fully-enumerated list

  // Arrays: native arrays on JVM.
  val anArray = Array.ofDim[Int](1000)  // Allocates 1000 Int-sized spaces in memory.  These are Mutable!
  anArray.update(31, 42)   // Sets the value at index 31 to 42.
  val fifthNumber = anArray(4)   // Indexes are 0-based

  // Sets: Collections with no duplicates (determined with the equals method)
  val aSet = Set(1,2,3,2,3,1,5)  // Really contains [1,2,3,4,5]
  val aSetContains3_1 = aSet.contains(3)
  val aSetContains3_2 = aSet(3)  // apply() and contains() do the same thing on the set.
  val aBiggerSet = aSet + 99    // Returns a new list (unless 99 was already in the list)
  val aSmallerSet = aSet - 1
  // Does not guarantee order (List does)
  val anotherSet = Set(4, 5, 6, 7)
  val aUnifiedSet1 = aSet.union(anotherSet)
  val aUnifiedSet2 = aSet ++ anotherSet    // Alternate syntax
  val aUnifiedSet3 = aSet | anotherSet     // Yet another olternate
  val diffSet1 = aSet.diff(anotherSet)  // Returns a new Set with aSet's elements except for those in anotherSet
  val diffSet2 = aSet -- anotherSet
  val intersection1 = aSet.intersect(anotherSet)
  val intersection2 = aSet & anotherSet

  // These all have map, flatmap and filter and, therefore, for comprehensions.
  val combinations = for {
    x <- Set(1,2,3,4)
    y <- Set(1,2,3,4)
  } yield x * y

  
  
  def main(args: Array[String]): Unit = {
    // (1 to 5).map(_ => println("foo"))
    //  (1 to 5).foreach(_ => println("foo"))  // We can use "foreach" instead of "map" since println returns Unit
//    println(aSet)
//    println(anotherSet)
//    println(aUnifiedSet1)
//    println(diffSet1)
    println(combinations)
  }
}