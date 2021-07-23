<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Student Form</title>
</head>
<body>

        <form:form action="processForm" modelAttribute="student">
            First name: <form:input path="firstName" />

            <br><br>
            Last name: <form:input path="lastName" />

            <br><br>

            Country:
            <form:select path="country">
                <form:options items="${student.countryOption}"/>
                <%--                <form:option value="India" label="India" />--%>
                <%--                <form:option value="Australia" label="Australia" />--%>
                <%--                <form:option value="Italy" label="Italy" />--%>
                <%--                <form:option value="Russia" label="Russia" />--%>
            </form:select>

            <br><br>

            Favourite Language:
            <br>
            Java <form:radiobutton path="favouriteLanguage" value="Java"/>
            C++ <form:radiobutton path="favouriteLanguage" value="C++"/>
            Python <form:radiobutton path="favouriteLanguage" value="Python"/>
            C# <form:radiobutton path="favouriteLanguage" value="C#"/>

            <br>
            <br>
            Familiar Operating Systems
            <br>
            Windows <form:checkbox path="operatingSystem" value="Windows"/>
            Mac OS <form:checkbox path="operatingSystem" value="Mac OS"/>
            Linux <form:checkbox path="operatingSystem" value="Linux"/>


            <input type="submit" value="submit">


        </form:form>



</body>
</html>
