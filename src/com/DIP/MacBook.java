/*Dependency Inversion Principle : Class should depend on interfaces rather tham concrete classes
 * 
 * Keyboard(I) : WiredKeyboard(C)
 * 				 BluetoothKeyboard(C)
 * 
 * Mouse(I) : WiredMouse(C)
 * 			  BluetoothMouse(C)
*/
package com.DIP;
/*class WiredKeyboard{
	
}
class WiredMouse{
	
}
public class MacBook {
	private final WiredKeyboard keyboard;
	private final WiredMouse mouse;
	
	public MacBook() {
		keyboard = new WiredKeyboard();
		mouse = new WiredMouse();
	}
}
*/
interface KeyBoard{
	
}
interface Mouse{
	
}
public class MacBook{
	private final KeyBoard keyboard;
	private final Mouse mouse;
	
	public MacBook(KeyBoard keyboard, Mouse mouse) {
		this.keyboard=keyboard;
		this.mouse = mouse;
	}
	
}