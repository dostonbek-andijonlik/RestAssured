import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class LoginAuth {
   @Test
   void login(){
    RestAssured.baseURI = "https://testmobile.anorbank.uz/api/v2/authenticate";
       RequestSpecification request = RestAssured.given();

   }
}
