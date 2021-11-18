# Bab 12 Sensor dan Location

## Tujuan Pembelajaran

### 1.  Mahasiswa mengetahui cara membuat aplikasi terkait sensor-sensor.
### 2.  Mahasiswa mengetahui cara membuat aplikasi terkait location/map menggunakan GPS. 

## Langkah Praktikum

#

### 1. List the available sensors
#

1.1 Build the app

1. Create a new Android project. Call it SensorSurvey and use the Empty activity template.<br>
<img src="img/langkah1.png"><br><br>

2. Open res/layout/activity_main.xml.<br>

3. Add a margin of 16 dp to the constraint layout.<br>
<img src="img/langkah2.png"><br><br>

4. Delete the existing TextView. <br>
<img src="img/langkah3.png"><br><br>

5. Add a ScrollView element inside the constraint layout. Give it these attributes: <br>
<img src="img/langkah4.png"><br><br>

6. Add a TextView element inside the ScrollView and give it these attributes:<br>
<img src="img/langkah5.png"><br><br>

7. This TextView holds the list of sensors. The placeholder text is replaced at runtime by the actual sensor list. The layout for your app should look like this screenshot:<br>
<img src="img/langkah6.png"><br><br>

8. Open MainActivity and add a variable at the top of the class to hold an instance of SensorManager:<br>
<img src="img/langkah7.png"><br>
The sensor manager is a system service that lets you access the device sensors. 

9. In the onCreate() method, below the setContentView() method, get an instance of the sensor manager from system services, and assign it to the mSensorManager variable:<br>
<img src="img/langkah8.png"><br>

10. Get the list of all sensors from the sensor manager. Store the list in a List object whose values are of type Sensor:<br>
<img src="img/langkah9.png"><br>
The Sensor class represents an individual sensor and defines constants for the available sensor types. The Sensor.TYPE_ALL constant indicates all the available sensors. 

11. Iterate over the list of sensors. For each sensor, get that sensor's official name with the getName() method, and append that name to the sensorText string. Each line of the sensor list is separated by the value of the line.separator property, typically a newline character:<br>
<img src="img/langkah10.png"><br>

12. Get a reference to the TextView for the sensor list, and update the text of that view with the string containing the list of sensors:<br>
<img src="img/langkah11.png"><br>

#

1.2 Run the app on a device and in the emulator
1. Run the app on a physical device. The output of the app looks something like this screenshot:<br>
<img src="img/langkah13.png"><br>

2. Run the app in an emulator. The output of the app looks something like this screenshot:<br>
<img src="img/langkah12.png"><br>
Because the Android emulator is a simulated device, all the available sensors are virtual sensors. "Goldfish" is the name of the emulator's Linux kernel. 

3. Click the More button (three horizontal dots) on the emulator's control panel. The Extended Controls window appears.<br>

4. Click Virtual Sensors.<br>
<img src="img/langkah14.png"><br>
This window shows the settings and current values for the emulator's virtual sensors. Drag the image of the device to simulate motion and acceleration with the accelerometer. Dragging the device image may also rotate the main emulator window.

5. Click the Additional Sensors tab. <br>
<img src="img/langkah15.png"><br>
This tab shows the other available virtual sensors for the emulator, including the light, temperature, and proximity sensors. You use more of these sensors in the next task. 

#

### Task 2. Get sensor data
#

The Android sensor framework provides the ability for your app to register for and react to changes in sensor data. In this task you modify your existing app to listen to and report values from the proximity and light sensors.

    The light sensor measures ambient light in lux, a standard unit of illumination. The light sensor typically is used to automatically adjust screen brightness.
    The proximity sensor measures when the device is close to another object. The proximity sensor is often used to turn off touch events on a phone's screen when you answer a phone call, so that touching your phone to your face does not accidentally launch apps or otherwise interfere with the device's operation.

#

2.1 Modify the layout

1. Open res/layout/activity_main.xml.<br>

2. Delete the ScrollView and TextView elements from the previous app.<br>
<img src="img/langkah16.png"><br>

3. Add a TextView and give it the attributes in the following table. Extract the string into a resource called "label_light". This text view will print the current value from the light sensor.<br>
<img src="img/langkah17.png"><br>

Bagian "%1$.2f" dari string teks adalah kode placeholder. Kode ini akan diganti dalam kode Java untuk aplikasi Anda dengan placeholder yang diisi dengan nilai numerik yang sebenarnya. Dalam hal ini kode placeholder memiliki tiga bagian:

    %1: Penampung pertama. Anda dapat menyertakan beberapa placeholder dalam string yang sama dengan %2, %3, dan seterusnya.
    $.2: Format angka. Dalam hal ini, .2 menunjukkan bahwa nilai harus diformat dengan hanya dua digit setelah titik desimal.
    f: Menunjukkan bahwa nilai yang akan ditampilkan adalah angka floating-point. Gunakan s untuk nilai string dan d untuk nilai desimal.

Bagian dari string yang tidak terdiri dari placeholder ("Sensor Cahaya: ") dilewatkan ke string baru. Anda dapat mengetahui lebih lanjut tentang placeholder dan kode pemformatan di dokumentasi Formatter.

