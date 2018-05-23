import org.apache.spark.SparkContext

object BasicAvgFromFiles {
  def main(args: Array[String]) {

    if (args.length < 3) {
      println("Usage: [sparkmaster] [inputdirectory] [outputdirectory]")
      //exit(1)
    }
    val master = "local"
    val inputFile = "/hdfs://localhost:9000/input/average"
    val outputFile = "hdfs://localhost:9000/out8"
    val sc = new SparkContext(master, "BasicAvgFromFiles", System.getenv("SPARK_HOME"))
    val input = sc.wholeTextFiles(inputFile)
    val result = input.mapValues { y =>
      val nums = y.split(" ").map(_.toDouble)
      nums.sum / nums.size.toDouble
    }
    result.saveAsTextFile(outputFile)

  }
}