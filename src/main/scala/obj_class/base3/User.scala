package obj_class.base3

/**
  * @author xiaoran
  * @date 2019/07/27
  *
  *      伴生对象的 apply方法和unapply方法
  *
  *      apply方法:   构造器
  *      unapply方法: 提取器
  *
  */
class User (var name:String,var password:String){

}

object User{
  //apply可以用来创建对象
  def apply(name: String, password: String): User = new User(name, password)
  def apply(name: String): User = new User(name, "")

  //unapply  可以用来提取对象和对象属性
  def unapply(arg: User): Option[(String, String)] ={
    if(arg == null){
      None
    }
    else{
     Some(arg.name,arg.password)
    }
  }
}

object UserTest{
  def main(args: Array[String]): Unit = {
    //常规创建对象方法
    //val user:User = new User("name","pass")

    //使用apply常见对象   集合也是通过这种方式实现
    val user:User = User("name","pass")
    val user1:User = User("name")
    println("user:  "+user.isInstanceOf[User])
    println("user1: "+user.isInstanceOf[User])

    //使用unapply提取属性
    user match {
      case User(name,password)=>println(name+password)
      case _=> ""
    }
  }
}