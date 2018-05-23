import org.apache.spark.SparkConf
import org.apache.spark.streaming.{Seconds, StreamingContext}

/**
  * Created by agnel on 4/10/18.
  */
object Test {
def main(arg:Array[String]){

  val sparkConf = new SparkConf().setAppName("911")
  val ssc = new StreamingContext(sparkConf, Seconds(2))
  //val data = ssc.textFile("/home/agnel/911.csv")

}
}
