import scala.io.Source
// counts the number of occurrences of a word in a file and print them in descending order
object Main extends App {

  Source.fromFile("src/main/Hello.txt").getLines().flatMap(_.split(" "))
    .toStream
    .groupBy(identity)
    .mapValues(_.size)
    .toSeq
    .sortWith(_._2>_._2)
    .foreach(println)


}
