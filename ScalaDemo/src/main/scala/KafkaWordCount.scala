import org.apache.spark.SparkConf
import org.apache.spark.streaming.kafka.KafkaUtils
import org.apache.spark.streaming.{Minutes, Seconds, StreamingContext}

/**
  * Created by agnel on 4/6/18.
  */
object KafkaWordCount {
  def main(args: Array[String]) {

    val sparkConf = new SparkConf().setAppName("KafkaWordCount")
    val ssc = new StreamingContext(sparkConf, Seconds(2))
    ssc.checkpoint("checkpoint")

    val kafkaStream = KafkaUtils.createStream(ssc, "localhost:2181","spark-streaming-consumer-group", Map("ag-topic" -> 5))



    val words = kafkaStream.flatMap(x =>  x._2.split(" "))

    val wordCounts = words.map(x => (x, 1)).reduceByKey(_ + _)

    kafkaStream.print()  //prints the stream of data received
    wordCounts.print()   //prints the wordcount result of the stream

    ssc.start()
    ssc.awaitTermination()
    System.out.println("Is Completed...");

  }

}
