package chapter19;

public class EnumClass {
    enum Shrubbery {
        GROUND, CRAWLING, HANGING
    }


    public static void main(String... args) {
        for (Shrubbery s : Shrubbery.values()) {                    //遍历Shrubbery中的所有值
            System.out.println(s + " ordinal: " + s.ordinal());      //打印s在enum类型中的声明顺序
            System.out.print(s.compareTo(Shrubbery.CRAWLING) + " ");    //compareTo()作对比
            System.out.print(s.equals(Shrubbery.CRAWLING )+ " ");
            System.out.println(s == Shrubbery.CRAWLING);
            /**
             * getDeclaringClass()返回该enum值声明时所在的类
             */
            System.out.println(s.getDeclaringClass());
            /**
             * name()方法返回s在Enum中的声明
             */
            System.out.println(s.name());
            System.out.println("-----------------");
        }

        /**
         * Enum.valueOf(class,string)：
         * 根据指定的名字返回相应的enum实例
         */
        for (String s : "HANGING CRAWLING GROUND".split(" ")) {
            Shrubbery shrubbery = Enum.valueOf(Shrubbery.class, s);
            System.out.println(shrubbery);
        }
    }
}
