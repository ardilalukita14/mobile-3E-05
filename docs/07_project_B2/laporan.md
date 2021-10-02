# 01 - B2 Java-AdvancedWidgetsJavaEdition-forAndroidStudio4.x

## Tujuan Pembelajaran

### 1. Mahasiswa akan memulai proyek untuk membuat aplikasi Android game sederhana. Pertama dengan konfigurasi proyek dan konfigurasi resource.
### 2. Mahasiswa mengetahui tentang style, theme, dan drawable vector image.
### 3. Mahasiswa akan membuat UI untuk proyek Color Game dengan beberapa atribut onClick.
### 4. Mahasiswa akan mendeklarasikan field yang dibutuhkan oleh aplikasi dan menentukan method untuk memeriksa validitas saat memasuki permainan.
### 5. Mahasiswa mengetahui bagaimana cara kerja dari Countdowntimer.
### 6. Mahasiswa akan memahami bagaimana mengakses array dari resource dan memasukkannya ke dalam List dan Hashtable.
### 7. Mahasiswa akan memahami bagaimana memulai timer dalam sebuah permainan.
### 8. Mahasiswa akan memahami bagaimana cara menghandle waktu dan menghitung skor.

## Hasil Praktikum

#

###    Untuk praktikum project B1 Basic Activity Java Edition 4.x ini sendiri akan ada 8 tahapan, yang mana masing - masing tahapan akan ada output tersendiri. Adapaun output - output tersebut ialah :
#

### 1. Define color, string, and integer resources
Berikut ini adalah bukti bahwa telah berhasil menyelesaikan Praktikum 1 - Define color, string, and integer resources dengan menggunakan android studio. <br>
Langkah Praktikum :
1. Pertama, kita buat project baru bernama ColorGameX. <br>
 <img src="img/langkah1.png"><br><br>
2. Kemudian kita tambahkan beberapa colors ke dalam file color.xml<br>
 <img src="img/langkah2.png"><br><br>

3. Selanjutnya, kita juga deklarasikan strings di dalam file string.xml, seperti berikut. <br>
 <img src="img/langkah3.png"><br><br>

4. Menambahkan kode program ke dalam file themes.xml sesuai dengan perintah di Guide. <br>
 <img src="img/langkah4.png"><br><br>

5. Kemudian, kita buat file MyActivity di dalam folder org.aplase.colorgame dengan detail konfigurasi seperti berikut. <br><br>
 <img src="img/langkah5.png"><br><br>

6. Selanjutnya, kita buka AndroidManifest.xml dan kemudian kita coba sesuaikan konfigurasinya dengan Guide yang ada. <br>
 <img src="img/langkah6.png"><br><br>

7. Merubah isian file build.graddle (Module: app) menjadi seperti berikut.<br>
 <img src="img/langkah7.png"><br>
<img src="img/langkah8.png"><br><br>

8. Terakhir, kita inputkan file “TestB1BasicActivityX011.java”, “TestB1BasicActivityX012.java”, “ElementTest.java”, “ResourceTest.java” dan “ViewTest.java” ke dalam folder “org.aplas.colorgamex (test)”. Lalu, kita coba eksekusi / running file “TestB1BasicActivityX011.java” dan “TestB1BasicActivityX011.java”.<br>

#
### Hasil Bagian 1 <br><br>
<img src="img/hasilB2_1.png"><br><br>

#

### 2. Define theme, style, and drawable resources
Berikut ini adalah bukti bahwa telah berhasil menyelesaikan Praktikum 2 - Define theme, style, and drawable resources dengan menggunakan android studio. <br>
Langkah Praktikum :
1. Pertama, kita copy file <b>“ic_resicon.xml</b> yang sudah disediakan ke dalam folderd drawable. <br>

2. Selanjutnya kita buat round button di dalam drawable, lalu kita inputkan kode ke dalamnya, seperti berikut. <br>
 <img src="img/langkah9.png"><br><br>

