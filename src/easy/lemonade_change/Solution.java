package easy.lemonade_change;
//At a lemonade stand, each lemonade costs $5.
//Customers are standing in a queue to buy from you, and order one at a time (in the order specified by bills).
//Each customer will only buy one lemonade and pay with either a $5, $10, or $20 bill.  You must provide the correct change to each customer, so that the net transaction is that the customer pays $5.
class Solution {
//    Runtime: 1 ms, faster than 100.00% of Java online submissions for Lemonade Change.
//    Memory Usage: 40 MB, less than 64.15% of Java online submissions for Lemonade Change.
    public boolean lemonadeChange(int[] bills) {
        int fivesChange = 0;
        int tensChange = 0;

        for (int bill : bills) {
            if (bill == 5) {
                fivesChange++;
            } else if (bill == 10) {
                if (fivesChange >= 1) {
                    fivesChange--;
                    tensChange++;
                } else {
                    return false;
                }
            } else  if (bill == 20) {
                if (fivesChange >=1 && tensChange >= 1) {
                    fivesChange--;
                    tensChange--;
                } else if (fivesChange >=3) {
                    fivesChange -=3;
                } else {
                    return false;
                }
            }
        }
        return true;

    }
}