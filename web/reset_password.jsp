<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/header.html" />

<h1>Reset Your Password</h1>
        <div>
            <nav>
                <a href="index.jsp">Home</a> &nbsp;
                <a href="Login.jsp">Login</a> &nbsp;
                <a href="reset_password.jsp">Change Password</a> &nbsp;
            </nav>
        </div>

<form action="NewCustomerServlet" method="post">
            <input type="hidden" name="action" value="reset">
            <label>First Name:</label>
            <input type="text" name="firstname" value="${user.firstName}"><br>
            <label>Last Name:</label>
            <input type="text" name="lastname" value="${user.lastName}"><br>
            <label>Phone:</label>
            <input type="text" name="phone" value="${user.phone}"><br>
            <label>Address:</label>
            <input type="text" name="address" value="${user.address}"><br>
            <label>City:</label>
            <input type="text" name="city" value="${user.city}"><br>
            <label>State:</label>
            <input type="text" name="state" value="${user.state}"><br>
            <label>Zip:</label>
            <input type="text" name="zip" value="${user.zip}"><br>
            <label>Email:</label>
            <input type="text" name="email" value="${user.email}"><br>
            <label>Username:</label>
            <input type="text" name="username" value="${user.username}"><br>
            <label>Password:</label>
            <input type="email" name="password" required><br>
            <input type="submit" value="Submit" name="submit">
           
        </form>








<c:import url="/footer.jsp" />