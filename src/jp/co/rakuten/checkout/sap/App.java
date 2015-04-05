package jp.co.rakuten.checkout.sap;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("jp/co/rakuten/checkout/sap/beans.xml");
        Camera cam = (Camera) context.getBean("camera");
        cam.takeSnap();
        context.close();
	}

}
