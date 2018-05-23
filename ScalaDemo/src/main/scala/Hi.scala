/**
  * Created by agnel on 4/13/18.
  */
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.sql._
import org.apache.spark.SparkConf
object Hi {

  case class DimC(ID:Int, Name:String, City:String, EffectiveFrom:Int, EffectiveTo:Int)

  def main(args:Array[String]) {
    val conf = new SparkConf().setAppName(“LoadDW”)
    val sc = new SparkContext(conf)
    val sqlContext= new org.apache.spark.sql.SQLContext(sc)
    import sqlContext.implicits._
    val fDimCustomer = sc.textFile(“DimCustomer.txt”)

    var dimCustomer1 =   fDimCustomer.map(_.split(‘,’)).map(r=>DimC(r(0).toInt,r(1),r(2),r(3).toInt,r(4).toInt)).toDF

    dimCustomer1.registerTempTable(“Cust_1”)

    val customers = sqlContext.sql(“select * from Cust_1”)

    customers.show()
  }
}
