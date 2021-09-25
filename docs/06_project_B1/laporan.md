# 01 - B1:Java - Basic Activity Java Edition - for Android Studio 4.x

## Tujuan Pembelajaran

### 1. Mahasiswa mengetahui bagaimana cara membuat kelas suhu beserta cara mengkonversi satuannya.
### 2. Mahasiswa mengetahui bagaimana cara membuat kelas jarak beserta cara mengkonversi satuannya.
### 3. Mahasiswa mengetahui bagaimana cara membuat kelas berat beserta cara mengkonversi satuannya.
### 4. Mahasiswa mengetahui bagaimana cara membuat fields and methods di dalam main activity class.
### 5. Mahasiswa mengetahui activity lifecycle ketika on Create dan on Start.
### 6. Mahasiswa mengetahui tentang RadioGroup changed event dan bagaimana cara mengubah Spinner content.
### 7. Mahasiswa mengetahui bagaimana cara membuat sebuah method to do conversion.
### 8. Mahasiswa mengetahui bagaimana cara membuat events action untuk Button, Spinner, and CheckBox
### 9. Mahasiswa mengetahui bagaimana cara membuat new image element dan mengisinya saat formula checkbox checked.

## Hasil Praktikum

#

###    Untuk praktikum project B1 Basic Activity Java Edition 4.x ini sendiri akan ada 9 tahapan, yang mana masing - masing tahapan akan ada output tersendiri. Adapaun output - output tersebut ialah :
#

### 1. Make Temperature Class
Berikut ini adalah bukti bahwa telah berhasil menyelesaikan Praktikum 1 - Make Temperature Class dengan menggunakan android studio. <br>
Langkah Praktikum :
1. Pertama, kita hapus terlebih dahulu semua file yang ada di dalam folder “org.aplas.basicappx (test)”. <br>
2. Kemudian kita buat java class bernama <b>Temperature</b> di dalam folder yang sama dengan <b>MainActivity</b> <br><br>
 <img src="img/langkah1.png">

3. Selanjutnya, kita buat attribute private bernama celcius dengan tipe data double. <br><br>
 <img src="img/langkah2.png">

4. Membuat konstruktor dengan parameter kosong. Konstruktor ini akan memulai "celcius" field dengan nilai 0. <br><br>
 <img src="img/langkah3.png">

5. Kemudian, kita buat tiga set method untuk menetapkan "celcius" field, seperti di bawah ini. <br><br>
 <img src="img/langkah4.png">

6. Selanjutnya, kita buat tiga get method (fungsi) untuk mengembalikan nilai bertipe double dari proses konversi "celcius" field, seperti di bawah ini. <br><br>
 <img src="img/langkah5.png">

7. Kita buat method(fungsi) baru lagi untuk proses konversi satuan suhu. <br><br>
 <img src="img/langkah6.png">

8. Terakhir, kita inputkan file “TestB1BasicActivityX011.java” dan “ViewTest.java” ke dalam folder “org.aplas.basicappx (test)”. Lalu, kita coba eksekusi / running file “TestB1BasicActivityX011.java”<br><br>
<img src="img/langkah7.png">
#
### Hasil Bagian 1 <br><br>
<img src="img/hasil1.png">

#

### 2. Make Distance Class
Berikut ini adalah bukti bahwa telah berhasil menyelesaikan Praktikum 2 - Make Distance Class dengan menggunakan android studio. <br>
Langkah Praktikum :
1. Pertama, kita buat java class bernama <b>Distance</b> di dalam folder yang sama dengan <b>MainActivity</b>. <br><br>
 <img src="img/langkah8.png">

2. Selanjutnya, kita buat attribute private bernama meter dengan tipe data double. <br><br>
 <img src="img/langkah9.png">

3. Membuat konstruktor dengan parameter kosong. Konstruktor ini akan memulai "meter" field dengan nilai 0. <br><br>
 <img src="img/langkah10.png">

4. Kemudian, kita buat tiga set method untuk menetapkan "meter" field, seperti di bawah ini. <br><br>
 <img src="img/langkah11.png">

5. Selanjutnya, kita buat tiga get method (fungsi) untuk mengembalikan nilai bertipe double dari proses konversi "meter" field, seperti di bawah ini. <br><br>
 <img src="img/langkah12.png">

6. Kita buat method(fungsi) baru lagi untuk proses konversi satuan jarak. <br><br>
 <img src="img/langkah13.png"> <br>
 <img src="img/langkah14.png">

7. Terakhir, kita inputkan file “TestB1BasicActivityX021.java” ke dalam folder “org.aplas.basicappx (test)”. Lalu, kita coba eksekusi / running file “TestB1BasicActivityX021.java”<br><br>
<img src="img/langkah15.png">
#
### Hasil Bagian 2 <br><br>
<img src="img/hasil2.png">

