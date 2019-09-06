pipeline
{

   agent
   {
	label 'master'
   }

   tools
   {
	jdk 'JDK8'
	maven 'mvn'
   }
   
stages 
{

	stage('Checkout')
	{
	 	steps
		{	
		 	checkout scm
		}
	}	

	stage('Build')
	{
	 	steps
		{	
		 	bat 'mvn clean install'
		}
	}


	stage('Unit Tests')
	{
	 	steps
		{	
		 	bat 'mvn clean site'
		}
	}

	stage('Publish Test Coverage')
	{
	 	steps
		{	
		 	publishHTML([
				allowMissing : true,
				alwaysLinkToLastBuild : true,
				keepAll: true,
				reportDir: 'target\\site',
				reportFiles: 'surefire-report.html',
				reportName: 'Junit Test Report',
				reportTitles: ''])
			
		}
	}
	stage('Publish Java Docs')
	{
	 	steps
		{	
		 	publishHTML([
				allowMissing : true,
				alwaysLinkToLastBuild : true,
				keepAll: true,
				reportDir: 'target\\site\\apidocs',
				reportFiles: 'index.html',
				reportName: 'Java Docs Link',
				reportTitles: ''])
			
		}
	}
	

}


}
	
