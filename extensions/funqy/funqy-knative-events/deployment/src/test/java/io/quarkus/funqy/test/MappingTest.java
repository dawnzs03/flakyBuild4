package io.quarkus.funqy.test;

import static org.hamcrest.Matchers.*;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import io.quarkus.test.QuarkusUnitTest;
import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.parsing.Parser;

public class MappingTest {
    @RegisterExtension
    static QuarkusUnitTest test = new QuarkusUnitTest()
            .withApplicationRoot((jar) -> jar
                    .addAsResource("trigger.properties", "application.properties")
                    .addClasses(PrimitiveFunctions.class, GreetingFunctions.class, Greeting.class, GreetingService.class,
                            Identity.class));

    @Test
    public void testMapping() {
        RestAssured.given().contentType("application/json")
                .header("ce-id", UUID.randomUUID().toString())
                .header("ce-specversion", "1.0")
                .header("ce-type", "tolower")
                .header("ce-source", "test")
                .body("\"HELLO\"")
                .post("/")
                .then().statusCode(200)
                .header("ce-id", notNullValue())
                .header("ce-type", "lowercase")
                .header("ce-source", "to.lowercase")
                .body(equalTo("\"hello\""));
    }

    @Test
    public void testAnnotatedMapping() {
        RestAssured.given().contentType("application/json")
                .header("ce-id", UUID.randomUUID().toString())
                .header("ce-specversion", "1.0")
                .header("ce-type", "echo")
                .header("ce-source", "test")
                .body("\"HELLO\"")
                .post("/")
                .then().statusCode(200)
                .header("ce-id", notNullValue())
                .header("ce-type", "echo.output")
                .header("ce-source", "echo")
                .body(equalTo("\"HELLO\""));
    }

    @Test
    public void testNoopDefaultMapping() {
        RestAssured.given()
                .config(RestAssured.config.encoderConfig(
                        EncoderConfig.encoderConfig().appendDefaultContentCharsetToContentTypeIfUndefined(false)))
                .contentType("")
                .header("ce-id", UUID.randomUUID().toString())
                .header("ce-specversion", "1.0")
                .header("ce-type", "noop")
                .header("ce-source", "test")
                .post("/")
                .then().statusCode(204)
                .header("ce-id", nullValue())
                .header("ce-type", nullValue())
                .header("ce-source", nullValue());
    }

    @Test
    public void testNoopDefaultMappingGet() {
        RestAssured.given()
                .config(RestAssured.config.encoderConfig(
                        EncoderConfig.encoderConfig().appendDefaultContentCharsetToContentTypeIfUndefined(false)))
                .contentType("")
                .header("ce-id", UUID.randomUUID().toString())
                .header("ce-specversion", "1.0")
                .header("ce-type", "noop")
                .header("ce-source", "test")
                .get("/")
                .then().statusCode(204)
                .header("ce-id", nullValue())
                .header("ce-type", nullValue())
                .header("ce-source", nullValue());
    }

    @Test
    public void testNoopGet() {
        RestAssured.given()
                .config(RestAssured.config.encoderConfig(
                        EncoderConfig.encoderConfig().appendDefaultContentCharsetToContentTypeIfUndefined(false)))
                .contentType("")
                .get("/noop")
                .then().statusCode(204)
                .header("ce-id", nullValue())
                .header("ce-type", nullValue())
                .header("ce-source", nullValue());
    }

    @Test
    public void testDefaultMapping() {
        RestAssured.given().contentType("application/json")
                .header("ce-id", UUID.randomUUID().toString())
                .header("ce-specversion", "1.0")
                .header("ce-type", "doubleIt")
                .header("ce-source", "test")
                .body("2")
                .post("/")
                .then().statusCode(200)
                .header("ce-id", notNullValue())
                .header("ce-type", "doubleIt.output")
                .header("ce-source", "doubleIt")
                .body(equalTo("4"));
    }

