import java.util.*;
import java.io.*;
public class  Training{
        public static void main(String[] args)throws IOException{

                System.out.println("      ===================================================================");
                System.out.println("      |                           私のニート                           　|");
                System.out.println("      ===================================================================");
                System.out.println("");
                System.out.println("");
                System.out.println("                           自分好みのニートを作ろう！");
                System.out.println("                         　　Enter入力でスタート");

                //入力待機
                InputStreamReader is = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(is);
                String n =br.readLine();
                System.out.println("                 これからかわいいニートとの20日間が始まります！");
                System.out.println("                   1日ごとに行動を決めてニートを育てましょう！");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                int hung = 3;
		int intel = 0;
		int mel = 0;
		int pow =0;
                double random =0;
		int n1 = 0;
		int n2 = 0;
		//ループ開始
                for(int date = 0; date < 20; date++){
	                 random = Math.random();
		         Scanner sc = new Scanner(System.in);

			 System.out.println("      ===================================================================");
                         System.out.println("      |                           "+date+"日目                              |");
                         System.out.println("      ===================================================================");
			 if(random>0.01 && random<0.02 && date>0){
				 event();
			 }
			 if(hung==0){
				 death(hung,intel,pow,date);
			 }else if(hung<0){
				 death(hung,intel,pow,date);
				 break;
			 }
                         System.out.println("");
                         System.out.println("");
                         System.out.println("");
                         System.out.println("");
                         System.out.println("");
                         System.out.println("");
                         System.out.println("");
                         System.out.println("");
                         System.out.println("");
                         System.out.println("       　　　　　　　　　何をしようか＞ (゜)(゜）ミ");
                         System.out.println("");
			 System.out.println("       満腹度:"+hung+" 知能:"+intel+" 力:"+pow+" ストレス:"+mel);
			 System.out.println("");
			 System.out.println("");
			 System.out.println("       1.エサをあげる　2.本を読ませる　3.運動させる");
			 System.out.print("         整数を入力してください:");
                         try {
                                 n1 = sc.nextInt();
                         }
                         catch(NoSuchElementException e ) {
                                 System.out.print("数値を入力してください");
				 date--;
                         }

			 	switch( n1 ) {

					case 1:
						System.out.println("");
						System.out.println("");
						System.out.println("  お！　エサくれるんやな！　ありがとうやで！　＞ (^)(^)ミ");
						System.out.println("  満腹度が3上がった");

						hung +=3;
						break;
					case 2:
						
						System.out.println("");
						System.out.println("");
						System.out.println("何を読ませようか？　1.マンガ  2.教科書");
	                         		System.out.print("         整数を入力してください:");
                         			try {
                                 			n2 = sc.nextInt();
						}catch(NoSuchElementException e ) {
                                 							System.out.println("数値を入力してください");
											date--;
                         			}
						if(n2==1){
							System.out.println("   マンガはいい暇つぶしになるから最高やな！　ありがとうやで！＞(^)(^)ミ");
							mel--;
							hung--;

						}else if(n2==2){
							System.out.println("   勉強きらいやけどがんばるやで! ＞　(^)(^)ミ");
							System.out.println("   知能が1上がった　ストレスが１上がった");
							intel++;
							mel++;
							hung--;
						}else{
							System.out.println("　やっぱ本読むのやめるか＞ (゜)(゜)ミ");
						} break;
					case 3:
						System.out.println("　　あの夕日に向かって走るやで〜wwwwwwww＞ (^)(^)ミ");
						System.out.println("    満腹度が１下がった　力が１上がった");
						hung--;
						pow++;
						break;
						
				}
		}
		lastDay(intel,pow,mel);
	}
	//ママン登場イベント
		public static void event(){
			
                         System.out.println("");
                         System.out.println("");
                         System.out.println("");
                         System.out.println("");
                         System.out.println("");
                         System.out.println("");
                         System.out.println("");
                         System.out.println("");
                         System.out.println("");
			 System.out.println("     J('-`)し＜ニート！お小遣いよ!");
			 System.out.println("     (^)(^)ミ＜ママン！ありがとうやで！");
			 System.out.println("     ストレスが３下がった！");
		}
		//最終日及びリザルト
		public static void lastDay(int intel,int pow,int mel){
			 int result = intel + pow - mel; 
			 System.out.println("      ===================================================================");
                         System.out.println("      |                           20 日目                              |");
                         System.out.println("      ===================================================================");
                         System.out.println("");
                         System.out.println("");
                         System.out.println("");
                         System.out.println("");
                         System.out.println("");
                         System.out.println("");
                         System.out.println("");
                         System.out.println("");
                         System.out.println("");
                         System.out.println("");
			 System.out.println("    お疲れ様でした！あなたが育てたニートはどのように育ったか結果を見てみましょう！");
                         System.out.println("");
                         System.out.println("");
                         System.out.println("");
                         System.out.println("");
                         System.out.println("    結果:　知力:"+intel+" 力："+pow+" ストレス:"+mel);
			 if(result>10){
				 System.out.print("ランク：A");
			 }else if(result>6){
				 System.out.print("ランク：B");
		         }else if(result>0){
				 System.out.print("ランク：C");
			 }else{
				 System.out.print("ランク：D");
			 }
		}
		//死亡イベント
		public static void death(int hung,int intel,int pow,int date){
			if(hung==0){
				System.out.println("   グエーお腹空いたンゴ...何か食べたいンゴ....＞(=)(=)ミ");
			}else{
				System.out.println("   ・・・・・・・・・・・・・・・＞()()ミ");
				intel = 0;
				pow = 0;
                                System.out.println("       ┏━━━━━━━━━━┓");
                                System.out.println("     　┃　／　＼　┃");
                                System.out.println("     　┃／　　　＼┃");
                                System.out.println("     　┃ (ﾟ)(ﾟ)ミ ┃");
                                System.out.println("     　┃ ﾉ　　 ミ ┃");
                                System.out.println("     　┃ つ　　(　┃");
                                System.out.println("     　┃　 )　 (　┃");
                                System.out.println("     　┗━━━━━━━━━━┛");
                        	System.out.println("");
                         	System.out.println("");
                         	System.out.println("");
                         	System.out.println("");
                         	System.out.println("");
                         	System.out.println("");
                         	System.out.println("");
                         	System.out.println("");
				int i =0;
				while(i<200){
					System.out.println("ｵﾏｴｶﾞｺﾛｼﾀｵﾏｴｶﾞｺﾛｼﾀｵﾏｴｶﾞｺﾛｼﾀｵﾏｴｶﾞｺﾛｼﾀｵﾏｴｶﾞｺﾛｼﾀｵﾏｴｶﾞｺﾛｼﾀｵﾏｴｶﾞｺﾛｼﾀｵﾏｴｶﾞｺﾛｼﾀｵﾏｴｶﾞｺﾛｼﾀｵﾏｴｶﾞｺﾛｼﾀｵﾏｴｶﾞｺﾛｼﾀｵﾏｴｶﾞｺﾛｼﾀｵﾏｴｶﾞｺﾛｼﾀｵﾏｴｶﾞｺﾛｼﾀｵﾏｴｶﾞｺﾛｼﾀｵﾏｴｶﾞｺﾛｼﾀｵﾏｴｶﾞｺﾛｼﾀｵﾏｴｶﾞｺﾛｼﾀｵﾏｴｶﾞｺﾛｼﾀｵﾏｴｶﾞｺﾛｼﾀ");
					i++;
				}
			        date = 20;
			}
		}
	
}
