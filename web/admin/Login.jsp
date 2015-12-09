<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/header.html" />

<h1>Login</h1>
        <p>To sign up and a new customer please click the New Customer 
            Link in the menu bar.</p>
        <div>
            <nav>
                <a href="index.jsp">Home</a> &nbsp;
                <a href="Login.jsp">Login</a> &nbsp;
                <a href="New_customer.jsp">New Customer</a> &nbsp;
            </nav>
        </div>
        <form action="j_security_check" method="get">
          
            <label class = "pad_top">Username:</label>
            <input type="text" name="j_username" ><br>
            <label class = "pad_top">Password:</label>
            <input type="password" name="j_password"><br>
            <input type="submit" name="submit" value="Login">
            
            
            
        </form>

<c:import url="/footer.jsp" />