    @Test
    public void testHttp() {
        RestAssured.given().contentType("application/json")
                .body("\"HELLO\"")
                .post("/toLowerCase")
                .then().statusCode(200)
                .header("ce-id", nullValue())
                .header("ce-type", nullValue())
                .header("ce-source", nullValue())
                .body(equalTo("\"hello\""));
    }

    @Test
    public void testNoTrigger() {
        RestAssured.given().contentType("application/json")
                .header("ce-id", UUID.randomUUID().toString())
                .header("ce-specversion", "1.0")
                .header("ce-type", "foo")
                .header("ce-source", "test")
                .body("2")
                .post("/")
                .then().statusCode(404);
    }

    static final String toLowercaseEvent = "{ \"id\" : \"1234\", " +
            "  \"specversion\": \"1.0\", " +
            "  \"source\": \"test\", " +
            "  \"type\": \"tolower\", " +
            "  \"datacontenttype\": \"application/json\", " +
            "  \"data\": \"HELLO\" " +
            "}";

    @Test
    public void testStructuredMapping() {
        RestAssured.given().contentType("application/cloudevents+json")
                .body(toLowercaseEvent)
                .post("/")
                .then().statusCode(200)
                .defaultParser(Parser.JSON)
                .body("id", notNullValue())
                .body("specversion", equalTo("1.0"))
                .body("type", equalTo("lowercase"))
                .body("source", equalTo("to.lowercase"))
                .body("datacontenttype", equalTo("application/json"))
                .body("data", equalTo("hello"));
    }

    static final String doubleItEvent = "{ \"id\" : \"1234\", " +
            "  \"specversion\": \"1.0\", " +
            "  \"source\": \"test\", " +
            "  \"type\": \"doubleIt\", " +
            "  \"datacontenttype\": \"application/json\", " +
            "  \"data\": 2 " +
            "}";

    @Test
    public void testStructuredDefaultMapping() {
        RestAssured.given().contentType("application/cloudevents+json")
                .body(doubleItEvent)
                .post("/")
                .then().statusCode(200)
                .defaultParser(Parser.JSON)
                .body("id", notNullValue())
                .body("specversion", equalTo("1.0"))
                .body("type", equalTo("doubleIt.output"))
                .body("source", equalTo("doubleIt"))
                .body("datacontenttype", equalTo("application/json"))
                .body("data", equalTo(4));
    }

    static final String echoEvent = "{ \"id\" : \"1234\", " +
            "  \"specversion\": \"1.0\", " +
            "  \"source\": \"test\", " +
            "  \"type\": \"echo\", " +
            "  \"datacontenttype\": \"application/json\", " +
            "  \"data\": \"HELLO\" " +
            "}";

    @Test
    public void testStructuredAnnotatedMapping() {
        RestAssured.given().contentType("application/cloudevents+json")
                .body(echoEvent)
                .post("/")
                .then().statusCode(200)
                .defaultParser(Parser.JSON)
                .body("id", notNullValue())
                .body("specversion", equalTo("1.0"))
                .body("type", equalTo("echo.output"))
                .body("source", equalTo("echo"))
                .body("datacontenttype", equalTo("application/json"))
                .body("data", equalTo("HELLO"));
    }

    static final String noTriggerEvent = "{ \"id\" : \"1234\", " +
            "  \"specversion\": \"1.0\", " +
            "  \"source\": \"test\", " +
            "  \"type\": \"nobody\", " +
            "  \"datacontenttype\": \"application/json\", " +
            "  \"data\": 2 " +
            "}";

    @Test
    public void testStructuredNoTrigger() {
        RestAssured.given().contentType("application/cloudevents+json")
                .body(noTriggerEvent)
                .post("/")
                .then().statusCode(404);
    }

    static final String noopEvent = "{ \"id\" : \"1234\", " +
            "  \"specversion\": \"1.0\", " +
            "  \"source\": \"test\", " +
            "  \"type\": \"noop\" " +
            "}";

    @Test
    public void testStructuredNoop() {
        RestAssured.given().contentType("application/cloudevents+json")
                .body(noopEvent)
                .post("/")
                .then().statusCode(204);
    }

}
