def call(String message, int times = 1) {
    // לולאת Groovy פשוטה שמדפיסה את ההודעה מספר פעמים
    for (int i = 0; i < times; i++) {
        echo "${i + 1}: ${message}"
    }
}