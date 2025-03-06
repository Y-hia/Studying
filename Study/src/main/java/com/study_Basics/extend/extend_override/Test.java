package com.study_Basics.extend.extend_override;

public class Test {

    // 什么是方法重新，为什么需要方法重新：当父类中的方法不能满足需求时，子类可以重新父类中的方法。
    //重写后方法的访问 Java遵循就近原则
    public static void main(String[] args) {
        Npc npc = new Npc();
        npc.eat();
    }
    /**
     * 注意：
     * 1、方法重写，子类方法名必须和父类方法名一样，参数列表也必须一样，返回值也必须一样。
     * 2、子类方法不能比父类方法更宽泛，比如子类方法返回值类型是父类方法返回值类型的子类，或者子类方法返回值类型是父类方法返回值类型的父类。
     * 3、子类重新的方法访问权限必须大于父类方法。
     * 4、私有方法、静态方法不可以被重写。
     */
}
