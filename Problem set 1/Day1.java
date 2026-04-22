public class Day1 {
    public static void main(String[] args) {
        int purchasedChocolates = 50;
        int wrappersNeededForFreeChocolate = 3;

        int totalChocolates = calculateTotalChocolates(
                purchasedChocolates,
                wrappersNeededForFreeChocolate);

        System.out.println("Purchased chocolates: " + purchasedChocolates);
        System.out.println("Total chocolates after wrapper exchange: " + totalChocolates);
    }

    private static int calculateTotalChocolates(int purchasedChocolates, int wrappersNeeded) {
        int totalChocolates = purchasedChocolates;
        int currentWrappers = purchasedChocolates;

        while (currentWrappers >= wrappersNeeded) {
            int freeChocolates = currentWrappers / wrappersNeeded;
            totalChocolates += freeChocolates;
            currentWrappers = freeChocolates + (currentWrappers % wrappersNeeded);
        }

        return totalChocolates;
    }
}
