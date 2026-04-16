package basic.question01;

/**
 * 第4章 変数
 */

public class Question01_2 {

	public static void main(String[] args) {

		// TODO:ここに実装
		int appleprice = 100;
		String stationery = "鉛筆";
		int bananaprice = appleprice;
		String writingUtensils = stationery;
		System.out.println("りんごの値段は" + appleprice + "円です。");
		System.out.println("バナナの値段は" + bananaprice + "円です。");
		System.out.println("この筆記用具は" + writingUtensils + "です。");

	}

}
