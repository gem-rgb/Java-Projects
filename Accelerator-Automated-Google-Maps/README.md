# Accelerator-Automated-Google-Maps

> **Category**: Location & Maps  
> **Package**: `com.king.myautomatedlocation`  
> **Platform**: Android (Java)

## Overview
An Android application integrating Google Play Services Maps and Location APIs (`FusedLocationProviderClient`) to dynamically retrieve the device's real-time GPS coordinates, place interactive map markers, and animate the camera with custom zoom levels.

---

## Key Features
- **Native Android Architecture**: Built using pure Java with standard Android Jetpack / Support libraries.
- **Responsive UI Layouts**: Designed with XML layout configurations supporting various device screen sizes.
- **Modular Component Design**: Structured Separation of Concerns across Activities, Adapters, and Data Models.

---

## Architecture & Components

### Activities
- `MainActivity`
- `MapsActivity`

### Java Source Classes
- `MainActivity.java`
- `MapsActivity.java`

### XML Layouts
- `activity_main.xml`
- `activity_maps.xml`
- `content_main.xml`

### Required Permissions
- `android.permission.ACCESS_FINE_LOCATION`

### Core Dependencies
- `androidx.appcompat:appcompat:1.2.0`
- `androidx.constraintlayout:constraintlayout:2.0.2`
- `androidx.navigation:navigation-fragment:2.3.1`
- `androidx.navigation:navigation-ui:2.3.1`
- `com.google.android.gms:play-services-location:15.0.0`
- `com.google.android.gms:play-services-maps:15.0.0`
- `com.google.android.material:material:1.2.1`

---

## Getting Started

### Prerequisites
- **Android Studio**: Android Studio Electric Eel (or newer recommended)
- **Java Development Kit (JDK)**: JDK 8, 11, or 17
- **Android SDK**: API Level 15+ (target SDK 28-33 depending on configuration)

### Installation & Run
1. Open **Android Studio**.
2. Select **File > Open...** and navigate to this folder (`Accelerator-Automated-Google-Maps`).
3. Allow Gradle to synchronize dependencies.
4. If this project uses Firebase (`google-services.json`), ensure a valid Firebase configuration file is placed in the `app/` directory if connecting to your own backend.
5. Connect an Android device with USB debugging enabled or launch an Android Virtual Device (AVD).
6. Click **Run > Run 'app'** (`Shift + F10`) to build and deploy.

---

## License & Attribution
Maintained as part of the [Java-Projects](https://github.com/gem-rgb/Java-Projects) repository.
