import java.util.*;
import java.io.*;
public class game{
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
		System.out.println("                 これからかわいいニートとの100日間が始まります！");
		System.out.println("                   1日ごとに行動を決めてニートを育てましょう！");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		int health=0;
		int stamina=0;
		int intel=0;
		int mel=0;
		//n1は選択肢のやつ
		int n1=0;
		int n2=0;
		double random=0;
		//rループ開始
		for(int date=0;date<100;date++){
			random = Math.random();
			Scanner sc= new Scanner(System.in);
			System.out.println("      ===================================================================");
			System.out.println("      |                           "+date+"日目                              |");
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
			System.out.println(random);
			System.out.println("       　　　　　　　　　何をしようか＞ (゜)(゜）ミ");                      
			System.out.println("");
			System.out.println("         健康:"+health+" 体力:"+stamina+" 知力:"+intel+" 憂鬱:"+mel);
			System.out.println("");
			System.out.println("");
			System.out.println(" 　　　1.寝る 2.ゲームする 3.ネットサーフィンする　4.勉強する 5.外出する");
			System.out.print("         整数を入力してください:");
			n1 = sc.nextInt();
			switch(n1){
				case 1:
					System.out.println("                  やることないし今日は寝ようかｽﾔｰ");
					System.out.println("　　　　　健康ポイントが１上がった！体力が１上がった!");
					if(random>0.01 && random<0.02){
						System.out.println("");
						System.out.println("     ニートは寝ていたら運悪く心臓麻痺で死んでしまった!");
						date+=100-date;
						System.out.println("       ┏━━━━━━━━━━┓");
						System.out.println("     　┃　／　＼　┃");
						System.out.println("     　┃／　　　＼┃");
						System.out.println("     　┃ (ﾟ)(ﾟ)ミ ┃");
						System.out.println("     　┃ ﾉ　　 ミ ┃");
						System.out.println("     　┃ つ　　(　┃");
						System.out.println("     　┃　 )　 (　┃");
						System.out.println("     　┗━━━━━━━━━━┛");
					}
					health++;
					stamina++;
					break;
				case 2:
					System.out.println("今日はゲームでもして過ごすか！");
					if(random>0.7){
						System.out.println("お！今日は調子ええやんけ!");
						System.out.println("　憂鬱ポイントが２下がった！");
						mel-=2;
					} else if(random<=0.7 && random>0.4){
						System.out.println("やっぱゲームは最高の娯楽やなﾎﾟﾁﾎﾟﾁｰ");
						System.out.println("   健康ポイントが１下がった... 憂鬱ポイントが１下がった！");
						health--;
						mel--;
					} else{
						System.out.println("なんやこのクソゲ！売ったろ！");
						System.out.println("体力ポイントが１下がった...健康ポイントが１下がった...　憂鬱ポイントが２上がった...");
						stamina--;
						health--;
						mel+=2;
					}
					break;
				case 3:
					System.out.println("暇やし３ちゃんねるでもみるか！");
					if(random>0.7){
						System.out.println("  おっ、かわええ動物の画像見つけたやで！いやされるやで!");
						System.out.println("  憂鬱ポイントが2下がった!");
						mel-=2;
					}else if(random<=0.7 && random>0.4){
						System.out.println("  隙を見て自分語りするやで!ワイは東大卒やで！");
						System.out.println("  憂鬱ポイントが1下がった");
						mel--;
					}else{
						System.out.println("レスバトルで負けてしまったやで...今日はもうやめや...");
						System.out.println("体力ポイントが２下がった... 健康ポイントが２下がった...　憂鬱ポイントが２上がった...");
						stamina-=2;
						health-=2;
						mel+=2;
					}
					break;
				case 4:
					System.out.println("暇やし勉強でもするか！");
					if(random>0.7){
						System.out.print("ワイは東大卒(妄想）やから楽勝や!");
						System.out.println("知力ポイントが2上がった! 憂鬱ポイントが２下がった!");
					}else if(random<=0.7 && random>0.4){
						System.out.println("ちょいムズやけどまあいけるわ");
						System.out.println("知力ポイントが１上がった! 体力が１下がった...");
						stamina--;
						intel++; 
					}
					break;
				case 5:
					System.out.println("ニートやけどたまには外出てみるか！");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("どこへ行こうか？");
					System.out.println("");
					System.out.println("1.アｘメイト　2.図書館　3.飯屋");
					System.out.print("整数値を入力してください:");
					n2=sc.nextInt();
					if(n2==1){
						System.out.println("ワイの好きなアニメのグッズでも漁ろ！");
						System.out.println("体力ポイントが1下がった... 憂鬱ポイントが2下がった!");
						stamina++;
						mel-=2;
					}else if(n2==2){
						System.out.println("あんま行ったことないとこやけど...おもろそうなのあるやん！読んだろ!");
						System.out.println("知力ポイントが2上がった! 体力ポイントが2下がった...");
						intel+=2;
						stamina+=2;
					}else if(n2==3){
						System.out.println("飯屋でたらふく食ったろ！");
						System.out.println("体力ポイントが2上がった! 健康ポイントが2下がった...");
						health-=2;
						stamina+=2;
					}else{
						System.out.println("やっぱ散歩でもするか");
						if(random>0.07&&random<0.08){
							System.out.println("");
							System.out.println("");
							System.out.println("あっ！車が突っ込んできた　ｸﾞｴｰ死んだンゴー");
							System.out.println("");
							System.out.println("");
							System.out.println("       ┏━━━━━━━━━━┓");
							System.out.println("     　┃　／　＼　┃");
							System.out.println("     　┃／　　　＼┃");
							System.out.println("     　┃ (ﾟ)(ﾟ)ミ ┃");
							System.out.println("     　┃ ﾉ　　 ミ ┃");
							System.out.println("     　┃ つ　　(　┃");
							System.out.println("     　┃　 )　 (　┃");
							System.out.println("     　┗━━━━━━━━━━┛");
							System.out.println("        Game Over");
							date+=100-date;}
						System.out.println("体力ポイントが2下がった... 憂鬱ポイントが2下がった!");
					} 
					break;
				default:
					System.out.println("1〜5の数値を入力してください");
					date-=1;
					break;

			}
		}
	}
}
