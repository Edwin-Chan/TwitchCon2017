<!DOCTYPE html>

<html>
    <head>
      <!-- <meta http-equiv="refresh" content="3"> -->
      <script
  src="https://code.jquery.com/jquery-3.2.1.min.js"
  integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
  crossorigin="anonymous"></script>
    </head>
<style>body{
    background-color: #000000;}
  </style>

      <body>
        <div ID="happy" style="display:block;">
          <img src="happy.jpg" class="img-fluid" id="happy" width="100" height="100">
        </div>

        <div ID="sad" style="display:block;">
          <img src="sad.jpg" class="img-fluid" id="sad" width="100" height="100">
        </div>

        <div ID="surprise" style="display:block;">
          <img src="surprise.png" class="img-fluid" id="surprise" width="100" height="100">
        </div>

        <div ID="disgust" style="display:block;">
          <img src="disgust.png" class="img-fluid" id="disgust" width="100" height="100">
        </div>

        <div ID="fear" style="display:block;">
          <img src="fear.png" class="img-fluid" id="fear" width="100" height="100">
        </div>
        <div ID="anger" style="display:block;">
          <img src="anger.png" class="img-fluid" id="anger" width="100" height="100">
        </div>

        <button id="inputbutton">Input</button>

      <script type="text/javascript" src="snowstorm.js"></script>
      <script>

$(document).ready(function() {
      function initialSort()
      {
        // Get the DOM reference
        var contentId = document.getElementById("happy");
        // Toggle
        contentId.style.display == "block" ? contentId.style.display = "none" :
        contentId.style.display = "block";

        // Get the DOM reference
        contentId = document.getElementById("sad");
        // Toggle
        contentId.style.display == "block" ? contentId.style.display = "none" :
        contentId.style.display = "block";

        // Get the DOM reference
        contentId = document.getElementById("disgust");
        // Toggle
        contentId.style.display == "block" ? contentId.style.display = "none" :
        contentId.style.display = "block";

        // Get the DOM reference
        contentId = document.getElementById("surprise");
        // Toggle
        contentId.style.display == "block" ? contentId.style.display = "none" :
        contentId.style.display = "block";

        // Get the DOM reference
        contentId = document.getElementById("fear");
        // Toggle
        contentId.style.display == "block" ? contentId.style.display = "none" :
        contentId.style.display = "block";

        // Get the DOM reference
        contentId = document.getElementById("anger");
        // Toggle
        contentId.style.display == "block" ? contentId.style.display = "none" :
        contentId.style.display = "block";

        /*
        function input()
        {
          var emote = prompt("Please enter your emote");

          if(emote == "happy")
          {
            toggleHappy();
          }

          if(emote == "sad")
          {
            toggleSad();
          }

          if(emote == "disgust")
          {
            toggleDisgust();
          }

          if(emote == "surprise")
          {
            toggleSurprise();
          }

          if(emote == "fear")
          {
            toggleFear();
          }
        }
        */
      }

        // var snow = false;

        function toggleAnger()
        {
          snowStorm.toggleSnow();

          // Get the DOM reference
          var contentId = document.getElementById("anger");
          // Toggle
          contentId.style.display == "block" ? contentId.style.display = "none" :
          contentId.style.display = "block";
        }

        function toggleHappy()
        {
          // Get the DOM reference
          var contentId = document.getElementById("happy");
          // Toggle
          contentId.style.display == "block" ? contentId.style.display = "none" :
          contentId.style.display = "block";
        }

        function toggleSad()
        {
          // Get the DOM reference
          var contentId = document.getElementById("sad");
          // Toggle
          contentId.style.display == "block" ? contentId.style.display = "none" :
          contentId.style.display = "block";
        }

        function toggleDisgust()
        {
          // Get the DOM reference
          var contentId = document.getElementById("disgust");
          // Toggle
          contentId.style.display == "block" ? contentId.style.display = "none" :
          contentId.style.display = "block";
        }

        function toggleSurprise()
        {
          // Get the DOM reference
          var contentId = document.getElementById("surprise");
          // Toggle
          contentId.style.display == "block" ? contentId.style.display = "none" :
          contentId.style.display = "block";
        }

        function toggleFear()
        {
          // Get the DOM reference
          var contentId = document.getElementById("fear");
          // Toggle
          contentId.style.display == "block" ? contentId.style.display = "none" :
          contentId.style.display = "block";
        }

        $("#inputbutton").on("click", function()
        {
          var emote = prompt("Please enter your emote");

          if(emote == "happy")
          {
            toggleHappy();
          }

          if(emote == "sad")
          {
            toggleSad();
          }

          if(emote == "disgust")
          {
            toggleDisgust();
          }

          if(emote == "surprise")
          {
            toggleSurprise();
          }

          if(emote == "fear")
          {
            toggleFear();
          }

          if(emote == "anger")
          {
            toggleAnger();
          }
        });

          initialSort();

      });
      </script>

      </body>
</html>
