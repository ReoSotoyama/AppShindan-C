import java.util.Scanner;

public class Shindan {


	public static void main(String[] args){
		//メイン処理をかく
		int situ1 = situmon1();

		//回答内容で診断結果を考える処理

		//回答内容を出力
	}



	public static int situmon1(){
		int answer;
		String s[] = {"人にあげる","ゴミにポイ","フリマで売る","燃やす"};
		//質問内容を表示
		System.out.println("問１");
		System.out.println("要らなくなったぬいぐるみ、どうする？");
		//回答内容を表示
		for(int i = 0; i < s.length; i++){
			System.out.println((i+1) + ":" + s[i]);
		}
		//ユーザーが答えを入力
		System.out.print("回答を入力 ：");
		answer = sc.nextInt();
		System.out.print("あなたの回答は「" + s[answer-1] + "」");

		return answer;
	}

	public static void situmon2(){


	}

	public static void situmon3(){


	}

	public static int situmon4(){
		Scanner sc = new Scanner(System.in);
		int ans;
		System.out.println("問４");
		System.out.print("あなたの年齢を入力してください");
		do{
			ans = sc.nextInt();
		}while(ans > 0 && ans < 100);

		System.out.println();

		System.out.println("あなたの年齢は" + ans + "歳");


		return ans;

	}

	public static void situmon5(){


	}

	public static void situmon6(){


	}

}
