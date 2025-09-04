import java.io.DataInputStream;
import java.io.DataOutputStream;
import gnu.io.NRSerialPort;

public final class Program {
    public static void main(String[] args) {
        String port = "/dev/tty.usbmodem102"; // or "COM3", TODO

        int baudRate = 115200;
        NRSerialPort serial = new NRSerialPort(port, baudRate);
        serial.connect();

        DataInputStream ins = new DataInputStream(serial.getInputStream());
        try {
	        while (!Thread.interrupted()) {
		        if (ins.available() > 0) {
			        int b = ins.read();
			        System.out.print((char) b);
                }
                Thread.sleep(5);
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
        serial.disconnect();
    }
}
