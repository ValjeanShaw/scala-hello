package util_class

import scala.util.Random

/**
  * @author xiaoran
  * @date 2019/08/05
  *
  * 模式匹配
  *
  * 不需要break
  *
  * 1.常量模式匹配
  * 2.变量模式匹配
  * 3.通配符模式匹配
  * 4.样例类匹配
  * 5.类型匹配
  *
  */
object Pattern {
  def main(args: Array[String]): Unit = {
    /**
      * 常量模式匹配
      * 1.常量字面值的匹配
      * 2.常量变量的匹配
      */
    val name = "hello world"
    name match{
      case "hello world" => println("success")
      case _ => println("fail")
    }

    //常量变量 注意这里只能用大写
    val NAME_STR = "hello world"
    val name_str = "hello worl3d"
    name match {
      case NAME_STR => println("success")
      case _ => println("fail")
    }


    // 变量模式的匹配   小写会被赋值
    val site = "url.com"
    val place = "url"
    site match{
      case site=> println(site+".cn")
      case _ => println("fail")
    }


    //通配符的匹配
    val list = List(1,2,3)
    list match {
      case List(_,_,3) => println("success")
      case _ => println("fail")
    }


    //样例类匹配
    abstract class Notification

    case class EMAIL(receiver:String,head:String,body:String) extends Notification
    case class SMS(receiver:String,body:String) extends Notification
    val notification:Notification = new EMAIL("receiver","head","body")
    notification match {
        //想要使用变量，需在case中定义
      case EMAIL(receiver,head,_)=>println(receiver,head)
      case SMS(receiver,body)=>println(receiver,body)
      case _ => println("fail")
    }


    //类型匹配
    val arr = Array("string",12,12.4,'r')
    val obj = arr(Random.nextInt(4))
    println(obj)
    obj match {
      case x:Int => println(x)
      case s:String => println(s.toUpperCase())
      case d:Double => println(Int.MaxValue)
      case _ => println("fail")
    }
  }
}
