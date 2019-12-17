package collec

import scala.collection.mutable

/**
  *
  * map的定义和使用
  *
  * 不可变map   Map   注意是值不可变
  * 可变map   mutable.Map
  *
  * @author xiaoran
  * @date 2019/06/24
  *
  */
object MapDemo {
  def main(args: Array[String]): Unit = {
    /**
      * 不可变map   定义和使用
      * -----------------------------------------------------------
      */
    //map的定义
    val score = Map("zhangsan" -> 100, "lisi" -> 120)
    println(score)

    val score2 = Map(("zhangsan" -> 232), ("wangyu" -> 778))
    println(score2)

    //逗号也可以定义
    val score3 = Map(("zhangfei", 123), ("guanyu", 321))

    //map的使用
    //取数据
    println(score("zhangsan"))
    //取出所有的key
    println(score.keys)

    //添加和删除   此处仅返回新的对象，不会对原map产生影响

    val score4 = score3 + ("libai" -> 2)
    val score5 = score4 - "zhangsan"




    /**
      * 变长map  定义，读取和写入
      * -----------------------------------------------------------
      */
    //定义变长map
    val mapMutable = mutable.Map("zhangsan" -> 100, "lisi" -> 120)

    //修改数据，若元素中无此数据，则会增加一个
    mapMutable("zhangsan") = 90
    println(mapMutable("zhangsan"))
    mapMutable("zhangs") = 109
    println(mapMutable("zhangs"))


    //添加和删除
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
