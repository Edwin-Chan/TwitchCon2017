<!DOCTYPE html>

<html>
    <head>
      <meta http-equiv="refresh" content=".5">
    </head>

    <body>
      <div ID="content" style="display:block;">
        <img src="happy.jpg" class="img-fluid" id="happy">
          <a href="javascript:setImageVisible('happy', true)">show image</a>
          <a href="javascript:setImageVisible('happy', false)">hide image</a>
      </div>

    <script type="text/javascript">
      function toggleContent()
      {
        // Get the DOM reference
        var contentId = document.getElementById("content");
        // Toggle
        contentId.style.display == "block" ? contentId.style.display = "none" :
        contentId.style.display = "block";
      }
    </script>

    <button onclick="toggleContent()">Toggle</button>

    </body>
</html>
