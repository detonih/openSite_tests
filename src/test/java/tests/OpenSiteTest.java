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
		driver.quit();
	}
	
	
	// Acessa a pagina web
	@Test
	public void test() throws InterruptedException {
		driver.get("http://marcelodebittencourt.com/demopages/demosimplesearch/");
		Thread.sleep(2000);
		// verifica se é verdadeira a asserção
		assertTrue("Titulo da página difere do esperado", driver.getTitle().contentEquals("Demo Simple Search using JavaScript"));
	}

}
