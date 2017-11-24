<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="WEB-INF/view/easyui-base.jsp"%>
<html>
<head>
</head>

    <div style="padding:5px;background:#fafafa;width:500px;border:1px solid #ccc">
        <a href="#" class="easyui-linkbutton" plain="true" iconCls="icon-cancel">Cancel</a>
        <a href="#" class="easyui-linkbutton" plain="true" iconCls="icon-reload">Refresh</a>
        <a href="#" class="easyui-linkbutton" plain="true" iconCls="icon-search">Query</a>
        <a href="#" class="easyui-linkbutton" plain="true">text button</a>
        <a href="#" class="easyui-linkbutton" plain="true" iconCls="icon-print">Print</a>
        <a href="#" class="easyui-linkbutton" plain="true" iconCls="icon-help"></a>
        <a href="#" class="easyui-linkbutton" plain="true" iconCls="icon-save"></a>
        <a href="#" class="easyui-linkbutton" plain="true" iconCls="icon-back"></a>
    </div>


    <div style="background:#fafafa;padding:5px;width:200px;border:1px solid #ccc">
    <a href="#" class="easyui-menubutton" menu="#mm1" iconCls="icon-edit">Edit</a>
    <a href="#" class="easyui-menubutton" menu="#mm2" iconCls="icon-help">Help</a>
    </div>
    <div id="mm1" style="width:150px;">
        <div iconCls="icon-undo">Undo</div>
        <div iconCls="icon-redo">Redo</div>
        <div class="menu-sep"></div>
        <div>Cut</div>
        <div>Copy</div>
        <div>Paste</div>
        <div class="menu-sep"></div>
        <div iconCls="icon-remove">Delete</div>
        <div>Select All</div>
    </div>
    <div id="mm2" style="width:100px;">
        <div>Help</div>
        <div>Update</div>
        <div>About</div>
    </div>
</body>
</html>
