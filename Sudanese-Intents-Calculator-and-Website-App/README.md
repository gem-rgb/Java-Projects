# Sudanese-Intents-Calculator-and-Website-App

> **Category**: Utilities & System Intents  
> **Package**: `com.wanyama.mycalculatorintentswebviewapp`  
> **Platform**: Android (Java)

## Overview
A multi-screen productivity utility showcasing Android system integration: launching system actions (calling, texting, sharing), interactive math calculations, and in-app web browsing.

---

## Key Features
- **Native Android Architecture**: Built using pure Java with standard Android Jetpack / Support libraries.
- **Responsive UI Layouts**: Designed with XML layout configurations supporting various device screen sizes.
- **Modular Component Design**: Structured Separation of Concerns across Activities, Adapters, and Data Models.

---

## Architecture & Components

### Activities
- `CalculatorActivity`
- `IntentsActivity`
- `MainActivity`
- `WebsiteActivity`

### Java Source Classes
- `CalculatorActivity.java`
- `IntentsActivity.java`
- `MainActivity.java`
- `WebsiteActivity.java`

### XML Layouts
- `activity_calculator.xml`
- `activity_intents.xml`
- `activity_main.xml`
- `activity_website.xml`

### Required Permissions
- `android.permission.CALL_PHONE`
- `android.permission.INTERNET`

### Core Dependencies
- `androidx.appcompat:appcompat:1.2.0`
- `androidx.constraintlayout:constraintlayout:2.0.4`

---

## Getting Started

### Prerequisites
- **Android Studio**: Android Studio Electric Eel (or newer recommended)
- **Java Development Kit (JDK)**: JDK 8, 11, or 17
- **Android SDK**: API Level 15+ (target SDK 28-33 depending on configuration)

### Installation & Run
1. Open **Android Studio**.
2. Select **File > Open...** and navigate to this folder (`Sudanese-Intents-Calculator-and-Website-App`).
3. Allow Gradle to synchronize dependencies.
4. If this project uses Firebase (`google-services.json`), ensure a valid Firebase configuration file is placed in the `app/` directory if connecting to your own backend.
5. Connect an Android device with USB debugging enabled or launch an Android Virtual Device (AVD).
6. Click **Run > Run 'app'** (`Shift + F10`) to build and deploy.

---

## License & Attribution
Maintained as part of the [Java-Projects](https://github.com/gem-rgb/Java-Projects) repository.
