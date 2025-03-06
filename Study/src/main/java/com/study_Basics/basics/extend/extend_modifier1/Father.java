package com.study_Basics.basics.extend.extend_modifier1;

public class Father {
    // private 私有的，只能在本类中访问
        private void privateMethod(){
            System.out.println("private");
        }

        // 默认的，本类、在当前包下其他类可以访问
        void Method(){
            System.out.println("缺省");
        }

        // protected 受保护的，本类、当前包其他类，以及子类均可以访问
        protected void protectedMethod(){
            System.out.println("protected");
        }

        // public 公开的，所有类均可访问
        public void publicMethod(){
            System.out.println("public");
        }

        public static void main(String[] args) {

            Father fu = new Father();
            fu.privateMethod();
            fu.Method();
            fu.protectedMethod();
            fu.publicMethod();
        }

}
