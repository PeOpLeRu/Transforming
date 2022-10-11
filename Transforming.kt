interface Transforming
{
    fun resize(zoom: Int)

    fun rotate(direction: RotateDirection)
}

enum class RotateDirection
{
    Clockwise, CounterClockwise
}

class Point(var x : Float, var y : Float)