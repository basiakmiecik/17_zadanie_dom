<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: basik
  Date: 09/11/2018
  Time: 12:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Zabawa z tesktem</title>
  </head>
  <body>
  <h1>Przelicznik tekstu</h1>
  <form action="/text" method="post">
  <div class="form-group">
    <textarea type ="string" class="form-control" name="AreaOfText" rows="14" cols="50"></textarea>
      <button type="submit" class="btn btn-primary" name="klawisz">Zatwierdz</button>
  </div>
  </form>

  </body>
</html>
