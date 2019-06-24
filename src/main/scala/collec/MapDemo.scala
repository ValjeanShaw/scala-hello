package collec

import scala.collection.mutable

/**
  *
  * map的定义和使用
  *
  * @author xiaoran
  * @date 2019/06/24
  *
  */
object MapDemo {
  def main(args: Array[String]): Unit = {
    //map的定义
    val score = Map("zhangsan" -> 100, "lisi" -> 120)
    println(score)

    val score2 = Map(("zhangsan" -> 232), ("wangyu" -> 778))
    println(score2)

    //map的使用
    //取数据
    println(score("zhangsan"))
    //取出所有的key
    println(score.keys)


    //定义变长map
    val mapMutable = mutable.Map("zhangsan" -> 100, "lisi" -> 120)
    //修改数据，若元素中无此数据，则会增加一个
    mapMutable("zhangsan") = 90
    println(mapMutable("zhangsan"))

    mapMutable("zhangs") = 109
    println(mapMutable("zhangs"))


    //插入数据
    mapMutable += (("wanger" -> 999))
    println(mapMutable)

    mapMutable -= "wanger"
    println(mapMutable)

    //遍历
    for ((k, v) <- mapMutable) {
      println(k + ":" + v)
    }
  }
}
