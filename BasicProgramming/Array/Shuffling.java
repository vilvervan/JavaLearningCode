/******************************************************************************
 *  Compilation:  javac -encoding "UTF-8" Shuffling.java
 *  Execution:    java HugeArray
 *
 *  演示如何表示洗牌
 *  第i张牌随机地与第i至第n-1之间的任意一张牌调换，或者不动
 *
 *
 ******************************************************************************/
class Shuffling{
	public static void main(String[] args){
		String[] SUITS = {"黑桃","红桃","梅花","方块"};
		String[] RANKS = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		
		String[] deck = new String[RANKS.length * SUITS.length];
		for (int i = 0; i < RANKS.length; i++) {
			for (int j = 0; j < SUITS.length; j++) {
				deck[SUITS.length*i + j] = SUITS[j] + " " + RANKS[i]; 			
			}
		}
		int n = deck.length;
		for(int i = 0;i < n;i++){
			/*
			 * (int)(Math.Random() * (n - i)):	[0,n-i)		 
			 * i + (int)(Math.Random() * (n - i)):	[i,n)			 
			 */
			int t = i + (int)(Math.Random() * (n - i));
			String temp = deck[i];
			deck[i] = deck[t];
			deck[t] = temp;
		}
		for (int i = 0; i < n; i++) {
            System.out.println(deck[i]);
        }
	}
}