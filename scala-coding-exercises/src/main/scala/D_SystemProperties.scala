import scala.sys.SystemProperties

object D_SystemProperties {
  
  def printAll():Unit =
    new SystemProperties().iterator.foreach((name, value) => println(s"$name: $value"))
  
  
  def main(args: Array[String]): Unit = {
    println(printAll())
  }
}