package basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// TODO:ここに実装

		int amount = 0;
		int price = 100;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("鉛筆を購入しますか？\nはい：0、いいえ：1>");
		String buyString = reader.readLine();
		int buyFlag = Integer.parseInt(buyString);
		System.out.println();

		while (buyFlag == 0) {
			amount++;
			System.out.print("購入する鉛筆の本数を1つ増やしますか？\nはい：0、いいえ：1>");
			String buyString2 = reader.readLine();
			buyFlag = Integer.parseInt(buyString2);
			System.out.println();
		}
		System.out.println("購入した鉛筆の本数は" + amount + "本です。");
		System.out.println("購入した鉛筆の合計金額は" + (amount * price) + "円です。");

	}

}
