```
Directory structure:
└── sadiquereyaz-multi-module-basic/
    ├── build.gradle.kts
    ├── gradle.properties
    ├── gradlew
    ├── gradlew.bat
    ├── settings.gradle.kts
    ├── app/
    │   ├── build.gradle.kts
    │   ├── proguard-rules.pro
    │   ├── .gitignore
    │   └── src/
    │       ├── androidTest/
    │       │   └── java/
    │       │       └── com/
    │       │           └── reyaz/
    │       │               └── multimodulebasic/
    │       │                   └── ExampleInstrumentedTest.kt
    │       ├── main/
    │       │   ├── AndroidManifest.xml
    │       │   ├── java/
    │       │   │   └── com/
    │       │   │       └── reyaz/
    │       │   │           └── multimodulebasic/
    │       │   │               ├── MainActivity.kt
    │       │   │               ├── MultiModuleApp.kt
    │       │   │               └── MyApplication.kt
    │       │   └── res/
    │       │       ├── drawable/
    │       │       │   ├── ic_launcher_background.xml
    │       │       │   └── ic_launcher_foreground.xml
    │       │       ├── mipmap-anydpi-v26/
    │       │       │   ├── ic_launcher.xml
    │       │       │   └── ic_launcher_round.xml
    │       │       ├── mipmap-hdpi/
    │       │       │   ├── ic_launcher.webp
    │       │       │   └── ic_launcher_round.webp
    │       │       ├── mipmap-mdpi/
    │       │       │   ├── ic_launcher.webp
    │       │       │   └── ic_launcher_round.webp
    │       │       ├── mipmap-xhdpi/
    │       │       │   ├── ic_launcher.webp
    │       │       │   └── ic_launcher_round.webp
    │       │       ├── mipmap-xxhdpi/
    │       │       │   ├── ic_launcher.webp
    │       │       │   └── ic_launcher_round.webp
    │       │       ├── mipmap-xxxhdpi/
    │       │       │   ├── ic_launcher.webp
    │       │       │   └── ic_launcher_round.webp
    │       │       ├── values/
    │       │       │   ├── colors.xml
    │       │       │   ├── strings.xml
    │       │       │   └── themes.xml
    │       │       └── xml/
    │       │           ├── backup_rules.xml
    │       │           └── data_extraction_rules.xml
    │       └── test/
    │           └── java/
    │               └── com/
    │                   └── reyaz/
    │                       └── multimodulebasic/
    │                           └── ExampleUnitTest.kt
    ├── core/
    │   ├── data/
    │   │   ├── build.gradle.kts
    │   │   ├── consumer-rules.pro
    │   │   ├── proguard-rules.pro
    │   │   ├── .gitignore
    │   │   └── src/
    │   │       ├── androidTest/
    │   │       │   └── java/
    │   │       │       └── com/
    │   │       │           └── reyaz/
    │   │       │               └── core/
    │   │       │                   └── data/
    │   │       │                       └── ExampleInstrumentedTest.kt
    │   │       ├── main/
    │   │       │   ├── AndroidManifest.xml
    │   │       │   └── java/
    │   │       │       └── com/
    │   │       │           └── reyaz/
    │   │       │               └── core/
    │   │       │                   └── data/
    │   │       │                       ├── di/
    │   │       │                       │   └── DataModule.kt
    │   │       │                       └── repository/
    │   │       │                           └── UserRepositoryImpl.kt
    │   │       └── test/
    │   │           └── java/
    │   │               └── com/
    │   │                   └── reyaz/
    │   │                       └── core/
    │   │                           └── data/
    │   │                               └── ExampleUnitTest.kt
    │   ├── domain/
    │   │   ├── build.gradle.kts
    │   │   ├── consumer-rules.pro
    │   │   ├── proguard-rules.pro
    │   │   ├── .gitignore
    │   │   └── src/
    │   │       ├── androidTest/
    │   │       │   └── java/
    │   │       │       └── com/
    │   │       │           └── reyaz/
    │   │       │               └── core/
    │   │       │                   └── domain/
    │   │       │                       └── ExampleInstrumentedTest.kt
    │   │       ├── main/
    │   │       │   ├── AndroidManifest.xml
    │   │       │   └── java/
    │   │       │       └── com/
    │   │       │           └── reyaz/
    │   │       │               └── core/
    │   │       │                   └── domain/
    │   │       │                       ├── model/
    │   │       │                       │   └── User.kt
    │   │       │                       └── repository/
    │   │       │                           └── UserRepository.kt
    │   │       └── test/
    │   │           └── java/
    │   │               └── com/
    │   │                   └── reyaz/
    │   │                       └── core/
    │   │                           └── domain/
    │   │                               └── ExampleUnitTest.kt
    │   └── ui/
    │       ├── build.gradle.kts
    │       ├── consumer-rules.pro
    │       ├── proguard-rules.pro
    │       ├── .gitignore
    │       └── src/
    │           ├── androidTest/
    │           │   └── java/
    │           │       └── com/
    │           │           └── reyaz/
    │           │               └── core/
    │           │                   └── ui/
    │           │                       └── ExampleInstrumentedTest.kt
    │           ├── main/
    │           │   ├── AndroidManifest.xml
    │           │   └── java/
    │           │       └── com/
    │           │           └── reyaz/
    │           │               └── core/
    │           │                   └── ui/
    │           │                       ├── navigation/
    │           │                       │   ├── AppNavigation.kt
    │           │                       │   └── Routes.kt
    │           │                       └── theme/
    │           │                           ├── Color.kt
    │           │                           ├── Theme.kt
    │           │                           └── Type.kt
    │           └── test/
    │               └── java/
    │                   └── com/
    │                       └── reyaz/
    │                           └── core/
    │                               └── ui/
    │                                   └── ExampleUnitTest.kt
    ├── feature/
    │   ├── home/
    │   │   ├── build.gradle.kts
    │   │   ├── consumer-rules.pro
    │   │   ├── proguard-rules.pro
    │   │   ├── .gitignore
    │   │   └── src/
    │   │       ├── androidTest/
    │   │       │   └── java/
    │   │       │       └── com/
    │   │       │           └── reyaz/
    │   │       │               └── feature/
    │   │       │                   └── home/
    │   │       │                       └── ExampleInstrumentedTest.kt
    │   │       ├── main/
    │   │       │   ├── AndroidManifest.xml
    │   │       │   └── java/
    │   │       │       └── com/
    │   │       │           └── reyaz/
    │   │       │               └── feature/
    │   │       │                   └── home/
    │   │       │                       ├── HomeScreen.kt
    │   │       │                       └── HomeViewModel.kt
    │   │       └── test/
    │   │           └── java/
    │   │               └── com/
    │   │                   └── reyaz/
    │   │                       └── feature/
    │   │                           └── home/
    │   │                               └── ExampleUnitTest.kt
    │   ├── profile/
    │   │   ├── build.gradle.kts
    │   │   ├── consumer-rules.pro
    │   │   ├── proguard-rules.pro
    │   │   ├── .gitignore
    │   │   └── src/
    │   │       ├── androidTest/
    │   │       │   └── java/
    │   │       │       └── com/
    │   │       │           └── reyaz/
    │   │       │               └── feature/
    │   │       │                   └── profile/
    │   │       │                       └── ExampleInstrumentedTest.kt
    │   │       ├── main/
    │   │       │   ├── AndroidManifest.xml
    │   │       │   └── java/
    │   │       │       └── com/
    │   │       │           └── reyaz/
    │   │       │               └── feature/
    │   │       │                   └── profile/
    │   │       │                       ├── ProfileScreen.kt
    │   │       │                       └── UserDetailScreen.kt
    │   │       └── test/
    │   │           └── java/
    │   │               └── com/
    │   │                   └── reyaz/
    │   │                       └── feature/
    │   │                           └── profile/
    │   │                               └── ExampleUnitTest.kt
    │   └── settings/
    │       ├── build.gradle.kts
    │       ├── consumer-rules.pro
    │       ├── proguard-rules.pro
    │       ├── .gitignore
    │       └── src/
    │           ├── androidTest/
    │           │   └── java/
    │           │       └── com/
    │           │           └── reyaz/
    │           │               └── feature/
    │           │                   └── settings/
    │           │                       └── ExampleInstrumentedTest.kt
    │           ├── main/
    │           │   ├── AndroidManifest.xml
    │           │   └── java/
    │           │       └── com/
    │           │           └── reyaz/
    │           │               └── feature/
    │           │                   └── settings/
    │           │                       └── SettingsScreen.kt
    │           └── test/
    │               └── java/
    │                   └── com/
    │                       └── reyaz/
    │                           └── feature/
    │                               └── settings/
    │                                   └── ExampleUnitTest.kt
    └── gradle/
        ├── libs.versions.toml
        └── wrapper/
            └── gradle-wrapper.properties
```
