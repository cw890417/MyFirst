package chapter01

/**
  * 示例代码
  * 继承App，调用方法是就可以省去main方法
  */
object Chapter01_Test extends App {

  //创建一个Upper类
  class Upper {
    //参数为可变参数，返回类型为String的Seq对象，
    def upper(string: String*): Seq[String] = {
      //将传入的参数转为大写，并用map转为集合形式
      //使用函数字面量的方式，传入的是匿名函数:(s: String) => s.toUpperCase()
      string.map((s: String) => s.toUpperCase())
    }
  }

  //传入可变参数
  val up = new Upper
  println(up.upper("a", "b", "c"))

  //简化版本
  //两种表示方式一样，省去Seq[String]，自动推断返回类型
  def upper(string: String*) = string.map(_.toUpperCase())

  println(Chapter01_Test.upper("aa", "bb", "cc"))
}
