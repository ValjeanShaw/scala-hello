package obj_class.Base4

/**
  * @author xiaoran
  * @date 2019/08/01
  *
  * 抽象类的定义和使用
  *
  * 不能被实例化
  *
  * 可以有抽象方法和非抽象方法
  * 有抽象方法的叫抽象类
  *
  * 抽象方法的override可以省略
  *
  */
abstract class AbClass {
  val field:String = "abstract field"

  //定义抽象方法  可重载
  def content: String
  def content(p:String,q:String): String

  def content(str:String):Unit={
    println(s"abstract method:$str")
  }
}

class Detail extends AbClass{
  override def content: String = {
    println("this is implement method")
    "detail method"
  }

  def content(p:String,q:String): String = {
    println("this is implement method"+q+p)
    "detail method"
  }
}

object Test{
  def main(args: Array[String]): Unit = {
    val detail:Detail = new Detail
    detail.content
    detail.content("")
    detail.content("1","2")
  }
}
