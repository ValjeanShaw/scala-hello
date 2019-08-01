package obj_class.base5

/**
  * @author xiaoran
  * @date 2019/08/01
  *
  *
  * 特质 当做java中的接口使用
  *
  * 特质里面的方法可以是抽象的，也可以是非抽象的，与java不同
  */
trait Iterator[A] {
  def hasNext: Boolean

  def next(): A
}

trait Logger{
  def log(msg:String): Unit ={
    println(msg)
  }
}

//多个特质使用with
class IntIterator(to: Int) extends Iterator[Int] with Logger {
  private val current = 0

  override def hasNext: Boolean = current < to

  override def next(): Int = {
    if (hasNext) {
      var t = current
      t += 1
      log(t.toString)
      t
    } else
      0
  }
}

object Test{
  def main(args: Array[String]): Unit = {
    val iterator = new IntIterator(10)
    println(iterator.hasNext)
    println(iterator.next())
  }
}
