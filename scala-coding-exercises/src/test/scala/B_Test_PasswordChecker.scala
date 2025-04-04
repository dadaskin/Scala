import munit.*
import B_PasswordChecker.*

class PasswordCheckerSuite extends FunSuite {
  test("Acceptable passwords are ok") {
    assert(isValidPassword("(ScalaChallenge2)"))
    assert(isValidPassword("b3stpAssw0rd!"))
    assert(isValidPassword("qu1zL_ts"))
  }

  test("Unacceptable passwords are not ok") {
    assert(!isValidPassword("z1x:bN"))
    assert(!isValidPassword("qWeRtYuI"))
    assert(!isValidPassword("quizzle123"))
  }
}
