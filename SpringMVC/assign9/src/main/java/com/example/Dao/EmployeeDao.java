package com.example.Dao;

import com.example.model.EmployeeModel;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.swing.tree.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDao {
    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public List<EmployeeModel> getEmployeesByPage(int pageid, int total){
        String sql="select * from emp limit "+(pageid-1)+","+total;
        return template.query(sql,new RowMapper<EmployeeModel>(){
            public EmployeeModel mapRow(ResultSet rs, int row) throws SQLException {
                EmployeeModel e=new EmployeeModel();
                e.setId(rs.getInt(1));
                e.setName(rs.getString(2));
                e.setSalary(rs.getFloat(3));
                return e;
            }
        });
    }
    public List<EmployeeModel> getAllEmployees(){
        String sql = "select * from emp";
        return template.query(sql,new RowMapper<EmployeeModel>(){
            public EmployeeModel mapRow(ResultSet rs, int row) throws SQLException{
                EmployeeModel e2=new EmployeeModel();
                e2.setId(rs.getInt(1));
                e2.setName(rs.getString(2));
                e2.setSalary(rs.getFloat(3));
                return e2;
            }
        });
    }
}
