package chapter01

/**
  * 通过mkString 方法指定集合元素间的分隔符
  */
object Upper2 {
  def main(args: Array[String]): Unit = {
    val str = List("aa", "bb", "cc")
    //    val output = str.map(_.toUpperCase()).mkString("[", ",", "]")
    //    println(output)

    //简化写法，通过foreach遍历集合
    str.map(_.toUpperCase()).mkString("[", ",", "]").foreach(printf("%s", _))


  }
}
