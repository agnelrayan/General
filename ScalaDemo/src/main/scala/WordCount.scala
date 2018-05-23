import org.apache.spark.streaming.{Seconds, StreamingContext}
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark._
import org.apache.spark.streaming.kafka.KafkaUtils
/**
  * Created by agnel on 3/26/18.
  */
object WordCount {
  def main(args:Array[String]){
    //val sc = new SparkContext("local","Word Count","/home/agnel/hadoop/spark-2.2.1-bin-hadoop2.7",Nil,Map(),Map())

   val conf = new SparkConf().setAppName("SparkJoins").setMaster("local")
   val sc = new SparkContext(conf);


   val input = sc.textFile("hdfs://localhost:9000/lord/Lord.txt")
    val count = input.flatMap(line =>line.split(" "))
      .map(word=>(word,1))
      .reduceByKey(_+_)
    count.saveAsTextFile("hdfs://localhost:9000/outdirs")
    System.out.println("OK");

   /*val conf = new SparkConf().setMaster("local[*]").setAppName("KafkaReceiver")
   val ssc = new StreamingContext(conf, Seconds(5))

   val kafkaStream = KafkaUtils.createStream(ssc, "localhost:2181","spark-streaming-consumer-group", Map("ag-topic" -> 5))
   //need to change the topic name and the port number accordingly

   val words = kafkaStream.flatMap(x =>  x._2.split(" "))

   val wordCounts = words.map(x => (x, 1)).reduceByKey(_ + _)

   kafkaStream.print()  //prints the stream of data received
   wordCounts.print()   //prints the wordcount result of the stream

   ssc.start()
   ssc.awaitTermination()
   System.out.println("Is Completed...");*/





  }

}
