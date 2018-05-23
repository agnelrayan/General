import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark._

object WordCount {
def main(args:Array[String]){

  //val sc = new SparkContext("local","Word Count","/home/agnel/hadoop/spark-2.2.1-bin-hadoop2.7",Nil,Map(),Map())
  //val sc = new SparkContext( "local", "Word Count", "/usr/local/spark", Map(), Map())

  val conf = new SparkConf().setAppName("SparkWordCount").setMaster("local")
  val sc = new SparkContext(conf);
  val input = sc.textFile("/home/agnel/jesus")

  val count = input.flatMap(line=>line.split(",")).map(word=>(word,2)).reduceByKey(_+_)
  count.saveAsTextFile("hdfs://localhost:9000/out7")
  System.out.println("OK")

}
}
