import org.junit.jupiter.api.Test;

class PinCodeTest {

	@Test
	void givenPincodeShouldPassTheTest() {
		PinCode myPinCode = new PinCode(484555);
		myPinCode.checkPincodeNumbers();
	}
	
	@Test
	void givenPincodeShouldNotPassTestIfHavingAlphabetsAtStarting() {
	PinCode myPinCode = new PinCode(484555);
	myPinCode.checkPinCodeNotHavingAlphabetsInTheBeginning();
	}
	
	@Test
	void givenPincodeShouldNotPassTheTestIfHavingAlphabetAtTheEnd() {
		PinCode myPinCode = new PinCode(484555);
		myPinCode.checkPinCodeNotHavingAlphabetsInTheEnd();
	}
}