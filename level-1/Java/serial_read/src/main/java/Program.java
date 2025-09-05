import java.io.BufferedReader; import java.io.InputStream; import java.io.InputStreamReader; import 
java.io.IOException;

import com.fazecast.jSerialComm.SerialPort;

public final class Program {
    public static void main(String[] args) {
        String name = "/dev/tty.u..."; // or "COM3"
        SerialPort p = SerialPort.getCommPort(name);
        p.setComPortTimeouts(SerialPort.TIMEOUT_READ_BLOCKING, 1000, 0);
        p.setBaudRate(115200);
        p.openPort();
        try (InputStream is = p.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr)) {
            do {
                String line = br.readLine();
                System.out.println(line);
            } while (p.isOpen());
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
