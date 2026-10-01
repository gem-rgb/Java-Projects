# Java Projects Collection

A comprehensive collection of **15 native Android (Java) applications** showcasing modern mobile development paradigms, cloud integrations, persistence mechanisms, UI/UX architectures, and Android system services.

[![Android](https://img.shields.io/badge/Platform-Android-green.svg)](https://developer.android.com)
[![Java](https://img.shields.io/badge/Language-Java-orange.svg)](https://www.java.com)
[![Gradle](https://img.shields.io/badge/Build-Gradle-blue.svg)](https://gradle.org)

---

## 📚 Project Catalog

| # | Project Name | Category | Key Technologies & APIs | Description |
|---|--------------|----------|-------------------------|-------------|
| 1 | [Accelerator-Automated-Google-Maps](./Accelerator-Automated-Google-Maps) | 📍 Maps & Location | Google Maps API, `FusedLocationProviderClient`, GPS | Real-time GPS location tracking with animated markers and camera zooming. |
| 2 | [Accelerator-Firebase-Storage-App](./Accelerator-Firebase-Storage-App) | ☁️ Firebase & Cloud | Firebase Storage, Realtime Database, Glide | Media uploads to cloud storage with progress tracking and gallery list. |
| 3 | [Accelerator-Hardcoded-Location-Maps](./Accelerator-Hardcoded-Location-Maps) | 📍 Maps & Location | Google Maps Android SDK, Custom Markers | Map coordinates plotting, marker setup, and camera positioning. |
| 4 | [Accelerator-SQlite-App-With-Alert](./Accelerator-SQlite-App-With-Alert) | 💾 Local Database | Android SQLite (`SQLiteDatabase`), AlertDialogs | Offline member registration and database queries with alert dialogs. |
| 5 | [Android-Firebase-Database-App-with-Java](./Android-Firebase-Database-App-with-Java) | ☁️ Firebase & Cloud | Firebase Realtime Database, RecyclerView | Realtime cloud database CRUD operations for user profiles. |
| 6 | [Complete-Rwandan-Firebase-Project](./Complete-Rwandan-Firebase-Project) | ☁️ Firebase & Cloud | Firebase Auth, Realtime Database, RecyclerView | Complete student information portal with auth, registration, and password reset. |
| 7 | [Custom-ListView-Accelerator-App](./Custom-ListView-Accelerator-App) | 📱 UI & Lists | ListView, Custom ArrayAdapter, ViewHolder | Side-by-side comparison of standard vs custom list adapters. |
| 8 | [Firebase-Storage-App](./Firebase-Storage-App) | ☁️ Firebase & Cloud | Firebase Storage & DB, Context Menu, Glide | Image upload, cloud gallery viewer, details view, and item deletion. |
| 9 | [Intents-Calculator-And-Website-App](./Intents-Calculator-And-Website-App) | 🛠️ Utilities & System | Implicit/Explicit Intents, WebView, Math Parser | Multi-utility suite: Phone dialer, SMS, Email, Share, Calculator, and WebView. |
| 10 | [Jaza-Kikapu](./Jaza-Kikapu) | 🛒 E-Commerce & Charity | Firebase Auth, CircleIndicator, ArcLayout, Orders | Full mobile shopping basket and community donation platform. |
| 11 | [Jaza-Kikapu-Admin](./Jaza-Kikapu-Admin) | 🛒 Admin & Inventory | Firebase Storage & DB, SweetAlert, Products Catalog | Admin portal for managing products, uploading inventory photos, and tracking items. |
| 12 | [kiAndroid-Class-Recyclerview-Project](./kiAndroid-Class-Recyclerview-Project) | 📱 UI & Lists | RecyclerView, CardView, Glide Image Loader | Modern list architecture using CardView and RecyclerView adapters. |
| 13 | [Mass-Guest](./Mass-Guest) | ☁️ Firebase & Cloud | Firebase Storage, Visitor Registry, RecyclerView | Event attendance and visitor registration with photo uploads. |
| 14 | [Rwandan-SQlite-Project](./Rwandan-SQlite-Project) | 💾 Local Database | Android SQLite (`Cursor`), ConstraintLayout | Offline user registry with SQLite CRUD operations and input validation. |
| 15 | [Sudanese-Intents-Calculator-and-Website-App](./Sudanese-Intents-Calculator-and-Website-App) | 🛠️ Utilities & System | System Intents, Calculator, In-app WebKit WebView | Utility toolkit for calling, messaging, math operations, and browsing. |

---

## 🏛️ Domain Architecture

### 1. 📍 Maps & Location Services
- **[Accelerator-Automated-Google-Maps](./Accelerator-Automated-Google-Maps)**: Integrates `FusedLocationProviderClient` for dynamic GPS position acquisition, runtime permission checks (`ACCESS_FINE_LOCATION`), and map camera updates.
- **[Accelerator-Hardcoded-Location-Maps](./Accelerator-Hardcoded-Location-Maps)**: Demonstrates coordinate pin-pointing, custom map styling, and designated geographic region boundaries.

### 2. ☁️ Firebase Authentication & Cloud Persistence
- **[Complete-Rwandan-Firebase-Project](./Complete-Rwandan-Firebase-Project)**: Full authentication lifecycle including login, registration, password recovery, and authenticated real-time data sync.
- **[Android-Firebase-Database-App-with-Java](./Android-Firebase-Database-App-with-Java)**: NoSQL Realtime Database integration for user accounts and live list updates.
- **[Firebase-Storage-App](./Firebase-Storage-App)** & **[Accelerator-Firebase-Storage-App](./Accelerator-Firebase-Storage-App)**: Binary file/image upload pipelines with upload progress listeners, download URL resolution, and Glide caching.
- **[Mass-Guest](./Mass-Guest)**: Visitor check-in and registry with cloud-stored identity photos.

### 3. 💾 Offline Storage & SQLite Databases
- **[Accelerator-SQlite-App-With-Alert](./Accelerator-SQlite-App-With-Alert)** & **[Rwandan-SQlite-Project](./Rwandan-SQlite-Project)**: Zero-dependency offline persistence using Android's native `SQLiteDatabase` engine, `Cursor` data extraction, and interactive dialog alerts.

### 4. 🛒 Mobile Commerce & Administration
- **[Jaza-Kikapu](./Jaza-Kikapu)**: Consumer-facing store supporting catalog exploration, shopping cart/basket management, donation campaigns, order verification, and personal dashboards.
- **[Jaza-Kikapu-Admin](./Jaza-Kikapu-Admin)**: Merchant-facing application for inventory creation, photo upload, stock monitoring, and order review.

### 5. 📱 UI Patterns & List Architectures
- **[Custom-ListView-Accelerator-App](./Custom-ListView-Accelerator-App)**: Compares default `android.R.layout.simple_list_item_1` with custom multi-element row layouts.
- **[kiAndroid-Class-Recyclerview-Project](./kiAndroid-Class-Recyclerview-Project)**: Production-grade list performance leveraging `RecyclerView.ViewHolder` and `CardView` elevation.

### 6. 🛠️ Utilities, System Intents & Web Integration
- **[Intents-Calculator-And-Website-App](./Intents-Calculator-And-Website-App)** & **[Sudanese-Intents-Calculator-and-Website-App](./Sudanese-Intents-Calculator-and-Website-App)**: Integrates with Android OS telephony, SMS, email clients, social sharing intents, arithmetic computation, and WebKit WebView rendering.

---

## 🚀 Getting Started

### Prerequisites
- **Android Studio**: Android Studio Electric Eel (or newer recommended)
- **Java Development Kit**: JDK 8, 11, or 17
- **Android SDK**: Build tools and platform SDK installed via Android Studio SDK Manager

### Opening and Running a Project
Each folder in this repository is an independent Android Studio project.

1. Clone this repository:
   ```bash
   git clone https://github.com/gem-rgb/Java-Projects.git
   cd Java-Projects
   ```
2. Open **Android Studio**.
3. Select **File > Open...** and select any specific project subdirectory (e.g. `Jaza-Kikapu` or `Accelerator-Automated-Google-Maps`).
4. Allow Gradle to synchronize dependencies.
5. If using a Firebase-enabled project, make sure to link your own `google-services.json` in the `app/` directory if you wish to run against your own Firebase project.
6. Connect an Android device or start an emulator, then click **Run** (`Shift + F10`).

---

## 📄 License
This repository is maintained under the [gem-rgb](https://github.com/gem-rgb) GitHub organization.
