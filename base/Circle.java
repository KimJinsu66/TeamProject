package base;
import myInterface.Shape;

/**
 * Shape 인터페이스를 구현하고 equals() 메소드를 오버라이딩한 Circle 클래스.
 * 
 * @author (2017315002 김아름,2018315053 테라오카유이카,2014671038 김진수) 
 * @version (2019.09.09)
 */
public class Circle implements Shape
{
    int x;
    int y;
    int radius;
    public Circle(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    
    public boolean equals(Object obj){
        Circle c = (Circle)obj;
        if(x == c.x && y == c.y) return true;
        else return false;
    }
    
    public void draw(){
        System.out.println("반지름이" + radius + "인 원입니다.");
    } 
    public double getArea(){
        return radius * radius * PI ;
    } 
}
