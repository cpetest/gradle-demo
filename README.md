# Java Spring boot web application

| Language | Framework | Platform 
| -------- | -------- |--------|
| Java | SpringBoot | ServiceStage Web App, CCE Cluster|

This sample code helps get you started with a simple Java web application
deployed by ServiceStage WebApp to a CCE Cluster.

This sample includes:

* README.md
* License.md
* pom.xml - this file is the Maven Project Object Model for the web application
* src/main - this directory contains your Java service source files
* src/test - this directory contains your Java service unit test files

## Getting Started

Clone your code repository and start developing your application on IDE of your choice

1. Install maven.  See https://maven.apache.org/install.html for details.

2. Install tomcat.  See https://tomcat.apache.org/tomcat-8.0-doc/setup.html for
   details.

3. Build the application.

        $ mvn -f pom.xml package

4. Copy the built application to the Tomcat webapp directory.  The actual
   location of that directory will vary depending on your platform and
   installation.

        $ cp target/ROOT.war <tomcat webapp directory>

4. Restart your tomcat server

5. Open http://127.0.0.1:8080/ in a web browser to view your application.

if you want to deploy the sample code on servicestage, View your CI/CD pipeline and service stack on ServiceStage and customize it as per your needs

## License:

See [LICENSE](LICENSE).

## Contributing

