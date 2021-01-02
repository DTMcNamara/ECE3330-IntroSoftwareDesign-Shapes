/**
 * the Cube class inherits from threeDimensionalShape
 * and implements the ThreeDimensionalShape interface.
 * It defines all methods in such a way to represent a
 * cube.
 */
public class Cube extends ThreeDimensionalShape implements ThreeDimensionalShape.ThreeDimensionalInterface {

    /**
     * The blank cube constructor
     * makes a unit square with
     * dimensions all equal to 1
     */
    public Cube(){
        this.setDimension1(1);
        this.setDimension2(1);
        this.setDimension3(1);
    }

    /**
     * The cube constructor with
     * 1 argument is used to create
     * a cube object with the dimension1
     * set to the parameter. dimension2
     * is set to 1.
     *
     * @param i The param i is used to set
     *          the value of dimension1 on
     *          creation.
     */
    public Cube(double i){
        this.setDimension1(i);
        this.setDimension2(1);
        this.setDimension3(1);
    }

    /**
     * The cube constructor with
     * 2 arguments is used to create
     * a cube with dimensions set
     * to the passed values.
     *
     * @param i the value to set
     *          dimension1 to.
     *
     * @param j the value to set
     *          dimension2 to.
     */
    public Cube(double i,double j){
        this.setDimension1(i);
        this.setDimension2(j);
        this.setDimension3(1);
    }

    /**
     * The cube constructor with
     * 2 arguments is used to create
     * a cube with dimensions set
     * to the passed values.
     *
     * @param i the value to set
     *          dimension1 to.
     *
     * @param j the value to set
     *          dimension2 to.
     *
     * @param k the value to set
     *          dimension3 to.
     */
    public Cube(double i,double j,double k){
        this.setDimension1(i);
        this.setDimension2(j);
        this.setDimension3(k);
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
        this.dimension1=i;
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
        this.dimension2=j;
    }

    /**
     * The getDimension3 method is
     * used to get the value of the third
     * defining dimension of the shape.
     */
    @Override
    public double getDimension3() {
        return dimension3;
    }

    /**
     * The setDimension3 method is
     * used to set the value of dimension3
     * to the parameter.
     * @param k The param i is the value
     *          to set dimension3 to.
     */
    @Override
    public void setDimension3(double k) {
        this.dimension3=k;
    }

    /**
     * The getSurfaceArea method is
     * used to get the surface area of
     * the given object representing a
     * 3d shape.
     *
     * @return the return value is
     *         the surface area calculated.
     */
    @Override
    public double getSurfaceArea() {
        return((2*(this.getDimension1()*this.getDimension2()))+(2*(this.getDimension1()*this.getDimension2()))+(2*(this.getDimension2()*this.getDimension3())));
    }

    /**
     * The getVolume method is used
     * to get the volume calculated for
     * the given 3d shape object
     *
     * @return the return value is the
     *         volume of the 3d shape.
     */
    @Override
    public double getVolume() {
        return (dimension1*dimension2*dimension3);
    }

    /**
     * The toString method is used to
     * get the attributes of the object
     * to a string for printing.
     */
    @Override
    public String toString(){
        return(
                "Cube/Rectangular Prism\n" +
                "Length= " + this.getDimension1() + "\n" +
                "Width= " + this.getDimension2() + "\n" +
                "Height= " + this.getDimension3() + "\n" +
                "Total Surface Area= " + this.getSurfaceArea() + "\n" +
                "Total Volume= " + this.getVolume() + "\n");
    }
}
