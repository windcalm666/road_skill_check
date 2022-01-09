package check;

public class Check2 {

	private String firstName;
	private String lastName;

	public Check2(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	};

	protected String getFirstName() {
		return firstName;
	};
	
	protected String getLastName() {
		return lastName;
	};

	//Q4 名前で出力結果の異なるメソッドage()を作成すること
	protected String age(String firstName) {
		if(firstName.equals("田中")) {
			return "24歳";
		} else if(firstName.equals("山田")) {
			return "29歳";
		} else {
			return "値は無効です";
		}
	}
	
	//Q8　名前が１文字づつ表示されるメソッドnameOne()を作成すること
	protected void nameOne(String firstName, String lastName) {
		
	}
}