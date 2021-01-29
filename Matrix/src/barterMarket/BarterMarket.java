package barterMarket;

public class BarterMarket {
	public static int maxFb(int comicBook, int coins, int coinsNeeded, int coinsOffered) {
		int maxFb = 0;
		while (comicBook > 0 && coins >= coinsNeeded) {
			maxFb++;
			coins = coins - coinsNeeded;
			comicBook--;

			if (coins < coinsNeeded && comicBook > 0) {
				comicBook--;
				coins = coins + coinsOffered;

			}
		}
		return maxFb;
	}

	public static void main(String arg[]) {
		int comicBook = 393;
		int coins = 896;
		int coinsNeeded = 787;
		int coinsOffered = 920;
		int maxFictionBook = maxFb(comicBook, coins, coinsNeeded, coinsOffered);
		System.out.println(maxFictionBook);
	}

}
