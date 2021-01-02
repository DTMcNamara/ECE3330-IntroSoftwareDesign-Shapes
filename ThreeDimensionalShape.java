/**
 * The ThreeDimensionalShape class inherits
 * from shape and implements the shape interface.
 * This is an additional interface that requires
 * additional methods to be defined.
 */
abstract class ThreeDimensionalShape extends Shape implements Shape.shapeInterface {

    /**
     * The dimension1 is used to hold the first
     * of 3 defining dimensions for the shape.
     */
    double dimension1;

    /**
     * The dimension2 is used to hold the second
     * of 3 defining dimensions for the shape.
     */
    double dimension2;

    /**
     * The dimension3 is used to hold the third
     * of 3 defining dimensions for the shape.
     */
    double dimension3;

    /**
     * The interface ThreeDimensionalShapeInterface
     * requires the methods below to be implemented.
     * They include toString, getDimension1/2/3,
     * and setDimension1/2/3.
     */
    public interface ThreeDimensionalInterface {

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
         * The getDimension3 method is
         * used to get the value of the third
         * defining dimension of the shape.
         */
        double getDimension3();

        /**
         * The setDimension3 method is
         * used to set the value of dimension3
         * to the parameter.
         * @param k The param i is the value
         *          to set dimension3 to.
         */
        void setDimension3(double k);

        /**
         * The getSurfaceArea method is
         * used to get the surface area of
         * the given object representing a
         * 3d shape.
         *
         * @return the return value is
         *         the surface area calculated.
         */
        double getSurfaceArea();

        /**
         * The getVolume method is used
         * to get the volume calculated for
         * the given 3d shape object
         *
         * @return the return value is the
         *         volume of the 3d shape.
         */
        double getVolume();
    }
}
