object SumEven {

  def sumOfEvenNumbers(numbers: List[Int]): Int = {
    numbers.filter(_ % 2 == 0).sum
  }

  def main(args: Array[String]): Unit = {
    val numbers = List(10, 21, 3, 15, 50, 1)
    val sum = sumOfEvenNumbers(numbers)
    println(s"Sum of even numbers: $sum")
  }
}
