package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 100, 200, 300, 400, 500 };
		// 購入数（変更不可）
		int[] amounts = new int[5];

		// TODO: 実装ここから
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int totalPrice = 0;
		System.out.println("各商品の購入数を入力してください。");
		for (int i = 0; i < 5; i++) {
			System.out.print(itemNames[i] + "の購入数：>");
			String item = reader.readLine();
			amounts[i] = Integer.parseInt(item);

			totalPrice += prices[i] * amounts[i];
		}
		System.out.println();
		System.out.println("割引前合計：" + totalPrice);

		if (totalPrice >= 5000) {
			totalPrice = totalPrice - (totalPrice / 10);
			System.out.println("割引適用(10%OFF)：" + totalPrice + "円");
		}

		System.out.println("税込み合計：" + (totalPrice += totalPrice / 10));
	}

}
