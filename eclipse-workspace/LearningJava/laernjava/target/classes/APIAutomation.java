
public class APIAutomation {

	public static void main(String[] args) {
		import static io.restassured.RestAssured.*;
		import static org.hamcrest.Matchers.*;

		public class APITest {

		    private static final String BASE_URL = "https://trading-api-staging.lcx.com";
		    private static final String ENDPOINT = "/wallet/all";

		    @Test
		    public void testGetWalletData() {
		        given()
		            .baseUri(BASE_URL)
		        .when()
		            .get(ENDPOINT)
		        .then()
		           // .statusCode(200) // Assuming 200 is the expected status code
		          //  .body("status", equalTo("success")) // Checks if the "status" field in the response is equal to "success"
		         //   .body("data.wallets.size()", greaterThan(0)); // Checks if the size of "wallets" array is greater than 0
		    }
		}

	}

}
