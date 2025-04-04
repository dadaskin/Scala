object B_PasswordChecker {

  def hasPunctuation(str: String): Boolean =
    str.exists(char =>
      char == '.' ||
      char == ',' ||
      char == ';' ||
      char == ':' ||
      char == '?' ||
      char == '!' ||
      char == '"' ||
      char == '_' ||
      char == ')' ||
      char == '('
    )
    
  def isValidPassword(password: String): Boolean = {
    password.length >= 8 &&
    password.exists(_.isUpper) &&
    password.exists(_.isLower) &&
    (password.exists(_.isDigit) || hasPunctuation(password))
  }


  def main(args: Array[String]): Unit = {
    println(isValidPassword("AbcdE?12"))
    println(isValidPassword("short"))
  }
}
