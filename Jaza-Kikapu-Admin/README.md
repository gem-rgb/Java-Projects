# Jaza-Kikapu-Admin

> **Category**: Admin & Inventory Management  
> **Package**: `com.king.jazakikapuadmin`  
> **Platform**: Android (Java)

## Overview
The administrative companion application for Jaza Kikapu, facilitating product catalog management, image asset uploads to Firebase Storage, real-time inventory tracking, and authenticated administrative operations.

---

## Key Features
- **Native Android Architecture**: Built using pure Java with standard Android Jetpack / Support libraries.
- **Responsive UI Layouts**: Designed with XML layout configurations supporting various device screen sizes.
- **Modular Component Design**: Structured Separation of Concerns across Activities, Adapters, and Data Models.

---

## Architecture & Components

### Activities
- `AddProductActivity`
- `AddproductActivity`
- `AddproductsActivity`
- `MainActivity`
- `PasswordActivity`
- `ProductsActivity`
- `RegisterActivity`
- `SplashActivity`

### Java Source Classes
- `AddProductActivity.java`
- `MainActivity.java`
- `PasswordActivity.java`
- `ProductsActivity.java`
- `ProductsAdapter.java`
- `RegisterActivity.java`
- `SplashActivity.java`
- `Upload.java`

### XML Layouts
- `activity_add_product.xml`
- `activity_main.xml`
- `activity_password.xml`
- `activity_products.xml`
- `activity_register.xml`
- `activity_splash.xml`
- `content_addproducts.xml`
- `content_products.xml`
- `product_layout.xml`

### Required Permissions
- None required (Standard permissions)

### Core Dependencies
- `androidx.appcompat:appcompat:1.2.0`
- `androidx.cardview:cardview:1.0.0`
- `androidx.constraintlayout:constraintlayout:2.0.4`
- `androidx.navigation:navigation-fragment:2.3.1`
- `androidx.navigation:navigation-ui:2.3.1`
- `androidx.recyclerview:recyclerview:1.1.0`
- `com.github.f0ris.sweetalert:library:1.5.1`
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
2. Select **File > Open...** and navigate to this folder (`Jaza-Kikapu-Admin`).
3. Allow Gradle to synchronize dependencies.
4. If this project uses Firebase (`google-services.json`), ensure a valid Firebase configuration file is placed in the `app/` directory if connecting to your own backend.
5. Connect an Android device with USB debugging enabled or launch an Android Virtual Device (AVD).
6. Click **Run > Run 'app'** (`Shift + F10`) to build and deploy.

---

## License & Attribution
Maintained as part of the [Java-Projects](https://github.com/gem-rgb/Java-Projects) repository.
