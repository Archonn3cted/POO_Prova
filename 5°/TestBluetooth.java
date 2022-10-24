package prova05;

public class TestBluetooth {
	public static void main(String[] args) {
		BluetoothUFAL b1 = new BluetoothSerial();
		BluetoothUFAL b2 = new BluetoothPack();
		
		b1.Connecting();
		b1.Processing();
		b1.Disconnecting();
		
		b2.Connecting();
		b2.Processing();
		b2.Disconnecting();
		
	}
	}
