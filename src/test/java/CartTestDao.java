import javax.sql.DataSource;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.project.dao.CartDao;
import com.project.dao.CartDaoImplementation;
import com.project.sources.Cart;

public class CartTestDao {
	static ApplicationContext context;
	static DataSource dataSource ;
	private static final Logger logger = Logger.getLogger(CartTestDao.class);

	static CartDao cartDao;
	@BeforeClass
	public static void setUp()
	{
		context = new FileSystemXmlApplicationContext("src\\main\\webapp\\WEB-INF\\springDispatcherServlet-servlet.xml");
		dataSource = (DataSource) context.getBean("dataSource");
		cartDao = new CartDaoImplementation();
		cartDao.setDataSource(dataSource);
		BasicConfigurator.configure();
		
	}
	
	/*@Test
	public void testAddToCart() {
		Cart c = new Cart(2,1,"-1","2");
		cartDao.addToCart(c);
		Cart c1 = new Cart(2,2,"1","-1");
		cartDao.addToCart(c1);
		Cart c2 = new Cart(1,1,"-1","3");
		cartDao.addToCart(c2);
		Cart c3 = new Cart(1,2,"1","-1");
		cartDao.addToCart(c3);
	}*/
	
	@Test
	public void testDeleteFromCart() {
		cartDao.deleteFromCart(2);
	}
	
	@Test
	public void testDeleteItemFromCart() {
		
		cartDao.deleteItemFromCart(1,"2");
	}
	
}
