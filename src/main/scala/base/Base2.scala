package base

/**
  * 表达式
  *
  * 特点：
  *   1.表达式是有返回值的
  *   2.返回值是表达式的最后一条执行结果
  *
  * * 条件表达式
  * * 块表达式
  *
  * @author xiaoran
  * @date 2019/06/18
  *
  */
object Base2 {

  def main(args: Array[String]): Unit = {
    /**
      * 条件表达式
      * 可混合返回结果类型
      */
    val a = 123
    val b = if (a > 0)
      a
    else
      "字符串"
    println(b)

    /**
      * 块表达式
      * {}修饰
      */
    val value = {
      val a = 10
      val b = 20
      a + b
    }
    println(value)
  }
}
