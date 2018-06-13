package chapter02

/**
  * 如同前文，定义 Point 类，并提供默认的初始化值。
  * 新的 shift 方法，用于从现有的 Point 对象中对“点”进行平移，从而创建一个新的Point 对象。
  * 它使用了 copy 方法， copy 方法也是 case 类自动创建的。
  */
object Point extends App {

  case class PointClass(x: Double = 0.0, y: Double = 0.0) {

    def shift(deltax: Double = 0.0, deltay: Double = 0.0) = {
      copy(x + deltax, y + deltay)
    }
  }

  val p1 = new PointClass(1.1, 2.2)
  val p2 = p1.copy(y = 3.2)
  println(p1)
  //新的 shift 方法，用于从现有的 Point 对象中对“点”进行平移，从而创建一个新的
  // Point 对象。它使用了 copy 方法， copy 方法也是 case 类自动创建的
  println(p1.shift(1.2,22.2))
}