3. Di dalam file round_btn.xml tepatnya di tag shape, kita coba tambahkan kode - kode berikut. <br>
 <img src="img/langkah10.png"> <br><br>
 Maka, akan diperoleh hasil seperti berikut :<br>
 <img src="img/hasil.png"> <br><br>

4. Kemudian, kita tambahkan style baru bernama <b>ColoredButton</b> di dalam file themes.xml tanpa parent. <br>
 <img src="img/langkah11.png"><br><br>

5. Selanjutnya, kita juga tambahkan style baru di dalam file yang sama dengan nama “ProgressBar” dengan parent "@android:style/Widget.SeekBar".<br>
 <img src="img/langkah12.png"><br><br>

7. Terakhir, kita inputkan file “ElementTest.java, ResourceTest.java, ViewTest.java, TestB2AdvancedWidgetsX021.java ke dalam folder “org.aplas.colorgamex (test)”. Lalu, kita coba eksekusi / running file “TestB1BasicActivityX021.java”.<br>
#
### Hasil Bagian 2 <br><br>
<img src="img/hasilB2_2.png">

#

### 3. Completing the layout (UI)
Berikut ini adalah bukti bahwa telah berhasil menyelesaikan Praktikum 3 - Completing the layout (UI) dengan menggunakan android studio. <br>
Langkah Praktikum :
1. Pertama, kita buka file <b>activity_layout.xml</b>, lalu kita tambahkan beberapa kode program seperti berikut :<br>
   a) <br>
   <img src="img/langkah13.png"><br><br>
   b) <br>
   <img src="img/langkah14.png"><br><br>
   c)<br>
   <img src="img/langkah15.png"><br><br>
   d) <br>
   <img src="img/langkah16.png"><br><br>
   e)<br>
   <img src="img/langkah17.png"><br><br>
   f)<br>
   <img src="img/langkah18.png"><br><br>
   g)<br>
   <img src="img/langkah19.png"><br><br>
   h)<br>
   <img src="img/langkah20.png"><br><br>
   i)<br>
   <img src="img/langkah21.png"><br><br>

2. Kita coba tambahkan 3 method ke dalam file “MyActivity.java”, diantaranya method openGame, startGame, SubmitColor.
3. Terakhir, kita inputkan file “TestB2AdvancedWidgetsX031.java” ke dalam folder “org.aplas.colorgamex (test)”. Lalu, kita coba eksekusi / running file “TestB2AdvancedWidgetsX031.java”.<br>

#
### Hasil Bagian 3 <br><br>
a) Hasil 1
<img src="img/hasilB2_3.png">
b) <br>
<img src="img/hasil1.png">

#

### 4.Create validation method
Berikut ini adalah bukti bahwa telah berhasil menyelesaikan Praktikum 4 - Create validation method dengan menggunakan android studio. <br>
Langkah Praktikum :
1. Untuk praktikum ke-4 kali ini kita akan berfokus pada file MyActivity.xml. Dimana kita akan mencoba memasukkan beberapa kode program ke dalam file MyActivity.xml. Adapun detailnya adalah seperti berikut.
<img src="img/langkah22.png"><br>
<img src="img/langkah23.png"><br><br>

2. Selanjutnya, kita inputkan “TestB2AdvancedWidgetsX041.java” ke dalam folder “org.aplas.colorgamex (test)”. Lalu, kita coba eksekusi / running file “TestB2AdvancedWidgetsX041.java”.<br>

#
### Hasil Bagian 4 <br><br>
<img src="img/hasilB2_4.png">

#

### 5. Create method to start CountDownTimer
Berikut ini adalah bukti bahwa telah berhasil menyelesaikan Praktikum 5 - Create method to start CountDownTimer dengan menggunakan android studio. <br>
Langkah Praktikum :
1. Pertama, kita buka file MainActivity.java, kemudian kita coba tambahkan kode program berikut :
<img src="img/langkah27.png"><br>
<img src="img/langkah28.png"><br>
<img src="img/langkah29.png"><br>
<img src="img/langkah30.png"><br>

