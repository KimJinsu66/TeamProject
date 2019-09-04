
/**
 * 인터페이스 Shape에 있는 추상 클래스들을 구현하는 Circle 클래스.
 * 
 * @author (2017315002 김아름,2018315053 테라오카유이카,2014671038 김진수) 
 * @version (2019.09.02)
 */
public class Circle implements Shape
{
    int radius;
    public Circle(int radius ){
        this.radius = radius;
    }
    public void draw(){
        System.out.println("반지름이" + radius + "인 원입니다.");
    } 
    public double getArea(){
        return radius * radius * PI ;
    } 
}
