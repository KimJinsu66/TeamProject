
/**
 * 인터페이스 Shape에 있는 추상 클래스들을 구현하는 Rect 클래스.
 * 
 * @author (2017315002 김아름,2018315053 테라오카유이카,2014671038 김진수) 
 * @version (2019.09.02)
 */
public class Rect implements Shape
{
    int width;
    int height;
    public Rect(int width, int height){
        this.width = width;
        this.height = height;
    }

    public void draw(){
        System.out.println(width + "x" + height + "크기의 사각형입니다.");
    } 

    public double getArea(){
        return width * height;
    } 
}
