package obj_class.base3

/**
  * @author xiaoran
  * @date 2019/07/26
  *
  *       单例对象   object
  *       可以看做是java中的工具类,常用于定义工具函数和常量
  *
  *       单例对象不能带参数，不能创建实例化对象，在第一次被调用的时候被初始化
  *
  */
object Base3 {
  /**
    * 类似于java中的静态方法,被调用方式为class.method
    *
    * @param msg
    */
  def log(msg: String): Unit = {
    println(s"INFO:$msg")
  }
}

//在类中被调用
class Test {
  def log: Unit = {
    //调用方式
    Base3.log("hello")
  }
}

//在object中被调用
object LoggerTest{
  def main(args: Array[String]): Unit = {
    val obj:Test = new Test()
    obj.log

    Base3.log("world")
  }
}

