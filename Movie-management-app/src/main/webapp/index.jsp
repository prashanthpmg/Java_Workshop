<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">
</head>
<body>
   <main class="form-container">
       <form action="save" method="Post" class="booking-form">
         <h2>Movie Management</h2>

         <label for="movie_name">Movie Name:</label>
         <input type="text" id="movie_name" name="movie_name" placeholder="Enter  Movie Name" required>

         <label for="movie_language">Movie Language:</label>
         <input type="text" id="movie_language" name="movie_language" placeholder="Enter  Movie Language" required>

         <label for="movie_hero">Hero Name:</label>
         <input type="text" id="movie_hero" name="movie_hero"  placeholder="Enter Hero Name" required>

         <label for="movie_heroine">Movie Heroine:</label>
         <input type="text" id="movie_heroine" name="movie_heroine"  placeholder="Enter Heroine" required>

         <label for="movie_releasedate">Movie Release Date:</label>
        <input type="date" id="movie_releasedate" name="movie_releasedate"  placeholder="Enter Movie Release Date" required>

         <input type="Submit" value="Submit">
       </form>
</body>
</html>
