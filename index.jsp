<!-- index.jsp -->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP Example</title>
</head>
<body>
    <h1><%= request.getAttribute("message") %></h1>
    
    <!-- Your JavaScript code can be included here -->
    <script type="text/javascript">
        // Your JavaScript code goes here
        alert("Hello from JavaScript!");
    </script>
</body>
</html>
