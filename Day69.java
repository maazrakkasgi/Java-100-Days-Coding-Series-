// Suppose, we have a class A which is the base class and we have a class B which is derived from class A and we have a class C which is derived from class B, we can access the functions of both class A and class B by creating an object for class C.

//Hence, this mechanism is called multi-level inheritance. (B inherits A and C inherits B.)//
class Isosceles{
 void display1()

 {
 System.out.println("I am an isosceles triangle");
 }
}
class Equilateral extends Isosceles{
 void display2()
 {
 System.out.println("I am an equilateral triangle");
 }

}
class C extends Equilateral{
 void display3()
 {
 System.out.println("I am triangle");
 }

}
public class Day69
{
public static void main(String[] args) {
C c = new C();
c.display2();
c.display1();
c.display3();
}
}