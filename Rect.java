
/**
 * 여기에 Rect 클래스 설명을 작성하십시오.
 * 
 * @author (2017315002 김아름) 
 * @version (2019.09.02)
 */
public class Rect implements Shape
{
    int a;
    int b;
    public Rect(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void draw(){
        System.out.println(a + "x" + b + "크기의 사각형입니다.");
    } 
    public double getArea(){
        return a * b;
    } 
}
