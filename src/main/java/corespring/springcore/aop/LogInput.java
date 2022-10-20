package corespring.springcore.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class LogInput implements MethodBeforeAdvice {

	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		String className=target.getClass().getName();
		String methodName=method.getName();
		System.out.println("Executing method"+methodName+"of class"+className);
		for(Object parameter :args) {
			System.out.println(parameter.getClass().getName()+"="+parameter.toString());
		}
		
	}
	

}
