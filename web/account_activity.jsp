<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/header.html" />

<h1>Account Activity</h1>
        <div>
            <nav>
                <a href="index.jsp">Home</a> &nbsp;
                <a href="Login.jsp">Login</a> &nbsp;
                <a href="reset_password.jsp">Change Password</a> &nbsp;
            </nav>
        </div>

<c:if test="${user.username != null}">
    <p> Welcome ${user.firstName} ${user.lastName}. <br>   
        <c:otherwise>
            <p> Not logged in. <br>
            <a href="Login.jsp">Login Here Please</a> &nbsp;
        </c:otherwise>
</c:if>
        








<c:import url="/footer.jsp" />
