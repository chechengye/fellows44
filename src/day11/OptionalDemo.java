package day11;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        //1、of方式创建非空的
        Optional<String> opt = Optional.of("zhangsan");
        //2、ofnullable 可以创建空的
        Optional<Object> o = Optional.ofNullable(null);
        //System.out.println(o.get());
        System.out.println(opt.isPresent());
        System.out.println(o.orElse("new val"));
        System.out.println("-----------orElseGet----------");
        System.out.println(o.orElseGet(() -> "new val"));
        System.out.println("-----------orElseThrow----------");
        System.out.println(opt.orElseThrow(() -> new IllegalArgumentException("没有取到值！")));
        System.out.println("--------------map----------------");
        Optional<String> optionalS = opt.map(val -> val.toUpperCase());
        System.out.println(optionalS.get());
        System.out.println("--------------flatmap----------------");
        optionalS = opt.flatMap(val -> Optional.of(val.toUpperCase() + "- flatMap"));
        System.out.println(optionalS.get());
    }
}