#

### 3. Make Weight Class
Berikut ini adalah bukti bahwa telah berhasil menyelesaikan Praktikum 3 - Make Weight Class dengan menggunakan android studio. <br>
Langkah Praktikum :
1. Pertama, kita buat java class bernama <b>Weight</b> di dalam folder yang sama dengan <b>MainActivity</b>. <br><br>
 <img src="img/langkah16.png">

2. Selanjutnya, kita buat attribute private bernama gram dengan tipe data double. <br><br>
 <img src="img/langkah17.png">

3. Membuat konstruktor dengan parameter kosong. Konstruktor ini akan memulai "gram" field dengan nilai 0. <br><br>
 <img src="img/langkah18.png">

4. Kemudian, kita buat tiga set method untuk menetapkan "gram" field, seperti di bawah ini. <br><br>
 <img src="img/langkah19.png">

5. Selanjutnya, kita buat tiga get method (fungsi) untuk mengembalikan nilai bertipe double dari proses konversi "gram" field, seperti di bawah ini. <br><br>
 <img src="img/langkah20.png">

6. Kita buat method(fungsi) baru lagi untuk proses konversi satuan berat. <br><br>
 <img src="img/langkah21.png"> 

7. Terakhir, kita inputkan file “TestB1BasicActivityX031.java” ke dalam folder “org.aplas.basicappx (test)”. Lalu, kita coba eksekusi / running file “TestB1BasicActivityX031.java”<br><br>
<img src="img/langkah22.png">

#
### Hasil Bagian 3 <br><br>
<img src="img/hasil2.png">

#

### 4. Define fields and methods in Activity
Berikut ini adalah bukti bahwa telah berhasil menyelesaikan Praktikum 4 - Define fields and methods in Activity dengan menggunakan android studio. <br>
Langkah Praktikum :
1. Pertama, kita buat beberapa deskripsi fields ke dalam file <b>MainActivity</b>.<br><br>
 <img src="img/langkah23.png">

2. Membuat 2 blank methods dengan spesifikasi seperti berikut. Lalu, kita berikan kondisi - kondisi sesuai dengan perintah yang ada.  <br><br>
 <img src="img/langkah24.png"> <br>
<img src="img/langkah25.png"> 

3. Terakhir, kita inputkan file “TestB1BasicActivityX041.java” ke dalam folder “org.aplas.basicappx (test)”. Lalu, kita coba eksekusi / running file “TestB1BasicActivityX041.java”<br><br>
<img src="img/langkah26.png">

#
### Hasil Bagian 4 <br><br>
<img src="img/hasil4.png">

#

### 5. Make Override method in Activity
Berikut ini adalah bukti bahwa telah berhasil menyelesaikan Praktikum 5 - Make Override method in Activity dengan menggunakan android studio. <br>
Langkah Praktikum :
1. Pertama, kita buka file MainActivity.java, kemudian kita coba tambahkan kode program berikut ke dalam method “onCreate” yang sudah ada sebelumnya. <br><br>
 <img src="img/langkah27.png">

2. Selanjutnya, kita buat method “onStart” di bawah method “onCreate”. Lalu, kita definisikan method tersebut dengan menggunakan kode - kode program berikut. <br><br>
 <img src="img/langkah28.png">

3. Terakhir, kita inputkan file “TestB1BasicActivityX051.java” ke dalam folder “org.aplas.basicappx (test)”. Lalu, kita coba eksekusi / running file “TestB1BasicActivityX051.java”<br><br>
<img src="img/langkah29.png">

#
### Hasil Bagian 5 <br><br>
<img src="img/hasil5.png">

#

### 6. Create RadioGroup event
Berikut ini adalah bukti bahwa telah berhasil menyelesaikan Praktikum 6 - Create RadioGroup event dengan menggunakan android studio. <br>
Langkah Praktikum :
1. Pertama, kita buka file string.xml, kemudian kita coba tambahkan beberapa item di dalam tag string-array, seperti dibawah ini. <br><br>
 <img src="img/langkah30.png">

2. Selanjutnya, kita tambahkan file “distance.png” dan “weight.png” yang ada di folder Supplement ke dalam folder “drawable”. <br><br>

3. Kemudian, buka file MainActivity.java dan buat sebuah event ketika "unitType" Radiogroup di dalam metode "onCreate". Selain itu, di langkah ketiga ini kita juga buat beberapa kondisi case di dalam method "onCreate".
<img src="img/langkah31.png"> <br>
<img src="img/langkah32.png">

