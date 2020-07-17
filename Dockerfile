FROM openjdk

COPY target/student-0.0.1-SNAPSHOT.jar /opt/student-0.0.1-SNAPSHOT.jar

CMD ["java","-jar","/opt/student-0.0.1-SNAPSHOT.jar","&"]