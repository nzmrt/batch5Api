package techproedbatch5;
import static io.restassured.RestAssured.*;
public class PostRequest04 extends TestBase {

     /*  POST Scenario:
                Content type Json olsun  (Content Type demektir.)
                When
                POST request yolladigimda
			 1) https://restful-booker.herokuapp.com/booking
            2) Request Body
            {
                "firstname": "Hasan",
                  "lastname": "Kara",
                  "totalprice": 123,
                  "depositpaid": true,
                 "bookingdates": {
                "checkin": "2020-05-02",
                "checkout": "2020-05-05"
            },
                "additionalneeds": "Wifi"
            }
            Then
            Status Code 200 olmali
            Response Body, Request Body ile ayni olduğunu verfy ediniz

            POJO: Plain Old Java Object

            POJO: Json formatindaki data yi Class lara cevirme islemine denir.

            http://www.jsonschema2pojo.org/ adresine gidilir
            Data parantezden diğer paranteze kopyalanıp siteye tasinir.
            sol tarafta class name--> Booking  target --> java  source type -->Json olacak
            daha sonra preview ile class olusturulacak.
            Keylerin hepsi variable olarak tanimlandi.



*/
}
