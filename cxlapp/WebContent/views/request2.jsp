<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  <title>Renren Website Demo -- Request</title>
</head>
<body>
  <a target="_blank" href="http://widget.renren.com/dialog/request?app_id=${requestScope.appId}&display=${requestScope.display}&accept_url=${requestScope.acceptUrl}&accept_label=${requestScope.acceptLabel}&actiontext=${requestScope.actionText}&redirect_uri=${requestScope.redirectUri}">点此发送邀请</a>
</body>
</html>