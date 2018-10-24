<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<script type="text/javascript">
    $('#dg').datagrid({
        url:'${pageContext.request.contextPath }/banner/select',
        columns:[[
            {field:'name',title:'图片名',width:100},
            {field:'status',title:'状态',width:100},
            {field:'createDate',title:'上传日期',width:100,align:'right'},
            {field:'description',title:'描述信息',width:100},

        ]],
        toolbar: [{
            iconCls: 'icon-edit',
            handler: function(){alert('编辑按钮')}
        },'-',{
            iconCls: 'icon-help',
            handler: function(){alert('帮助按钮')}
        },'-',{
            iconCls: 'icon-help',
            handler: function(){alert('帮助按钮')}
        } ,'-',{
            iconCls: 'icon-help',
            handler: function(){alert('帮助按钮')}
        }],


        pagination:true



    });
</script>

<table id="dg"></table>

