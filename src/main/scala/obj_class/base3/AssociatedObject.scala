package obj_class.base3

/**
  * @author xiaoran
  * @date 2019/07/26
  *
  *       伴生对象和伴生类
  *
  *       当类和对象在 同一个源文件中，伴生类和伴生对象可以相互访问彼此的私有方法和私有属性
  *
  *
  */
class AssociatedObject {
  val id = AssociatedObject.newUniqueNumber
}

object AssociatedObject {
  private var lastNumber = 0

  private def newUniqueNumber: Int = {
    lastNumber +=1
    lastNumber
  }

  def main(args: Array[String]): Unit = {
    val associatedObject:AssociatedObject = new AssociatedObject
    println(associatedObject.id)
  }
}