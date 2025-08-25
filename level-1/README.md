# Level 1: Logging sensor data
## Goals
To finish the level, achieve these goals.

- [ ] Read a CO2 sensor, on the Microbit
- [ ] Send data via USB, to your laptop
- [ ] Store sensor data, on your laptop
- [ ] Read stored data, on your laptop
- [ ] Show historical data as a chart
- [ ] Build an end-to-end prototype

## Building blocks
To achieve the goals, use these blocks.

- [ ] [Use the Microbit with MakeCode](#use-the-microbit-with-makecode)
- [ ] [Add a library to your Microbit code](#add-a-library-to-your-microbit-code)
- [ ] [Read ASCII bytes from a serial port](#read-ascii-bytes-from-a-serial-port)
- [ ] [Store data in CSV format into a file](#store-data-in-csv-format-into-a-file)
- [ ] [Open a CSV file as a spreadsheet](#open-a-CSV-file-as-a-spreadsheet)
- [ ] [Import a CSV file into a notebook](#import-a-CSV-file-into-a-notebook)
- [ ] [Store data into a database with SQL](#store-data-into-a-database-with-sql)
- [ ] [Read data from a database with SQL](#read-data-from-a-database-with-sql)
- [ ] [Run a database as a local service](#run-a-database-as-a-local-service)

### Use the Microbit with MakeCode
Here's an [introduction to the Microbit](https://github.com/tamberg/microbit-intro) with [MakeCode](https://makecode.microbit.org).

### Add a library to your Microbit code
...

### Read ASCII bytes from a serial port
On your computer, with a device connected via USB.

#### With _screen_, in a terminal (on MacOS, Linux)
```console
$ screen /dev/tty.u<TAB> 115200
```
(To end _screen_ press CTRL-A-K.)

#### With _PuTTY_ (on Windows)
...

#### With Python
Install the [pyserial](https://pyserial.readthedocs.io/en/latest/shortintro.html) library.
```console
$ pip uninstall serial
$ pip install pyserial
```
Edit [serial_read.py](Python/serial_read/serial_read.py) to set the serial port name.
```Python
import serial

port = serial.Serial('/dev/tty.usbmodem102') # or 'COM3'
port.baudrate = 115200
while (port.isOpen()):
    bytes = port.readline()
    chars = str(bytes, 'utf-8')
    print(chars)
```

Run the program.
```console
$ cd level-1/Python/serial_read
$ python serial_read.py
```

#### With Java
Edit [Program.java](Java/serial_read/src/main/java/Program.java) to set the serial port name.
```Java
public final class Program {
    public static void main(String args[]) {
        ...
    }
}
```
Run the program.
```console
$ cd level-1/Java/serial_read
$ ./clean.sh && ./setup.sh && ./build.sh
$ java -cp ./src:target Program
```

#### Result
ASCII data sent over USB shows up, e.g.
```console
(485.480316162109)
(485.607025146484)
(485.632629394531)
...
```
<details>
<summary>Does not work? <u>Check these tips</u>.</summary>

- Python [AttributeError: module 'serial' has no attribute 'Serial'](https://stackoverflow.com/questions/41199876/attributeerror-module-serial-has-no-attribute-serial)
- Terminal _permission denied: ./script.sh_
    ```console
    $ chmod u+x *.sh
    ```
- Terminal broken after using _screen_
    ```console
    $ stty sane
    ```

</details>

### Store data in CSV format into a file
...

### Open a CSV file as a spreadsheet
...

### Read data from a database with SQL
...

### Read data from a database with SQL
...

### Run a database as a local service
...

## Side quests
To learn more, consider these side quests.

- [ ] Show a "bad room climate" alert on the Microbit
- [ ] Add other [available sensors](https://github.com/fhnw-imvs/fhnw-iot-library/tree/main), e.g. light or PIR
- [ ] Replace your laptop with a Raspberry Pi
