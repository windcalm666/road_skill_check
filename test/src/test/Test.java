package test;

public class Test {
	
	public static void main(String[] args) {
		//Q1問題
		// numberの配列を条件に沿って表示させなさい
		int number[] = { 3, 5, 7, 9, 11, 13, 15}; 
		// Q1-1
		// number配列0番目と3番目の合計値を出力しなさい
		System.out.println("合計は" + number[0] + number[3] + "点です");
		
		// Q1-2
		// number配列1番目と2番目との乗算を出力しなさい
		System.out.println("乗算は" + number[1] * number[2] + "点です");
		
		// Q1-3
		// for文を使い配列の中身を全てを出力しなさい
		for(int i = 0; i < number.length; i++) {
			System.out.println("number[" + "] …　" + number[i]);
		};
		
		// Q1-4
		// for文とif文を使い下記条件に当てはまるように出力しなさい
		// 5で割りけれる場合は「a」を表示、3で割りけれる場合は「b」を表示、３と５両方で割りけれる場合は「c」両方とも割り切れない場合は「d」表示
		for(int i = 0; i < number.length; i++) {
			if((number[i] % 15) == 0) {
				System.out.println("c");
			} else if((number[i] % 3) == 0) {
				System.out.println("b");
			} else if((number[i] % 5) == 0) {
				System.out.println("a");
			} else {
				System.out.println("d");
			};
		};
		//Q1-5
		//参照テーブルに下記データを追加するSQL文を記載してください(回答のSQL文はコメントアウトすること)
		// id 1234, name Road, entrance_year 2017, section null
		/**
		 * INSERT INTO test (id, name, entrance_year, section)
		 * VALUES(1234, 'Road', 2017, null);
		 * */
		
		//Q1-6
		//参照テーブルの下記データを削除するSQL文を記載してください(回答のSQL文はコメントアウトすること)
		// id 0001と0002のものを削除
		/**
		 * DELETE FROM test
		 * WHERE id == 0001 OR id == 0002;
		 * */
		
		
	};

};
