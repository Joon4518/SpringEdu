/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.50
 * Generated at: 2023-09-15 04:50:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1612850415545L));
    _jspx_dependants.put("jar:file:/C:/eGovFrame-4.0.0/workspace.edu/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/SpringMVC03/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/C:/eGovFrame-4.0.0/workspace.edu/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/SpringMVC03/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/header.jsp", out, false);
      out.write("\r\n");
      out.write("\t  <h2>Spring MVC03</h2>\r\n");
      out.write("\t  <div class=\"panel panel-default\">\r\n");
      out.write("\t    <div class=\"panel-heading\">Board</div>\r\n");
      out.write("\t    <div class=\"panel-body\">\r\n");
      out.write("\t\t\t<table id=\"boardList\" class=\"table table-bordered table-hover\">\r\n");
      out.write("\t\t\t\t<tr class=\"active\">\r\n");
      out.write("\t\t\t\t\t<td>번호</td>\r\n");
      out.write("\t\t\t\t\t<td>제목</td>\r\n");
      out.write("\t\t\t\t\t<td>작성자</td>\r\n");
      out.write("\t\t\t\t\t<td>작성일</td>\r\n");
      out.write("\t\t\t\t\t<td>조회수</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tbody id=\"view\">\r\n");
      out.write("\t\t\t\t<!-- 비동기 방식으로 가져온 게시글 나오게할 부분 -->\r\n");
      out.write("\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"5\">\r\n");
      out.write("\t\t\t\t\t\t<button onclick=\"goForm()\" class=\"btn btn-primary btn-sm\">글쓰기</button>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- 글쓰기 폼 -->\r\n");
      out.write("\t\t<div class=\"panel-body\" id=\"wform\" style=\"display : none;\">\r\n");
      out.write("\t\t\t<form id=\"frm\">\r\n");
      out.write("\t\t\t<table class=\"table\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>제목</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"title\" class=\"form-control\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>내용</td>\r\n");
      out.write("\t\t\t\t\t<td><textarea class=\"form-control\" name=\"content\" rows=\"7\" cols=\"\"></textarea> </td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>작성자</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"writer\" class=\"form-control\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-success btn-sm\" type=\"button\" onclick=\"goInsert()\">등록</button>\r\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-warning btn-sm\" type=\"reset\" id=\"fclear\">취소</button>\r\n");
      out.write("\t\t\t\t\t\t<button onclick=\"goList()\" class=\"btn btn-info btn-sm\">목록</button>\r\n");
      out.write("\t\t\t\t\t</td>\t\t\t\t\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t    <div class=\"panel-footer\">스프링게시판 - 박병관</div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(document).ready(function(){\r\n");
      out.write("\t\t\t// HTML이 다 로딩되고나서 아래 코드실행\r\n");
      out.write("\t\t\tloadList();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\tfunction loadList(){\r\n");
      out.write("\t\t\t// 비동기방식으로 게시글 리스트 가져오기 기능\r\n");
      out.write("\t\t\t// ajax - 요청 url, 어떻게 데이터 받을지, 요청방식 등... -> 객체\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl : \"board/all\",\r\n");
      out.write("\t\t\t\ttype : \"get\",\r\n");
      out.write("\t\t\t\tdataType : \"json\",\r\n");
      out.write("\t\t\t\tsuccess : makeView, // 콜백함수\r\n");
      out.write("\t\t\t\terror : function() { alert(\"error\"); }\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction makeView(data){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar listHtml = \"\";\r\n");
      out.write("\t\t\t$.each(data, function(index, obj){\r\n");
      out.write("\t\t\t\tlistHtml += \"<tr>\";\r\n");
      out.write("\t\t\t\tlistHtml += \"<td>\" + (index + 1) + \"</td>\";\r\n");
      out.write("\t\t\t\tlistHtml += \"<td id='t\" + obj.idx + \"'>\";\r\n");
      out.write("\t\t\t\tlistHtml += \"<a href='javascript:goContent(\" + obj.idx + \")'>\";\r\n");
      out.write("\t\t\t\tlistHtml += obj.title;\r\n");
      out.write("\t\t\t\tlistHtml += \"</a>\";\r\n");
      out.write("\t\t\t\tlistHtml += \"</td>\";\r\n");
      out.write("\t\t\t\tlistHtml += \"<td id='w\" + obj.idx + \"'>\" + obj.writer + \"</td>\";\r\n");
      out.write("\t\t\t\tlistHtml += \"<td>\" + obj.indate + \"</td>\";\r\n");
      out.write("\t\t\t\tlistHtml += \"<td>\" + obj.count + \"</td>\";\r\n");
      out.write("\t\t\t\tlistHtml += \"</tr>\";\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t// 상세보기 화면\r\n");
      out.write("\t\t\t\tlistHtml += \"<tr id='c\" + obj.idx + \"' style='display : none'>\";\r\n");
      out.write("\t\t\t\tlistHtml += \"<td>내용</td>\";\r\n");
      out.write("\t\t\t\tlistHtml += \"<td colspan='4'>\";\r\n");
      out.write("\t\t\t\tlistHtml += \"<textarea id='ta\" + obj.idx + \"' readonly rows='7' class='form-control'>\";\r\n");
      out.write("\t\t\t\t// listHtml += obj.content;\r\n");
      out.write("\t\t\t\tlistHtml += \"</textarea>\";\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t// 수정 삭제 화면\r\n");
      out.write("\t\t\t\tlistHtml += \"<br>\";\r\n");
      out.write("\t\t\t\tlistHtml += \"<span id='ub\"+ obj.idx +\"'>\";\r\n");
      out.write("\t\t\t\tlistHtml += \"<button onclick='goUpdateForm(\" + obj.idx + \")' class='btn btn-sm btn-success'>수정화면</button></span> &nbsp;\"\r\n");
      out.write("\t\t\t\tlistHtml += \"<button onclick='goDelete(\" + obj.idx + \")' class='btn btn-sm btn-warning'>삭제</button> &nbsp;\"\r\n");
      out.write("\t\t\t\tlistHtml += \"</td>\";\r\n");
      out.write("\t\t\t\tlistHtml += \"</tr>\";\r\n");
      out.write("\t\t\t});\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\"#view\").html(listHtml);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tgoList();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// goForm 함수를 만들어서 view는 감추고 wform은 보이게하시오\r\n");
      out.write("\t\tfunction goForm(){\r\n");
      out.write("\t\t\t$(\"#boardList\").css(\"display\", \"none\");\r\n");
      out.write("\t\t\t$(\"#wform\").css(\"display\", \"block\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction goList(){\r\n");
      out.write("\t\t\t$(\"#boardList\").css(\"display\", \"table-row\");\r\n");
      out.write("\t\t\t$(\"#wform\").css(\"display\", \"none\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction goInsert(){\r\n");
      out.write("\t\t\t// 게시글 등록기능 - 비동기\r\n");
      out.write("\t\t\t// title=\"안녕\"&content=\"반가워\"&writer=\"호두아빠\"\r\n");
      out.write("\t\t\tvar fData = $(\"#frm\").serialize();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl : \"board/new\",\r\n");
      out.write("\t\t\t\ttype : \"post\",\r\n");
      out.write("\t\t\t\tdata : fData,\r\n");
      out.write("\t\t\t\tsuccess : loadList,\r\n");
      out.write("\t\t\t\terror : function() { alert(\"error\") }\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\"#fclear\").trigger(\"click\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction goContent(idx){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif($(\"#c\" + idx).css(\"display\") == \"none\"){\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\turl : \"board/\" + idx,\r\n");
      out.write("\t\t\t\t\ttype : \"get\",\r\n");
      out.write("\t\t\t\t\tdataType : \"json\",\r\n");
      out.write("\t\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t\t$(\"#ta\" + idx).val(data.content);\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\terror : function() { alert(\"error\"); }\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(\"#c\" + idx).css(\"display\",\"table-row\");\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t$(\"#c\" + idx).css(\"display\",\"none\");\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\turl : \"board/count/\" + idx,\r\n");
      out.write("\t\t\t\t\ttype : \"put\",\r\n");
      out.write("\t\t\t\t\tsuccess : loadList,\r\n");
      out.write("\t\t\t\t\terror : function() { alert(\"error\"); }\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction goDelete(idx){\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl : \"board/\" + idx,\r\n");
      out.write("\t\t\t\ttype : \"delete\",\r\n");
      out.write("\t\t\t\tdata : {\"idx\" : idx},\r\n");
      out.write("\t\t\t\tsuccess : loadList,\r\n");
      out.write("\t\t\t\terror : function() { alert(\"error\"); }\t\t\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction goUpdateForm(idx){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\"#ta\" + idx).attr(\"readonly\", false);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar title = $(\"#t\" + idx).text();\r\n");
      out.write("\t\t\tvar newTitle = \"<input id='nt\"+idx+\"' value='\" + title + \"' type='text' class='form-control' >\";\r\n");
      out.write("\t\t\t$(\"#t\" + idx).html(newTitle);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar writer = $(\"#w\" + idx).text();\r\n");
      out.write("\t\t\tvar newWriter = \"<input id='nw\"+idx+\"' value='\" + writer + \"' type='text' class='form-control' >\";\r\n");
      out.write("\t\t\t$(\"#w\" + idx).html(newWriter);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar newBtn = \"<button onclick='goUpdate(\"+idx+\")' class='btn btn-primary btn-sm'>수정</button>\";\r\n");
      out.write("\t\t\t$(\"#ub\" + idx).html(newBtn);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction goUpdate(idx){\r\n");
      out.write("\t\t\tvar title = $(\"#nt\" + idx).val();\r\n");
      out.write("\t\t\tvar content = $(\"#ta\" + idx).val();\r\n");
      out.write("\t\t\tvar writer = $(\"#nw\" + idx).val();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl : \"board/update\",\r\n");
      out.write("\t\t\t\ttype : \"put\",\r\n");
      out.write("\t\t\t\tcontentType : \"application/json;charset=utf-8\",\r\n");
      out.write("\t\t\t\tdata : JSON.stringify({\"idx\" : idx, \"title\" : title, \"content\" : content, \"writer\" : writer}),\r\n");
      out.write("\t\t\t\tsuccess : loadList,\r\n");
      out.write("\t\t\t\terror : function() { alert(\"error\"); }\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
