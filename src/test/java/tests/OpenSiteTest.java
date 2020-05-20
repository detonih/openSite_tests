package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenSiteTest {
	
	//Define variavel do WebDriver (chrome)
	private WebDriver driver;
	
	// annotation. Colocaremos detalhes para acesso para manipular o navegador
	@Before
	public void setUp() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	//Comandos executados apos os testes (vai fechar o navegador)
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
