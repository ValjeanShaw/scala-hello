package collec

/**
  * 一些常用的函数
  *
  * @author xiaoran
  * @date 2019/06/25
  *
  */
object Common {
  def main(args: Array[String]): Unit = {
    /**
      * filter
      *
      * 过滤每个元素
      * boolean = true被过滤出来，= false被舍弃
      */
    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val listResult = list.filter(x => x % 2 == 0)
    println(listResult)


    /**
      * flattern  拍平
      *
      * 只针对一层进行拍平
      */
    val list1 = List(0, -1, -2)
    val list2 = List(2, 4, 6, 8, 10, list1)
    val list3 = List(1, 3, 5, 7, 9)
    val list4 = List(list2, list3)
    println(list4.flatten)


    /**
      *
      * map
      * 针对所有元素都进行函数计算
      *
      */
    val listResult2 = list.map(x => x * 10)
    println(listResult2)

    /**
      * flatmap
      * map和拍平联合，可用于保留map和map后的结果
      */
    val listResult3 = list.flatMap(x => List(x, x * 10))
    println(listResult3)

    /**
      * forAll
      * 判断 所有元素
      *
      * forEach
      * 处理 所有元素
      */
    println(list.forall(e => e > 0))
    list.foreach(println(_))


    /**
      * reduceLeft
      * 从左开始向后针对每个元素进行迭代函数计算，第一个元素为 下标为0的元素
      *
      * reduceRight
      * 举例说明：
      * 1，2，3，4，5
      * reduce: -
      * 运行过程：   4-5  3-(4-5)  2-(3-(4-5))   1-(2-(3-(4-5)))
      *
      *
      */
    println(list.reduceLeft(_+_))
    println(list.reduceRight(_-_))


    /**
      * 在reduce的基础上，从种子值开始运算
      */
    println(list.foldLeft(100)(_-_))
    println(list.foldRight(9)(_-_))

  }
}
