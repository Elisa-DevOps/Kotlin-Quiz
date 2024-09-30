fun main() {
    val quizAnswer1 = 15
    var quizAnswer2 = 3
    val quizAnswer3 = "isosceles"
    val quizAnswer4 = 47

    println("What is 75 / 5?");
    val studentAnswer1 = Integer.valueOf(readLine());
   
    println("Solve for y: 6 * 2y = 36");
    val studentAnswer2 = Integer.valueOf(readLine());
  
    println("What is the name of the type of triangle that has two equal sides?");
    val studentAnswer3 = readLine();
  
    println("What is the value of the equation: 8 * 6 - (3 - 2)");
    val studentAnswer4 = Integer.valueOf(readLine());
  
    var points = 0;
  
    if (studentAnswer1 == quizAnswer1) {
      points =+ 25;
    }
  
    if (studentAnswer2 == quizAnswer2) {
      points += 25;
    } else if (studentAnswer2 == quizAnswer2++ || studentAnswer2 == quizAnswer2--) {
      points += 20
      println("The answer $studentAnswer2 is within 1 point of $quizAnswer2");
    } else {
      points += 1;
    }
  
    if (studentAnswer3 == quizAnswer3) {
      points += 25;
    } else if (studentAnswer3 == "equilateral") {
      points += 10;
    } else {
      points += 1;
    }
      
    if (studentAnswer4 == quizAnswer4) {
      points += 25
    } else if (studentAnswer4 >= 44 && studentAnswer4 <= 54) {
      points += 20
    } else {
      points += 1
    }
  
    when (points) {
      in 0..59 -> println("Your grade is an F.");
      in 60..69 -> println("Your grade is a D.");
      in 70..79 -> println("Your grade is a C.");
      in 80..89 -> println("Your grade is a B.");
      in 90..100 -> println("Your grade is an A.");
      in 101..110 -> println("Your grade is an A+.");
    }
  }