4. Copy and paste the TextView element. Change the attributes in the following table. Extract the string into a resource called "label_proximity". This text view will print values from the proximity sensor.<br>
<img src="img/langkah18.png"><br>

The layout for your app should look like this screenshot:<br>
<img src="img/langkah19.png"><br> 

5. Open res/values/strings.xml and add this line:<br>
<img src="img/langkah20.png"><br> 
You'll use this message in the next task when you test if a sensor is available. 

#

2.2 Get the sensors <br>
In this task, you modify the activity's onCreate() method to gain access to the light and proximity sensors. 

1. Open MainActivity and add private member variables at the top of the class to hold Sensor objects for the light and proximity sensors. Also add private member variables to hold the TextView objects from the layout:<br>
<img src="img/langkah21.png"><br> 

2. In the onCreate() method, delete all the existing code after the line to get the sensor manager. <br>

3. Add code to onCreate() to get the two TextView views and assign them to their respective variables:<br>
<img src="img/langkah22.png"><br> 

4. Get instances of the default light and proximity sensors. These will be instances of the Sensor class. Assign them to their respective variables:<br>
<img src="img/langkah23.png"><br> 
Metode getDefaultSensor() digunakan untuk query the sensor manager for sensors dari tipe tertentu. Jenis sensor ditentukan oleh kelas Sensor. Jika tidak ada sensor yang tersedia untuk tipe yang diberikan, metode getDefaultSensor() mengembalikan null.

5. Get the error string you defined earlier from the strings.xml resource:<br>
<img src="img/langkah24.png"><br> 

6. Test that there is an available light sensor. If the sensor is not available (that is, if getDefaultSensor() returned null), set the display text for the light sensor's TextView to the error string.<br>
<img src="img/langkah25.png"><br> 
Perangkat yang berbeda memiliki sensor yang berbeda, jadi penting bagi aplikasi Anda untuk memeriksa apakah ada sensor sebelum menggunakan sensor tersebut. Jika sensor tidak tersedia, aplikasi Anda harus menonaktifkan fitur yang menggunakan sensor tersebut dan memberikan informasi yang berguna kepada pengguna. Jika fungsionalitas aplikasi Anda bergantung pada sensor yang tidak tersedia, aplikasi Anda harus memberikan pesan dan berhenti dengan hati-hati. Jangan berasumsi bahwa perangkat apa pun akan memiliki sensor tertentu.

7. Test for the existence of the proximity sensor.<br>
<img src="img/langkah26.png"><br> 

#
2.3 Listen for new sensor data

1. At the top of the class, modify the class signature to implement the SensorEventListener interface.<br>
<img src="img/langkah27.png"><br> 

2. Click the red light bulb icon, select "implement methods," and select all methods. <br>
<img src="img/langkah28.png"><br> 

The SensorEventListener interface includes two callback methods that enable your app to handle sensor events:

    onSensorChanged(): Called when new sensor data is available. You will use this callback most often to handle new sensor data in your app.
    onAccuracyChanged(): Called if the sensor's accuracy changes, so your app can react to that change. Most sensors, including the light and proximity sensors, do not report accuracy changes. In this app, you leave onAccuracyChanged() empty.

3. Ganti metode siklus hidup aktivitas onStart() untuk mendaftarkan pendengar sensor Anda. Mendengarkan data sensor yang masuk menggunakan daya perangkat dan menghabiskan masa pakai baterai. Jangan daftarkan listener Anda di onCreate(), karena itu akan menyebabkan sensor menyala dan mengirim data (menggunakan daya perangkat) bahkan saat aplikasi Anda tidak berada di latar depan. Gunakan metode onStart() dan onStop() untuk mendaftarkan dan membatalkan pendaftaran pendengar sensor Anda.<br>
<img src="img/langkah29.png"><br> 
<b>Note:</b> The onStart() and onStop() methods are preferred over onResume() and onPause() to register and unregister listeners. As of Android 7.0 (API 24), apps can run in multi-window mode (split-screen or picture-in-picture mode). Apps running in this mode are paused, but still visible on screen. Use onStart() and onStop() to ensure that sensors continue running even if the app is in multi-window mode. 

4. Implement the onStop() lifecycle method to unregister your sensor listeners when the app pauses:<br>
<img src="img/langkah30.png"><br> 

5. In the onSensorChanged() method, get the sensor type.<br>
<img src="img/langkah31.png"><br> 

6. Also in onSensorChanged(), get the sensor value.<br>
<img src="img/langkah31.png"><br> 

7. Add a switch statement for the sensorType variable. Add a case for Sensor.TYPE_LIGHT to indicate that the event was triggered by the light sensor.<br>
<img src="img/langkah32.png"><br> 

8. Inside the light sensor case, get the template string from the resources, and update the value in the light sensor's TextView.<br>
<img src="img/langkah33.png"><br> 

9. Add a second case for the proximity sensor (Sensor.TYPE_PROXIMITY).<br>
<img src="img/langkah34.png"><br> 

#

2.4 Run the app on a device and in the emulator

1. 

#

3.2: Working with sensor-based orientation

#

Task 1. Build the TiltSpot app

1.1 Download and explore the starter app

1. Download the TiltSpot_start app and open it in Android Studio.
2. Open res/layout/activity_main.xml.
3. Open MainActivity. 

