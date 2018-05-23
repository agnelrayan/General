/**
  * Created by agnel on 3/26/18.
  */

import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf
object Test {
  def main(args: Array[String]) {
   println("welcome to scala")
    println("Hallelujah...")

    val master = args.length match {
      case x: Int if x > 0 => args(0)
      case _ => "local"
    }
    val sc = new SparkContext(master, "BasicMap", System.getenv("SPARK_HOME"))
    val input = sc.parallelize(List(10,20,30,40))
    val result = input.map(x => x*x)
    println(result.collect().mkString(","))

    val input2 = sc.parallelize(List(2,4,6,8))
    val result2 = input2.map(x=>x*x*x)
    println(result2.collect().mkString(","))
  }

}
