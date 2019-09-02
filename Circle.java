
/**
 * 인터패이스 Shape를 구현한 Circle클래스.
 * 
 * @author (2018315053 테라오카유이카) 
 * @version (2019.09.02)
 */
public class Circle implements Shape
{
    int r;
    public Circle(int r ){
        this.r = r;
    }
    public void draw(){
        System.out.println("반지름이" + r + "인 원입니다.");
    } 
    public double getArea(){
        return r * r * PI ;
    } 
}
