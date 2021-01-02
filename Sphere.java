/**
 * the Sphere class inherits from threeDimensionalShape
 * and implements the ThreeDimensionalShape interface.
 * It defines all methods in such a way to represent a
 * Sphere.
 */
public class Sphere extends ThreeDimensionalShape implements ThreeDimensionalShape.ThreeDimensionalInterface {

    /**
     * The blank sphere constructor
     * makes a unit square with
     * dimensions all equal to 1
     */
    public Sphere(){
        this.setDimension1(1);
        this.setDimension2(1);
        this.setDimension3(1);
    }

    /**
     * The sphere constructor with
     * 1 argument is used to create
     * a sphere object with the dimension1
     * set to the parameter. dimension2
     * is set to 1.
     *
     * @param i The param i is used to set
     *          the value of dimension1 on
     *          creation.
     */
    public Sphere(double i){
        this.setDimension1(i);
        this.setDimension2(1);
        this.setDimension3(1);
    }

    /**
     * The sphere constructor with
     * 2 arguments is used to create
     * a sphere with dimensions set
     * to the passed values.
     *
     * @param i the value to set
     *          dimension1 to.
     *
     * @param j the value to set
     *          dimension2 to.
     */
    public Sphere(double i, double j){
        this.setDimension1(i);
        this.setDimension2(j);
        this.setDimension3(1);
    }

    /**
     * The sphere constructor with
     * 2 arguments is used to create
     * a sphere with dimensions set
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
    public Sphere(double i, double j,double k){
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
        return ((4*Math.PI)*
                (Math.pow((
                (Math.pow(this.getDimension1(),1.6)*(Math.pow(this.getDimension2(),1.6)))+
                (Math.pow(this.getDimension2(),1.6)*(Math.pow(this.getDimension3(),1.6)))+
                (Math.pow(this.getDimension3(),1.6)*(Math.pow(this.getDimension1(),1.6)))/3),
                (1/1.6))));
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
        return (((double)4/3)*this.getDimension1()*this.getDimension2()*this.getDimension3()*Math.PI);
    }

    /**
     * The toString method is used to
     * get the attributes of the object
     * to a string for printing.
     */
    public String toString(){
        return(
                "Sphere/Ellipsoid\n" +
                "Diameter1= " + this.getDimension1() + "\n" +
                "Diameter2= " + this.getDimension2() + "\n" +
                "Height= " + this.getDimension3() + "\n" +
                "Total Surface Area= " + this.getSurfaceArea() + "\n" +
                "Total Volume Area= " + this.getVolume() + "\n");
    }
}
