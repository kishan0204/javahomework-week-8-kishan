package javahomework_week_8;/*16. Point
You have to represent a point in 2D space. Write a class with the name Point. The class needs two
fields (instance variables) with name x and y of type int.
The class needs to have two constructors. The first constructor does not have any parameters (no-arg
constructor). The second constructor has parameters x and y of type int and it needs to initialize the
fields.
Write the following methods (instance methods):*/

public class Programme_16_Point {
    public static void main(String[] args) {
        Programme_16_Point first = new Programme_16_Point(6,5);
        Programme_16_Point second = new Programme_16_Point(3,1);
        System.out.println("distance(0,0)="+first.distance());
        System.out.println("distance(second)="+first.distance(second));
        System.out.println("distance(2,2)="+first.distance(2,2));
        Programme_16_Point programme_16_point = new Programme_16_Point();
        System.out.println("distance()="+ programme_16_point.distance());


    }
    int x, y ;
    public Programme_16_Point(){

    }
    public Programme_16_Point(int x , int y){
        this.x=x;
        this.y=y;
    }
    public  int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        x=this.x;
    }
    public void setY(int y){
        this.y=y;
    }
    //distance one point to(0,0)
    public double distance(){
        return distance(0, 0);
    }
    //distance with two parameter
    public double distance(int x , int y){
        return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
    }
    //distance to another point
    public double distance(Programme_16_Point programme_16_point){
        return distance(programme_16_point.x,programme_16_point.y);
    }

}

