package main;

import org.junit.Test;
import uitis.UrlTools;
import java.util.HashMap;

public class initTest  extends loginMain {
    public static HashMap<String,Object> dataDevicesId= new HashMap<String, Object>();
    mainTest main = new mainTest();

    //职位搜索
    @Test
    public void Login(){

        dataDevicesId.put("pageStart", "0");
        dataDevicesId.put("pageLimit", "10");
        dataDevicesId.put("workAddr", "北京");

        main.sendPost3(dataDevicesId, UrlTools.souzhiwei,strCookie,"res111ult");
        System.out.println(strCookie);
    }
    //微聊登录
    @Test
    public void gerenLogin(){

        dataDevicesId.put("username", "18310614641");
        dataDevicesId.put("password", "123456a");
//        main.sendPost2("\"username\",\"18310614641\",\"password\",\"123456a\"", UrlTools.gerenloginUrl);
    }

}
