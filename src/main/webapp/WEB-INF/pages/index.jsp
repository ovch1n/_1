<%@ taglib prefix="form" uri="http://www.springframework.org/tags" %>
<%@ page contentType = "text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Subtraction</title>
</head>

<body>
<form action="/index" method="POST">
    <table>
        <tr><td>Первое число</td> <td>Второе число</td> <td>Результат</td></tr><br>
        <tr><td><input type="text" name="ch1">/</td>
            <td><input type="text" name="ch2">=</td>
            <td>${otvet}</td>
            <td><input type="submit" name="calculate" value="Calculate"></td>
        </tr>
    </table>
</form>
</body>
</html>
