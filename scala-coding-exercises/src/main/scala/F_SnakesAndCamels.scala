object F_SnakesAndCamels {

  def snakeToCamel(string: String): String = {
    val snakeWordRegex = "_(.)".r
    snakeWordRegex.replaceAllIn(string, matched => matched.group(1).toUpperCase)
  }

  def main(args: Array[String]): Unit = {
    println(snakeToCamel("this_is_a_string"))
  }
}
