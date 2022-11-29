package restful_booker;

import io.restassured.RestAssured;
import org.apache.http.HttpStatus;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;

public class GetBookingIds {

    @BeforeMethod
    public void setUp() {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
    }

    @Test
    public void TC_01_Get_All_BookingIds() {
        RestAssured.given()
                .when()
                .basePath("/booking")
                .get()
                .then()
                .statusCode(equalTo(201));
    }
}
