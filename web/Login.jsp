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
        <form action="LoginServlet" method="post">
            <input type="hidden" name="action" value="add">
            <label>Username:</label>
            <input type="text" name="username" required><br>
            <label>Password:</label>
            <input type="password" name="password" required><br>
            <input type="submit" name="submit" value="Login">
            <input type="reset" name="reset" value="Reset">
            
            
        </form>

<c:import url="/footer.jsp" />
