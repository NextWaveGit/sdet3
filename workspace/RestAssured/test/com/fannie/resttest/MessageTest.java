package com.fannie.resttest;

import static com.jayway.restassured.RestAssured.when;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.is;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static com.jayway.restassured.RestAssured.given;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.fanniemae.entity.Message;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;

import org.junit.BeforeClass;
import org.junit.Test;

import com.jayway.restassured.RestAssured;

public class MessageTest {
	
	@BeforeClass
	public static void init(){
		RestAssured.baseURI ="http://localhost:9090/DynamicWorks/resources";
	}

	
	/**
	 * @throws ParseException 
	 * @see This test case will fail whn you have an entry in the rest service, as it is expecting empty
	 */
/*	@Test
	public void getMessagesTest(){
		
		when()
			.get("/message")
		.then()
			.statusCode(200)
			.body("", is(empty()));
	}
*/	
	
	@Test 
	public void postMessageSimpleTest() throws ParseException{	
		// version 1.0 for testing only the posting of the job 
		/*
		 * {
			"messageId": 101
			"msg": "Hello There"
			"author": "Naveen"
			}
		 */
		Message message= new Message(115, "harsha", "i like writing",
				new SimpleDateFormat( "dd-MMM-yyyy" ).parse( "23-FEB-2017" ));

		given()
		.contentType(ContentType.JSON)
		.body(message)
	.when()
		.post("/message")
	.then()
		.statusCode(200)
		.body("messageId", is(message.getMessageId()))
		.body("msg", is(message.getMsg()))
		.body("author", is(message.getAuthor()));
		
	}
	
	@Test
	public void postMessageCompleteTest() throws ParseException{
		// Sample data model 
		/*
		 * {
			"messageId": 101
			"msg": "Hello There"
			"author": "Naveen"
			}
		 */
	
		
		// version 2.0, this is the complete test case for testing and validating 
		Message message= new Message(114, "Scott", "i like writing", 
				new SimpleDateFormat( "dd-MMM-yyyy" ).parse( "23-FEB-2017" ));
		Integer messageId = 
		given()
			.contentType(ContentType.JSON)
			.body(message)
		.when()
			.post("/message")
		.then()
			.statusCode(200)
			.body("messageId", is(message.getMessageId()))
			.body("msg", is(message.getMsg()))
			.body("author", is(message.getAuthor()))
		.extract()
			.path("messageId");
		
		given()
			.pathParam("messageId", messageId)
		.when()
			.get("/message/{messageId}")
		.then()
			.statusCode(200)
			.body("messageId", is(message.getMessageId()))
			.body("msg", is(message.getMsg()))
			.body("author", is(message.getAuthor()));
		
	}
	

	@Test
	public void deleteMessageTest(){
		// msg received from the rest 
		// "Message Deleted "+ messageId;
		// delete method takes only 1 path param 
		int messageId  = 101;
		given()
			.pathParam("messageId", messageId)
		.when()
			.delete("/message/{messageId}")
		.then()
			.statusCode(200)
			.body("message", is("Message Deleted "+messageId));
	}
}
