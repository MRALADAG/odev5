package odev5.core.concretes;

import odev5.core.abstracts.AccountService;
import odev5.googleServices.GoogleAccountManager;

public class GoogleAccountManagerAdapter implements AccountService {

	private GoogleAccountManager googleAccount;
	private String account;

	public GoogleAccountManagerAdapter(String googleAccount) {

		this.account = googleAccount;
		this.googleAccount = new GoogleAccountManager();
	}

	@Override
	public void accountAdd() {

		if (this.googleAccount.accountCheck(this.account)) {

			System.out.println("Sisteme GOOGLE hesab� ile kay�t olundu. " + this.account);
			return;

		} else {

			System.out.println(
					"Yanl�� GOOGLE hesap ad� yaz�ld���ndan veya GOOGLE hesab�n�z bulunmad���ndan sisteme kayd�n�z yap�lamam��t�r. "
							+ this.account);
			return;

		}

	}

}
