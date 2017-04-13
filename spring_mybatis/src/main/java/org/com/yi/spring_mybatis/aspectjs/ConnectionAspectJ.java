package org.com.yi.spring_mybatis.aspectjs;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.ibatis.session.SqlSession;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.com.yi.spring_mybatis.utils.SessionUtils;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ConnectionAspectJ {

	private SqlSession session;

	@Before("execution(* org.com.yi.spring_mybatis.*.dao.impl.*.*(..))")
	public void setConnectionBefore(JoinPoint jp) {
		Object obj = jp.getTarget();
		String md = jp.getSignature().getName();
		Class<?> clas = obj.getClass();
		clas.getTypeParameters();
			System.err.println(obj);
		try {
			
			// Method methodOne=clas.getMethod("setUm",UserMapper.class);
			Method methodTwo = clas.getMethod("setSession", SqlSession.class);

			// Class<?>[] type=methodOne.getParameterTypes();
			session = SessionUtils.getSqlSession();
			// methodOne.invoke(obj,session.getMapper(UserMapper.class));
			methodTwo.invoke(obj, session);

		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.err.println(obj);

	}

	@AfterThrowing(throwing = "exe", pointcut = ("execution(* org.com.yi.spring_mybatis.*.dao.impl.*.*(..))"))
	public void executionThrowing(JoinPoint jp, Object exe) {
		
		session.rollback();
		session.close();
		System.err.println("执行失败");
		System.err.println("错误:"+exe);

	}

	

	@AfterReturning(returning = "rvt", pointcut = ("execution(* org.com.yi.spring_mybatis.*.dao.impl.*.*(..))"))
	public void executionReturning() {

		session.commit();
		session.close();
		System.err.println("执行成功");

	}
	
//	@After("execution(public * org.com.yi.spring_mybatis.*.dao.impl.*.*(..))")
//	public void execution(JoinPoint jp) {
//		
//		
//		
//	}
}
