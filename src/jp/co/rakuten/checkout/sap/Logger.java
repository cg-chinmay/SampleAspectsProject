package jp.co.rakuten.checkout.sap;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
      
      @Pointcut("execution(void jp.co.rakuten.checkout.sap.Camera.takeSnap())")
      public void cameraSnap() {
          
      }
    
      @Before("cameraSnap()")
      public void aboutToSnap() {
    	  System.out.println("About to Snap");
      }
      
      @After("cameraSnap()")
      public void doneSnapping() {
    	  System.out.println("After Snapping");
      }
      
      @Around("cameraSnap()")
      public void aroundSnapping(ProceedingJoinPoint p) {
    	  System.out.println("Before Snapping Around advice");
    	  try {
			p.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println("Exception in Around advice");
		}
    	  System.out.println("After Snapping Around advice");
      }
}
