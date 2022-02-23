package sukkiri_practice;

public class Code2_10 {

	public static void main(String[] args) {
		Account ac = new Account();
		ac.setAccountType(AccountType.TOUZA);
		showAccount("5634625", ac.getAccountType());
	}

	public static void showAccount(String aNo, AccountType aType) {
		System.out.println("口座番号は" + aNo + ", 口座種別は" + aType);
	}

}
