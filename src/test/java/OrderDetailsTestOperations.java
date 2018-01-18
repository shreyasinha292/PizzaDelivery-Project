import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.project.dao.OrderDetailsImlp;
import com.project.dao.OrderDetailsOperation;
import com.project.sources.OrderDetails;

public class OrderDetailsTestOperations {

	
	static ApplicationContext context;
	static DataSource dataSource ;
	private static final Logger logger = Logger.getLogger(CustomerTestDao.class);

	static OrderDetailsOperation orderDetailsOperation;
	@BeforeClass
	public static void setUp()
	{
		context = new FileSystemXmlApplicationContext("src\\main\\webapp\\WEB-INF\\springDispatcherServlet-servlet.xml");
		dataSource = (DataSource) context.getBean("dataSource");
		orderDetailsOperation = new OrderDetailsImlp();
		orderDetailsOperation.setDataSource(dataSource);
		BasicConfigurator.configure();
		
	}
	
	@Test
	public void addOrders() {
		
		OrderDetails od = new OrderDetails(1,5,"1",null,1);
		OrderDetails od1 = new OrderDetails(2,5,"2",null,2);
		OrderDetails od2 = new OrderDetails(3,6,"1",null,3);
		OrderDetails od3 = new OrderDetails(4,6,null,"1",1);
		List<OrderDetails> odList = new ArrayList<OrderDetails>();
		odList.add(od);
		odList.add(od1);
		odList.add(od2);
		odList.add(od3);
		
		orderDetailsOperation.addOrders(odList);
	}
	
	@Test
	public void displayAllOrderDetails() {
		
		List<OrderDetails> odlist = orderDetailsOperation.displayAllOrderDetails();
		for(OrderDetails od : odlist) {
			
			logger.info(od.getOdId() + " " + od.getOrderId()+" " +od.getCpId() + " "+ od.getItemId() +" "+od.getQuantity());
		}
		
	}

	@Test
	public void displayOrderDetailsById() {
		
		OrderDetails od = orderDetailsOperation.displayOrderDetailsById("5");
		logger.info(od.getOdId() + " " + od.getOrderId()+" " +od.getCpId() + " "+ od.getItemId() +" "+od.getQuantity());
		
	}
	
	
	
}
