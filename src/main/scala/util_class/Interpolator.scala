package util_class

/**
  * @author xiaoran
  * @date 2019/08/05
  *
  * 字符串插值器   scala 2.1之后提供
  * s
  * f
  * raw
  */
object Interpolator {

  def main(args: Array[String]): Unit = {
    /**
      * s 插值器   变量，表达式
      */
    val name = "iverson"
    println(s"allen $name")
    val a = 30
    val b = 20
    println(s"age: ${a+b}")


    /**
      * f插值器    用于格式化
      */
    val height = 1.8597834d
    println(f"$name%s is $height%2.2f ")


    //raw   字符串是什么就输出什么，转移符也按字符串输出
    println(raw"a\nb\tc")

  }
}
