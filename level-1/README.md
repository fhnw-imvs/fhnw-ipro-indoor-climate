# Level 1: Logging sensor data
## Goals
To finish the level, achieve these goals.

- [ ] Read a CO2 sensor, on the Microbit
- [ ] Send data via USB, to your laptop
- [ ] Store sensor data, on your laptop
- [ ] Read stored data, on your laptop
- [ ] Show historical data as a chart

## Building blocks
To achieve the goals, use these blocks.

- [ ] [Use the Microbit](https://github.com/tamberg/microbit-intro) with [MakeCode](https://makecode.microbit.org)
- [ ] Add a library to your Microbit code
- [ ] [Read ASCII bytes from a serial port](#read-ascii-bytes-from-a-serial-port)
- [ ] Store data in CSV format into a file
- [ ] Open a CSV file as a spreadsheet
- [ ] Import a CSV file into a notebook
- [ ] Store data into a database with SQL
- [ ] Read data from a database with SQL
- [ ] Run a database as a local service

### Read ASCII bytes from a serial port
On your (Mac or Linux) computer.

#### With _screen_, in a terminal
```console
$ screen /dev/tty.u<TAB> 115200
```

#### Or with Python
```Python
import serial

port = serial.Serial('COM3') # or /dev/tty.u...
port.baudrate = 115200
bytes = port.read()
print(bytes)
```

#### Or with Java
```Java
...
```

#### Troubleshooting
<details>
<summary>Click to open/close.</summary>

- Python [AttributeError: module 'serial' has no attribute 'Serial'](https://stackoverflow.com/questions/41199876/attributeerror-module-serial-has-no-attribute-serial#60600073)

</details>

## Side quests
To learn more, consider these side quests.

- [ ] Show a "bad room climate" alert on the Microbit
- [ ] Add other [available sensors](https://github.com/fhnw-imvs/fhnw-iot-library/tree/main), e.g. light or PIR
- [ ] Replace your laptop with a Raspberry Pi
