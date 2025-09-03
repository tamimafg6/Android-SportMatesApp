# SportMates — Android App

A simple Android app (Kotlin) for friends and teams to view **schedules**, **rosters**, **games**, and more. Built as a class project and ready to extend.

---

## Table of Contents

- [Features](#features)
- [Tech Stack](#tech-stack)
- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Quick Start](#quick-start)
- [Build & Run](#build--run)
- [Testing](#testing)
- [Configuration](#configuration)
- [Coding Style](#coding-style)
- [Roadmap](#roadmap)
- [Contributing](#contributing)
- [License](#license)
- [Author](#author)

---

## Features

- View **team rosters**
- See **game schedules** and basic match details
- Clean, student‑friendly codebase that’s easy to expand

> Tip: Add screens like “Team Profile”, “Match Details”, “Create Game”, etc., as you grow the app.

---

## Tech Stack

- **Language:** Kotlin
- **Build:** Gradle (Kotlin DSL)
- **UI:** Android Views (ready for Jetpack Compose if you add it)
- **Min/Target SDK:** Set in `app/build.gradle.kts`
- **Testing:** JUnit / Instrumented tests scaffold (optional for now)

---

## Project Structure

```text
Android-SportMatesApp/
├─ app/                     # Android app module
│  ├─ src/
│  │  ├─ main/              # Main source set
│  │  │  ├─ AndroidManifest.xml
│  │  │  └─ java|kotlin/... # App source code
│  │  ├─ test/              # Local unit tests (JVM)
│  │  └─ androidTest/       # Instrumented tests (device/emulator)
├─ gradle/                  # Gradle wrapper files
├─ build.gradle.kts         # Root Gradle build (Kotlin DSL)
├─ settings.gradle.kts      # Gradle settings (modules)
├─ gradle.properties        # Gradle JVM & project properties
├─ gradlew / gradlew.bat    # Gradle wrapper scripts
└─ README.md
```

---

## Prerequisites

- **Android Studio** (Giraffe or newer recommended)
- **Android SDK** + at least one emulator image (or a physical device with USB debugging)
- **JDK 17** (bundled with Android Studio)
- **Git**

---

## Quick Start

1. **Clone the repository**
   ```bash
   git clone https://github.com/tamimafg6/Android-SportMatesApp.git
   cd Android-SportMatesApp
   ```

2. **Open in Android Studio**
   - File → Open… → select the project root
   - Wait for **Gradle sync** to finish (uses the included **Gradle wrapper**)

3. **Select a device**
   - Use an **Android Emulator** (AVD Manager) or **physical device** (USB debugging enabled)

4. **Run the app**
   - Click **Run ▶** (or press `Shift + F10`)

---

## Build & Run

- **From Android Studio**
  1. Make sure Gradle sync completes successfully.
  2. Choose a device.
  3. Click **Run ▶**.

- **From the command line**
  ```bash
  # Clean & build (debug)
  ./gradlew clean assembleDebug

  # Install on connected device/emulator
  ./gradlew installDebug

  # Run unit tests
  ./gradlew test

  # Run instrumented tests (emulator/device must be running)
  ./gradlew connectedAndroidTest
  ```

> If Gradle sync fails, check that your **SDK versions** match the ones in `app/build.gradle.kts`. You can also try **File → Invalidate Caches / Restart…** in Android Studio.

---

## Testing

- **Local unit tests** go in `app/src/test/...` (run on JVM).
- **Instrumented tests** go in `app/src/androidTest/...` (run on device/emulator).

From Android Studio: use the **Run tests** gutter icons or **Run → Run…**.  
From CLI: `./gradlew test` and `./gradlew connectedAndroidTest`.

---

## Configuration

- App ID / package name: set in `app/build.gradle.kts` and the `AndroidManifest.xml`.
- Min/target SDK: set in `app/build.gradle.kts` under `android { defaultConfig { ... } }`.
- If you add APIs:
  - Put keys/secrets in **local.properties** or **Gradle properties**, not in source.
  - Use **BuildConfig** or environment-specific files for staging vs production.

---

## Coding Style

- Kotlin idioms (null‑safety, data classes, `when`, extension functions).
- Use **ViewBinding** or **Jetpack Compose** (if you add Compose) for safer UI code.
- Prefer **sealed classes** / **Result** types for domain results.
- Keep Activities/Fragments thin; move logic to **ViewModels** and plain Kotlin classes.

---

## Roadmap

- Team profiles (logo, colors, home venue)
- Match details (score, location, maps link)
- Simple auth (email/Google Sign‑In)
- Offline caching with **Room**
- API integration with **Retrofit** + **Coroutines**
- Notifications for upcoming games
- Dark theme & accessibility polish

---

## Contributing

1. Fork the repository
2. Create a feature branch: `git checkout -b feature/your-change`
3. Commit: `git commit -m "feat: add X"`
4. Push: `git push origin feature/your-change`
5. Open a Pull Request

---

## License

Add a `LICENSE` file (MIT/Apache-2.0/etc.) if you plan to share or reuse this code publicly.

---

## Author

**Tamim Afghanyar** — 2025
