import Oop_Abstract.LoginPage;
import Oop_Abstract.Page;

public class PageTes {

	public static void main(String[] args) {

			LoginPage lp = new LoginPage(10);
			lp.title();
			lp.url();
			lp.pageTimeLoad();
			lp.forgotpwd();
			lp.displayLogo();
			Page.footer();
			LoginPage.footer();
		
			System.out.println("--------");
			
			//child class object can referred by parent abstract class ref variables
			//top casting
			Page p = new LoginPage();
			p.title();
			p.url();
			p.pageTimeLoad();
			p.displayLogo();

			//down casting // NA
			//LoginPage lo = new Page();
			
			
	}

}
