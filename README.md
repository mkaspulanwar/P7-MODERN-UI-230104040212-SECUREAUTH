# 📱 Praktikum Mobile Programming #7: Menerapkan Desain UI Modern (P7ModernUi)

Repositori ini berisi implementasi praktikum Mobile Programming Modul #7 yang berfokus pada penerapan **Desain UI Modern** pada aplikasi Android menggunakan **Jetpack Compose** dan **Material Design 3 (MD3)**, termasuk fitur keamanan **Biometric Authentication (App Lock)**.

## 🚀 Fitur Utama & Hasil Praktikum

Proyek ini berhasil mengimplementasikan beberapa konsep inti Desain UI Modern:

* **🎨 Material Design 3 (MD3):** Penerapan sistem desain terbaru Android untuk antarmuka yang intuitif dan adaptif.
* **🌈 Dynamic Color:** Aplikasi mampu menyesuaikan skema warna (Primary, Secondary, Tertiary, dll.) secara otomatis berdasarkan *wallpaper* pengguna (pada Android 12+).
* **🌗 Dark Mode/Light Mode:** Implementasi tema gelap dan terang yang diatur melalui *Settings Screen* atau preferensi sistem.
* **🔒 App Lock (Biometric Auth):** Menambahkan lapisan keamanan menggunakan **Biometric Authentication** (Fingerprint/Face Unlock) untuk melindungi akses ke aplikasi.
* **📐 Komponen MD3:** Penggunaan komponen modern seperti `Button`, `Card`, `TextField`, dan `TopAppBar` dari pustaka Material 3 di Jetpack Compose.

---

## ✔️ Tujuan Praktikum

Berikut adalah poin-poin tujuan yang telah dicapai dalam praktikum ini:

1.  Menjelaskan dan menerapkan **prinsip desain UI modern** sesuai **Material Design 3**.
2.  Mengimplementasikan **Color Scheme, Typography, dan Shape** pada aplikasi Android.
3.  Membuat file *theme* dan *style* yang **modular, *reusable***, dan **konsisten**.
4.  Menerapkan **komponen Material 3** (`Button`, `Card`, `TextField`, `AppBar`).
5.  Menggunakan **Dynamic Color** & **Custom Color Palette**.
6.  Menerapkan **Dark Mode** dan **Light Mode** secara benar.
7.  Melakukan **UI refinement** agar aplikasi tampil profesional.

---

## 📘 Konsep Dasar yang Diimplementasikan

Praktikum ini berlandaskan pada konsep-konsep inti dalam pengembangan UI/UX modern Android:

### 1. Material Design 3 (MD3)
Pembaruan dari Material Design yang membawa estetika baru dengan penekanan pada:
* **Dynamic Color:** Skema warna adaptif.
* **Smooth Corner Shape:** Penggunaan sudut membulat yang lebih halus.
* **Motion & Elevation:** Animasi dan kedalaman yang ditingkatkan.
* **Accessibility:** Kontras dan skala yang lebih baik.

### 2. Theme
*Theme* adalah fondasi visual aplikasi yang mengatur tampilan global dari semua komponen UI.
* **ColorScheme:** Set warna aplikasi (Primary, Secondary, Background, dll.).
* **Typography:** Setelan untuk teks (Font Family, Weight, Size).
* **Shape:** Bentuk dan sudut untuk berbagai komponen.

### 3. Style (di Jetpack Compose)
Dalam Compose, *style* diwujudkan dalam bentuk:
* **Modifier Reusable:** Rantai `Modifier` yang dapat digunakan ulang di banyak komponen.
* **Component Styling:** Pengaturan parameter spesifik pada komponen (misalnya `ButtonDefaults`, `TextStyle`).

### 4. Design System
*Design System* memastikan konsistensi visual di seluruh aplikasi dengan menyediakan *satu sumber kebenaran* untuk:
* Warna dan Komponen
* Layout dan Spacing
* Icon

---

## 🛠️ Tools & Teknologi

* **Bahasa Pemrograman:** Kotlin
* **Framework UI:** Jetpack Compose
* **Design System:** Material Design 3 (MD3)
* **IDE:** Android Studio
* **Fitur Keamanan:** Biometric Library

## ⚙️ Cara Menjalankan Proyek

1.  **Clone** repositori ini:
    ```bash
    git clone [https://www.andarepository.com/](https://www.andarepository.com/)
    ```
2.  Buka proyek di **Android Studio**.
3.  Pastikan *device/emulator* yang digunakan mendukung **Biometric Authentication (Fingerprint/Face Unlock)** untuk menguji fitur App Lock.
4.  Jalankan aplikasi pada *device* atau *emulator* (Target SDK 31+ disarankan untuk Dynamic Color).

---

## 📸 Tampilan Aplikasi



*(Ganti tag ini dengan gambar tangkapan layar (screenshot) aplikasi Anda)*
