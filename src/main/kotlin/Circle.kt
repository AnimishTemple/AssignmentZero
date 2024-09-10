class Circle (_name: String, _radius: Double) : Shape (_name) {

    private val radius = _radius

    override fun printDimensions() {
        println("Radius of circle: $radius")
        println("Area of circle: ${getArea()}")
    }

    override fun getArea(): Double {
        return (3.14 * (radius * radius)) + super.getArea()
    }

}