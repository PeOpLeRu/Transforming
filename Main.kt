fun main()
{
    println("\n ------- Before calling the methods ------- \n")
    var transformFigures : MutableList<Transforming> = mutableListOf()
    transformFigures.add(Rect(2.toFloat(), 3.toFloat()))
    transformFigures.add(Square(2.toFloat()))
    transformFigures.add(Circle(5.toFloat()))

    transformFigures.forEach { it -> println(it) }

    transformFigures[0].rotate(RotateDirection.Clockwise)
    transformFigures[1].resize(2)
    transformFigures[2].resize(3)

    val circle : Movable = Circle(3.toFloat())
    println(circle)
    circle.move(1, -3)

    println("\n ------- After calling the methods ------- \n")

    transformFigures.forEach { it -> println(it) }
    println(circle)
}