import java.util.regex.Pattern;

public class FunctionsImpl implements Functions{

	@Override
	public void checkEmailFirstMandatoryPart() {
		Pattern.compile("^[a-z A-z]{3}");
	}
}