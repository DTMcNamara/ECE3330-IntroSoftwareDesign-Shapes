public class ShapesTestMain {
    public static void main(String[] args) {
        Shape[]shapes= new Shape[21];
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2);
        Circle circle3 = new Circle(2,2);
        shapes[0]=circle1;
        shapes[1]=circle2;
        shapes[2]=circle3;
        Square square1 = new Square();
        Square square2 = new Square(2);
        Square square3 = new Square(2,2);
        shapes[3]=square1;
        shapes[4]=square2;
        shapes[5]=square3;
        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle(2);
        Triangle triangle3 = new Triangle(2,2);
        shapes[6]=triangle1;
        shapes[7]=triangle2;
        shapes[8]=triangle3;
        Sphere sphere1 = new Sphere();
        Sphere sphere2 = new Sphere(2);
        Sphere sphere3 = new Sphere(2,2);
        Sphere sphere4 = new Sphere(2,2,2);
        shapes[9]=sphere1;
        shapes[10]=sphere2;
        shapes[11]=sphere3;
        shapes[12]=sphere4;
        Cube cube1 = new Cube();
        Cube cube2 = new Cube(2);
        Cube cube3 = new Cube(2,2);
        Cube cube4 = new Cube(2,2,2);
        shapes[13]=cube1;
        shapes[14]=cube2;
        shapes[15]=cube3;
        shapes[16]=cube4;
        Tetrahedron tetrahedron1 = new Tetrahedron();
        Tetrahedron tetrahedron2 = new Tetrahedron(2);
        Tetrahedron tetrahedron3 = new Tetrahedron(2,2);
        Tetrahedron tetrahedron4 = new Tetrahedron(2,2,2);
        shapes[17]=tetrahedron1;
        shapes[18]=tetrahedron2;
        shapes[19]=tetrahedron3;
        shapes[20]=tetrahedron4;
        for(int i=0;i<shapes.length;i++){
            System.out.println(shapes[i].toString());
        }
    }
}
