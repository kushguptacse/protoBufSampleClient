# protoBufSampleClient
*proto buffer sample maven client fro java application.
1.It contains code to write Person Message serialized object to file and read file to give back Person object.
2.Since PersonOuterClass class is generated from proto file.The PersonOuterClass java class has methods provided by protoBuffer. so we need to add below dependency in pom to resolve imports -
  <dependency>
			<groupId>com.google.protobuf</groupId>
			<artifactId>protobuf-java</artifactId>
			<version>3.5.1</version>
		</dependency>
