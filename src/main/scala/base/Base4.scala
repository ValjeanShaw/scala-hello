package base

/**
  *
  * def 方法名(参数列表) ：返回类型 = 方法体
  * 返回类型在方法是递归方法的时候，一定要指明返回类型，其他情况可以省略
  *
  * @author xiaoran
  * @date 2019/06/19
  *
  */
object Base4 {
  def main(arg: Array[String]): Unit = {
    println(add(1, 2))
    println(add2(3, 4))
    println("多参方法\n------")
    println(addMultiple(3, 4,5))
    println(addMultiple1(3, 4)(5))
    println(addMultiple2(3)(4)(5))
    println("无参方法\n------")
    printInfo()
    printInfo
    printInfo1
    println("默认参数方法\n-------")
    priInfoDefault1(1,2)
    priInfoDefault1(1,2,3)
    println("可变长参数方法\n-------")
    multiAdd(3,5,6,7,2,5,2)

  }

  /**
    * 指定返回类型
    */
  def add(a: Int, b: Int): Int = {
    a + b
  }

  /**
    * 不指定返回类型
    */
  def add2(a: Int, b: Int) = {
    a + b
  }

  /**
    * 多个参数，可以用括号隔开
    */
  def addMultiple(x: Int, y: Int, z: Int) = x * y + z

  def addMultiple1(x: Int, y: Int)(z: Int) = x * y + z

  def addMultiple2(x: Int)(y: Int)(z: Int) = x * y + z

  /**
    * 无参方法  括号可省或者不省略
    */
  def printInfo() = println("有括号 info")   //调用时可带可不带括号
  def printInfo1 = println("无括号 info")   //调用时不能带括号

  /**
    * 带有默认值的方法
    */
  def priInfoDefault(str:String = "default mess")=println(str)
  def priInfoDefault1(a:Int = 1,b:Int,c:Int = 5)=println(a+b+c)

  /**
    * 可变长参数  会包装成数组类型
    */
  def multiAdd(a:Int*)={
    for(i <- a) print(i)
  }

}
