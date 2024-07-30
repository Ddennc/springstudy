package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts  {
    @Pointcut("execution(* get*())")
    public  void  allGetMethods(){}
    @Pointcut("execution(* get* ())")
    public void  allGetMethodsFromUniLibrary(){}
    @Pointcut("execution(* return* ())")
    public void allReturnMethodsFromLibrary(){}
    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromLibrary()")
    public void allGetAndReturnMethodsFromLibrary(){}
    @Pointcut("execution(* *(..))")
    public void allMethods(){}
    @Pointcut("allGetAndReturnMethodsFromLibrary() && ! allReturnMethodsFromLibrary()")
    public void allMethodsExceptReturn(){}
    @Pointcut("execution(* add*(..))")
    public  void  allAddMethods(){}
}
