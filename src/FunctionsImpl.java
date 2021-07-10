import java.util.regex.Pattern;

public class FunctionsImpl implements Functions{

	@Override
	public void checkPincodeNumbers() {
		Pattern.compile("[0-9]{6}");
	}
	
	public void checkPinCodeNotHavingAlphabetsInTheBeginning() {
		Pattern.compile("^[0-9]{6}");		
	}
	
	
	public void checkPinCodeNotHavingAlphabetsInTheEnd() {
		Pattern.compile("^[0-9]{6}$");		
	}
}
