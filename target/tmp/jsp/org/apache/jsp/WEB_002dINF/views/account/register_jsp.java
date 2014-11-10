package org.apache.jsp.WEB_002dINF.views.account;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>用户注册</title>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\t$(document).ready(function() {\n");
      out.write("\t\t//聚焦第一个输入框\n");
      out.write("\t\t$(\"#loginName\").focus();\n");
      out.write("\t\t//为inputForm注册validate函数\n");
      out.write("\t\t$(\"#inputForm\").validate({\n");
      out.write("\t\t\trules : {\n");
      out.write("\t\t\t\tloginName : {\n");
      out.write("\t\t\t\t\tremote : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/register/checkLoginName\"\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\tmessages : {\n");
      out.write("\t\t\t\tloginName : {\n");
      out.write("\t\t\t\t\tremote : \"用户登录名已存在\"\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<form id=\"inputForm\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/register\" method=\"post\"\n");
      out.write("\t\tclass=\"form-horizontal form-signin\">\n");
      out.write("\t\t<fieldset>\n");
      out.write("\t\t\t<legend>用户注册</legend>\n");
      out.write("\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"登录名\" required\n");
      out.write("\t\t\t\tautofocus id=\"loginName\" name=\"loginName\" /> \n");
      out.write("\t\t\t<input type=\"text\"\n");
      out.write("\t\t\t\tclass=\"form-control\" placeholder=\"用户名\" required id=\"name\"\n");
      out.write("\t\t\t\tname=\"name\" /> \n");
      out.write("\t\t\t<input type=\"password\" class=\"form-control input-large required\" \n");
      out.write("\t\t\t\tplaceholder=\"密码\" required id=\"plainPassword\" name=\"plainPassword\" />\n");
      out.write("\t\t\t<input type=\"password\" class=\"form-control input-large required\" id=\"confirmPassword\"\n");
      out.write("\t\t\t\tname=\"confirmPassword\" placeholder=\"确认密码\"\n");
      out.write("\t\t\t equalTo=\"#plainPassword\" />\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"form-actions\">\n");
      out.write("\t\t\t\t<input id=\"submit_btn\" class=\"btn btn-primary btn-lg\" type=\"submit\"\n");
      out.write("\t\t\t\t\tvalue=\"提交\" />&nbsp; \n");
      out.write("\t\t\t\t<input id=\"cancel_btn\" class=\"btn btn-lg\"\n");
      out.write("\t\t\t\t\ttype=\"button\" value=\"返回\" onclick=\"history.back()\" />\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</fieldset>\n");
      out.write("\t</form>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("ctx");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }
}
