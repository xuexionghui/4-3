
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.junlaninfo.dao.RedisDao;




public class redisSpringbootApplicationTests {
     
     @Autowired
     private static RedisDao  redisDao;
     
     public static void main(String[] args) {
        	 redisDao.setKey("name", "xuexionghui");
        	  System.out.println("111"+redisDao.getValue("name"));
        
         
	}
}
