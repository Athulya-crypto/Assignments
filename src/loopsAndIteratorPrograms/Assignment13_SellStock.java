package loopsAndIteratorPrograms;

public class Assignment13_SellStock {

	public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price :prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
}

    public static void main(String[] args) {
       
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit : " + maxProfit(prices1));  // Output: 5

       
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Maximum Profit : " + maxProfit(prices2));  // Output: 0
    }
}

	

