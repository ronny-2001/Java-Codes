class Triangle{
    static int numOfSides=3;
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;

    public Triangle(double base,double height,double sideLenOne,double sideLenTwo,double sideLenThree){
        this.base=base;
        this.height=height;
        this.sideLenOne=sideLenOne;
        this.sideLenTwo=sideLenTwo;
        this.sideLenThree=sideLenThree;
    }

    public double findArea(){
        return (this.base*this.height/2);
    }

}

public class constructor{
    public static void main(String[] args){
        Triangle t1=new Triangle(8,15,8,15,7);
        Triangle t2=new Triangle(3,8,3,8,10);

        double result_t1=t1.findArea();
        double result_t2=t2.findArea();

        System.out.println(result_t1); //output:60.0
        System.out.println(result_t2); //output:12.0

        System.out.println(t1.sideLenThree); //output:7.0
        System.out.println(t2.sideLenOne); //output:3.0

        System.out.println(Triangle.numOfSides);
    }
}