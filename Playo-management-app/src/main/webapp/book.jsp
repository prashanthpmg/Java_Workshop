<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Playo Application</title>
  <link rel="stylesheet" href="style.css">
</head>
<body>
  <header class="header">
    <h1>Playo Booking</h1>
  </header>

  <main class="form-container">
    <form action="validate" method="POST" class="booking-form">
      <h2>Booking Details</h2>

      <label for="name">Name:</label>
      <input type="text" id="name" name="name" placeholder="Enter your name" required>

      <label for="email">Email:</label>
      <input type="email" id="email" name="email" placeholder="Enter your email" required>

      <label for="contact">Contact Number:</label>
      <input type="tel" id="contact" name="contact" placeholder="Enter your contact number" required>

      <label for="players">No. of Players:</label>
      <input type="number" id="players" name="players" min="1" placeholder="Enter number of players" required>

      <label for="cost">Cost per Player:</label>
      <input type="number" id="cost" name="cost" min="0" placeholder="Enter cost per player" required>

      <input type="submit" value="Submit Booking">
    </form>
  </main>
</body>
</html>
