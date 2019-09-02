
/**
 * 여기에 Oval 클래스 설명을 작성하십시오.
 * 
 * @author (2014671038 김진수) 
 * @version (2019.09.02)
 */
public class Oval implements Shape
{   
    int a;
    int b;
    public Oval(int a , int b){
        this.a = a;
        this.b = b;
    }
    public void draw(){
        System.out.println(a + "x" + b + "에 내접하는 타원입니다.");
    } 
    public double getArea(){
        return PI * a * b;
    } 
}
