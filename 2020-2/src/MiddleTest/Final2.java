package MiddleTest;

import java.awt.Button;
//import javax.swing.Timer;
import javax.swing.*;
 
interface Remote{
	void turnOn();
	void turnOff();
}
public class Final2 implements Remote  {
	boolean onOff = false;
	


	public static void main(String[] args) {
		Final2 f = new Final2();
		Timer t = new Timer(1000, event -> System.out.println("beep"));
		t.start();
		}
		
	}

