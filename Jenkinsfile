node {
  stage("Clone the project") {
   git branch: 'dev', credentialsId: 'Sebas9112-col_git', url: 'https://github.com/Sebas9112-col/test.devops.git'
  }

  stage("Compilation") {
    sh "mvn clean install -DskipTests"
  }

  stage("Tests and Deployment") {
    stage("Runing unit tests") {
      sh "./mvnw test -Punit"
    }
    stage("Deployment") {
      sh 'nohup ./mvnw spring-boot:run -Dserver.port=8001 &'
    }
  }
}