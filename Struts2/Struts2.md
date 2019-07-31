### Struts2

控制器由Servlet变为Filter



![](image.png)


单个拦截器



![](image.png)
传统servlet方式：

![](image.png)
这样做会有很大弊端，当属性很多时，我们需要写很多getParameter方法。

struts2利用**__属性驱动和模型驱动帮助我们完成了数据自动获取和数据自动封装__****，**改善了这些弊端



1\.属性驱动

对于属性驱动，我们需要在Action中定义与表单元素对应的所有的属性，因而在Action中会出现很多的getter和setter方法

`public class LoginAction1 extends ActionSupport {`

`	/**`

`	 * 属性驱动`

`	 */`

`	@Override`

`	public String execute() throws Exception {`

`		System.out.println(username);`

`		System.out.println(password);`

`		return "success";`

`	}`

`	private String username;`

`	private String password;`

`	public String getUsername() {`

`		return username;`

`	}`

`	public void setUsername(String username) {`

`		this.username = username;`

`	}`

`	public String getPassword() {`

`		return password;`

`	}`

`	public void setPassword(String password) {`

`		this.password = password;`

`	}	`

`}`

struts2\.xml

`<action name="loginAction"`

`			class="com.foxconn.action.LoginAction1">`

`			<result name="success">/04/index.jsp</result>`

`		</action>`

2\.模型驱动

对于模型驱动，使用的Action对象需要实现ModelDriven接口并给定所需要的类型.而在Action中我们只需要定义一个封装所有数据信息的javabean

`public class MLoginAction extends ActionSupport implements ModelDriven<User>{`

`	private User us=new User();`

`	/**`

`	 * 模型驱动`

`	 */`

`	@Override`

`	public String execute() throws Exception {`

`		System.out.println(us.getUsername());`

`		System.out.println(us.getPassword());`

`		// TODO Auto-generated method stub`

`		return "success";`

`	}`

`	@Override`

`	public User getModel() {`

`		// TODO Auto-generated method stub`

`		return us;`

`//当请求发送到action之前，调用getModel（）方法获取表单数据将要封装的实例化的对象，从而获取到类和类中的属性`

//request.getParameter获取表单提交的数据名，从而获取到值

//如果表单提交的name值与实体类中的属性名一致，那么我们将表单中的数据封装到对象中



`	}`

`}`

struts\.xml

`<action name="mloginAction"`

`			class="com.foxconn.action.MLoginAction">`

`			<result name="success">/04/index.jsp</result>`

`			<interceptor-ref name="modelDriven"></interceptor-ref>`

`			<interceptor-ref name="defaultStack"></interceptor-ref>`

`		</action>`

3\.属性和模型驱动的相同点



当我们使用属性驱动和模型驱动的时候，必须将表单的元素中的name属性值与我们定义接收数据信息的变量名对应起来。



标签实现模型驱动

**不用实现接口**

JSP

`<%@taglib prefix="s" uri="/struts-tags"%>`

`<h1>anther smode</h1>`

`	<s:form namespace="userlogin" action="sloginAction" method="post">`

`	username:<s:textfield name="us.username"></s:textfield>`

`		<br>`

`	password:<s:password name="us.password">`

`		</s:password>`

`		<br>`

`		<s:submit value="提交" />`

`	</s:form>`



`/**`

` * `

` * @author admin`

`    *标签实现模型驱动`

` */`

`public class SLoginAction extends ActionSupport {`

``

`	private User us;`

`	@Override`

`	public String execute() throws Exception {`

`		System.out.println(us.getUsername());`

`		System.out.println(us.getPassword());`

`		return "success";`

`	}`

`	public User getUs() {`

`		return us;`

`	}`

`	public void setUs(User us) {`

`		this.us = us;`

`	}`

`}`

struts\.xml

`<action name="sloginAction"`

`			class="com.foxconn.action.SLoginAction">`

`			<result name="success">/04/index.jsp</result>`

`		</action>`

