import java.util.Scanner;

public class Shindan {

	Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		//メイン処理をかく
		int situ1 = situmon1();

		//回答内容で診断結果を考える処理

		//回答結果を出力
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

	public static void situmon4(){


	}

	public static void situmon5(){


	}

	public static void situmon6(){


	}

}
