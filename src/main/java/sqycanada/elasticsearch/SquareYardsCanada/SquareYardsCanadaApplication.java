package sqycanada.elasticsearch.SquareYardsCanada;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("sqycanada.elastic")
public class SquareYardsCanadaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SquareYardsCanadaApplication.class, args);
	}

}
