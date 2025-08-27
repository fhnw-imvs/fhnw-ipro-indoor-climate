# Level 1: Logging sensor data
To document your setup, update this sketch.

<kbd><img src="sketch.png" height="240"/></kbd>

## Goals
To finish the level, achieve these goals.

- [ ] Read a CO2 sensor, on the Microbit
- [ ] Send data via USB, to your computer
- [ ] Store sensor data, on your computer
- [ ] Read stored data, on your computer
- [ ] Show historical data as a chart
- [ ] Build an end-to-end prototype

## Building blocks
To achieve the goals, use these blocks.

- [ ] [Get a Microbit hardware kit](#get-a-microbit-hardware-kit)
- [ ] [Use the Microbit with MakeCode](#use-the-microbit-with-makecode)
- [ ] [Read a value from an I2C sensor](#read-a-value-from-an-i2c-sensor)
- [ ] [Write ASCII bytes to a serial port](#write-ascii-bytes-to-a-serial-port)
- [ ] [Read ASCII bytes from a serial port](#read-ascii-bytes-from-a-serial-port)
- [ ] [Store data in CSV format into a file](#store-data-in-csv-format-into-a-file)
- [ ] [Open a CSV file as a spreadsheet](#open-a-CSV-file-as-a-spreadsheet)
- [ ] [Import a CSV file into a notebook](#import-a-CSV-file-into-a-notebook)
- [ ] [Run a database as a local service](#run-a-database-as-a-local-service)
- [ ] [Store data into a database with SQL](#store-data-into-a-database-with-sql)
- [ ] [Read data from a database with SQL](#read-data-from-a-database-with-sql)

### Get a Microbit hardware kit
Borrow these items from the [FHNW IoT Hardware Library](https://github.com/fhnw-imvs/fhnw-iot-library)
- Microbit (or use your own)
- Micro USB cable (or use your own)
- Grove adapter for Microbit
- Grove CO2 sensor
- Grove cable

### Use the Microbit with MakeCode
Here's an [introduction to the Microbit](https://github.com/tamberg/microbit-intro) with [MakeCode](https://makecode.microbit.org).

- Open the editor https://makecode.microbit.org/
- Connect the Microbit to your computer via USB
- Download the .hex file to the "MICROBIT" drive
- Wait for the Microbit's LED to stop blinking
  
### Read a value from an I2C sensor
On an embedded device, connected via USB.

#### With MakeCode (on Microbit)
- Plug the Microbit into the Grove adapter.
- Wire the sensor to the Grove port named _I2C_.
- Open _Extensions_, search for / select a library, e.g. [Grove](https://makecode.microbit.org/v1/pkg/Seeed-Studio/pxt-grove).
- Check for new blocks matching the sensor name, e.g. _SCD30_.

### Write ASCII bytes to a serial port
On an embedded device, connected via USB.

#### With MakeCode (on Microbit)
Use the _Advanced_ > [Serial](https://makecode.microbit.org/v0/reference/serial) blocks to write strings and numbers.

#### Result
ASCII data is sent over USB serial.

### Read ASCII bytes from a serial port
On your computer, with a device connected via USB.

#### With _screen_, in a terminal (on MacOS, Linux)
```console
$ screen /dev/tty.u<TAB> 115200
```
(To end _screen_ press CTRL-A-K.)

#### With _PuTTY_ (on Windows)
- Install [PuTTY](https://www.chiark.greenend.org.uk/~sgtatham/putty/latest.html)
- Select the _Session_ tab
- Select _Connection type: Serial_
- Edit _Serial line: COM3_
- Select _Speed: 115200_
- Click _Open_ to connect

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

#### Errors
Got an error? Check these tips.

- Python [AttributeError: module 'serial' has no attribute 'Serial'](https://stackoverflow.com/questions/41199876/attributeerror-module-serial-has-no-attribute-serial)
- Terminal _permission denied: ./script.sh_
    ```console
    $ chmod u+x *.sh
    ```
- Terminal broken after using _screen_
    ```console
    $ stty sane
    ```

### Store data in CSV format into a file
...

### Open a CSV file as a spreadsheet
...

### Store data into a database with SQL
...

### Read data from a database with SQL
...

### Run a database as a local service

#### HSQLDB database

1. Install hsqldb
   - Download latest version of hsqldb from [HSQLDB](https://hsqldb.org)
   something like hsqldb-2.7.*.zip

   - Extract the archive, e.g. into `C:\hsqldb` 
     ```md
     hsqldb/
     |- lib/        (contains hsqldb.jar)
     |- bin/        (scripts to start server, tools, etc.)
     |- doc/        (documentation)
	 ```

2. Start the hsqldb-service
Run the following command:
   ```md
   C:\hsqldb> java -cp lib\hsqldb.jar org.hsqldb.Server 
   ```
   Alternatively, adapt und run script `bin\runServer.bat`.    
   Server can be stopped via `[Ctrl]+[C]`. For the next step, the server should be running.

3. Start the gui and connect
Run the following command:
   ```md
   C:\hsqldb> java -cp lib\hsqldb.jar org.hsqldb.util.DatabaseManagerSwing  \
                  --url jdbc:hsqldb:hsql://localhost --user SA
   ```
   Alternatively, adapt und run script `bin\runManagerSwing.bat`.
   If successfull, a gui opens, showing a connection to the server running on localhost.

4. Create a table and test some SQL    
In the sql-window of the gui, enter the following command (adapt the table-structure to your needs):
    ```sql
    CREATE TABLE DATA (
        VALUE NUMERIC(10,4),
        LABEL VARCHAR(200),
        ID INT GENERATED BY DEFAULT AS IDENTITY,
        TS TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    );
    COMMIT;
	```
	
	You can add some data and read it:
    ```sql
    INSERT INTO DATA (VALUE) VALUES (23);
    INSERT INTO DATA (VALUE) VALUES (22);
    COMMIT;
	SELECT * FROM DATA;
	```	
  To drop the table use `DROP TABLE DATA;` To close the gui, use `File - Exit`.

## Side quests
To learn more, consider these side quests.

- [ ] Show a "bad room climate" alert on the Microbit
- [ ] Add other [available sensors](https://github.com/fhnw-imvs/fhnw-iot-library/tree/main), e.g. light or PIR
- [ ] Replace your computer with a Raspberry Pi
