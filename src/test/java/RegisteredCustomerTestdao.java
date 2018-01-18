import javax.sql.DataSource;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.project.dao.CartDao;
import com.project.dao.CartDaoImplementation;
import com.project.dao.RegisteredCustomerDao;
import com.project.dao.RegisteredCustomerDaoImplementation;
import com.project.sources.Registered_Customers;

public class RegisteredCustomerTestdao {
	static ApplicationContext context;
	static DataSource dataSource ;
	private static final Logger logger = Logger.getLogger(RegisteredCustomerTestdao.class);

	static RegisteredCustomerDao registerCustomerDao;
	@BeforeClass
	public static void setUp()
	{
		context = new FileSystemXmlApplicationContext("src\\main\\webapp\\WEB-INF\\springDispatcherServlet-servlet.xml");
		dataSource = (DataSource) context.getBean("dataSource");
		registerCustomerDao = new RegisteredCustomerDaoImplementation();
		registerCustomerDao.setDataSource(dataSource);
		BasicConfigurator.configure();
		
	}
	
	@Test
	public void testAddRegisteredCustomer() {
		Registered_Customers rc = new Registered_Customers(1,"22/09/1996", "shreya123","SS11" );
		registerCustomerDao.addRegisteredCustomer(rc);
		Registered_Customers rc1 = new Registered_Customers(2,"23/09/1996", "eeshan221","ES22" );
		registerCustomerDao.addRegisteredCustomer(rc1);
	}
}
