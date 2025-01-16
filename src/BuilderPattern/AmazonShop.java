package BuilderPattern;

public class AmazonShop {

	public static void main(String[] args) {

		
		Shopping sh = new Shopping();
		
		//sc1:
		sh.login("nop@gmail.com","nps!@#123")
		        .search("Tshirt")
		               .adTOCart("Tshirt")
		                        .doPayment("1212 1211 1212 1212",1234)
		                                  .genrateOrder()
		                                               .logOut();
		
		//sc2:
		sh.login("nozawp@gmail.com","np!@#123")
		        .search("MacBook")
		               .adTOCart("MacBook")
		                        .logOut();
		
		//sc3:
		sh.login("pozawp@gmail.com","p!@#123")
                .doPayment("1213 1311 1233 1232",234221)
                         .genrateOrder().logOut();
		
		//sc4:
		sh.login("zawp@gmail.com","aw!@#123").logOut();
                 
	}

}
