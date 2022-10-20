package corespring.springcore.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class LogOutput implements AfterReturningAdvice{

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		
		String className = target.getClass().getName();
        String methodName = method.getName();
        System.out.println("Returning from method "+methodName+" of class "+className+" with "+returnValue.toString());
    
	}
}
