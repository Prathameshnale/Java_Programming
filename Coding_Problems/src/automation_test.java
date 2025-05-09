//package codingPractice;
//
//
//
//import static io.restassured.RestAssured.given;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import org.junit.jupiter.api.Test;
//
//import io.restassured.http.ContentType;
//import io.restassured.response.Response;
//
//public class CreateUserAPITest {
//
//    String baseUrl = "https://bfhldevapigw.healthrx.co.in/automation-campus/create/user";
//
//    @Test
//    public void testCreateUserPositive() {
//        // Positive Test Case
//        Response response = given()
//                .header("roll-number", "1")
//                .contentType(ContentType.JSON)
//                .body("{\n" +
//                        " \"firstName\": \"Test\",\n" +
//                        " \"lastName\": \"Test\",\n" +
//                        " \"phoneNumber\": 9999999999,\n" +
//                        " \"emailId\": \"test.test@test.com\"\n" +
//                        "}")
//                .post(baseUrl);
//        
//        assertEquals(200, response.getStatusCode());
//    }
//
//    @Test
//    public void testCreateUserMissingFields() {
//        // Negative Test Case: Omitting required fields
//        Response response = given()
//                .header("roll-number", "1")
//                .contentType(ContentType.JSON)
//                .body("{\n" +
//                        " \"lastName\": \"Test\",\n" +
//                        " \"phoneNumber\": 9999999999,\n" +
//                        " \"emailId\": \"test.test@test.com\"\n" +
//                        "}")
//                .post(baseUrl);
//        
//        assertEquals(400, response.getStatusCode());
//    }
//
//    // Add more test cases for invalid data types, email format, etc.
//}
