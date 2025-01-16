package Oop_Abstract;

public class PageTest {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage();
		lp.title();
		lp.url();
		lp.pageTimeLoad();
		lp.forgotpwd();
		lp.displayLogo();
		
		Page.footer();
		LoginPage.footer();
		
		//top casting:
		Page p = new LoginPage();
		p.title();
		p.url();
		p.pageTimeLoad();
		p.displayLogo();
		
		
		
		
		
	}

}
