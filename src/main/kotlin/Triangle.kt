class Triangle (_name: String,
                _base: Double,
                _height: Double) : Shape (_name) {

    private val base = _base
    private val height = _height

    override fun printDimensions() {
        println("Base of triangle: $base")
        println("Height of triangle: $height")
        println("Area of traingle: ${getArea()}")
    }

    override fun getArea(): Double {
        return (0.5 * base * height) + super.getArea()
    }


}