
/**
 * 전체 프로그램 실행시키는 main() 메소드 작성.
 * 
 * @author (2017315002 김아름,2018315053 테라오카유이카,2014671038 김진수) 
 * @version (2019.09.02)
 */
public class Test
{
    public static void main(String[] args){
        Shape[] list = new Shape[3];
        list[0] = new Circle(10,20);
        list[1] = new Oval(20, 30);
        list[2] = new Rect(10, 40);
        for(int i = 0; i < list.length; i++)
            list[i].redraw(); 
        for(int i = 0; i < list.length; i++)
            System.out.println("면적은 " + list[i].getArea());
    }

}
