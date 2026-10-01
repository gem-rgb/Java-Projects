# Jaza-Kikapu

> **Category**: E-Commerce & Community Platforms  
> **Package**: `com.king.jazakikapu`  
> **Platform**: Android (Java)

## Overview
A comprehensive mobile commerce and community donation application featuring catalog browsing, shopping basket checkout, order tracking, phone verification, donor support, and personalized dashboards.

---

## Key Features
- **Native Android Architecture**: Built using pure Java with standard Android Jetpack / Support libraries.
- **Responsive UI Layouts**: Designed with XML layout configurations supporting various device screen sizes.
- **Modular Component Design**: Structured Separation of Concerns across Activities, Adapters, and Data Models.

---

## Architecture & Components

### Activities
- `AboutApp`
- `AboutCompany`
- `BestValueDetailsActivity`
- `Checkout`
- `Dashboard`
- `Donations`
- `LessFortunate`
- `OrdersActivity`
- `PartnerProducts`
- `Partners`
- `PasswordRecovery`
- `PendingOrdersActivity`
- `ProductDetails`
- `Registration`
- `SignIn`
- `SplashActivity`
- `Summary`
- `UserProfile`
- `VerifyPhoneActivity`

### Java Source Classes
- `AboutApp.java`
- `AboutCompany.java`
- `BestValueDetailsActivity.java`
- `Checkout.java`
- `Dashboard.java`
- `Donations.java`
- `LessFortunate.java`
- `MainActivity.java`
- `OrdersActivity.java`
- `PartnerProducts.java`
- `Partners.java`
- `PasswordRecovery.java`
- `PendingOrdersActivity.java`
- `ProductDetails.java`
- `Registration.java`
- `SignIn.java`
- `SplashActivity.java`
- `Summary.java`
- `Tools.java`
- `UserProfile.java`
- `VerifyPhoneActivity.java`

### XML Layouts
- `activity_about_app.xml`
- `activity_about_company.xml`
- `activity_best_value_details.xml`
- `activity_checkout.xml`
- `activity_dashboard.xml`
- `activity_donations.xml`
- `activity_less_fortunate.xml`
- `activity_main.xml`
- `activity_orders.xml`
- `activity_partner_products.xml`
- `activity_partners.xml`
- `activity_password_recovery.xml`
- `activity_pending_orders.xml`
- `activity_product_details.xml`
- `activity_registration.xml`
- `activity_sign_in.xml`
- `activity_splash.xml`
- `activity_summary.xml`
- `activity_user_profile.xml`
- `activity_verify_phone.xml`
- `fragment_notifications.xml`
- `fragment_summary.xml`
- `fragment_tabs_store.xml`
- `toolbar.xml`

### Required Permissions
- None required (Standard permissions)

### Core Dependencies
- `androidx.cardview:cardview:1.0.0`
- `androidx.constraintlayout:constraintlayout:2.0.4`
- `androidx.legacy:legacy-support-v4:1.0.0`
- `androidx.recyclerview:recyclerview:1.1.0`
- `com.github.florent37:arclayout:1.0.3`
- `com.google.android.material:material:1.2.1`
- `com.google.firebase:firebase-auth:16.0.3`
- `com.roughike:bottom-bar:2.3.1`
- `de.hdodenhof:circleimageview:3.0.0`
- `me.relex:circleindicator:1.2.2@aar`

---

## Getting Started

### Prerequisites
- **Android Studio**: Android Studio Electric Eel (or newer recommended)
- **Java Development Kit (JDK)**: JDK 8, 11, or 17
- **Android SDK**: API Level 15+ (target SDK 28-33 depending on configuration)

### Installation & Run
1. Open **Android Studio**.
2. Select **File > Open...** and navigate to this folder (`Jaza-Kikapu`).
3. Allow Gradle to synchronize dependencies.
4. If this project uses Firebase (`google-services.json`), ensure a valid Firebase configuration file is placed in the `app/` directory if connecting to your own backend.
5. Connect an Android device with USB debugging enabled or launch an Android Virtual Device (AVD).
6. Click **Run > Run 'app'** (`Shift + F10`) to build and deploy.

---

## License & Attribution
Maintained as part of the [Java-Projects](https://github.com/gem-rgb/Java-Projects) repository.
