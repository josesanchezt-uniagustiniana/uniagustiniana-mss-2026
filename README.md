# uniagustiniana-mss-2026
Este repositorio se utilizará en la sesión 3 de mantenimiento de software

# compilar proyecto para sonarqube
javac -d out src\*.java 

# analizar proyecto actual usando token de SonarCloud
sonar-scanner -Dsonar.login=fa31cb0a5fbe19bd57774f4457f5a7cbb66f9e7a 

Donde el login es el token que se usa para realizar análisis manual