import org.junit.jupiter.api.Test;

class EMailTest {

	@Test
	void givenEmailShouldBeHavingThreeAlphabetsAtTheBeginning() {
		EMail myEmail = new EMail("abc");
		myEmail.checkEmailFirstMandatoryPart();
	}

}
