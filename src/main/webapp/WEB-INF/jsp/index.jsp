<%--
  Created by IntelliJ IDEA.
  User: v1157
  Date: 2019/4/16
  Time: 上午 12:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String ctxPath = request.getContextPath(); %>
<html >
<head>
<meta charset="UTF-8">
<title>超酷的jQuery带验证登录表单DEMO演示</title>
<link href="https://fonts.googleapis.com/css?family=Titillium+Web:400,300,600" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="<%=ctxPath%>/css/normalize.min.css">
<script src="<%=ctxPath%>/js/jquery.min.js"></script>
<script  src="<%=ctxPath%>/js/index.js"></script>
<link rel="stylesheet" href="<%=ctxPath%>/css/style.css">

</head>

<body>


  <div class="form">

      <ul class="tab-group">
        <li class="tab active"><a href="#signup">Sign Up</a></li>
        <li class="tab"><a href="#login">Log In</a></li>
      </ul>

      <div class="tab-content">
        <div id="signup">
          <h1>Sign Up for Free</h1>

          <form action="/" method="post">

          <div class="top-row">
            <div class="field-wrap">
              <label>
                First Name<span class="req">*</span>
              </label>
              <input type="text" required autocomplete="off" />
            </div>

            <div class="field-wrap">
              <label>
                Last Name<span class="req">*</span>
              </label>
              <input type="text"required autocomplete="off"/>
            </div>
          </div>

          <div class="field-wrap">
            <label>
              Email Address<span class="req">*</span>
            </label>
            <input type="email"required autocomplete="off"/>
          </div>

          <div class="field-wrap">
            <label>
              Set A Password<span class="req">*</span>
            </label>
            <input type="password"required autocomplete="off"/>
          </div>

          <button type="submit" class="button button-block"/>Get Started</button>

          </form>

        </div>

        <div id="login">
          <h1>Welcome Back!</h1>

          <form action="/" method="post">

            <div class="field-wrap">
            <label>
              Email Address<span class="req">*</span>
            </label>
            <input type="email"required autocomplete="off"/>
          </div>

          <div class="field-wrap">
            <label>
              Password<span class="req">*</span>
            </label>
            <input type="password"required autocomplete="off"/>
          </div>

          <p class="forgot"><a href="#">Forgot Password?</a></p>

          <button class="button button-block"/>Log In</button>

          </form>

        </div>

      </div><!-- tab-content -->

</div> <!-- /form -->
</body>
</html>
