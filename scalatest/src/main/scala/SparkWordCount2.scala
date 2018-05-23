
import org.apache.spark.{SparkConf, SparkContext}

object SparkWordCount2 {
  def main(args: Array[String]) {
  /*  val inputFile = "hdfs://localhost:9000/lord/Lord.txt"
    val outputFile = "hdfs://localhost:9000/lord"
    val conf = new SparkConf().setAppName("wordCount")
    // Create a Scala Spark Context.
    val sc = new SparkContext(conf)
    // Load our input data.
    val input =  sc.textFile(inputFile)
    // Split up into words.
    val words = input.flatMap(line => line.split(" "))
    // Transform into word and count.
    val counts = words.map(word => (word, 1)).reduceByKey{case (x, y) => x + y}*/
    // Save the word count back out to

    //val sc = new SparkContext( "local", "Word Count", "/usr/local/spark", Nil, Map(), Map())

    /* local = master URL; Word Count = application name; */
    /* /usr/local/spark = Spark Home; Nil = jars; Map = environment */
    /* Map = variables to work nodes */
    /*creating an inputRDD to read text file (in.txt) through Spark context*/

    val conf = new SparkConf().setAppName("wordcount")
    //"local", "Word Count", "/home/agnel/hadoop/spark-2.2.1-bin-hadoop2.7", Nil, Map(), Map())
    val sc = new SparkContext(conf)

    val input = sc.textFile("hdfs://localhost:9000/lord/Lord.txt")
    val count = input.flatMap(line ⇒ line.split(" "))
      .map(word ⇒ (word, 1))
      .reduceByKey(_ + _)
    count.saveAsTextFile("outfile")
    System.out.println("OK");


  }
}