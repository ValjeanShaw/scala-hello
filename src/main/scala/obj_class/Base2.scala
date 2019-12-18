package obj_class

/**
  * @author xiaoran
  * @date 2019/07/20
  *
  *
  * scala 构造函数
  * scala构造函数分为主构造函数和辅助构造函数
  *
  * 辅助构造函数使用更方便，不需要跟类名相同
  * 主构造函数只能定义一个，辅助构造函数可以定义多个
  *---------------------------------------------------
  * 主构造函数
  * 写法：class ClassName(param0:Type,val param1:Type,var param2:Type)
  *
  * 主构造函数只能有一个
  * 类自带无参构造主函数
  * 通过主构造函数new 对象，将执行类中所有代码
  *
  * 参数类型
  * val修饰的变量，拥有get方法，无set方法
  * var修饰的变量，拥有get方法和set方法
  * 无二者修饰的变量，不会作为类的一个属性，也无get和set方法
  *---------------------------------------------------
  *
  * 辅助构造函数：
  * 写法：
  * def this(param0:Type)
  *
  * 辅助构造函数可以有任意多个
  * 每一个辅助构造函数的第一行都是调用主构造函数或者其他辅助构造函数
  *
  * 参数类型：
  * 不能有val和var修饰
  *
  *
  */
class Base2(id:Int,var name:String,val gender:Int) {
  val a = 1
  println(a)

  def this(a:Int){
    this(1,",",0)
    println("辅助构造函数1")
  }

  def this(a:Int,b:String){
    this(a)
    println("辅助构造函数2")
  }
}

object Base2Test{
  def main(args: Array[String]): Unit = {
    //调用主构造函数方式
    val base2:Base2 = new Base2(1,"",9)
    base2.name=("ddd")

    //调用辅助构造函数方式
    val base3:Base2 = new Base2(2)
    val base4:Base2 = new Base2(3,"null")
  }
}
