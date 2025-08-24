import serial

port = serial.Serial('/dev/tty.usbmodem1102') # or 'COM3'
port.baudrate = 115200
while (port.isOpen()):
    line = port.readline()
    print(line)
