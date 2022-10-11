abstract class Figure(var centerX: Float, var centerY: Float) : Movable, Transforming
{
    abstract fun area(): Float
}