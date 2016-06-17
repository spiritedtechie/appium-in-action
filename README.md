Description
-----------

This project is to explore Appium for testing an Android application.

Appium supports Android API >= 17 and additional features require 18/19.

Appium puts a WebDriver abstraction layer over native test automation solutions
(e.g. UIAutomation for iOS, UiAutomator for Android). This allows for true cross-platform native mobile automation.

Tests can be written in any WebDriver compatible language, and a range of Appium client libraries
can be used e.g. Ruby, Java, Objective-C, Javascript.

Setup
-----

1) Ensure Android SDK is installed and ANDROID_HOME set

2) Install Appium server (command line / Node NPM)

    brew install node   
    npm install -g appium
    npm install wd
    npm install -g appium-doctor

3) Alternatively, install Appium server as OS application

http://appium.io/downloads.html

4) Run Appium Doctor to check all is OK

    appium-doctor

5) Start Appium server

    appium &

6) Create and run an API 6.0 (Android M) emulator - easiest to do this from Android Studio

7) Build the APK under the app folder

    ./gradlew clean assemble

8) Run the JUnit test MyFirstTest in the appium sub-module folder
