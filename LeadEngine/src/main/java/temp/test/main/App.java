package temp.test.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.aspire.hackathon.bean.Lead;
import com.aspire.hackathon.config.AppConfig;
import com.aspire.hackathon.service.ILeadService;

public class App {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ILeadService leadService = (ILeadService) context.getBean("leadService");
		
		System.out.println("Record insert begins !!");
		Lead leadObj = new Lead("Veera", 979113, "veerabecse11@gmail.com");
		leadService.create(leadObj);
		System.out.println("insert success !!");
		
		System.out.println("Find All!!");
		List<Lead> leads = leadService.findAll();
        for (Lead lead: leads) {
            System.out.println(lead);
        }
        context.close();
	}

}
