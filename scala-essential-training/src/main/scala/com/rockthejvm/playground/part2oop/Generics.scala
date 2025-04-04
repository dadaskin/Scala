package com.rockthejvm.playground.part2oop

object Generics {

  abstract class IntList {
    def first: Int

    def rest: IntList
  }

  class EmptyIntList extends IntList {
    override def first: Int = throw new NoSuchElementException()
    override def rest: IntList = throw new NoSuchElementException()
  }

  case class NonEmptyIntList(a: Int, r: IntList) extends IntList {
    override def first: Int = a
    override def rest: IntList = r
  }

  // Reuse this logic on strings and maintain strong typing
  abstract class MyList[A] {
    def first: A
    def rest: MyList[A]
    def isEmpty: Boolean
  }

  class EmptyList[A] extends MyList[A]  {
    override def first: A = throw new NoSuchElementException()
    override def rest: MyList[A] = throw new NoSuchElementException()
    def isEmpty = true
  }

  case class NonEmptyList[A](a:A, r: MyList[A]) extends MyList[A] {
    override def first: A = a
    override def rest: MyList[A] = r
    def isEmpty = false
  }

  // Can add type args to traits, abstract classes, case classes.
  //   Not on objects.

  // Can add multiple type args on single class, trait, etc.
  trait MyMap[X,Y]

  // Can add type args for methods
  def second[A](list: MyList[A]) : A =
    if (list.isEmpty) throw new NoSuchElementException()
    else if (list.rest.isEmpty) throw new NoSuchElementException()
    else list.rest.first


  def main(args: Array[String]): Unit = {
    val numbers = NonEmptyList(1, NonEmptyList(2, NonEmptyList(3, new EmptyList)))
    val firstNumber = numbers.first

    val strings = NonEmptyList("a", NonEmptyList("b", NonEmptyList("c", new EmptyList)))
    val firstString = strings.first

    println(second(numbers))
    println(second(strings))
  }
}
