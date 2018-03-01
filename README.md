# Android Client Communications with Java TCP/IP Server
### ECE 3740 Fall 2017 Project 5.2

## Overview
This repository contains a server and a client designed to communicate with each other. The Android app contains a TCP/IP client that can communicate with the Java TCP/IP server.

## Running the Code
Two IDEs are used: Netbeans and Android Studio.

### Java TCP/IP Server
Use Netbeans to run the Server project. To allow the server to accept communications, submit the command `6` to create a Server Socket. Then, submit the command `2` to make the server listen for connections.

### Android Client
Using an emulator or an android device, load the android project in the AndroidGUIClient folder using Android Studio. Once the project is running on your device, configure the IP/Port in the app to the IP and port of the server, respectively. Once set up, press the CONNECT button on the Android app to start communicating with the server.
