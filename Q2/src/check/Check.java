package check;

import constants.Constants;

public class Check {

	
	public static void main(String[] args) {
		//Q1 test1インスタンスを生成(苗字と名前は１のものを使うこと)
		Check2 test1 = new Check2(Constants.firstName1,Constants.lastName1);
		//Q2 test2インスタンスを生成(苗字と名前は２のものを使うこと)
		Check2 test2 = new Check2(Constants.firstName2,Constants.lastName2);
		//Q3 test1とtest2の2人の名前を表示
		System.out.println("二人の名前は" + test1 + "と" + test2 + "です");

		//Q5 上記で作成したtest1インスタンスを利用してCheck2.javaのQ4 ageメソッド動かすこと(※ 先にQ4の問題を解くこと)
		String test1Age = test1.age(test1.getFirstName());
		System.out.println(test1 + test1Age);
		
		//Q6 上記で作成したtest2インスタンスを利用してCheck2.javaのQ4 ageメソッド動かすこと(※ 先にQ4の問題を解くこと)
		String test2Age = test2.age(test2.getFirstName());
		System.out.println(test2 + test2Age);
		
		//Q7 Check2.javaのQ4 ageメソッドの出力結果が「値は無効です」となるようにageメソッドを動かすこと(※ 先にQ4の問題を解くこと)
		String test3Age = test1.age("高橋");
		System.out.println(test3Age);
		}
}
