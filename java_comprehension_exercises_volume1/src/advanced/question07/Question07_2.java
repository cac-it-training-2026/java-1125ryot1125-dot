package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 100, 200, 300, 400, 500 };

		// TODO: 実装ここから
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] amounts = new int[5];

		System.out.println("各商品の購入数を入力してください。");
		for (int i = 0; i < 5; i++) {
			System.out.print(itemNames[i] + "の購入数:>");
			String item = reader.readLine();
			amounts[i] = Integer.parseInt(item);
		}
		System.out.println();
		int totalPrice = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println(itemNames[i] + ":" + (prices[i] * amounts[i]) + "円");
			totalPrice = totalPrice + (prices[i] * amounts[i]);
		}
		System.out.println("合計金額:" + totalPrice + "円");

	}
}
