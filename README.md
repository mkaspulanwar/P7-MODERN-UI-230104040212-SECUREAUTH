# PRAKTIKUM #7+ : MENERAPKAN DESAIN UI MODERN (P7ModernUi + SecureAuth)

<p align="center">
  <img src="https://img.shields.io/badge/Language-Kotlin-7F52FF?style=flat-square&logo=kotlin&logoColor=white" alt="Kotlin">
  <img src="https://img.shields.io/badge/UI%20Framework-Jetpack%20Compose-4285F4?style=flat-square&logo=jetpack-compose&logoColor=white" alt="Jetpack Compose">
  <img src="https://img.shields.io/badge/Design%20System-Material%203%20(MD3)-6200EE?style=flat-square&logo=material-design&logoColor=white" alt="Material Design 3">
  <img src="https://img.shields.io/badge/IDE-Android%20Studio-3DDC84?style=flat-square&logo=android-studio&logoColor=white" alt="Android Studio">
  <img src="https://img.shields.io/badge/Security-Biometric%20Auth-03DAC5?style=flat-square&logo=keybase&logoColor=white" alt="Biometric Auth">
</p>

Repositori ini berisi implementasi praktikum Mobile Programming Modul #7 yang berfokus pada penerapan **Desain UI Modern** pada aplikasi Android menggunakan **Jetpack Compose** dan **Material Design 3 (MD3)**, termasuk fitur keamanan **Biometric Authentication (App Lock)**.

## Fitur Utama & Hasil Praktikum

Proyek ini berhasil mengimplementasikan beberapa konsep inti Desain UI Modern:

* **Material Design 3 (MD3):** Penerapan sistem desain terbaru Android untuk antarmuka yang intuitif dan adaptif.
* **Dynamic Color:** Aplikasi mampu menyesuaikan skema warna (Primary, Secondary, Tertiary, dll.) secara otomatis berdasarkan *wallpaper* pengguna (pada Android 12+).
* **Dark Mode/Light Mode:** Implementasi tema gelap dan terang yang diatur melalui *Settings Screen* atau preferensi sistem.
* **App Lock (Biometric Auth):** Menambahkan lapisan keamanan menggunakan **Biometric Authentication** (Fingerprint/Face Unlock) untuk melindungi akses ke aplikasi.
* **Komponen MD3:** Penggunaan komponen modern seperti `Button`, `Card`, `TextField`, dan `TopAppBar` dari pustaka Material 3 di Jetpack Compose.

---

## Tujuan Praktikum

Berikut adalah poin-poin tujuan yang telah dicapai dalam praktikum ini:

1.  Menjelaskan dan menerapkan **prinsip desain UI modern** sesuai **Material Design 3**.
2.  Mengimplementasikan **Color Scheme, Typography, dan Shape** pada aplikasi Android.
3.  Membuat file *theme* dan *style* yang **modular, *reusable***, dan **konsisten**.
4.  Menerapkan **komponen Material 3** (`Button`, `Card`, `TextField`, `AppBar`).
5.  Menggunakan **Dynamic Color** & **Custom Color Palette**.
6.  Menerapkan **Dark Mode** dan **Light Mode** secara benar.
7.  Melakukan **UI refinement** agar aplikasi tampil profesional.

---

## 🗂️ Struktur Direktori Proyek
Proyek ini menggunakan struktur paket yang terorganisir, memisahkan logika utama (aplikasi entry point dan lifecycle) dari arsitektur UI (screens, components, theme, dan viewmodels).

