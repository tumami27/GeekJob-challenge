package jums;

import base.DBManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * ユーザー情報を格納するテーブルに対しての操作処理を包括する
 * DB接続系はDBManagerクラスに一任
 * 基本的にはやりたい1種類の動作に対して1メソッド
 * @author hayashi-s
 */
public class UserDataDAO {
    
    //インスタンスオブジェクトを返却させてコードの簡略化
    public static UserDataDAO getInstance(){
        return new UserDataDAO();
    }
    
    /**
     * データの挿入処理を行う。現在時刻は挿入直前に生成
     * @param ud 対応したデータを保持しているJavaBeans
     * @throws SQLException 呼び出し元にcatchさせるためにスロー 
     */
    public void insert(UserDataDTO ud) throws SQLException{
        Connection con = null;
        PreparedStatement st = null;
        try{
            con = DBManager.getConnection();
            st =  con.prepareStatement("INSERT INTO user_t(name,birthday,tell,type,comment,newDate) VALUES(?,?,?,?,?,?)");
            st.setString(1, ud.getName());
            st.setDate(2, new java.sql.Date(ud.getBirthday().getTime()));//指定のタイムスタンプ値からSQL格納用のDATE型に変更
            st.setString(3, ud.getTell());
            st.setInt(4, ud.getType());
            st.setString(5, ud.getComment());
            st.setTimestamp(6, new Timestamp(System.currentTimeMillis()));
            st.executeUpdate();
            System.out.println("insert completed");
        }catch(SQLException e){
            //修正
            System.out.println("接続時にエラーが発生しました："+e.getMessage());
            throw new SQLException(e);
        }finally{
            if(con != null){
                con.close();
            }
        }

    }
    
    
    /**
     * タスク：複合検索の成立
     * タスク：検索結果を複数表示させるためArryList
     * タスク：while文によって全件表示
     * データの検索処理を行う。
     * @param ud 対応したデータを保持しているJavaBeans
     * @throws SQLException 呼び出し元にcatchさせるためにスロー 
     * @return 検索結果
     */
    public ArrayList<UserDataDTO> search(UserDataDTO ud) throws SQLException{
        Connection con = null;
        PreparedStatement st = null;
         ArrayList<UserDataDTO> resultUdList = new ArrayList<UserDataDTO>();
        try{
            con = DBManager.getConnection();
            
            //
            String sql = "SELECT * FROM user_t";
           
            boolean flag = false;
            int flagnum1 = 0;
            int flagnum2 = 0;
            int flagnum3 = 0;
            if (!ud.getName().equals("")) {
                sql += " WHERE name like ?";
                flag = true;
                flagnum1=1;
            }
            if (ud.getBirthday()!=null) {
                if(!flag){
                    sql += " WHERE birthday like ?";
                    flag = true;
                    flagnum2 = 1;
                }else{
                    sql += " AND birthday like ?";
                    flagnum2 = 2;
                }
            }
            if (ud.getType()!=0) {
                if(!flag){
                    sql += " WHERE type like ?";
                    flagnum3 = 1;
                }else{
                    sql += " AND type like ?";
                    if(flagnum2 == 2){
                    flagnum3 = 3;
                }else{
                    flagnum3 = 2;    
                    }
            }
            }
            st =  con.prepareStatement(sql);
            if(flagnum1 == 1) {
                st.setString(1, "%"+ud.getName()+"%");
            }
            
            if(flagnum2 == 1) {
                st.setString(1, "%"+ new SimpleDateFormat("yyyy").format(ud.getBirthday())+"%");
            } else if (flagnum2 == 2){
                st.setString(2, "%"+ new SimpleDateFormat("yyyy").format(ud.getBirthday())+"%");
            }
            
            if (flagnum3 == 1) {
                st.setInt(1, ud.getType());
            } else if (flagnum3 == 2){
                st.setInt(2, ud.getType());
            } else if (flagnum3 == 3){
                st.setInt(3, ud.getType());
            }
            
            
            ResultSet rs = st.executeQuery();
            while (rs.next()){
            UserDataDTO resultUd = new UserDataDTO();
            resultUd.setUserID(rs.getInt(1));
            resultUd.setName(rs.getString(2));
            resultUd.setBirthday(rs.getDate(3));
            resultUd.setTell(rs.getString(4));
            resultUd.setType(rs.getInt(5));
            resultUd.setComment(rs.getString(6));
            resultUd.setNewDate(rs.getTimestamp(7));
            resultUdList.add(resultUd);
            System.out.println("search completed");
            }
            return resultUdList;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new SQLException(e);
        }finally{
            if(con != null){
                con.close();
            }
        }

    }
    
