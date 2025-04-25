<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <title>Kannada Movie Application</title>
  <link rel="stylesheet" href="style.css"/>
</head>
<body>
  <header>
    <h1>Kannada Movie Application</h1>
  </header>

  <main class="movie-container">
    <div class="movie-card">
      <img src="https://upload.wikimedia.org/wikipedia/en/8/84/Kantara_poster.jpeg" alt="Kantara Poster">
      <div class="movie-info">
        <h2>Kantara</h2>
        <p>Release Year: 2022</p>
        <p>Genre: Action, Drama</p>
          <button class="watch-btn" onclick="watchMovie('Kantara')">Watch</button>

      </div>
    </div>

    <div class="movie-card">
      <img src="https://m.media-amazon.com/images/M/MV5BM2M0YmIxNzItOWI4My00MmQzLWE0NGYtZTM3NjllNjIwZjc5XkEyXkFqcGc@._V1_.jpg" alt="KGF Chapter 1 Poster">
      <div class="movie-info">
        <h2>KGF Chapter 1</h2>
        <p>Release Year: 2018</p>
        <p>Genre: Action, Thriller</p>
                <button class="watch-btn" onclick="watchMovie('KGF Chapter 1')">Watch</button>

      </div>
    </div>

    <div class="movie-card">
      <img src="https://m.media-amazon.com/images/S/pv-target-images/ef222e4c367082c8f94315fbf5b62d350547c5e2589a97f12d5414979c64a9fc.jpg" alt="KGF Chapter 2 Poster">
      <div class="movie-info">
        <h2>KGF Chapter 2</h2>
        <p>Release Year: 2022</p>
        <p>Genre: Action, Drama</p>
                <button class="watch-btn" onclick="watchMovie('KGF Chapter 2')">Watch</button>

      </div>
    </div>

    <div class="movie-card">
      <img src="https://static.langimg.com/thumb/93180180/samayam-telugu-93180180.jpg?width=210&height=281&resizemode=4" alt="Vikrant Rona Poster">
      <div class="movie-info">
        <h2>Vikrant Rona</h2>
        <p>Release Year: 2022</p>
        <p>Genre: Fantasy, Thriller</p>
        <button class="watch-btn" onclick="watchMovie('Vikrant Rona')">Watch</button>

      </div>
    </div>

    <div class="movie-card">
      <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQQoJni-s3TwagwpckFLeSCHaAYScakepVyuQ&s" alt="777 Charlie Poster">
      <div class="movie-info">
        <h2>777 Charlie</h2>
        <p>Release Year: 2022</p>
        <p>Genre: Adventure, Drama</p>
        <button class="watch-btn" onclick="watchMovie('777 Charlie')">Watch</button>

      </div>
    </div>
  </main>
  <script>
  function watchMovie(title) {
    alert(`Now playing: ${title}`);
    window.open("https://www.youtube.com/results?search_query=" + encodeURIComponent(title + " Kannada trailer"), "_blank");
  }

  </script>

  <footer>
    <p>© 2025 Kannada MovieApp. All rights reserved.</p>
  </footer>
</body>
</html>
