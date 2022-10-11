class Circle(var R : Float, centerX: Float = 0.toFloat(), centerY: Float = 0.toFloat()) : Figure(centerX, centerY)
{
    override fun area(): Float
    {
        return  (Math.PI * R * R).toFloat();
    }

    override fun resize(zoom: Int)
    {
        var rr : Float = R * R
        rr *= zoom
        R = Math.sqrt(rr.toDouble()).toFloat()
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
        return "Circle: side = $R, center: ($centerX, $centerY)"
    }
}