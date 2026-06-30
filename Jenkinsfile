pipeline{
  agent any{
    stages{
      stage('clone')
      {
        steps{
          git branch 'main','url':
        }
      }
      stage('build')
      {
        steps{
          sh javac calculator.java 
        }
      }
      stage('test')
      {
        steps{
          sh java calculator 25 5
        }
      }
