import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class RestAssuredTest {

    @Test
    void test1(){

        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println("Response: " + response.asString());
        System.out.println("STATUS CODE: " + response.getStatusCode());
        System.out.println("Body: " + response.getBody().asString());
        System.out.println("Get Time: " + response.getTime());
        System.out.println("Get Header: " + response.getHeader("content-type"));

    }
}