4. Terakhir, kita inputkan file “ElementTest.java”, “TestB1BasicActivityX061.java, dan “TestB1BasicActivityX062.java” ke dalam folder “org.aplas.basicappx (test)”. Lalu, kita coba eksekusi / running file “TestB1BasicActivityX061.java”<br><br>
<img src="img/langkah33.png">

#
### Hasil Bagian 6 <br><br>
<img src="img/hasil6a_6b.png">

#

### 7. Make method to convert units
Berikut ini adalah bukti bahwa telah berhasil menyelesaikan Praktikum 7 - Make method to convert units dengan menggunakan android studio. <br>
Langkah Praktikum :
1. Pertama, kita buka file MainActivity.java dan kita coba tambahkan method "doConvert". <br>

2. Selanjutnya, kita tambahkan beberapa syntax ke dalam method "doConvert", seperti berikut ini. Yang mana untuk syntax itu sendiri kita buat dengan berpacu pada perintah yang ada di dalam GuideDocuments. <br><br>
<img src="img/langkah34.png">

3. Terakhir, kita inputkan file “TestB1BasicActivityX071.java” ke dalam folder “org.aplas.basicappx (test)”. Lalu, kita coba eksekusi / running file “TestB1BasicActivityX071.java”<br><br>
<img src="img/langkah35.png">

#
### Hasil Bagian 7 <br><br>
<img src="img/hasil7.png">

#

### 8. Create Widget event listener
Berikut ini adalah bukti bahwa telah berhasil menyelesaikan Praktikum 8 - Create Widget event listener dengan menggunakan android studio. <br>
Langkah Praktikum :
1. Pertama, kita tambahkan event listener untuk membantu mendeteksi event ketika “convertButton”di klik. Untuk bagian ini sendiri kita letakkan di bawah “unitType.setOnCheckedChangeListener” yang ada sudah kita tambahkan di dalam MainActivity.java sebelumnya. <br><br>
<img src="img/langkah36.png">

2. Selanjutnya, kita tambahkan event listener untuk membantu mendeteksi event ketika “oriList” di klik.  <br><br>
<img src="img/langkah37.png">

3. Kemudian, kita coba tambahkan kembali  event listener untuk membantu mendeteksi event ketika “convList” di klik.  <br><br>
<img src="img/langkah38.png">

4. Tambahkan kembali  event listener untuk membantu mendeteksi event ketika “roundBox” di klik.  <br><br>
<img src="img/langkah39.png">

5. Terakhir kita inputkan file “TestB1BasicActivityX081.java” ke dalam folder “org.aplas.basicappx (test)”. Lalu, kita coba eksekusi / running file “TestB1BasicActivityX081.java”<br><br>
<img src="img/langkah40.png">

#
### Hasil Bagian 8 <br><br>
<img src="img/hasil8.png">

#

### 9. Create ImageView and event
Berikut ini adalah bukti bahwa telah berhasil menyelesaikan Praktikum 9 - Create ImageView and event dengan menggunakan android studio. <br>
Langkah Praktikum :
1. Pertama, kita copy file “formula.png” yang ada di folder Supplement ke dalam folder “drawable”.<br>

2. Selanjutnya, di dalam activity_layout.xml tepatnya di bawah TableLayout, kita buat sebuah ImageView dengan id “imgFormula”.  <br><br>
<img src="img/langkah41.png">

3. Kemudian, kita coba tambahkan juga event listener untuk membantu mendeteksi event ketika “formBox” di klik.  <br><br>
<img src="img/langkah42.png">

4. Terakhir kita inputkan file “TestB1BasicActivityX091.java” dan “TestB1BasicActivityX092.java” ke dalam folder “org.aplas.basicappx (test)”. Lalu, kita coba eksekusi / running file “TestB1BasicActivityX081.java”<br><br>
<img src="img/langkah43.png">

#
### Hasil Bagian 9 <br><br>
<img src="img/hasil9a_9b.png">

#


## -   [Link Kode Program Layout](../../src/project/02_projectB1/app/src/main/res/layout/activity_main.xml)
## -   [Link Kode Program String](../../src/project/02_projectB1/app/src/main/res/values/strings.xml)
## -   [Link Kode Program Distance](../../src/project/02_projectB1/app/src/main/java/org/aplas/basicappx/Distance.java)
## -   [Link Kode Program Temperature](../../src/project/02_projectB1/app/src/main/java/org/aplas/basicappx/Temperature.java)
## -   [Link Kode Program Weight](../../src/project/02_projectB1/app/src/main/java/org/aplas/basicappx/Weight.java)
## -   [Link Kode Program MainActivity](../../src/project/02_projectB1/app/src/main/java/org/aplas/basicappx/MainActivity.java)