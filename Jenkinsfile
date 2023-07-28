node {
  stage("Clone  the project") {
 script {
          docker.withRegistry( 'https://registry.hub.docker.com', registryCredential ) {
            dockerImage.push("latest")
          }
        }
   git branch: 'dev', credentialsId: 'Sebas9112-col_git', url: 'https://github.com/Sebas9112-col/test.devops.git'
  }

  stage("Compilation") {
    sh "mvn clean install -DskipTests"
  }

  stage('SonarQube Analysis') {
    withSonarQubeEnv() {
      sh "mvn clean verify sonar:sonar -Dsonar.projectKey=devops -Dsonar.projectName='devops'"
    }
  }

  stage("Tests and Deployment") {
    stage("Runing unit tests") { 
      sh "mvn test -Punit"
    }
    stage("Deployment") {
      sh 'nohup dmvn spring-boot:run -Dserver.port=8001 &'
    }
  }
}