package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_1 {

	public static void main(String[] args) throws IOException {

		// TODO:ここに実装
		String[] itemNames = new String[5];
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 5; i++) {
			System.out.print("商品" + (i + 1) + "を入力してください：>");
			String item = reader.readLine();
			itemNames[i] = item;
			System.out.println();
		}
		int[] prices = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print(itemNames[i] + "の単価を入力してください：>");
			String priceString = reader.readLine();
			int num = Integer.parseInt(priceString);
			prices[i] = num;
			System.out.println();
		}
		System.out.println("登録商品一覧");
		for (int i = 0; i < 5; i++) {
			System.out.println(itemNames[i] + ":" + prices[i] + "円");

		}
	}

}
