<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/header.html" />
<h1>Welcome to Titan Online Banking.  Please fill out the 
        information below.</h1>
        <div>
            <nav>
                <a href="index.jsp">Home</a> &nbsp;
                <a href="Login.jsp">Login</a> &nbsp;
                <a href="New_customer.jsp">New Customer</a> &nbsp;
            </nav>
        </div>
        <form action="User" method="post">
            <input type="hidden" name="action" value="add">
            <label>First Name:</label>
            <input type="text" name="firstname" required><br>
            <label>Last Name:</label>
            <input type="text" name="lastname" required><br>
            <label>Phone:</label>
            <input type="text" name="phone" required><br>
            <label>Address:</label>
            <input type="text" name="address" required><br>
            <label>City:</label>
            <input type="text" name="city" required><br>
            <label>State:</label>
            <input type="text" name="state" required><br>
            <label>Zip:</label>
            <input type="text" name="zip" required><br>
            <label>Email:</label>
            <input type="email" name="email" required><br>
            <input type="submit" name="submit">
            <input type="reset" value="Submit" name="reset">
            
        </form>

<c:import url="/footer.jsp" />