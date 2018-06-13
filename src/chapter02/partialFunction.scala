package chapter02

/**
  * 偏函数:
  * 1.偏函数之所以“偏”，原因在于它们并不处理所有可能的输入，而只处理那些能与至少一个 case 语句匹配的输入。
  * 2.在偏函数中只能使用 case 语句，而整个函数必须用花括号包围同，普通函数字面量可以用花括号，也可以用圆括号包围
  * 3.如果偏函数被调用，而函数的输入却与所有语句都不匹配，系统就会抛出一个 MatchError （ http://www.scala-lang.org/api/current/#scala.MatchError）运行时错误。
  * 4.我们可以用 isDefineAt 方法测试特定输入是否与偏函数匹配，这样偏函数就可以避免抛出 MatchError 错误了。
  */
object partialFunction extends App {
  val pf1: PartialFunction[Any, String] = {
    case s: String => "YES"
  }
  val pf2: PartialFunction[Any, String] = {
    case d: Double => "YES"
  }
  val pf = pf1 orElse (pf2)

  def tryPF(x: Any, f: PartialFunction[Any, String]): String = // <4>
    try {
      f(x).toString
    } catch {
      case _: MatchError => "ERROR!"
    }

  def d(x: Any, f: PartialFunction[Any, String]) = // <5>
    f.isDefinedAt(x).toString

  println("      |   pf1 - String  |   pf2 - Double  |    pf - All") // <6>
  println("x     | def?  |  pf1(x) | def?  |  pf2(x) | def?  |  pf(x)")
  println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++")
  List("str", 3.14, 10) foreach { x =>
    printf("%-5s | %-5s | %-6s  | %-5s | %-6s  | %-5s | %-6s\n", x.toString,
      d(x, pf1), tryPF(x, pf1), d(x, pf2), tryPF(x, pf2), d(x, pf), tryPF(x, pf))
  }
}
