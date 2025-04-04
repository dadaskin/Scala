import munit.*
import A_PalindromeDetector.*

class A_Test_PalindromeDetector extends FunSuite {

    test("Palindromes are correctly identified") {
      assert(isPalindrome("kayak"))
      assert(isPalindrome("level"))
      assert(isPalindrome("radar"))
    }

    test("Non-palindromes are correctly identified") {
      assert(!isPalindrome("canoe"))
      assert(!isPalindrome("bumpy"))
      assert(!isPalindrome("lidar"))
    }

    test("Case is ignored") {
      assert(isPalindrome("tacocat"))
      assert(isPalindrome("TACOCAT"))
      assert(isPalindrome("tacoCAT"))
    }
}
