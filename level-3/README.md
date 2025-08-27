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
- [ ] Set up the Mu editor, for CircuitPython
- [ ] [Use the FeatherS3 with CircuitPython](#use-the-feathers3-with-circuitpython)
- [ ] [Read a value from an I2C sensor](#read-a-value-from-an-i2c-sensor)
- [ ] [Write ASCII bytes to a serial port](#write-ascii-bytes-to-a-serial-port)
- [ ] ...
- [ ] ...
- [ ] ...
- [ ] ...

### Get a FeatherS3 hardware kit
Borrow these items from the [FHNW IoT Hardware Library](https://github.com/fhnw-imvs/fhnw-iot-library)
- [FeatherS3 board](https://github.com/fhnw-imvs/fhnw-iot-library/blob/main/Hardware/Microcontrollers/UnexpectedMaker_FeatherS3_ESP32-S3.md)
- [USB-C cable](https://github.com/fhnw-imvs/fhnw-iot-library/blob/main/Parts/Cables/USB-C_Cable_1m.md) (or use your own)
- [Feather to Grove adapter](https://github.com/fhnw-imvs/fhnw-iot-library/blob/main/Hardware/Adapters/Feather_to_Grove_Adapter.md)
- [Grove CO2 sensor](https://github.com/fhnw-imvs/fhnw-iot-library/blob/main/Hardware/Sensors/Grove_CO2_Temperature_Humidity_Sensor_SCD30.md)
- [Grove cable](https://github.com/fhnw-imvs/fhnw-iot-library/blob/main/Parts/Cables/Grove_Cable_20cm.md)

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

## Side quests
To learn more, consider these side quests.

- [ ] ...
- [ ] ...
- [ ] ...
