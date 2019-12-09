package collec

import scala.collection.mutable

/**
  *
  * set
  * 1.不存在重复的元素
  * 2.排列无序
  *
  * @author xiaoran
  * @date 2019/06/25
  *
  */
object SetDemo {
  def main(args: Array[String]): Unit = {
    //不可变set
    val set = Set(1, 2, 3, 4, 5)
    val y = set+8
    val set2 = Set(10, 2, 30, 4, 50)

    println(set + 8)
    println(set - 1)

    //集合间操作
    //并集
    println("并集：")
    println(set ++ set2)
    //交集
    println("交集：")
    println(set.intersect(set2))


    //定义可变set
    val setMutable = mutable.Set(9, 6, 4, 5, 3, 5)
    //mutable也不会改变原set
    setMutable + 10
    setMutable - 5
    println(setMutable + 11)
    println(setMutable - 9)

  }
}
