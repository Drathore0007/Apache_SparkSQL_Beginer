import com.typesafe.config.{Config, ConfigFactory}
import org.apache.spark.{SparkConf, SparkContext}
import org.scalactic._
import org.apache.spark.sql.{Row, SparkSession}
import scala.util.Try
import _root_.spark.jobserver.{SparkJobValid, SparkJobInvalid, SparkJobValidation, SparkJob}
//import spark.jobserver.api.{SparkJobValid, SparkJobInvalid, SparkJobValidation, SparkJob}

//object multipara extends SparkJob {

object sql extends SparkJob {
  override def runJob(sc: SparkContext, config: Config): Any = {
    //val sql: String = config.getString("sql")
    val spark = SparkSession.builder().enableHiveSupport().getOrCreate()
    val df = spark.sql("select * from default.weather limit 10")
    Map(
        "columns" -> df.columns,
        "rows" -> df.collect.map(_.toSeq)
     )
  }
  override def validate(sc: SparkContext, config: Config): SparkJobValidation = {
    SparkJobValid
  }
}