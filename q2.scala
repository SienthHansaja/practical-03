import scala.io.StdIn.readLine

object len {

  def listOfStrings(myList: List[String]): List[String] = {
    myList.filter(_.length > 5)
  }

  def main(args: Array[String]): Unit = {
    val myList = List("This", "Monday", "is", "not", "Carnival", "Day")
    val newList: List[String] = listOfStrings(myList)
    println(
      "Filtered List: " + newList.mkString(",")
    ) // making list as continous strings
  }
}
