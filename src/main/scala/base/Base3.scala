package base

/**
  * 循环
  *
  * 1. for
  * 2. while
  * 3. do while
  *
  * @author xiaoran
  * @date 2019/06/19
  */
object Base3 {
  def main(args: Array[String]): Unit = {
    /**
      * for 循环
      * for(i <- 表达式，数组，集合)
      */
    //包含
    for(i <- 1 to 10){
      print(i)
    }
    println("-------")
    //不包含
    for(i <- 1 until 10){
      print(i)
    }
    //for循环嵌套   可多重嵌套
    for(i <- 1 to 3;j <- 1 to 3) println(i*10+j)
    println("-------")
    for(i <- 1 to 3;j <- 1 to 3;if(i != j)) println(i*10+j)

    //for循环的yield 构成集合
    val res = for(i <- 1 to 10) yield i*10
    println(res)
  }
}
