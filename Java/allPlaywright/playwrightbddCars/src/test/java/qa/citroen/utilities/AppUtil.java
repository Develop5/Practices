package qa.citroen.utilities;


public class AppUtil{
	
	public static String removeCurrency(String priceWithCurrency){
		return priceWithCurrency.replace("$", "").trim();
	}

}