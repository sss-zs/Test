import java.util.Scanner;

/**
 * @author zsalg         Email:1175241187@qq.com
 * @version 1.0
 * @Description
 * @date 2020/2/23 14:00
 **/
public class SqlMain {
    public static void main(String[] args) {
        boolean isLoop = true;
        while (isLoop){
            System.out.println("请输入一条SQL语句：");
            Scanner input = new Scanner(System.in);
            String sql = input.nextLine();

            //处理分行输入的问题，就是读";"号才停止;
            while(sql.lastIndexOf(";") != sql.length() - 1){
                sql = sql + " " + input.nextLine();
            }

            sql = sql.trim();       //处理前后空格;
            sql = sql.toLowerCase();        //变小写;
            sql = sql.replaceAll("\\s+"," ");       //处理中间多余的空格回车和特殊字符;
            sql = sql.substring(0,sql.lastIndexOf(";"));        //把手动输入的末尾的“;”去掉;
            //sql = "" + sql + " ENDOFSQL";       //在末尾加“ENDOFSQL”;
            System.out.println("处理后的SQL语句为：");
            System.out.println(sql);


             /*
              结束输入判断
              */
            if (sql.equals("exit")){
                isLoop = false;
            }
        }
    }
}
