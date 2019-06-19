package base

/**
  * 函数
  *
  * ()=>{}
  * {}可以省略
  *
  * 可以存放到一个变量中
  * 也可以把函数当做参数，传递给一个方法或函数，
  * 也可以当做返回值
  *
  *
  * @author xiaoran
  * @date 2019/06/19
  *
  */
object Base5 {
  def main(arg: Array[String]): Unit = {

    //函数的定义   (x: Int, y: Int) => x + y
    val fun = (x: Int, y: Int, z: Int) => x * y * z

    //常用操作  将函数定义成一个常量，然后来调用常量
    println(fun(1,2,3))

    /**
      * 无参数函数
      */
    val noParamFun = () => println("hahaha")
    noParamFun()  //（）不能省

  }

  /**
    * 函数和方法的联系
    *
    * 1.把函数当做参数传递给方法
    */
  val fun2 = (x:Int,y:Int)=>x+y

  def method(x:Int,y:Int,f:(Int,Int)=>Int)=f(x,y)

  println("函数转方法计算："+method(10,90,fun2))


  /**
    * 方法转换成函数
    * a.隐式   把方法当做参数传递给其他方法或者函数
    * b.显示   [方法名] _
    */
  def method2(x:Int,y:Int)= x-y
  method(5,1,method2)
  method(90,12,method2 _)
}
