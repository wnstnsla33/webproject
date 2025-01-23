package web.prac;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import com.sist.member.Member;
import com.sist.member.MemberRepository;

@SpringBootApplication
@ComponentScan(basePackages = {"com.sist.member", "com.sist.post"})
@EntityScan(basePackages = {"com.sist.member", "com.sist.post"})
public class PracApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(PracApplication.class, args);
		
		
	}

}
