import org.junit.jupiter.api.Test;

class PinCodeTest {

	@Test
	void givenPincodeShouldPassTheTest() {
		PinCode myPinCode = new PinCode(484555);
		myPinCode.checkPincodeNumbers();
	}
}
