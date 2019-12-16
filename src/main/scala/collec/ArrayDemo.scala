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
object ArrayDemo {
  def main(arg: Array[String]): Unit = {
    /**
      * 定义定长数组  定长代表长度固定，但是内容可变
      * 提供初始值时不要使用new
      */
    //初始值为0
    val nums1 = new Array[Int](10)
    //初始值为null
    val nums2 = new Array[String](10)
    //提供初始值时不要使用new,类型可推断
    val nums3 = Array("hello","world")
    val nums4 = Array("hello",1)
    //长度固定，但是内容可变
    nums4(0)="eer"
    println(nums4(0))


    //可变长数组
    var arr = ArrayBuffer(1,2,3)
    var arr1 = ArrayBuffer[Int](3,4,5)

    //加new的时候，括号中的数据为数组元素个数
    //初始化为0
    var arr2 = new ArrayBuffer[Int](10)
    //初始化为null
    var arr3 = new ArrayBuffer(8)

    //-----------------------------------------------------------
    /**
      * + 加入不同元素的做法 高效
      * 1.尾部加入单个元素   +=
      * 2.尾部加入多个元素   +=
      * 3.尾部加入任意集合   ++=
      */
    arr += 4
    println(arr)

    arr += (5,6)
    println(arr)

    arr ++= arr1
    println(arr)


    //尾部追加
    arr.append(78,87,90)
    println(arr)

    //指定下标插入   第一个数为下标
    arr.insert(5,777,888)
    println(arr)


    //删除指定的元素，从左到右，找到第一个匹配的值，就删除
    arr -= 777
    //删除指定下标的元素
    arr.remove(2)
    //删除指定下标的n个元素
    arr.remove(2,2)
    println(arr)


    //-----------------------------------------------------------
    //Array和ArrayBuffer互换
    val a = nums2.toBuffer
    val b = a.toArray

    //-----------------------------------------------------------
    /**
      * 遍历
      *
      */

    for(i<-0 until a.length){
      println(i)
    }
    //间隔2
    for(i<-0 until (a.length,2)){
      println(i)
    }
    //反转遍历
    for(i<-(0 until a.length).reverse){
      println(i)
    }
    //直接遍历值
    for(elem <- a){
      println(elem)
    }
  }
}
