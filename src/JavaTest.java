import netscape.javascript.JSObject;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class JavaTest {

    public static void main(String[] args) {
       List<Transaction> transactions = Arrays.asList(
                new Transaction("t1", "u1", 5000, "NY", 1672500100),
                new Transaction("t2", "u1", 7000, "CA", 1672500300), // Different location within 5 mins
                new Transaction("t3", "u2", 12000, "TX", 1672500500) // Amount > 10,000
        );

        List<String> result = detectSuspicious(transactions);
        System.out.println("Suspicious Transactions: " + result);
    }

    public static List<String> detectSuspicious(List<Transaction> transactions){
        int intialTimestamp = 0;
        List<String>  tansList = new ArrayList<>();
        for(Transaction transaction : transactions){

           if(intialTimestamp == 0){

               intialTimestamp =  transaction.getTimestamp();
           }else{
               Timestamp to = new Timestamp(intialTimestamp);
               Timestamp t1 = new Timestamp(transaction.getTimestamp());
               if(t1.getSeconds() - to.getSeconds() >= 5){
                   tansList.add(transaction.transactionId);
               }
           }
       }
        return tansList;
    }
}


class Transaction{
  String  transactionId;
  String userId;
   Integer amount;
   String location;
    int timestamp;

    public Transaction(String transactionId, String userId, Integer amount, String location, int timestamp) {
        this.transactionId = transactionId;
        this.userId = userId;
        this.amount = amount;
        this.location = location;
        this.timestamp = timestamp;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

}
