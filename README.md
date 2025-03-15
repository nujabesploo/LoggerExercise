# 🚀 Java Logger Demo  

> A simple yet powerful Java application showcasing structured logging with different severity levels using `java.util.logging.Logger`.  

## 📸 Screenshot  
Take a sneak peek at the code in action:  
![Project Screenshot](./image.png)  

---

## 🔥 Introduction  

Logging is an essential tool for debugging, monitoring, and maintaining software applications. This project demonstrates how to effectively use Java's built-in `Logger` to log messages at multiple severity levels, making it easier to track execution flow and potential issues.  

Whether you're debugging an issue, monitoring performance, or handling errors gracefully, this logger setup has you covered!  

---

## ✨ Features  

✔️ **Structured Logging:** Well-organized log messages with different levels of severity.  
✔️ **Built-in Java Utility:** Uses `java.util.logging.Logger`, eliminating the need for external dependencies.  
✔️ **Customizable Messages:** Modify the `logMeLikeYouDo()` function to tailor log output for your application.  
✔️ **Easy to Integrate:** Can be easily added to any Java project for quick and effective logging.  

---

## 🛠 Installation & Setup  

To get started with this project, follow these steps:  

1️⃣ **Clone this repository**  
```sh
git clone https://github.com/yourusername/your-repo.git
cd your-repo
```  

2️⃣ **Open the project in your favorite Java IDE** (e.g., IntelliJ, Eclipse, VS Code).  

3️⃣ **Run the `App.java` file**  
```sh
javac App.java
java App
```  

4️⃣ **Observe the logged output** in the console, categorized by severity levels!  

---

## 📜 How It Works  

The core functionality is handled by the `logMeLikeYouDo(String input)` method. This function logs messages at various severity levels:  

```java
private static void logMeLikeYouDo(String input) {
    logger.log(Level.FINE, "This is debug: " + input);
    logger.log(Level.INFO, "This is info: " + input);
    logger.log(Level.WARNING, "This is warn: " + input);
    logger.log(Level.SEVERE, "This is error: " + input);
    logger.log(Level.SEVERE, "This is fatal: " + input);
}
```  

Each log level serves a specific purpose:  

🔹 `FINE` – Debugging messages, useful for developers.  
ℹ️ `INFO` – General information about application execution.  
⚠️ `WARNING` – Indications of potential issues.  
❌ `SEVERE` – Errors that need immediate attention.  
🔥 `FATAL` (also logged as `SEVERE`) – Critical failures that might cause the program to crash.  

---

## 🎯 Customization  

Want to make the logging even more powerful? You can:  
- Modify the log format by configuring `Logger` settings.  
- Redirect logs to a file instead of the console.  
- Adjust log levels dynamically based on your needs.  

---

## ✨ Crediting & Publishing

If you use or modify this project:  
✔️ **Give credit** by mentioning the original project in your repository.  
✔️ **Feel free to fork** and customize for your own needs.  
✔️ **Publish improvements** and contribute back to the community!  

If you plan to **publish** your own version, please:  
📌 Include an acknowledgment to this original repository.  
📌 Clearly document any modifications or enhancements you've made.  

---
