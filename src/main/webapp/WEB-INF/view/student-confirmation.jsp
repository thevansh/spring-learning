<%--
  Created by IntelliJ IDEA.
  User: vansh
  Date: 23-07-2021
  Time: 07:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Confirmation</title>
</head>
<body>
        Student Confirmed Name is : ${student.firstName} ${student.lastName}
        <br>
        Country: ${student.country}

        <br>
        Your Favourite Language:  ${student.favouriteLanguage}
        <br>

        Operating System:
        <br>
        <ul>
                <c:forEach var="temp" items="${student.operatingSystem}">

                        <li> ${temp} </li>

                </c:forEach>
        </ul>

        <br>

        <a href="showForm"><input type="reset"></a>
</body>
</html>
