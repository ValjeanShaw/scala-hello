package base

/**
  * 异常
  * @author xiaoran
  * @date 2019/12/09
  *
  */
class Base6 {
  def main(args: Array[String]): Unit = {
    //scala异常和java几乎一致

    /**
      * 有个特殊类型Noting
      * 在if/else表达式中，如果有一个分支的类型是Noting，那么这个表达式结果类型是另一个分支的类型
      */
    val x=1
    val now = if(x%2==0){
      x/2
    }else{
      throw new InterruptedException
    }
  }
}
