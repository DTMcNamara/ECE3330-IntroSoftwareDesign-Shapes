/**
 * the Square class inherits from twoDimensionalShape
 * and implements the TwoDimensionalShape interface.
 * It defines all methods in such a way to represent a
 * square.
 */
public class Square extends TwoDimensionalShape implements TwoDimensionalShape.TwoDimensionalShapeInterface {

    /**
     * The blank square constructor
     * makes a unit square with
     * dimensions all equal to 1
     */
    public Square() {
        this.setDimension1(1);
        this.setDimension2(1);
    }

    /**
     * The square constructor with
     * 1 argument is used to create
     * a square object with the dimension1
     * set to the parameter. dimension2
     * is set to 1.
     *
     * @param i The param i is used to set
     *          the value of dimension1 on
     *          creation.
     */
    public Square(double i) {
        this.setDimension1(i);
        this.setDimension2(1);
    }

    /**
     * The square constructor with
     * 2 arguments is used to create
     * a square with dimensions set
     * to the passed values.
     *
     * @param i the value to set
     *          dimension1 to.
     *
     * @param j the value to set
     *          dimension2 to.
     */
    public Square(double i, double j) {
        this.setDimension1(i);
        this.setDimension2(j);
    }

    /**
     * The getDimension1 method is
     * used to get the value of the first
     * defining dimension of the shape.
     */
    @Override
    public double getDimension1() {
        return dimension1;
    }

    /**
     * The setDimension1 method is
     * used to set the value of dimension1
     * to the parameter.
     * @param i The param i is the value
     *          to set dimension1 to.
     */
    @Override
    public void setDimension1(double i) {
        this.dimension1 = i;
    }

    /**
     * The getDimension2 method is
     * used to get the value of the second
     * defining dimension of the shape.
     */
    @Override
    public double getDimension2() {
        return dimension2;
    }

    /**
     * The setDimension2 method is
     * used to set the value of dimension2
     * to the parameter.
     * @param j The param i is the value
     *          to set dimension2 to.
     */
    @Override
    public void setDimension2(double j) {
        this.dimension2 = j;
    }

    /**
     * The getArea method is used
     * to return the value of the area
     * of the given shape.
     *
     * @return the return value is the
     *         area of the given shape.
     */
    @Override
    public double getArea() {
        return (dimension1 * dimension2);
    }

    /**
     * The toString method is used to
     * get the attributes of the object
     * to a string for printing.
     */
    @Override
    public String toString() {
        return (
                "Rectangle/Square\n" +
                "Base= " + this.getDimension1() + "\n" +
                "Height= " + this.getDimension2() + "\n" +
                "Total Area= " + this.getArea() + "\n");
    }
}
