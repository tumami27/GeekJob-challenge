
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guest1Day
 */
public class Dealer extends Human{  
    
     ArrayList<Integer>cards=new ArrayList<Integer>();
      Dealer(){
      for(int a=0;a<=4;a++){//4回(マーク分）回す
       for(int i=1;i<14;i++){//13回（数字分）回す
           if(i<10){//1～１０は数字ポイントだからそのまま入れる
               cards.add(i);
           }else{
               cards.add(10);//11～１３(J～K)は１０点換算
           }
           
       }
   }
  }
  public ArrayList<Integer>deal(){    //カードを２枚渡すメソッド
      ArrayList<Integer>cards2= new ArrayList<Integer>();
       Collections.shuffle(cards);    //importしたコレクションメソッドで１～５２をランダムにシャッフル
       Integer result=cards.get(0)      ;//ランダムにシャッフルしたcardsの中身の0番目を取得(get)
       cards2.add(result);              //cards2の中にシャッフルしたものを入れる(add)(１枚目）
       
       Integer result2=cards.get(1);//シャッフルしたものを入れる(2枚目)
       cards2.add(result2);
       
       return cards2;//取得したカードをreturnで戻す
   }
public ArrayList<Integer>hit(){//カードを一枚引くメソッド
     ArrayList<Integer> cards2 = new ArrayList<Integer>();  
     Collections.shuffle(cards);//メソッドごとにシャッフルする
     Integer result=cards.get(1);
     cards2.add(result);
     
     return cards2;
}  

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
    