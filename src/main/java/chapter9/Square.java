package chapter9;

public class Square extends Rectangle{
    @Override
    public double calculatePerimeter() {
        return getSides() * getLength();
    }
    public void print(String what){
        System.out.println("I am a " + what );
    }
}
