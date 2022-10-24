package prova05;

abstract class BluetoothUFAL {
	
	abstract void Processing();
	
	
	public void Connecting() {
		System.out.println("You're now connecting...");
	}
	public void Disconnecting() {
		System.out.println("You're now disconnecting...");
	}

}
