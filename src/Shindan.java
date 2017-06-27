import java.util.Scanner;

public class Shindan {


	public static void main(String[] args){
		//メイン処理をかく
		int situ1 = situmon1();

		//回答内容で診断結果を考える処理

		//回答内容を出力
	}



	public static int situmon1(){

		int answer = 0;
		//質問内容を表示

		//回答内容を表示

		//ユーザーが答えを入力

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
