/******************************************************************************
 *  Compilation:  javac -encoding "UTF-8" Deal.java
 *  Execution:    java Deal n
 *
 *  n个玩家，给每个玩家发5张牌.
 *
 *
 ******************************************************************************/
public class Deal {
    public static void main(String[] args) {
        int CARDS_PER_PLAYER = 5;

        // 玩家数量
        int PLAYERS = Integer.parseInt(args[0]);

        String[] SUITS = {"黑桃","红桃","梅花","方块"};
		String[] RANKS = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

		int n = SUITS.length * RANKS.length;

        if (CARDS_PER_PLAYER * PLAYERS > n)
            throw new RuntimeException("玩家太多了");


        // 初始化 deck
        String[] deck = new String[RANKS.length * SUITS.length];
		for (int i = 0; i < RANKS.length; i++) {
			for (int j = 0; j < SUITS.length; j++) {
				deck[SUITS.length*i + j] = SUITS[j] + " " + RANKS[i]; 			
			}
		}

        // 洗牌
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n-i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        // 每人分5张（直接打印输出）
        for (int i = 0; i < PLAYERS * CARDS_PER_PLAYER; i++) {
            System.out.println(deck[i]);
            if (i % CARDS_PER_PLAYER == CARDS_PER_PLAYER - 1)
                System.out.println();
        }
    }

}