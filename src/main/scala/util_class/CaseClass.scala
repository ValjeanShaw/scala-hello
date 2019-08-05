package util_class

/**
  * @author xiaoran
  * @date 2019/08/05
  *
  *
  * 样例类
  *
  * 1.样例类的创建和使用
  * 2.样例类的比较
  * 3.样例类的copy
  *
  */
object CaseClass {

  def main(args: Array[String]): Unit = {
    //样例类的定义
    case class Message(name:String,age:Int,nation:String)

    //1.自带apply方法
    //2.默认public val修饰,即只有getter方法，没有setter方法
    val message = Message("herry",23,"chengdu")
    println(message)


    //样例类的比较   比较的是值，而非基于引用比较
    val message1 = Message("herry",23,"chengdu")

    if(message == message1){
      println("same")
    }else{
      println("different")
    }

    //样例类的拷贝
    val message2 = message.copy()
    println(message2.age,message2.name,message2.nation)

    //拷贝部分内容  部分内容自己给定
    val message3 = message.copy(name="hanmeimei")
    println(message3.age,message3.name,message3.nation)

  }

}
