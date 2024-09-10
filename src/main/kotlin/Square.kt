class Square (_name: String, _side: Double) : Shape (_name) {

    private val side = _side

    override fun printDimensions() {
        println("Length of square: $side")
        println("Area of square: ${getArea()}")
    }

    override fun getArea(): Double {
        return (side * side) + super.getArea()
    }


}