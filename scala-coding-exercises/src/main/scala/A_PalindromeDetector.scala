object A_PalindromeDetector {

  def isPalindrome(word: String): Boolean =
    word.toUpperCase.equals(word.reverse.toUpperCase)

  def isPalindrome_solution(word: String): Boolean = {
    val lower = word.toLowerCase
    lower.reverse == lower
  }

  def main(args: Array[String]): Unit = {
    println("rAdar: " + isPalindrome("rAdar"))
    println("Level: " + isPalindrome("Level"))
    println("kayak: " + isPalindrome("kayak"))
    println("canoe: " + isPalindrome("canoe"))
    println("Bumpy: " + isPalindrome("Bumpy"))
    println("LidAr: " + isPalindrome("LidAr"))
  }
 }