```bash
id.antasari.p7_modern_ui_230104040212
├── ui                                  # Folder Utama: Struktur Tampilan dan Logika UI (ViewModel)
│   ├── screens                         # Layar Utama Aplikasi (Pages/Destinations Composable)
│   │   ├── LoginScreen.kt
│   │   ├── CreateAccountScreen.kt
│   │   ├── HomeScreen.kt
│   │   ├── SecurityDetailsScreen.kt
│   │   └── SettingsScreen.kt           # Layar untuk mengatur Theme dan Biometric Auth
│   ├── auth
│   │   └── AuthViewModel.kt            # Logic pusat (State Management untuk Auth, App Lock, Theme)
│   ├── components                      # Komponen UI yang Dapat Digunakan Ulang (Reusable Components)
│   │   ├── AppButton.kt
│   │   ├── AppCard.kt
│   │   ├── AppTextField.kt
│   │   └── ...                         # (Komponen MD3 custom lainnya)
│   ├── navigation
│   │   └── AppNavHost.kt               # Definisi Rute Navigasi (Navigation Graph)
│   └── theme                           # Implementasi Material Design 3 (Design System)
│       ├── Color.kt                    # Palet Warna, Dynamic Color Scheme, & Custom Color
│       ├── Shape.kt                    # Bentuk Sudut Komponen
│       ├── Type.kt                     # Konfigurasi Tipografi
│       └── Theme.kt                    # Konfigurasi Tema Global (P7ModernUiTheme)
├── MainActivity.kt               // [1] Entry point & App Lifecycle (Mengelola App Lock)
├── SecureAuthApp.kt              // [2] Root Composable & Global Dependencies
├── AccountStorage.kt             // [3] Handler untuk Local Data Persistence (Shared Preferences)
├── BiometricUtils.kt             // [4] Helper untuk cek ketersediaan sensor Biometrik
├── LoginScreen.kt                // [5] Screen: Halaman Otentikasi/Masuk
├── CreateAccountScreen.kt        // [6] Screen: Halaman Pendaftaran Akun
├── HomeScreen.kt                 // [7] Screen: Halaman Utama Aplikasi
├── SecurityDetailsScreen.kt      // [8] Screen: Detail Keamanan
├── SettingsScreen.kt             // [9] Screen: Pengaturan Tema (Dark/Light Mode) & Biometrik

```

## Konsep Dasar yang Diimplementasikan

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

## Tools & Teknologi

* **Bahasa Pemrograman:** Kotlin
* **Framework UI:** Jetpack Compose
* **Design System:** Material Design 3 (MD3)
* **IDE:** Android Studio
* **Fitur Keamanan:** Biometric Library

## 📸 Screenshoot Desain Aplikasi

Aplikasi ini sepenuhnya mengadopsi Material Design 3 (MD3) dan mendukung tema dinamis. Perbedaan skema warna dapat dilihat jelas pada mode terang (Light Mode) dan mode gelap (Dark Mode).

### ☀️ Light Mode Preview

| Layar Login (MD3) | Layar Beranda (Home) | Layar Pengaturan (Settings) |
| :---: | :---: | :---: |
| ![Login Screen - Light](sreenshoots/login_light.jpg) | ![Home Screen - Light](sreenshoots/home_light.jpg) | ![Settings Screen - Light](sreenshoots/settings_light.jpg) |
| *Menampilkan komponen MD3 seperti Outlined TextField.* | *Menampilkan Card dan TopAppBar.* | *Toggles untuk Dark Mode & App Lock Biometric.* |

### 🌙 Dark Mode Preview

| Layar Login (MD3) | Layar Beranda (Home) | Layar Pengaturan (Settings) |
| :---: | :---: | :---: |
| ![Login Screen - Dark](sreenshoots/login_dark.jpg) | ![Home Screen - Dark](sreenshoots/home_dark.jpg) | ![Settings Screen - Dark](sreenshoots/settings_dark.jpg) |
| *Aplikasi beralih ke skema warna gelap dengan kontras yang optimal.* | *Menguji Dynamic Color pada latar belakang gelap.* | *Memperlihatkan status App Lock Biometric yang aktif.* |

## ⚙️ Cara Menjalankan Proyek

1.  **Clone** repositori ini:
    ```bash
    git clone https://github.com/mkaspulanwar/P7-MODERN-UI-230104040212-SECUREAUTH
    ```
2.  Buka proyek di **Android Studio**.
3.  Pastikan *device/emulator* yang digunakan mendukung **Biometric Authentication (Fingerprint/Face Unlock)** untuk menguji fitur App Lock.
4.  Jalankan aplikasi pada *device* atau *emulator* (Target SDK 31+ disarankan untuk Dynamic Color).

---

## 📸 Tampilan Aplikasi



*(Ganti tag ini dengan gambar tangkapan layar (screenshot) aplikasi Anda)*
