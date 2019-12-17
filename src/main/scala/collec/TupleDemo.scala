package collec

/**
  *
  * 元组的定义和使用
  *
  * @author xiaoran
  * @date 2019/06/25
  *
  */
object TupleDemo {
  def main(args: Array[String]): Unit = {
    //元组的定义   可以混合多种类型   元组中的数据不可被改变
    var tuple = ("string",123,6.5f)

    val tuple2,(a,b,c)=("tuple","bulala",5)

    //Tuple 后面的数字代表元组个数
    val t5 = Tuple5("da","shu","ju",123,456)



    //元组的访问
    println(tuple._1)
    println(b)
    println(t5._3)

    //元组的遍历有点特别
    tuple.productIterator.foreach(x=>println("遍历："+x))
    tuple.productIterator.foreach(println(_))


    //拉链操作  zip
    val symbols = Array("<","-",">")
    val counts = Array(2,3,4)

    val paris = symbols.zip(counts)
    paris.foreach(println(_))
  }
}
