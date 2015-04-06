package jp.co.rakuten.checkout.sap;

import org.springframework.stereotype.Component;

@Component
public class Camera {
   public void takeSnap() {
	   System.out.println("Take Snap");
   }
}
