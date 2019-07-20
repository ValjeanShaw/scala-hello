package obj_class

/**
  * @author xiaoran
  * @date 2019/07/20
  *
  *       Scala 访问修饰符分别有：private，protected，public。
  *
  *       如果没有指定访问修饰符，默认情况下，Scala 对象的访问级别都是 public。
  *
  *
  * scala中：
  * private    本类
  * protected  本类和子类（同一个package都不行，java中可以）
  * public     都可以访问
  *
  */
class Persons {
  //val 修饰的属性，系统会自动生成get方法
  val id: String = "1234"
  //var 修饰的属性，系统会自动生成get和set方法
  var name: String = ""

  //private var 修饰的属性，系统会自动生成private修饰的get和set方法
  private var gender: Int = 0

  //private[this]修饰的属性，系统不会生成get和set方法
  private[this] var age: Int = 0

}


object Base1Test{
  def main(args: Array[String]): Unit = {
    //创建对象
    val person:Persons = new Persons()
    //set方法
    person.name = ("dabaohu")
    //get方法
    println(person.name)

  }
}
