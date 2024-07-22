object mean {

  def findMean(n1: Int, n2: Int): Double = {
    val mean: Double = (n1 + n2) / 2.0
    val roundedMean =
      BigDecimal(mean).setScale(2, BigDecimal.RoundingMode.HALF_UP)
    roundedMean.toDouble
  }

  def main(args: Array[String]): Unit = {
    val average = findMean(10, 7)
    println(f"$average%.2f")
  }
}
