/**
 * The TwoDimensionalShape class inherits
 * from shape and implements the shape interface.
 * This is an additional interface that requires
 * additional methods to be defined.
 */
abstract class TwoDimensionalShape extends Shape implements Shape.shapeInterface {
    /**
     * The dimension1 is used to hold the first
     * of 2 defining dimensions for the shape.
     */
    double dimension1;

    /**
     * The dimension2 is used to hold the second
     * of 2 defining dimensions for the shape.
     */
    double dimension2;

    /**
     * The interface TwoDimensionalShapeInterface
     * requires the methods below to be implemented.
     * They include toString, getDimension1/2,
     * and setDimension1/2.
     */
    public interface TwoDimensionalShapeInterface {

        /**
         * The toString method is used to
         * get the attributes of the object
         * to a string for printing.
         */
        String toString();

        /**
         * The getDimension1 method is
         * used to get the value of the first
         * defining dimension of the shape.
         */
        double getDimension1();

        /**
         * The setDimension1 method is
         * used to set the value of dimension1
         * to the parameter.
         * @param i The param i is the value
         *          to set dimension1 to.
         */
        void setDimension1(double i);

        /**
         * The getDimension2 method is
         * used to get the value of the second
         * defining dimension of the shape.
         */
        double getDimension2();

        /**
         * The setDimension2 method is
         * used to set the value of dimension2
         * to the parameter.
         * @param j The param i is the value
         *          to set dimension2 to.
         */
        void setDimension2(double j);

        /**
         * The getArea method is used
         * to return the value of the area
         * of the given shape.
         *
         * @return the return value is the
         *         area of the given shape.
         */
        double getArea();
    }
}
