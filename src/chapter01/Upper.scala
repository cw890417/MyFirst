package chapter01

/**
  * 通过map方法将字符串转为大写，并通过foreach进行遍历
  */
object Upper {
  def main(args: Array[String]): Unit = {
    val str = List("a", "b", "c")
    str.map(_.toUpperCase()).foreach(printf("%s ", _))
  }
}
