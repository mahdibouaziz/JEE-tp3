<%--
  Created by IntelliJ IDEA.
  User: mahdi
  Date: 4/15/2021
  Time: 12:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%
        int nbLig= (int) request.getAttribute("nbLig");
        int nbCol= (int) request.getAttribute("nbCol");
    %>

    <div class="container" style="margin-top: 20px">

        <table class="table table-bordered table-striped">
            <tbody>
            <% for(int i=0;i<nbLig;i++){ %>
                <tr>
                    <% for(int j=0;j<nbCol;j++){ %>
                        <td> ( <%=i+1%> , <%=j+1%> )</td>
                    <%}%>
                </tr>
            <%}%>
            </tbody>
        </table>

    </div>

</body>
</html>
