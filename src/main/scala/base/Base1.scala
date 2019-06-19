package base

/**
  * var 变量
  * val 常量
  *
  * @author xiaoran
  * @date 2019/06/18
  *
  */
object Base1 {

  def main(args: Array[String]): Unit = {
    /**
      * 定义变量
      *
      * 1. var 变量名 = 值
      * 2. var 变量名:数据类型 = 值
      * 数据类型可推断
      */
    var a = 1
    var b: Float = 1.1f

    /**
      * 定义常量
      *
      * 1. val 常量名 = 值
      * 2. val 常量名:数据类型 = 值
      * 数据类型可推断
      * 修饰基本数据类型，想当与java的final
      * 修饰引用类型，引用不可变，但是引用的对象的内容可变
      *
      *
      */
    var val_a = 1
    var val_b: Float = 1.1f

    val a1 = Array(1, 2, 3)
    a1(0) = 5;


    /**
      * lazy   只能修饰val,不能修饰var
      * 作用：当真正用到变量的时候，才去初始化
      * 应用场景：不确定一些值是否需要初始化时，可这样定义，节省资源
      */

    lazy val c = 199
    println(c)
  }
}
