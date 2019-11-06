# Sample maven project to use methods provided by java proto class.

1.It contains code to write Person Message serialized object to file and read file to give back Person object.<br/>
2.Since PersonOuterClass class is generated from proto file.The PersonOuterClass java class has methods provided by protoBuffer.
<br/> so we need to add below dependency in pom to resolve imports -<br/>
  <dependency>
			<groupId>com.google.protobuf</groupId><br/>
			<artifactId>protobuf-java</artifactId><br/>
			<version>3.5.1</version><br/>
		</dependency>
