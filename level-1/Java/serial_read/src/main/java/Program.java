import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.fazecast.jSerialComm.SerialPortInvalidPortException;
import com.fazecast.jSerialComm.SerialPort;

public final class Program {
    public static void main(String[] args) {
        String name = "/dev/tty.usbmodem112302";
        SerialPort p = null;
        boolean open = false;
        try {
            p = SerialPort.getCommPort(name);
            p.setComPortTimeouts(SerialPort.TIMEOUT_READ_BLOCKING, 1000, 0);
            p.setBaudRate(115200);
            open = p.openPort();
        } catch (SerialPortInvalidPortException e) {}
        if (p != null && open) {
            try (InputStream is = p.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr)) {
                while (true) {
                    String line = br.readLine();
                    System.out.println(line);
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        } else {
            System.out.println("Cannot open port.");
        }
    }
}
