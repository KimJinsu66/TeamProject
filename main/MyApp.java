package main;
import base.Circle;
/**
 * main 메소드를 포함하는 MyApp 클래스 작성.
 * 
 * @author (2014671038 김진수, 2017315002 김아름, 2018315053 테라오카 유이카) 
 * @version (2019.09.09)
 */
public class MyApp
{
    public static void main(String[] args){
        Circle c1 = new Circle(2, 3, 5);
        Circle c2 = new Circle(2, 3, 10);
        System.out.println("원1 : " + c1);
        System.out.println("원2 : " + c2);
        if(c1.equals(c2))
            System.out.println("같은 원");
        else
            System.out.println("서로 다른 원");
    }
}