    /**
     * ユーザーIDによる1件のデータの検索処理を行う。
     * @param ud 対応したデータを保持しているJavaBeans
     * @throws SQLException 呼び出し元にcatchさせるためにスロー 
     * @return 検索結果
     */
    public UserDataDTO searchByID(UserDataDTO ud) throws SQLException{
        Connection con = null;
        PreparedStatement st = null;
        try{
            con = DBManager.getConnection();
            
            String sql = "SELECT * FROM user_t WHERE userID = ?";
            
            st =  con.prepareStatement(sql);
            st.setInt(1, ud.getUserID());
            
            ResultSet rs = st.executeQuery();
            rs.next();
            UserDataDTO resultUd = new UserDataDTO();
            resultUd.setUserID(rs.getInt(1));
            resultUd.setName(rs.getString(2));
            resultUd.setBirthday(rs.getDate(3));
            resultUd.setTell(rs.getString(4));
            resultUd.setType(rs.getInt(5));
            resultUd.setComment(rs.getString(6));
            resultUd.setNewDate(rs.getTimestamp(7));
            
            System.out.println("searchByID completed");

            return resultUd;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new SQLException(e);
        }finally{
            if(con != null){
                con.close();
            }
        }

    }
    
    
    /**
     * タスク：updateメソッドの作成
     * データの更新を行う。現在時刻は挿入直前に生成
     * @param ud 対応したデータを保持しているJavaBeans
     * @throws SQLException 呼び出し元にcatchさせるためにスロー 
     */
    
     public void update(UserDataDTO ud) throws SQLException{
        Connection con = null;
        PreparedStatement st = null;
          try{
            con = DBManager.getConnection();
            st =  con.prepareStatement("update user_t set name=?, birthday=?, tell=?, type=?, comment=?, newDate=? where userID=?");
            st.setString(1, ud.getName());
            st.setDate(2, new java.sql.Date(ud.getBirthday().getTime()));//指定のタイムスタンプ値からSQL格納用のDATE型に変更
            st.setString(3, ud.getTell());
            st.setInt(4, ud.getType());
            st.setString(5, ud.getComment());
            st.setTimestamp(6, new Timestamp(System.currentTimeMillis()));
            st.setInt(7, ud.getUserID());
            st.executeUpdate();
            System.out.println("update completed");
        }catch(SQLException e){
            //修正
            System.out.println("接続時にエラーが発生しました："+e.getMessage());
            throw new SQLException(e);
        }finally{
            if(con != null){
                con.close();
            }
        }

    }
     
     /**
     * タスク：deleteメソッドの作成
     * データの削除を行う。現在時刻は挿入直前に生成
     * @param ud 対応したデータを保持しているJavaBeans
     * @throws SQLException 呼び出し元にcatchさせるためにスロー 
     */
      public void delete(UserDataDTO ud) throws SQLException{
        Connection con = null;
        PreparedStatement st = null;
          try{
            con = DBManager.getConnection();
            st =  con.prepareStatement("delete from user_t where userID = ?");
            st.setInt(1, ud.getUserID());
            st.executeUpdate();
            System.out.println("insert completed");
        }catch(SQLException e){
            //修正
            System.out.println("接続時にエラーが発生しました："+e.getMessage());
            throw new SQLException(e);
        }finally{
            if(con != null){
                con.close();
            }
        }

    }
}
