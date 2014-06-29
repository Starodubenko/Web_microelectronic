<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Web-Microelectronic</title>
</head>
<body>
    <h2>Hello microelectronic world !!!</h2>
    <%--${Board}--%>
    <%--<br><br><br><br>--%>
    <%--${Filtered_devices}--%>
    <table border="1">
        <thead>
        <tr>
            <th><b>PRICE</b></th>
            <th><b>TYPE</b></th>
            <th><b>MATERIAL</b></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="device" items="${board}">

            <tr>
                <td><b> ${device.getPrice()}</b>
                </td>
                <td><b>${device.getType()}</b>
                </td>
                <td><b>${device.getSemiconductorMaterial()}</b>
                </td>
            </tr>

        </c:forEach>
        </tbody>
    </table>
</body>
</html>
