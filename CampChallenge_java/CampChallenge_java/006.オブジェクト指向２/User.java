
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guest1Day
 */
public class User extends Dealer {
     public  void setcard(ArrayList<Integer>cards2){
       for(int i=0;i<cards2.size();i++){//cards2に入ってる２枚を受け取る処理 .size()で要素数分　受け取る
        myCards.add(cards2.get(i));//myCardの中に入れる
       }
     
    }
   public boolean checkSum(){
       int sum=open();
       
        if (sum != 21){
            return true;
        } else {
            return false;
        }
        
   
    }
     public int open(){//取得したカード２枚を合計して公開するメソッド
      int open=0;
      for(int i=0;i<myCards.size();i++){
          open=open+myCards.get(i);
      }
      return open;
    }
}
    

