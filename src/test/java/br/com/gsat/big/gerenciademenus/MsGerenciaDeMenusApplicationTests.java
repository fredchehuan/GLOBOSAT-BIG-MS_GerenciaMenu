package br.com.gsat.big.gerenciademenus;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

//teste comentario bla

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("menu")

public class MsGerenciaDeMenusApplicationTests {
	
	//fred
	@Value("${qtdmax.menu.principal}")
	private int qtdMenus2;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testCarregarContextoDeTeste() {
		assertEquals(30, qtdMenus2);
	}
	

}
