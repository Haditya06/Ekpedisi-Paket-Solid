# 📦 Ekpedisi Paket SOLID

Aplikasi sederhana untuk mengelola proses pengiriman paket menggunakan **Java** dengan penerapan prinsip **SOLID** dan konsep pemrograman berorientasi objek.

Project ini dibuat sebagai implementasi sistem ekspedisi paket yang memiliki beberapa jenis layanan pengiriman, seperti **Reguler** dan **Ekonomi**, serta pengelolaan riwayat pengiriman.

## 📝 Deskripsi

**Ekpedisi Paket SOLID** merupakan aplikasi desktop berbasis Java yang digunakan untuk melakukan proses pengiriman paket.

Aplikasi ini menerapkan pemisahan tanggung jawab ke dalam beberapa bagian seperti:

- **Model** → menyimpan data dan representasi objek.
- **Service** → menangani logika bisnis aplikasi.
- **Repository** → mengelola penyimpanan dan pengambilan data.
- **Layanan** → mendefinisikan berbagai jenis layanan pengiriman.
- **View** → menangani tampilan antarmuka pengguna.

Struktur tersebut digunakan agar kode lebih terorganisir, mudah dikembangkan, dan mengikuti prinsip **SOLID**.

## ✨ Fitur

- 📦 Membuat data pengiriman paket
- 🚚 Pilihan layanan pengiriman:
  - Reguler
  - Ekonomi
- 💰 Perhitungan biaya pengiriman berdasarkan layanan
- 📋 Menyimpan riwayat pengiriman
- 🖥️ Antarmuka desktop menggunakan Java Swing
- 🧩 Pemisahan komponen berdasarkan tanggung jawab
- 🏗️ Penerapan konsep SOLID dan OOP

## 🛠️ Teknologi

| Teknologi | Keterangan |
|---|---|
| Java | Bahasa pemrograman utama |
| Java Swing | Antarmuka aplikasi |
| Maven | Build & dependency management |
| Java 25 | Versi Java yang digunakan |
| NetBeans | IDE pengembangan |

Project menggunakan konfigurasi Maven dengan `maven.compiler.release` versi **25**. 

## 📂 Struktur Project

```text
Ekpedisi-Paket-Solid/
│
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── mycompany/
│                   └── ekpedisipaket/
│                       │
│                       ├── EkpedisiPaket.java
│                       ├── Main.java
│                       │
│                       ├── layanan/
│                       │   ├── LayananPengiriman.java
│                       │   ├── LayananReguler.java
│                       │   └── LayananEkonomi.java
│                       │
│                       ├── model/
│                       │
│                       ├── repository/
│                       │   ├── RiwayatRepository.java
│                       │   └── RiwayatArrayList.java
│                       │
│                       ├── service/
│                       │   └── PengirimanService.java
│                       │
│                       └── view/
│                           └── FormatPengiriman.java
│
├── pom.xml
└── README.md
```

Struktur package pada repository saat ini memang dipisahkan menjadi `layanan`, `model`, `repository`, `service`, dan `view`. 

## 🧱 Penerapan SOLID

### 1. Single Responsibility Principle (SRP)

Setiap class memiliki tanggung jawab yang spesifik.

Contohnya:

- `PengirimanService` menangani proses bisnis pengiriman.
- `RiwayatArrayList` menangani penyimpanan riwayat.
- `FormatPengiriman` menangani tampilan aplikasi.
- Class pada package `layanan` menangani jenis layanan pengiriman.

Dengan pembagian tersebut, perubahan pada satu bagian tidak harus memengaruhi seluruh sistem.

### 2. Open/Closed Principle (OCP)

Sistem layanan pengiriman dibuat agar dapat dikembangkan dengan menambahkan jenis layanan baru tanpa harus mengubah logika utama aplikasi.

Contohnya, selain:

```text
LayananReguler
LayananEkonomi
```

dapat ditambahkan layanan baru seperti:

```text
LayananExpress
```

sesuai kebutuhan.

### 3. Liskov Substitution Principle (LSP)

Jenis layanan pengiriman dapat digunakan melalui abstraksi `LayananPengiriman`, sehingga implementasi layanan seperti Reguler dan Ekonomi dapat digunakan secara konsisten oleh sistem.

### 4. Interface Segregation Principle (ISP)

Interface digunakan untuk mendefinisikan kebutuhan yang spesifik sehingga class tidak dipaksa bergantung pada method yang tidak diperlukan.

### 5. Dependency Inversion Principle (DIP)

Service tidak langsung bergantung pada implementasi penyimpanan tertentu. `PengirimanService` menggunakan abstraksi repository sehingga implementasi repository dapat diganti tanpa mengubah logika utama service.

Contohnya:

```text
PengirimanService
        ↓
RiwayatRepository
        ↓
RiwayatArrayList
```

## ▶️ Cara Menjalankan

### Prasyarat

Pastikan sudah terinstall:

- **JDK 25**
- **Apache Maven**
- IDE seperti **NetBeans**, IntelliJ IDEA, atau VS Code

### Clone Repository

```bash
git clone https://github.com/Haditya06/Ekpedisi-Paket-Solid.git
```

Masuk ke folder project:

```bash
cd Ekpedisi-Paket-Solid
```

### Build Project

```bash
mvn clean package
```

### Menjalankan Project

```bash
mvn exec:java
```

Atau project dapat dibuka langsung menggunakan **NetBeans** sebagai project Maven.

## 🖥️ Alur Aplikasi

Secara umum alur aplikasi:

```text
User
  │
  ▼
FormatPengiriman
  │
  ▼
PengirimanService
  │
  ├───────────────┐
  ▼               ▼
Layanan        Repository
Reguler/       Riwayat
Ekonomi           │
                  ▼
             RiwayatArrayList
```

Class `Main` melakukan inisialisasi repository, service, daftar layanan pengiriman, kemudian menjalankan tampilan `FormatPengiriman`. 

## 🎯 Tujuan Project

Project ini dibuat untuk:

1. Memahami penerapan konsep **Object-Oriented Programming (OOP)**.
2. Memahami prinsip **SOLID** dalam pengembangan aplikasi.
3. Mempraktikkan penggunaan **interface dan abstraction**.
4. Memahami pemisahan antara layer **View, Service, Repository, Model, dan Layanan**.
5. Membuat kode yang lebih mudah dikembangkan dan dipelihara.
