package arrays;

public class BestTimeBuyStock {
    public static void main(String[] args) {
        int[] arr={7,6,4,3,1,5};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {

        int profit=0;

        for (int i = 0; i <prices.length-1 ; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if((prices[j]-prices[i])>profit){
                    profit=prices[j]-prices[i];

                }

            }

        }

        return profit;



    }
}
