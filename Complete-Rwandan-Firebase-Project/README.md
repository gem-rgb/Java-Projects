# Complete-Rwandan-Firebase-Project

> **Category**: Firebase & Cloud Services  
> **Package**: `com.king.mycompleterwandanfirebaseapp`  
> **Platform**: Android (Java)

## Overview
A full-featured educational portal powered by Firebase Authentication (email/password sign-in, user registration, password recovery) and Firebase Realtime Database for comprehensive student record administration.

---

## Key Features
- **Native Android Architecture**: Built using pure Java with standard Android Jetpack / Support libraries.
- **Responsive UI Layouts**: Designed with XML layout configurations supporting various device screen sizes.
- **Modular Component Design**: Structured Separation of Concerns across Activities, Adapters, and Data Models.

---

## Architecture & Components

### Activities
- `HomeActivity`
- `MainActivity`
- `PasswordresetActivity`
- `RegistrationActivity`
- `ViewstudentsActivity`

### Java Source Classes
- `CustomAdapter.java`
- `HomeActivity.java`
- `MainActivity.java`
- `PasswordresetActivity.java`
- `RegistrationActivity.java`
- `Student.java`
- `ViewstudentsActivity.java`

### XML Layouts
- `activity_home.xml`
- `activity_main.xml`
- `activity_passwordreset.xml`
- `activity_registration.xml`
- `activity_viewstudents.xml`
- `item_layout.xml`

### Required Permissions
- None required (Standard permissions)

### Core Dependencies
- `androidx.appcompat:appcompat:1.2.0`
- `androidx.constraintlayout:constraintlayout:2.0.4`
- `androidx.recyclerview:recyclerview:1.1.0`
- `com.google.firebase:firebase-auth:16.0.3`
- `com.google.firebase:firebase-core:16.0.3`
- `com.google.firebase:firebase-database:16.0.1`

---

## Getting Started

### Prerequisites
- **Android Studio**: Android Studio Electric Eel (or newer recommended)
- **Java Development Kit (JDK)**: JDK 8, 11, or 17
- **Android SDK**: API Level 15+ (target SDK 28-33 depending on configuration)

### Installation & Run
1. Open **Android Studio**.
2. Select **File > Open...** and navigate to this folder (`Complete-Rwandan-Firebase-Project`).
3. Allow Gradle to synchronize dependencies.
4. If this project uses Firebase (`google-services.json`), ensure a valid Firebase configuration file is placed in the `app/` directory if connecting to your own backend.
5. Connect an Android device with USB debugging enabled or launch an Android Virtual Device (AVD).
6. Click **Run > Run 'app'** (`Shift + F10`) to build and deploy.

---

## License & Attribution
Maintained as part of the [Java-Projects](https://github.com/gem-rgb/Java-Projects) repository.
