package main;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;

import java.util.ArrayList;
import java.util.List;

public class loginMain {
    public static String strCookie  = "";
    @BeforeClass
    public static void Fistclass(){

        List<String> values = new ArrayList<String>();
        values.add("username");
        values.add("18310614641");
        values.add("password");
        values.add("123456a");
        //发送post请求
        Response response = RestAssured.given()
//                .contentType("application/json")
                .formParams("username","18310614641","password","123456a")
                .when().post("http://support.ezhixin.com/a/userLogin");
        //获得body信息
        String response1 =  response.getBody().asString();
          strCookie = response.getCookie("JSESSIONID");
        System.out.println(strCookie);
        if(response1==null){
            throw new RuntimeException("发送请求不正确");
        }else{
            System.out.println(response1);
        }

    }

}
