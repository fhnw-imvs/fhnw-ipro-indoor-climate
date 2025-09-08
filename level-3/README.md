# Level 3: Monitoring remotely
To document your setup, update this sketch.

<kbd><img src="sketch.png" height="240"/></kbd>

## Goals
To finish the level, achieve these goals.

- [ ] Read a CO2 sensor, on the FeatherS3
- [ ] Send data via USB, to your computer
- [ ] Store sensor data, in a cloud backend
- [ ] Read stored data, from a cloud backend
- [ ] Show live data in a Web dashboard
- [ ] Build an end-to-end prototype

## Building blocks
To achieve the goals, use these blocks.

- [ ] [Get a FeatherS3 hardware kit](#get-a-feathers3-hardware-kit)
- [ ] [Set up the Mu editor for CircuitPython](#set-up-the-mu-editor-for-circuitpython)
- [ ] [Set up the FeatherS3 for CircuitPython](#set-up-the-feathers3-for-circuitpython)
- [ ] [Use the FeatherS3 with CircuitPython](#use-the-feathers3-with-circuitpython)
- [ ] [Read a value from an I2C sensor](#read-a-value-from-an-i2c-sensor)
- [ ] [Write ASCII bytes to a serial port](#write-ascii-bytes-to-a-serial-port)
- [ ] [Connect to a local Wi-Fi network](#connect-to-a-local-wi-fi-network)
- [ ] [Send a POST request to a Web server](#send-a-post-request-to-a-web-server)
- [ ] ...
- [ ] ...

### Get a FeatherS3 hardware kit
Borrow these items from the [FHNW IoT Hardware Library](https://github.com/fhnw-imvs/fhnw-iot-library)

<kbd><img src="hardware.png" width="420"/></kbd>

- [FeatherS3 board](https://github.com/fhnw-imvs/fhnw-iot-library/blob/main/Hardware/Microcontrollers/UnexpectedMaker_FeatherS3_ESP32-S3.md)
- [USB-C cable](https://github.com/fhnw-imvs/fhnw-iot-library/blob/main/Parts/Cables/USB-C_Cable_1m.md) (or use your own)
- [Feather to Grove adapter](https://github.com/fhnw-imvs/fhnw-iot-library/blob/main/Hardware/Adapters/Feather_to_Grove_Adapter.md)
- [Grove CO2 sensor](https://github.com/fhnw-imvs/fhnw-iot-library/blob/main/Hardware/Sensors/Grove_CO2_Temperature_Humidity_Sensor_SCD30.md)
- [Grove cable](https://github.com/fhnw-imvs/fhnw-iot-library/blob/main/Parts/Cables/Grove_Cable_20cm.md)

### Set up the Mu editor for CircuitPython
...

### Set up the FeatherS3 for CircuitPython
> Note: Skip these steps, if your board already shows up as _CIRCUITPY_.
#### FeatherS3 ROM bootloader mode (once)
To get the FeatherS3 into ROM bootloader mode

* Press and hold the _BOOT_ button
* Then, press the _RESET_ button
* Release the _BOOT_ button

Now the board should show up as a USB device, e.g. _/dev/cu.usbmodem01_ on MacOS or _COM3_ on Windows.

#### Install UF2 bootloader (once)
To install the UF2 bootloader, follow the steps to _Install, Repair, or Update UF2 Bootloader_ at the bottom of https://circuitpython.org/board/unexpectedmaker_feathers3/ or try this:

* Download [tinyuf2-unexpectedmaker_feathers3-0.35.0-combined.bin](https://adafruit-circuit-python.s3.amazonaws.com/bootloaders/esp32/unexpectedmaker_feathers3/tinyuf2-unexpectedmaker_feathers3-0.35.0-combined.bin).
* Use https://adafruit.github.io/Adafruit_WebSerial_ESPTool/ with _115'200 Baud_ to _Connect_.
* Once the device is connected, first _Erase_ its flash memory.
* Then _Choose a file ..._ to select _...-combined.bin_ and click _Program_ to upload it.
* Once the upload finished, press the _RESET_ button on the FeatherS3.

Now the board should show up as a USB drive named _FTHRS2BOOT_.

#### Install CircuitPython (once)
To install CircuitPython or more precisely the CircuitPython interpreter, follow these steps:

* Download the board specific _.UF2_ file from https://circuitpython.org/board/unexpectedmaker_feathers3/
* Drop it on the USB drive named _FTHRS2BOOT_ and wait until the drive disconnects.

Now the board should show up as a USB drive named _CIRCUITPY_.

#### Troubleshooting
* https://learn.adafruit.com/welcome-to-circuitpython/troubleshooting

### Use the FeatherS3 with CircuitPython
Here's an [introduction to Microcontrollers](https://github.com/tamberg/circuitpython-workshop) with [CircuitPython](https://circuitpython.org).

- ...
- ...
- ...

### Read a value from an I2C sensor
On an embedded device, connected via USB.

#### With CircuitPython (on FeatherS3)
- Plug the Feather board into the Grove adapter.
- Wire the sensor to a Grove port named _I2C_.
- Copy the sensor library to the board.
- Use the library to read a value.

### Write ASCII bytes to a serial port
On an embedded device, connected via USB.

#### With CircuitPython (on FeatherS3)
...

#### Result
ASCII data is sent over USB serial.

### Connect to a local Wi-Fi network
### With CircuitPython
...

### Send a POST request to a Web server
### With Curl
```console
$ curl -vX POST --data "" https://postb.in/...
```

### With CircuitPython
...

## Side quests
To learn more, consider these side quests.

- [ ] ...
- [ ] ...
- [ ] ...
