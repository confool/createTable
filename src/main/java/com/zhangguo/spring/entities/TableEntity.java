package com.zhangguo.spring.entities;

import com.zhangguo.spring.command.CreateTableParam;

import java.io.Serializable;
import java.util.List;

public class TableEntity implements Serializable {
    private static final long serialVersionUID = -3271257418286413963L;

    /*表名*/
    private String tableName;

    /*表字段集合*/
    private List<CreateTableParam> columns;

    public TableEntity() {
        // TODO Auto-generated constructor stub
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<CreateTableParam> getColumns() {
        return columns;
    }

    public void setColumns(List<CreateTableParam> columns) {
        this.columns = columns;
    }

    @Override
    public String toString() {
        return "TableEntity [tableName=" + tableName + ", columns=" + columns + "]";
    }


}
