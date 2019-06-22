package collec

/**
  *
  * 定长数组
  *
  * Array
  *
  * @author xiaoran
  * @date 2019/06/22
  *
  */
object FixLengArray {

  def main(arg: Array[String]): Unit = {
    /**
      * 定义定长数组
      */
    var arr = Array(1,2,3)

    var arr1 = Array[Int](3,4,5)

    //加new的时候，括号中的数据为数组元素个数
    //初始化为0
    var arr2 = new Array[Int](10)

    //初始化为null
    var arr3 = new Array(8)

    //使用
    for(num <- arr) println(num)

    println(arr.max)
    println(arr.min)

    //排序反转
    var arrTemp = arr.sorted.reverse
    for(num <- arrTemp) println(num)


  }

}
