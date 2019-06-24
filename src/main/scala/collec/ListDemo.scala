package collec

import scala.collection.mutable.ListBuffer

/**
  * List的操作和使用
  *
  * 可变  List
  * 不可变  ListBuffer
  *
  * @author xiaoran
  * @date 2019/06/22
  *
  */
object ListDemo {
  def main(args: Array[String]): Unit = {
    //定义不可变list
    var list = List(1, 2, 3)

    //模拟插入操作，返回新的集合
    //头部追加
    println(0 :: list)
    println(list.::(0))
    println(0 +: list)
    println(list.+:(0))

    //尾部追加
    println(list :+ 4)
    println(list.:+(4))

    //两个list之间的加和
    var list2 = List(5, 6, 7)
    println(list2 ++: list)
    println(list2 ++ list)

    println("-----------")

    //可变list   ListBuffer
    val listBuffer = ListBuffer(2, 4, 6, 8, 10)
    //追加  直接操作集合
    listBuffer += 1
    println(listBuffer)
    listBuffer.append(3)
    println(listBuffer)
    val listBuffer2 = ListBuffer(5,7,9)
    // ++ 不改变原集合  而且可以加上不可变list
    println(listBuffer ++ listBuffer2)
    println(listBuffer ++ list2)

  }
}
