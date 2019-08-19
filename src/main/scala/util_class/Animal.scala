package util_class

/**
  * @author xiaoran
  * @date 2019/08/19
  *
  *       sealed  密封类
  *
  *       sealed修饰的trait，class
  *
  *       约束：不能再类定义定义文件之外定义它的子类
  *
  *       作用：
  * 1.避免滥用继承
  * 2.确保模式匹配的完成性
  *
  */
sealed trait Animal {
  var animalType:String = "animal"
  var shoutNum: Int = 1

  def shout(): Unit = {
    println(s"$animalType shout $shoutNum")
  }
}

case class Cat(num: Int) extends Animal{
  this.animalType = "cat"
  this.shoutNum = num
}

case class Dog(num: Int) extends Animal{
  this.animalType = "dog"
  this.shoutNum = num
}

case class Pig(num: Int) extends Animal{

}

object Test {
  def main(args: Array[String]): Unit = {
    val animal: Animal = Cat(5);
    animal match {
      case animal: Cat => animal.shout()
      case animal: Dog => animal.shout()
      case animal: Pig => println("this animal is pig")
    }
  }
}