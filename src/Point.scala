case class Point(x:Int, y:Int){

  def move (dx:Int,dy:Int) = Point(this.x + dx, this.y + dy)

  def + (that:Point) = Point(this.x + that.x, this.y + that.y)

  def distance (point2:Point):Double = {
    val d=BigInt(this.x - point2.x).pow(2) + BigInt(this.y - point2.y).pow(2)
    math.sqrt(d.toDouble)
  }

  def invert () = Point(this.y, this.x)
}

object Point extends App {
  val point1 = Point(1, 2)
  val point2 = Point(3, 4)

  val point3 = point1.move(10, 20)
  println(point3)

  val point4 = point1 + point2
  println(point4)

  val distance = point1.distance(point2)
  println("distance between " + point1 + " and " + point2 + " is " +  distance)

  val point5 = point2.invert()
  println(point5)
}