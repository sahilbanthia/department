package Exception;

public class PhoneNumberException extends RuntimeException {
	long phone_number;
	public PhoneNumberException(long phone_number) {
		this.phone_number=phone_number;
	}
	@Override
	public String toString() {
		return "Invalid Number";
	}
}
