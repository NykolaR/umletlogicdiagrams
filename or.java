// Gate
drawLine (width / 4, 0, width / 2, 0);
drawLine (width / 4, height, width / 2, height);
drawArcOpen (width / 8, 0, width / 4, height, 270, 180);
drawLine (width / 2, 0, width * 3 / 4, height / 2);
drawLine (width / 2, height, width * 3 / 4, height / 2);

// Inputs
drawLine (0, height / 4, width / 3 + 9, height / 4);
drawLine (0, height * 3 / 4, width / 3 + 9, height * 3 / 4);

// Output
drawLine (width * 3 / 4, height / 2, width, height / 2);
