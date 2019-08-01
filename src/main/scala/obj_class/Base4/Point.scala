package obj_class.Base4

/**
  * @author xiaoran
  * @date 2019/07/31
  *
  */
class Point(val xc: Int, val yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
    //打印移动后的坐标
    println(s"x的坐标：$x   y的坐标：$y")

  }
}


class Location(val xl: Int, val yl: Int, val zl: Int) extends Point(xl, yl) {
  var z: Int = zl

  def move(dx: Int, dy: Int, dz: Int): Unit = {
    x = x + dx
    y = y + dy
    z = z + dz
    //打印移动后的坐标
    println(s"x的坐标：$x   y的坐标：$y    z的坐标：$z")
  }

}

object main {
  def main(args: Array[String]): Unit = {
    val loc: Location = new Location(1, 2, 3)
    loc.move(0, 0)
    loc.move(0, 0,0)
  }
}