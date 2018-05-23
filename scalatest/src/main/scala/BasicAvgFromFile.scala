import org.apache.spark.SparkContext

object BasicAvgFromFile {
  def main(args: Array[String]) {
    if (args.length < 2) {
      println("Usage: [sparkmaster] [inputfile]")
      //exit(1)
    }
    val master = "local"
    val inputFile = "/home/agnel/average"
    val sc = new SparkContext(master, "BasicAvg", System.getenv("/home/agnel/hadoop/spark-2.2.1-bin-hadoop2.7"))
    val input = sc.textFile(inputFile)
    val result = input.map(_.toInt).aggregate((0, 0))(
      (acc, value) => (acc._1 + value, acc._2 + 1),
      (acc1, acc2) => (acc1._1 + acc2._1, acc1._2 + acc2._2))
    val avg = result._1 / result._2.toFloat
    println(result)
  }

}
