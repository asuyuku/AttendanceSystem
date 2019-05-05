<%--
  Created by IntelliJ IDEA.
  User: v1157
  Date: 2019/4/16
  Time: 上午 2:05
  To change this template use File | Settings | File Templates.
--%>

<%@include file="/WEB-INF/jsp/header.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
  <link href="<%=ctxPath%>/css/H-ui.login.css" rel="stylesheet" type="text/css" />
    <title>Title</title>
  </head>
  <body>

<div class="loginWraper">
  <div id="loginform" class="loginBox">
   <form  action="<%=ctxPath%>/login.do"  method="post">
  <div class="panel panel-default" style="width:100%;height:100%;top:0;position:absolute;">
  	<div class="panel-header">登陆</div>
  	<div class="panel-body">
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">用户名：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" name="number" class="input-text radius size-L" style="color:black;" autocomplete="off" placeholder="帐号">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="password" name="password" class="input-text radius size-L" style="color:black;" autocomplete="off" placeholder="密码">
            </div>
        </div>
        <div class="row">
                <div class="formControls col-8 col-offset-3">
                  <span style="color: red;">${message}</span>
                </div>
         </div>
        <br/>
        <br/>
        <div class="text-c">
        <input type="submit" class="btn btn-success radius size-L" value="&nbsp;登&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;录&nbsp;" />
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="button" class="btn btn-success radius size-L" value="忘记密码" />
        </div>
  	</div>
  </div>
  </form>
  </div>
  </div>

  </body>
</html>
