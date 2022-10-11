class Square(var a : Float, centerX: Float = 0.toFloat(), centerY: Float = 0.toFloat()) : Figure(centerX, centerY)
{
    override fun area(): Float
    {
        return  (a * a).toFloat()
    }

    override fun resize(zoom: Int)
    {
        a = Math.sqrt((area() * zoom).toDouble()).toFloat()
    }

    override fun rotate(direction: RotateDirection)
    {
        return
    }

    override fun move(dx: Int, dy: Int)
    {
        centerX += dx
        centerY += dy
    }

    override fun toString() : String
    {
        return "Square: side = $a, center: ($centerX, $centerY)"
    }
}