package day06;

import org.junit.Test;

/**
 * 23种设计模式之  -- 模板方法模式,抽象类应用
 */
public class Example03 {
    @Test
    public void testFn(){
        UserManager um = new UserManager();
        um.check("admin", "del");
    }
}

/**
 * 定义好的骨架
 */
abstract class BaseManager{

    public void check(String username , String method){
        if("admin".equals(username)){//管理员才有权限访问我的方法
            execute(method);
        }else{
            System.out.println("没有权限做此操作");
        }
    }

    abstract void execute(String method);//执行方法
}

class UserManager extends BaseManager{

    @Override
    void execute(String method) {
        if("add".equals(method))
            System.out.println("执行添加操作");
        else if("find".equals(method))
            System.out.println("执行查询操作");
        else
            System.out.println("没有操作该方法的权限");
    }
}