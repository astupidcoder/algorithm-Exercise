package com;

import java.sql.*;

/**
 * @author liuyj
 * @Title: JdbcTest
 * @create 2020-05-27 17:31
 * @ProjectName algorithm-Exercise
 * @Description: TODO
 */
public class JdbcTest {
    public static void main(String[] args) {
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //通过驱动管理类来获取数据库连接
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatis","root","root");
            //定义sql语句 ?表示占位符
            String sql="select * from user where username=?";
            //获取预处理statement
            preparedStatement=connection.prepareStatement(sql);
            //设置参数
            preparedStatement.setString(1,"tom");
            //执行查询获取结果
            resultSet = preparedStatement.executeQuery();
            //遍历查询结果集
            while (resultSet.next()) {
                int id=resultSet.getInt("id");
                String username=resultSet.getString("username");
                System.out.println(username+id);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //释放资源
            if(resultSet !=null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (preparedStatement != null) {

                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
