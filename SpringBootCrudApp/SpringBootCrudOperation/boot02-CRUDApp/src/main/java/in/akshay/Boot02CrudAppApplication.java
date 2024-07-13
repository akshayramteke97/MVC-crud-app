package in.akshay;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import in.akshay.controller.MainController;
import in.akshay.vo.StudentVo;

@SpringBootApplication
public class Boot02CrudAppApplication {
	
	@Bean
	public LocalDate createLocalDate() {
		
		LocalDate now = LocalDate.now();
		
		return now;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the student name : ");
		String sname=scan.next();
		System.out.print("Enter the studetn address : ");
		String saddress=scan.next();
		System.out.print("Enter the student age : ");
		String sage=scan.next();
		System.out.print("Enter the studetn date of birth(yyyy-MM-dd): ");
		String dob=scan.next();
		StudentVo vo=new StudentVo();
		vo.setSname(sname);
		vo.setSaddrss(saddress);
		vo.setSage(sage);
		vo.setSdob(dob);
		ApplicationContext context = SpringApplication.run(Boot02CrudAppApplication.class, args);
		MainController controller = context.getBean(MainController.class);
		String processSave = controller.processSave(vo);
		System.out.println(processSave);
	}

}
