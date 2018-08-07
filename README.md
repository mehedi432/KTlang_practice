# Kotlin Installing The IDE
kotlin practice for making Android Application.

* Installing Java JDK on ubuntu or Linux *

          ***commands :***

*****For Java Installation (PPA)*****

```sudo add-apt-repository ppa:linuxuprising/java
   sudo apt-get update
   sudo apt-get install oracle-java10-installer```

*****For setting up environment variables (make java10 default)*****
```sudo apt-get install oracle-java10-set-default```

**Setting and installing INTELLij or IDE for Kotlin**
*****For downloading from PPA*****
```sudo add-apt-repository ppa:mmk2410/intellij-idea-community
   sudo apt-get update
   sudo apt-get install intellij-idea-community```

*****To remove IntelliJ installed from the above PPA*****
```sudo apt-get remove intellij-idea-community
   sudo add-apt-repository --remove ppa:mmk2410/intellij-idea-community```


**Setting and installing Android Studio or IDE for Kotlin**
*****For downloading from the ubuntu snap store*****
```sudo snap install android-studio --classic```

*****For downloading from PPA*****
```sudo apt-add-repository ppa:paolorotolo/android-studio
   sudo apt-get update
   sudo apt-get install android-studio```

**Uninstall Android Studio:**
*****If don’t have already, installed PPA Purge:*****
```sudo apt-get install ppa-purge```

***Now use the PPA Purge to purge the installed PPA***
```sudo apt-get remove android-studio
   sudo ppa-purge ppa:paolorotolo/android-studio```

**If Renderer Error in Android Studio**

***In the Android Studio version - 3.1.3*** 
Go to Dependency in Project Structure:

```implementation 'com.android.support:appcompat-v7:28.0.0-alpha3'```
[version 3 to 1], change it to:

```implementation 'com.android.support:appcompat-v7:28.0.0-alpha1'```
This will solve the problem of Preview.

