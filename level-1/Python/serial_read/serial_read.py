import serial

port = serial.Serial('/dev/tty.usbmodem102') # or 'COM3'
port.baudrate = 115200
bytes = port.read()
print(bytes)
