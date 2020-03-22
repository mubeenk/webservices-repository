package com.demo.client.clientsample;

import com.demo.client.*;

public class ClientSample {

	public static void main(String[] args) {
	        System.out.println("***********************");
	        System.out.println("Create Web Service Client...");
	        ApplicationServiceSOAP service1 = new ApplicationServiceSOAP();
	        System.out.println("Create Web Service...");
	        IApplicationService port1 = service1.getApplicationServicePort();
	        System.out.println("Call Web Service Operation...");
	        //System.out.println("Server said: " + port1.getApplication(Integer.parseInt("2")));  // Integer.parseInt(args[0])
	        //System.out.println("Server said: " + port1.updateApplication(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port1.getAll());
	        System.out.println("Server said: " + port1.addApplication(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port1.deleteApplication(Integer.parseInt(args[1])));
	        System.out.println("Create Web Service...");
	        IApplicationService port2 = service1.getApplicationServicePort();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port2.getApplication(Integer.parseInt(args[2])));
	        System.out.println("Server said: " + port2.updateApplication(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port2.getAll());
	        System.out.println("Server said: " + port2.addApplication(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port2.deleteApplication(Integer.parseInt(args[3])));
	        System.out.println("***********************");
	        System.out.println("Call Over!");
	}
}
