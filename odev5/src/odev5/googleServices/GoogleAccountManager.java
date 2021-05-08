package odev5.googleServices;

public class GoogleAccountManager {

	private GoogleAccount account;

	public GoogleAccountManager() {

		this.account = new GoogleAccount();
		this.account.setAccountName("Engin.Demirog");

	}

	public boolean accountCheck(String accountName) {

		if (accountName == this.account.getAccountName()) {
			return true;
		} else {
			return false;
		}
	}
}
