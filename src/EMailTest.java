import org.junit.Assert;
import org.junit.jupiter.api.Test;

class EMailTest {

	@Test
	void givenEmail_ShouldBeHaving_ThreeAlphabetsAtTheBeginning() {
		Functions myEmail = new FunctionsImpl();
		boolean result = myEmail.checkEmailFirstMandatoryPart("abc");
		Assert.assertEquals(true,result);
	}
	
	@Test
	void givenEmail_ShouldBeHaving_WordBridgelabz_Init() {
		Functions myEmail = new FunctionsImpl();
		boolean result = myEmail.checkEmailSecondMandaotryPart("abcbridgelabz");
		Assert.assertEquals(true,result);
	}
}
