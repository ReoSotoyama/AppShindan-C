import java.util.Scanner;

public class Shindan {

	public static void main(String[] args){

		int situ1 = situmon1();

	}

	public static int situmon1(){

		int answer = 0;

		return answer;
	}

	public static void situmon2(){


	}

	public static int situmon3(){
	  Scanner sc = new Scanner(System.in);
	  String[] s = {"赤","青","緑"};

	  System.out.print("あなたの好きな色はどれですか？");
	  for(int i = 0 ; i < s.length ; i++){
	    System.out.println( (i + 1) + ":" + s[i]);
	  }

	  int result;
	  System.out.print("数字を選んでく下さい -> ");
	  do{
	    result = sc.nextInt();
	    result--;
	    if(0 <= result && result <= 2){
	      System.out.print("正しく入力してください -> ");
	    }
	  }while(0 <= result && result <= 2);

	  sc.close();
	  return result;
	}

	public static void situmon4(){


	}

	public static void situmon5(){


	}

	public static void situmon6(){


	}

}
