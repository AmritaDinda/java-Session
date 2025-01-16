package WebDriver_Arch;

public interface webDriver extends SearchContext{
	
	public void get(String url);
	
	public String getTitle();
	
	public void click(String elements);
	
	public void sendKey(String elements,String value);
	
	public void close();
	
	@Override
	public void findElements(String elements);

	

}
