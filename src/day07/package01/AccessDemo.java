package day07.package01;

import day07.Package02.ProtectedDemo2;

public class AccessDemo {

    public static void main(String[] args) {
        PrivateDemo pd = new PrivateDemo();
        pd.method();
        ProtectedDemo protectedDemo = new ProtectedDemo();
        protectedDemo.eat();
        day07.Package02.ProtectedDemo p02 = new day07.Package02.ProtectedDemo();
        p02.method();


       /* ProtectedDemo2 protectedDemo2 = new ProtectedDemo2();
        protectedDemo2.*/
    }
}
