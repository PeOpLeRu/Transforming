import java.awt.Point

class Rect(private var width: Float, private var height: Float, centerX: Float = width / 2, centerY: Float = height / 2) : Figure(centerX, centerY)
{

    var A = Point(centerX - width / 2, centerY - height / 2)
    var B = Point(centerX - width / 2, centerY + height / 2)
    var C = Point(centerX + width / 2, centerY + height / 2)
    var D = Point(centerX + width / 2, centerY - height / 2)

    override fun area(): Float
    {
        return  (width * height).toFloat();
    }

    override fun resize(zoom: Int)
    {
        val scaller = Math.sqrt(zoom.toDouble()).toFloat()
        width *= scaller
        height *= scaller
    }

    override fun rotate(direction: RotateDirection)
    {
        val angle = if (direction == RotateDirection.Clockwise) 90 else 270

        if (direction == RotateDirection.Clockwise)
        {
            A.x = A.x * Math.cos(angle.toDouble()).toFloat() - A.y * Math.sin(angle.toDouble()).toFloat() + centerX
            A.y = A.x * Math.sin(angle.toDouble()).toFloat() + A.y * Math.cos(angle.toDouble()).toFloat() + centerY

            B.x = B.x * Math.cos(angle.toDouble()).toFloat() - B.y * Math.sin(angle.toDouble()).toFloat() + centerX
            B.y = B.x * Math.sin(angle.toDouble()).toFloat() + B.y * Math.cos(angle.toDouble()).toFloat() + centerY

            C.x = C.x * Math.cos(angle.toDouble()).toFloat() - C.y * Math.sin(angle.toDouble()).toFloat() + centerX
            C.y = C.x * Math.sin(angle.toDouble()).toFloat() + C.y * Math.cos(angle.toDouble()).toFloat() + centerY

            D.x = D.x * Math.cos(angle.toDouble()).toFloat() - D.y * Math.sin(angle.toDouble()).toFloat() + centerX
            D.y = D.x * Math.sin(angle.toDouble()).toFloat() + D.y * Math.cos(angle.toDouble()).toFloat() + centerY
        }

        var temp = height
        height = width
        width = temp

        temp = centerX
        centerX = centerY
        centerY = temp
    }

    override fun move(dx: Int, dy: Int)
    {
        centerX += dx
        centerY += dy

        A.x += dx;  A.y += dy

        B.x += dx;  B.y += dy

        C.x += dx;  C.y += dy

        D.x += dx;  D.y += dy
    }

    override fun toString() : String
    {
        return "Rect: width = $width, height = $height, center: ($centerX, $centerY)"
    }
}