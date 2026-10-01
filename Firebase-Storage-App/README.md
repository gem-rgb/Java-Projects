# Firebase-Storage-App

> **Category**: Firebase & Cloud Services  
> **Package**: `com.king.mystorageapp`  
> **Platform**: Android (Java)

## Overview
A robust media gallery application supporting image uploads to Firebase Cloud Storage, metadata synchronization via Firebase Database, detailed item inspection, and context menu actions (including deletion).

---

## Key Features
- **Native Android Architecture**: Built using pure Java with standard Android Jetpack / Support libraries.
- **Responsive UI Layouts**: Designed with XML layout configurations supporting various device screen sizes.
- **Modular Component Design**: Structured Separation of Concerns across Activities, Adapters, and Data Models.

---

## Architecture & Components

### Activities
- `DetailsActivity`
- `ImagesActivity`
- `MainActivity`

### Java Source Classes
- `DetailsActivity.java`
- `ImageAdapter.java`
- `ImagesActivity.java`
- `MainActivity.java`
- `Upload.java`

### XML Layouts
- `activity_details.xml`
- `activity_images.xml`
- `activity_main.xml`
- `content_details.xml`
- `content_images.xml`
- `content_main.xml`
- `image_layout.xml`

### Required Permissions
- None required (Standard permissions)

### Core Dependencies
- `androidx.appcompat:appcompat:1.2.0`
- `androidx.cardview:cardview:1.0.0`
- `androidx.navigation:navigation-fragment:2.0.0`
- `androidx.navigation:navigation-ui:2.0.0`
- `androidx.recyclerview:recyclerview:1.1.0`
- `com.github.bumptech.glide:glide:4.10.0`
- `com.google.android.material:material:1.2.1`
- `com.google.firebase:firebase-core:11.0.4`
- `com.google.firebase:firebase-database:11.0.4`
- `com.google.firebase:firebase-storage:11.0.4`

---

## Getting Started

### Prerequisites
- **Android Studio**: Android Studio Electric Eel (or newer recommended)
- **Java Development Kit (JDK)**: JDK 8, 11, or 17
- **Android SDK**: API Level 15+ (target SDK 28-33 depending on configuration)

### Installation & Run
1. Open **Android Studio**.
2. Select **File > Open...** and navigate to this folder (`Firebase-Storage-App`).
3. Allow Gradle to synchronize dependencies.
4. If this project uses Firebase (`google-services.json`), ensure a valid Firebase configuration file is placed in the `app/` directory if connecting to your own backend.
5. Connect an Android device with USB debugging enabled or launch an Android Virtual Device (AVD).
6. Click **Run > Run 'app'** (`Shift + F10`) to build and deploy.

---

## License & Attribution
Maintained as part of the [Java-Projects](https://github.com/gem-rgb/Java-Projects) repository.
