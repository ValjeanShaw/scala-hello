package base

import scala.io.StdIn

/**
  * 输入输出
  *
  * @author xiaoran
  * @date 2019/12/09
  *
  */
object Base0 {
  def main(args: Array[String]): Unit = {
    /**
      * 输入
      *
      */
    val line=StdIn.readLine()
    //带字符串提示的
    val line1=StdIn.readLine("please input：")
    val int=StdIn.readInt()

    /**
      * 输出
      */
    println("hello print"+int)
    print("this is input"+line+line1)


  }
}
