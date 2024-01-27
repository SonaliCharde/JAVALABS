package OOPS.Interface;

public class Lab149 {
    public static void main(String[] args) {

    }
}
interface interface1{}
interface interface2{}
class classA{}
class classB{}
abstract class abclassC{}
abstract class abclasD{}

class Test1 extends classA{} //class extending one class -P
//class Test2 extends classA,classB{} //class extending to multiple classes -NP
class Test3 implements interface1{} //class extending one interface - P
class Test4 implements interface1,interface2{} //class extending to multiple interfaces - P
class Test5 extends classA implements interface1,interface2 {}
//class extending to one class and implementing multiple interfaces -P

//class Test6 implements interface1 extends class A{}
//Class implementing to interface and extending to class -NP

//interface1 extends classA{} - Interface extends to class - NP
//interface1 implements classA{} - interface implementing to class - NP
//interface1 extends classA,classB{} - interface extending multiple classes - NP

interface interface3 extends interface1,interface2{} // interface extending to multiple interfaces - P




