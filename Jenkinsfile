pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout del repositorio de código
                git 'https://github.com/tu_usuario/tu_proyecto.git'
            }
        }
        
        stage('Unit Tests') {
            steps {
                // Ejecutar pruebas unitarias
                sh 'mvn test'
            }
        }
        
        stage('Build') {
            steps {
                // Compilación del proyecto
                sh 'mvn package'
            }
        }
        
        stage('Deploy') {
            steps {
                // Desplegar la aplicación en tu servidor o entorno de destino
                // Aquí puedes usar scripts o comandos específicos para tu caso
                // Por ejemplo: sh 'scp target/my-spring-boot-app.jar usuario@servidor:/ruta/del/servidor'
            }
        }
    }
}
