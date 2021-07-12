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
	
	@Test
	void givenSomeEmails_ShouldPassThe_FifthTestCondition() {
		
		Functions myEmail1 = new FunctionsImpl();
		boolean result1 = myEmail1.checkEmailForSecondOptionalPart("abc@yahoo.com");
		Assert.assertEquals(true, result1);
		
		Functions myEmail2 = new FunctionsImpl();
		boolean result2 = myEmail2.checkEmailForSecondOptionalPart("abc-100@yahoo.com");
		Assert.assertEquals(true, result2);
		
		Functions myEmail3 = new FunctionsImpl();
		boolean result3 = myEmail3.checkEmailForSecondOptionalPart("abc.100@yahoo.com");
		Assert.assertEquals(true, result3);
		
		Functions myEmail4 = new FunctionsImpl();
		boolean result4 = myEmail4.checkEmailForSecondOptionalPart("abc111@abc.com");
		Assert.assertEquals(true, result4);
		
		Functions myEmail5 = new FunctionsImpl();
		boolean result5 = myEmail5.checkEmailForSecondOptionalPart("abc-100@abc.net");
		Assert.assertEquals(true, result5);
		
		Functions myEmail6 = new FunctionsImpl();
		boolean result6 = myEmail6.checkEmailForSecondOptionalPart("abc.100@abc.com.au");
		Assert.assertEquals(true, result6);
		
		Functions myEmail7 = new FunctionsImpl();
		boolean result7 = myEmail7.checkEmailForSecondOptionalPart("abc@1.com");
		Assert.assertEquals(true, result7);
		
		
		Functions myEmail8 = new FunctionsImpl();
		boolean result8 = myEmail8.checkEmailForSecondOptionalPart("abc@gmail.com.com");
		Assert.assertEquals(true, result8);
		
	}
}
