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
		boolean result = myEmail.checkEmailSecondMandaotryPart("abc@bridgelabz");
		Assert.assertEquals(true,result);
	}
	
	@Test
	void givenEmail_ShouldBeHaving_DotCo_AfterBridgelabz() {
		Functions myEmail = new FunctionsImpl();
		boolean result = myEmail.checkEmailThirdMandatoryPart("abc@bridgelabz.com");
		Assert.assertEquals(true, result);
	}
	
	@Test
	void givenEmail_MayOrMayNotHave_FirstOptionalPart() {
		Functions myEmail = new FunctionsImpl();
		boolean result = myEmail.checkEmailForFirstOptionalPart("abc.xyz@bridgelabz.com");
		Assert.assertEquals(true,result);
	}
	
	@Test
	void givenEmail_MayOrMayNotHave_SecondOptionalPart() {
		Functions myEmail = new FunctionsImpl();
		boolean result = myEmail.checkEmailForSecondOptionalPart("abc.xyz@bridgelabz.co.in");
		Assert.assertEquals(true, result);
	}
}