2. Terakhir, kita inputkan file “TestB1BasicActivityX061.java” ke dalam folder “org.aplas.colorgamex (test)”. Lalu, kita coba eksekusi / running file “TestB1BasicActivityX061.java”<br><br>

#
### Hasil Bagian 5 <br><br>
<img src="img/hasilB2_6.png">

#

### 6. Create method to load color data to List and Hashtable
Berikut ini adalah bukti bahwa telah berhasil menyelesaikan Praktikum 6 - Create method to load color data to List and Hashtable dengan menggunakan android studio. <br>
Langkah Praktikum :
1.Pertama, kita buka file MainActivity.java, kemudian kita coba tambahkan kode program berikut :
<img src="img/langkah24.png"><br>
<img src="img/langkah25.png"><br>
<img src="img/langkah26.png"><br>

2. Terakhir, kita inputkan file “TestB1BasicActivityX051.java” ke dalam folder “org.aplas.colorgamex (test)”. Lalu, kita coba eksekusi / running file “TestB1BasicActivityX051.java”<br><br>

#
### Hasil Bagian 6 <br><br>
<img src="img/hasilb2_6.png">

#

### 7.Create method to start game
Berikut ini adalah bukti bahwa telah berhasil menyelesaikan Praktikum 7 - Create method to start game dengan menggunakan android studio. <br>
Langkah Praktikum :
1. Pertama, kita buka file MainActivity.java, kemudian kita coba tambahkan kode program berikut :
<img src="img/langkah31.png"><br>
<img src="img/langkah32.png"><br>
<img src="img/langkah33.png"><br>
<img src="img/langkah34.png"><br>
<img src="img/langkah35.png"><br>

2. Terakhir, kita inputkan file “TestB1BasicActivityX071.java” ke dalam folder “org.aplas.colorgamex (test)”. Lalu, kita coba eksekusi / running file “TestB1BasicActivityX071.java”<br><br>


#
### Hasil Bagian 7 <br><br>
<img src="img/hasilB2_7.png">

#

### 8. Create Widget event listener
Berikut ini adalah bukti bahwa telah berhasil menyelesaikan Praktikum 7 - Create method to start game dengan menggunakan android studio. <br>
Langkah Praktikum :
1. Pertama, kita buka file MainActivity.java, kemudian kita coba tambahkan kode program berikut :
<img src="img/langkah36.png"><br>
<img src="img/langkah37.png"><br>
<img src="img/langkah38.png"><br>
<img src="img/langkah39.png"><br>
<img src="img/langkah40.png"><br>
<img src="img/langkah41.png"><br>

2. Terakhir kita inputkan file “TestB1BasicActivityX081.java” ke dalam folder “org.aplas.colorgamex (test)”. Lalu, kita coba eksekusi / running file “TestB1BasicActivityX081.java”<br><br>

#
### Hasil Bagian 8 <br><br>
<img src="img/hasilB2_8.png">

#

## -   [Link Kode Program Layout](../../src/project/03_projectB2/app/src/main/res/layout/activity_layout.xml)
## -   [Link Kode Program String](../../src/project/03_projectB2/app/src/main/res/values/strings.xml)
## -   [Link Kode Program Color](../../src/project/03_projectB2/app/src/main/res/values/colors.xml)
## -   [Link Kode Program MyActivity](../../src/project/03_projectB2/app/src/main/java/org/aplas/colorgamex/MyActivity.java)
## -   [Link Kode Program Android Manifest](../../src/project/03_projectB2/app/src/main/AndroidManifest.xml)
## -   [Link Kode Program Build Gradle](../../src/project/03_projectB2/app/build.gradle)
## -   [Link Kode Program Round Button](../../src/project/03_projectB2/app/src/main/res/drawable/round_btn.xml)

D:\PROJECT\FILE GITHUB CLOUD & MOBILE\mobile-3E-05\src\project\03_projectB2\app\src\main\res\layout