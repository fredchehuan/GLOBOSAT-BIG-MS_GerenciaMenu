package br.com.gsat.big.gerenciademenus;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.gsat.big.gerenciademenus.utils.SenhaUtils;

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
			//System.out.println("QTD MÁXIMA DE MENUS = " + this.qtdMenus);
			
			String senhaEncoded = SenhaUtils.gerarBCrypt("123456");
			System.out.println(senhaEncoded);
			
			senhaEncoded = SenhaUtils.gerarBCrypt("123456");
			System.out.println("Nova Criptografia: " + senhaEncoded);
			
			System.out.println("Senha Válida: " + SenhaUtils.senahValida("123456", senhaEncoded));
		};
	}
}