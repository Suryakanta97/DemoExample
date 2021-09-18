# compile logging  module
# javac --module-path mods -d mods/com.surya.logging src/modules/com.surya.logging/module-info.java src/modules/com.surya.logging/com/surya/logging/*.java

# compile logging slf4j module
javac --module-path mods -d mods/com.surya.logging.slf4j src/modules/com.surya.logging.slf4j/module-info.java src/modules/com.surya.logging.slf4j/com/surya/logging/slf4j/*.java


# compile logging main app module
javac --module-path mods -d mods/com.surya.logging.app src/modules/com.surya.logging.app/module-info.java src/modules/com.surya.logging.app/com/surya/logging/app/*.java

# run logging main app
# java --module-path mods -m com.surya.logging.app/com.surya.logging.app.MainApp

# run looging main app using logback
java --module-path mods -Dlogback.configurationFile=mods/logback.xml -m com.surya.logging.app/com.surya.logging.app.MainApp
