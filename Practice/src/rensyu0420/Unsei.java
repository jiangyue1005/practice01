package rensyu0420;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Unsei {

	public static void main(String[] args) {

		

		Random random = new Random();

		List<String> list = new ArrayList<String>();
		list.add("大吉");
		list.add("中吉");
		list.add("小吉");
		list.add("末吉");
		list.add("吉");
		list.add("凶");

		// System.out.println("今日の運勢は"+list.get(random.nextInt(list.size()))+"です。");

		StringBuilder s1 = new StringBuilder("今日の運勢は");
		String s2 = "です。";
		StringBuilder ss = s1.append(list.get(random.nextInt(list.size()))).append(s2);
		System.out.println(ss);
		String s = ss.toString();

//		File file = new File("/Users/y_jiang/Documents/unsei.txt");
//
//		FileWriter fw;
//		try {
//			fw = new FileWriter(file, true);
//
//			// BufferedWriter in= new BufferedWriter(fw);
//
//			fw.write(s);
//
//			fw.close();
//
//		} catch (IOException e) {
//			// TODO 自動生成された catch ブロック
//			e.printStackTrace();
//
//		}

	}

}
