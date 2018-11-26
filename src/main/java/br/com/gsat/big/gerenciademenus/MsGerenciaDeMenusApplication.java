package br.com.gsat.big.gerenciademenus;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MsGerenciaDeMenusApplication {
	
	@Value("${qtdmax.menu.principal}")
	private int qtdMenus;

	public static void main(String[] args) {
		SpringApplication.run(MsGerenciaDeMenusApplication.class, args);
		//System.out.println("TEste Gerencia de MEnus");
	}
	
	@Bean
	public CommandLineRunner commandLineRUnner() {
		return args -> {
			System.out.println("QTD MÁXIMA DE MENUS = " + this.qtdMenus);
		};
	}
}