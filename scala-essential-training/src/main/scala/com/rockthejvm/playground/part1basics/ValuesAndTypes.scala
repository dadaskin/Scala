package com.rockthejvm.playground.part1basics

object ValuesAndTypes {

  // Numeric types
  val meaningOfLife: Int = 42 // Values cannot be reassigned.
  val anInteger = 67  // Compiler can infer that this is an Integer (4 bytes)
  val aBoolean: Boolean = false;
  var aShort: Short = 5243  // Short is 2 bytes
  var aLong: Long = 53627856934567L // 8 byte integer. Requires "L"
  val aFloat: Float = 2.4f  //  4-byte decimal.  Requires 'f'
  val aDouble:Double = 4.5  //  8-byte decimal.  Inferred decimal type

  // String types
  var aChar: Char = 'a'    // Single quote for Char
  val aString: String = "aflkjafl"  // Double quotes for String

  def main(args: Array[String]): Unit = {

  }
}
