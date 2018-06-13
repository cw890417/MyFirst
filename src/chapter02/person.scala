package chapter02

/**
  * 构造方法中的变量问题
  */
object person extends App {
  //name 为val 不可变，无法使用p.name更改值
  //age 为var 可以使用
  class Person(val name: String, var age: Int)

  val p = new Person("chenwei", 29)
  println(p.name)
  println(p.age)
  p.age = 28
  println(p.age)
}
