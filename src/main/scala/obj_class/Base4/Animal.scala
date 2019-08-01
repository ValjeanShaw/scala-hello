package obj_class.Base4

/**
  * @author xiaoran
  * @date 2019/08/01
  *
  * 关于继承中的override用法全集合
  */
class Animal {

  val nameVal = "a"
  var nameVar = "b"

  def function: String ={
    "Animal.function"
  }
}

/**
  * 1. 子类中的方法要覆盖父类中的方法，必须写override
  * 2. 子类中的属性val要覆盖父类中的属性，必须写override
  * 3. 父类中的var变量不可以覆盖
  */
class Dog extends Animal{
  override val nameVal: String = "dog"

  // variable nameVar cannot override a mutable variable
  //override var nameVar: String = "dog2"

  override def function: String = {
    "Dog.function"
  }

}

object AnimalTest{
  def main(args: Array[String]): Unit = {

  }
}
