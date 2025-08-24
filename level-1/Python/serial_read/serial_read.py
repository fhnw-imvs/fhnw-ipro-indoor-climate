import serial

port = serial.Serial('/dev/tty.usbmodem102') # or /dev/tty.u...
port.baudrate = 115200
bytes = port.read()
print(bytes)
