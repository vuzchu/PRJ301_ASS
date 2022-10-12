<%-- 
    Document   : Schedule
    Created on : Oct 13, 2022, 12:51:59 AM
    Author     : vu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <link href="../../css/style.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>Schedule : </p>
       
        Year<select name="datetime">
            <option>2021</option>
            <option>2022</option>
        </select>
        Week<select name="datetime">
            <option>29/08 To 04/09</option>
            <option>05/09 To 11/09</option>
            <option>12/09 To 18/09</option><!-- comment -->
            <option>19/09 To 25/09</option><!-- comment -->
            <option>26/09 To 02/10</option><!-- comment -->
            <option>03/10 To 09/10</option>
            <option>10/10 To 16/10</option>
            
        </select>
        
       <div class="timetable">
  <div class="week-names">
    <div>monday</div>
    <div>tuesday</div>
    <div>wednesday</div>
    <div>thursday</div>
    <div>friday</div>
    <div >saturday</div>
    <div>sunday</div>
  </div>
  <div class="time-interval">
    <div>7:30 - 9:00</div>
    <div>09:10 - 10:40</div>
    <div>10:50 - 12:20</div>
    <div>12:50 - 14:20</div>
    <div>15:00 - 16:30</div>
    <div>16:40 - 17:40</div>
  </div>
  <div class="content">
    <div>
      <div ></div>
    </div>
      <div></div>
    <div></div>
    <div></div>
        <div>
      <div ><a href="list.jsp">SE1611_IOT106</a></div>
    </div>
    <div class="weekend"></div>
    <div class="weekend"></div>
    <div><a href="list.jsp">SE1611_JPD123</a></div>
    <div></div>
    <div></div>
    <div>
      <div><a href="list.jsp">IOT106_PRJ301</a></div>
    </div>
    <div><a href="list.jsp">SE1611_IOT106</a></div>
    <div class="weekend"></div>
    <div class="weekend"></div>
    <div>
      <div ><a href="list.jsp">SE1611_JPD123</a></div>
    </div>
    <div><a href="list.jsp">IOT106_PRJ301</a></div>
    <div>
      <div ><a href="list.jsp">SE1611_JPD123</a></div>
    </div>
    <div><a href="list.jsp">IOT106_PRJ301</a></div>
    <div></div>
    <div class="weekend"></div>
    <div class="weekend"></div>
    <div></div>
    <div></div>
    <div><a href="list.jsp">SE1611_JPD123</a></div>
    <div></div>
    <div></div>
    <div class="weekend"></div>
    <div class="weekend"></div>
    <div>
      <div ></div>
    </div>
    <div></div>
    <div></div>
    <div></div>
    <div></div>
    <div class="weekend"></div>
    <div class="weekend"></div>
    <div></div>
    <div></div>
    <div></div>
    <div></div>
    <div></div>
    <div class="weekend"></div>
    <div class="weekend"></div>
  </div>
</div>
    </body>
</html>
