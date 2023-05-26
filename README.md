Sample Android project aiming to provide guidelines for Skrill Checkout integration.

## Overview
On June 30, the US bank Chase stops supporting in-process webview traffic. This topic raises the need for updated Skrill Checkout integration 
guidelines.

Our recommendation is to start Skrill Checkout in a browser or Custom Tabs. An essential part of being able to keep a good UX is to be able to 
redirect the customer from the browser back to the merchant's app once the payment is made.

In order to keep the good UX the merchant app **have to** initialize Skrill Checkout with **return_url** which on the other hand should  be registered in 
the app as an **Android App Link**. This means that when the payment is made and the browser loads the return_url then the app will be able to 
intercept that url and get back to foreground again.

## Technical guidelines
1. Skrill Checkout url should be loaded in a browser or Custom Tabs (out-of-process).
2. An Android App Link should be registered in the application.
[Step-by-step guide](https://developer.android.com/studio/write/app-link-indexing)
3. Host a *.well-known/assetlinks.json* file on your domain:
[App Links verification guidelines](https://developer.android.com/training/app-links/verify-android-applinks)
4. Define proper *launchMode* for the  Activity that handles the *App Links* depending on your needs.

## About this sample
[GitHub Pages](https://github.com/viktormitev1/viktormitev1.github.io) is used to host the *.well-known/assetlinks.json* for simplicity. 
Note that a debug certificate is used to generate the json file used in the sample which means that auto verification won't work anywhere and 
disambiguation dialog will appear on loading the *return_url*. This should not be the case with release certificate.

## Running the app
No special steps required to run the app. Import the project in Android Studio and run it.
