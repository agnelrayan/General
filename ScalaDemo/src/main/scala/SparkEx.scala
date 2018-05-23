import org.apache.spark.SparkConf

/**
  * Created by agnel on 4/23/18.
  */
object SparkEx {
  def main(args : Array[String]){
    val conf = new SparkConf().setAppName("Simple App").setMaster("local[2]").set("spark.executor.memory")
    val sc = new org.apache.spark.SparkContext(conf)
    val sql = new org.apache.spark.sql.SQLContext(sc)

    val NyseDF = sql.load("com.databricks.spark.csv",Map("path" ->args(0),"header"->"true"))
    NyseDF.registerTempTable("NYSE")
    NyseDF.printSchema()




  }

}
