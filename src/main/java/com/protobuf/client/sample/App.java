package com.protobuf.client.sample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.protobuf.client.sample.model.PersonOuterClass;
import com.protobuf.client.sample.model.PersonOuterClass.Person;
import com.protobuf.client.sample.model.PersonOuterClass.Person.Builder;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!!!");
		testProtoBuf1();
	}

	private static void testProtoBuf1() {
		Builder builder = PersonOuterClass.Person.newBuilder();
		builder.setAge(19);
		builder.setFirstName("Chris");
		builder.setLastName("Gayle").setIsProfileVerified(true);
		builder.addPhoneNumbers("9999888800");
		builder.addPhoneNumbers("9999888801").addPhoneNumbers("9999888802");
		System.out.println(builder.toString());
		Person person = builder.build();
		System.out.println("-------------------------------");
		System.out.println(person.toString());
		writeFile(person, "personSer.bin");
		readFile("personSer.bin");
	}

	private static void writeFile(Person person, String filePath) {
		System.out.println("writing message to file: " + filePath);

		try (OutputStream out = new FileOutputStream(filePath)) {
			person.writeTo(out);
			// To get byte array below commented method can be used-
			// person.toByteArray();
		} catch (IOException ex) {
			System.out.println(ex);
		}

	}

	private static void readFile(String filePath) {
		try (InputStream in = new FileInputStream(filePath)) {
			Person person = PersonOuterClass.Person.parseFrom(in);
			System.out.println("-------------------------------");
			System.out.println(person.toString());
		} catch (IOException ex) {
			System.out.println(ex);
		}
	}
}
