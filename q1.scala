import scala.io.StdIn.readLine
object reverse {

  def reverseString(word: List[Char]): Unit = {
    if (word.length != 0) {
      println(word.last)
      reverseString(word.init)
    }
  }

  def main(args: Array[String]): Unit = {
    println("Enter a string :")
    val word = readLine()
    val wordList = word.toList
    reverseString(wordList)
    // println(wordList.tail)
  }
}
