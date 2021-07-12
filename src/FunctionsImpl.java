import java.util.regex.Pattern;

class FunctionsImpl implements Functions{


	@Override
	public boolean checkEmailFirstMandatoryPart(String string)
	{
		Pattern myPattern = Pattern.compile("^[a-z]{3}");
		return myPattern.matcher(string).matches();
	}

	@Override
	public boolean checkEmailSecondMandaotryPart(String string) {
		Pattern myPattern = Pattern.compile("^[a-z]{3}[a-z]{3,10}");
		return myPattern.matcher(string).matches();
	}
}