case class Point(var x: Int, var y: Int) {
// methods
  def add(a: Point) = new Point(this.x + a.x, this.y + a.y)

  // move a point by a given distance dx and dy
  def move(x: Int, y: Int): Unit = {
    this.x = this.x + x
    this.y = this.y + y
  }

  // return the distance between two points
  def distance(a: Point): Double = {
    var dx: Int = this.x - a.x
    var dy: Int = this.y - a.y
    var distance: Int = dx * dx + dy * dy
    scala.math.sqrt(distance)
  }

  // switch the x and y coordinates
  def invert(): Unit = {
    var temp = this.x
    this.x = this.y
    this.y = temp
  }
}

object Point extends App {

  var a = Point(1, 2)
  var b = Point(5, 10)

  println
  println(a.add(b))

  a.move(x = 1, y = 2)
  println(a)

  var d = a.distance(b)
  println(d)

  a.invert()
  println(a)
}