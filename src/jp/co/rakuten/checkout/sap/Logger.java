package jp.co.rakuten.checkout.sap;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
    
    
      @Before("execution(void jp.co.rakuten.checkout.sap.Camera.takeSnap())")
      public void aboutToSnap() {
    	  System.out.println("About to Snap");
      }
}
