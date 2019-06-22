package collec

import scala.collection.mutable.ArrayBuffer

/**
  * 可变长数组
  *
  * ArrayBuffer
  *
  * @author xiaoran
  * @date 2019/06/22
  *
  */
object ChangeLengArray {
  def main(arg: Array[String]): Unit = {
    /**
      * 定义定长数组
      */
    var arr = ArrayBuffer(1,2,3)

    var arr1 = ArrayBuffer[Int](3,4,5)

    //加new的时候，括号中的数据为数组元素个数
    //初始化为0
    var arr2 = new ArrayBuffer[Int](10)

    //初始化为null
    var arr3 = new ArrayBuffer(8)

    /**
      * 加入不同元素的做法
      * 1.加入单个元素
      * 2.加入多个元素
      * 3.加入数组
      */

    arr += 4
    println(arr)

    arr += (5,6)
    println(arr)

    arr ++= arr1
    println(arr)

    arr.append(78,87,90)
    println(arr)

    //指定下标插入
    arr.insert(5,777,888)
    println(arr)


    //删除指定的元素，从左到右，找到第一个匹配的值，就删除
    arr -= 777
    println(arr)
  }
}
