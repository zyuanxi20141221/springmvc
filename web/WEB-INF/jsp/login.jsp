<%@ page contentType="text/html; charset=utf-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<head>
    <title>图书馆管理系统</title>
    <link href="CSS/style.css" rel="stylesheet">
    <script language="javascript">
        function check(form) {
            if (form.name.value == "") {
                alert("请输入管理员名称!");
                form.name.focus();
                return false;
            }
            if (form.pwd.value == "") {
                alert("请输入密码!");
                form.pwd.focus();
                return false;
            }
        }
    </script>
</head>
<body>
<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#F9D16B" class="tableBorder">
    <tr>
        <td>
            <table width="760" border="0" align="center" cellpadding="0" cellspacing="0">
                <tr>
                    <td height="142" valign="top">&nbsp;</td>
                </tr>
            </table>
        </td>
    </tr>
    <td>
        <table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
                <td valign="top">
                    <table width="100%" height="525" border="0" align="center" cellpadding="0" cellspacing="0">
                        <tr>
                            <td height="523" align="center" valign="top">
                                <table width="100%" height="271" border="0" cellpadding="0" cellspacing="0">
                                    <tr>
                                        <td height="271" align="right" valign="top" class="word_orange">
                                            <table width="100%" height="255" border="0" cellpadding="0" cellspacing="0"
                                                   background="">
                                                <tr>
                                                    <td height="57">&nbsp;</td>
                                                </tr>
                                                <tr>
                                                    <td height="179" valign="top">
                                                        <table width="90%" height="63" border="0" cellpadding="0"
                                                               cellspacing="0">
                                                            <tr>
                                                                <td width="2%">&nbsp;</td>
                                                                <td width="100%" align="center" valign="top">
                                                                    <form name="form1" method="post"
                                                                          action="loginAction!login">
                                                                        <table width="70%" border="0" cellpadding="0"
                                                                               cellspacing="0"
                                                                               bordercolorlight="#FFFFFF"
                                                                               bordercolordark="#D2E3E6">
                                                                            <tr>
                                                                                <td height="57">&nbsp;</td>
                                                                                <td height="57" colspan="2"
                                                                                    align="center">&nbsp;
                                                                                </td>
                                                                                <td>&nbsp;</td>
                                                                            </tr>
                                                                            <tr>
                                                                                <td width="60%" height="37">&nbsp;</td>
                                                                                <td width="10%">管理员名称：</td>
                                                                                <td width="20%">
                                                                                    <input name="username" type="text"
                                                                                           class="logininput"
                                                                                           id="username"
                                                                                           size="27"></td>
                                                                                <td width="20%">&nbsp;</td>
                                                                            </tr>
                                                                            <tr>
                                                                                <td width="60%" height="37">&nbsp</td>
                                                                                <td width="10%">管理员密码：</td>
                                                                                <td width="20%">
                                                                                    <input name="password"
                                                                                           type="password"
                                                                                           class="logininput"
                                                                                           id="password"
                                                                                           size="27"></td>
                                                                                <td width="20%"><a href="/book/register.html">用户注册</a></td>
                                                                            </tr>
                                                                            <tr>
                                                                                <td height="30">&nbsp;</td>
                                                                                <td colspan="2" align="center">
                                                                                    <input
                                                                                            name="Submit" type="submit"
                                                                                            class="btn_grey" value="确定"
                                                                                            onClick="return check(form1)">
                                                                                    &nbsp;
                                                                                    <input name="Submit3" type="reset"
                                                                                           class="btn_grey" value="重置">&nbsp;
                                                                                    <input name="Submit2" type="button"
                                                                                           class="btn_grey" value="关闭"
                                                                                           onClick="window.close();">
                                                                                </td>
                                                                                <td>&nbsp;</td>
                                                                            </tr>
                                                                        </table>
                                                                    </form>
                                                                </td>
                                                                <td width="1%">&nbsp;</td>
                                                            </tr>
                                                        </table>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td height="19">&nbsp;</td>
                                                </tr>
                                            </table>
                                        </td>
                                    </tr>
                                </table>
                                <table width="100%" height="27" border="0" cellpadding="0" cellspacing="0">
                                    <tr>
                                        <td align="center" class="word_login">CopyRight &copy; 2020
                                        </td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
        </table>
    </td>
    </tr>
</table>
</body>
</html>
