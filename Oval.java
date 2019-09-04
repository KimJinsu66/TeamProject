
/**
 * 인터페이스 Shape를 상속받은 Circle클래스.
 * 
 * @author (2014671038 김진수) 
 * @version (2019.09.02)
 */
public class Oval implements Shape
{   
    int width;
    int height;
    public Oval(int width , int height){
        this.width = width;
        this.height = height;
    }
    public void draw(){
        System.out.println(width + "x" + height + "에 내접하는 타원입니다.");
    } 
    public double getArea(){
        return PI * width * height;
    } 
}
