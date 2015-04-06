package jp.co.rakuten.checkout.sap;

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
}
