package com.techelevator;

public class Exercises {

	/*
	 1. The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on
	 vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
	 sleepIn(false, false) → true
	 sleepIn(true, false) → false
	 sleepIn(false, true) → true
	 */
	public boolean sleepIn(boolean weekday, boolean vacation) {
		//if NOT weekday sleep in
		if (weekday == false) {
			return true;
		}
		//if vacation sleep in
		if (vacation == true) {
			return true;
		}
		return false;
	}	

// OR if (!weekday || vacation) {
	// return true;
	// }
    // {
	// return false;
	// }

// OR return !weekday || vacation;
	
	/*
	 2. We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
	 We are in trouble if they are both smiling or if neither of them is smiling. Return true if we
	 are in trouble.
	 monkeyTrouble(true, true) → true
	 monkeyTrouble(false, false) → true
	 monkeyTrouble(true, false) → false
	 */
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		// If a smiling and b smiling then trouble
		if (aSmile == true && bSmile == true) {
			return true;
		}
		// If a not smiling and b not smiling then trouble
		if (aSmile == false && bSmile == false) {
			return true;
		}
		// Otherwise no trouble
		return false;
	}

// OR if (aSmile && bSmile) {
	// return true;
	// }
	// if (!aSmile && !bSmile) {
	// return true;
	// }
	
// OR if ( (aSmile && bSmile) || (!aSmile && !bSmile) ) {
	// return true;
	// }
	
// OR return ( (aSmile && bSmile) || (!aSmile && !bSmile) );
	
// OR return aSmile == bSmile; (Are they the same? both smiling or both not smiling)
	
	/*
	 3. Given two int values, return their sum. Unless the two values are the same, then return double their sum.
	 sumDouble(1, 2) → 3
	 sumDouble(3, 2) → 5
	 sumDouble(2, 2) → 8
	 */
	public int sumDouble(int a, int b) {
		// If values different, return sum
		// If values same, return double the sum
		if (a == b) {
			return ((a + b) * 2);
		}
		if (a != b) {
			return (a + b);
		}
		return 0;
	}

	/*
	 4. Given an int n, return the absolute difference between n and 21, except return double the absolute
	 difference if n is over 21.
	 diff21(19) → 2
	 diff21(10) → 11
	 diff21(21) → 0
	 diff21(22) → 2
	 diff21(-10) → 31
	 */
	public int diff21(int n) {
		// return 21 - n
		// unless n > 21, then return n - 21 * 2
		if (n <= 21) {
			return (21 - n);
		}
		else if (n > 21) {
			return ((n - 21) * 2);
		}
		return 0;
	}

	/*
	 5. We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
	 We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if
	 we are in trouble.
	 parrotTrouble(true, 6) → true
	 parrotTrouble(true, 7) → false
	 parrotTrouble(false, 6) → false
	 */
	// parrot talking and hour before 7 = trouble
	// parrot talking and hour after 20 = trouble
	// parrot not talking at all = no trouble
	// parrot talking and hour between 7 and 20 = no trouble
	
	public boolean parrotTrouble(boolean talking, int hour) {
		if (talking == true && hour < 7) {
			return true;
		}
		else if (talking == true && hour > 20) {
			return true;
		}
		return false;
	}

	/*
	 6. Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
	 makes10(9, 10) → true
	 makes10(9, 9) → false
	 makes10(1, 9) → true
	 */
	public boolean makes10(int a, int b) {
		// output needs to be boolean
		// inputs are int
		// If a is 10 = true
		// If b is 10 = true
		// If a+b is 10 = true
		
		if (a == 10 || b == 10 || a + b == 10) {
			return true;
		}
		return false;
	}

	/*
	 7. Given 2 int values, return true if one is negative and one is positive. Except if the parameter
	 "negative" is true, then return true only if both are negative.
	 posNeg(1, -1, false) → true
	 posNeg(-1, 1, false) → true
	 posNeg(-4, -5, true) → true
	 */
	public boolean posNeg(int a, int b, boolean negative) {
		// output = boolean
		// If a < 1 AND b >=1 = true
		// If a >=1 AND b <1 = true
		// BUT if boolean negative is true, a >= 1 and b < 1 = false
		// If boolean negative is true, a < 1 and b >= 1 = false
		// If boolean negative is true, a < 1 and b < 1 = true
		
		if (a < 1 && b >= 1 && negative != true) {
			return true;
		}
		else if (a >= 1 && b < 1 && negative != true) {
			return true;
		}
		else if ((a >= 1 || b >= 1) && negative == true) {
			return false;
		}
		else if (a < 1 && b < 1 && negative == true) {
			return true;
		}
		else return false;
	}

	/*
	 8. Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
	 (Hint: Think "mod".)
	 or35(3) → true
	 or35(10) → true
	 or35(8) → false
	 */
	public boolean or35(int n) {
		//output = boolean
		//n multiple of 3 = true
		//n multiple of 5 = true
		if (n%3 == 0) {
			return true;
		}
	if (n%5 == 0) {
		return true;
	}
		return false;
	}

	/*
	 9. Given two temperatures, return true if one is less than 0 and the other is greater than 100.
	 icyHot(120, -1) → true
	 icyHot(-1, 120) → true
	 icyHot(2, 120) → false
	 */
	public boolean icyHot(int temp1, int temp2) {
		//If temp1 < 0 and temp2 > 100 = true
		//If temp1 > 100 and temp2 < 1 = true
		if (temp1 < 0 && temp2 > 100) {
			return true;
		}
		if (temp1 > 100 && temp2 < 0) {
			return true;
		}
		return false;
	}

	/*
	 10. Given 2 int values, return true if either of them is in the range 10..20 inclusive.
	 in1020(12, 99) → true
	 in1020(21, 12) → true
	 in1020(8, 99) → false
	 */
	public boolean in1020(int a, int b) {
		// If a >= 10 and <= 20, true
		// If b >=10 and <= 20, true
		if ((a >= 10 && a <= 20) || (b >=10 && b <= 20)) {
			return true;
		}
		return false;
	}

	/*
	 11. We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values,
	 return true if 1 or more of them are teen.
	 hasTeen(13, 20, 10) → true
	 hasTeen(20, 19, 10) → true
	 hasTeen(20, 10, 13) → true
	 */
	public boolean hasTeen(int a, int b, int c) {
		// Teen = 13-19
		// If a, b, or c is 13-19 -> true
		if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
			return true;
		}
		return false;
	}

	/*
	 12. We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values,
	 return true if one or the other is teen, but not both.
	 loneTeen(13, 99) → true
	 loneTeen(21, 19) → true
	 loneTeen(13, 13) → false
	 */
	public boolean loneTeen(int a, int b) {
		// Teen = 13-19
		// true IF a is Teen OR b is Teen NOT BOTH
		if ((a >= 13 && a <= 19) ^ (b >= 13 && b <= 19)) {
			return true;
		}
		return false;
	}

	/*
	 13. Given three int values, a b c, return the largest.
	 intMax(1, 2, 3) → 3
	 intMax(1, 3, 2) → 3
	 intMax(3, 2, 1) → 3
	 */
	public int intMax(int a, int b, int c) {
		// output is int
		if ((a >= b) && (a >= c)) {
			return a;
		}
		if ((b >= a) && (b >= c)) {
			return b;
		}
		if ((c >= a) && (c >= b)) {
			return c;
		}
		return 0;
	}

	/*
	 14. Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both
	 in the range 40..50 inclusive.
	 in3050(30, 31) → true
	 in3050(30, 41) → false
	 in3050(40, 50) → true
	 */
	public boolean in3050(int a, int b) {
		// If both 30-40, true
		// If both 40-50, true
		if ((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) {
			return true;
		}
		if ((a >= 40 && a <= 50) && (b >= 40 && b <= 50)) {
			return true;
		}
		return false;
	}

	/*
	 15. Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
	 or return 0 if neither is in that range.
	 max1020(11, 19) → 19
	 max1020(19, 11) → 19
	 max1020(11, 9) → 11
	 */
	public int max1020(int a, int b) {
		// If a in range and > b in range; return a
		// If b in range and > a in range; return b
		// If a in range and b not in range; return a
		// If b in range and a not in range; return b
		// If neither in range; return 0
	
		if ((a >= 10 && a <= 20) && (b >= 10 && b <= 20) && a >= b) {
			return a;
		}
		if ((b >= 10 && b <= 20) && (a >= 10 && a <= 20) && b >= a) {
			return b;
		}
		if ((a >= 10 && a <= 20) && (b <= 10 || b >= 20)) {
			return a;
		}
		if ((b >= 10 && b <= 20) && (a <= 10 || a >= 20)) {
			return b;
		}
		return 0;
	}

	/*
	 16. When squirrels get together for a party, they like to have cigars. A squirrel party is successful
	 when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case
	 there is no upper bound on the number of cigars. Return true if the party with the given values is
	 successful, or false otherwise.
	 cigarParty(30, false) → false
	 cigarParty(50, false) → true
	 cigarParty(70, true) → true
	 */
	public boolean cigarParty(int cigars, boolean isWeekend) {
		// When cigars 40-60; true
		// Weekend; true
		if (cigars >= 40 && cigars <= 60) {
			return true;
		}
		if ((cigars >= 40) && (isWeekend == true)) {
			return true;
		}
		return false;
	}

	/*
	 17. You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness
	 of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. The result
	 returned will be 0 if you did not get the table, 1 if you might get the table, and 2 if you did get
	 the table. If you or your date is very stylish (8 or more), then the result is 2 (yes). With the
	 exception that if either of you has style of 2 or less, then the result is 0 (no). Otherwise the
	 result is 1 (maybe).
	 dateFashion(5, 10) → 2
	 dateFashion(5, 2) → 0
	 dateFashion(5, 5) → 1
	 */
	public int dateFashion(int you, int date) {
		// Did not get table = 0
		// Might get table = 1
		// Did get table = 2
		// If You or Date >= 8; result is 2
		// If You or Date <= 2; result is 0
		// Otherwise; result is 1
		if ((you >= 8 && date > 2)) {
			return 2;
		}
		if ((date >= 8 && you > 2)) {
			return 2;
		}
		if (you <= 2 || date <= 2) {
		return 0; 
		}
		return 1;
	}

	/*
	 18. The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature
	 is between 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90. Given
	 an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.
	 squirrelPlay(70, false) → true
	 squirrelPlay(95, false) → false
	 squirrelPlay(95, true) → true
	 */
	public boolean squirrelPlay(int temp, boolean isSummer) {
		// If temp 60-90, true
		// If summer and temp 60-100, true
		if ((temp >= 60 && temp <= 90) && isSummer != true) {
			return true;
		}
		if ((temp >= 60 && temp <= 100) && isSummer == true) {
			return true;
		}
		return false;
	}

	/*
	 19. You are driving a little too fast, and a police officer stops you. Write code to compute the result,
	 encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the
	 result is 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the
	 result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
	 caughtSpeeding(60, false) → 0
	 caughtSpeeding(65, false) → 1
	 caughtSpeeding(65, true) → 0
	 */
	public int caughtSpeeding(int speed, boolean isBirthday) {
		
		// Not birthday
		// if speed <= 60 then 0
		// if speed [61-80] then 1
		// if speed >= 81 then 2
		
		// ** 5 difference in speed **
		
		// Birthday
		// if speed <= 65 then 0
		// if speed [66-85] then 1
		// if speed >= 86 then 2
		
		// IF birthday, then subtract 5 from speed so non-bday calculations will work 
		// going 65 is like going 60, that's why you subtract and don't add
		
		speed = isBirthday ? speed - 5 : speed;
		
		if (speed > 80) {
			return 2;
		}
		if (speed > 60) {
			return 1;
		}
		return 0;
	}

	/*
	 20. Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden,
	 so in that case just return 20.
	 sortaSum(3, 4) → 7
	 sortaSum(9, 4) → 20
	 sortaSum(10, 11) → 21
	 */
	public int sortaSum(int a, int b) {
		// Add a + b 
		// If a + b = 10-19, return 20
	if (a + b < 10 || a + b > 19) {
		return (a + b);
	}
		return 20;
	}
	

	/*
	 21. Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are
	 on vacation, return a string of the form "7:00" indicating when the alarm clock should ring. Weekdays,
	 the alarm should be "7:00" and on the weekend it should be "10:00". Unless we are on vacation -- then
	 on weekdays it should be "10:00" and weekends it should be "off".
	 alarmClock(1, false) → "7:00"
	 alarmClock(5, false) → "7:00"
	 alarmClock(0, false) → "10:00"
	 */
	public String alarmClock(int day, boolean vacation) {
		// Sun=0 Mon=1 Tue=2 Wed=3 Thu=4 Fri=5 Sat=6
		// Mon = 1
		// Weekday; return String "7:00"
		// Weekend; return String "10:00"
		// Vacation Weekday "10:00"
		// Vacation Weekend "off"
		if ((day == 0 || day == 6) && vacation != true) {
			return "10:00";
		}
		if ((day == 0 || day ==6) && vacation == true) {
			return "off";
		}
		if ((day == 1 || day == 2 || day == 3 || day == 4 || day == 5) && vacation != true) {
			return "7:00";
		}
		if ((day == 1 || day == 2 || day == 3 || day == 4 || day == 5) && vacation == true){
			return "10:00";
		}
		return "";
	}

	/*
	 22. Given a number n, return true if n is in the range 1..10, inclusive. Unless "outsideMode" is true,
	 in which case return true if the number is less or equal to 1, or greater or equal to 10.
	 in1To10(5, false) → true
	 in1To10(11, false) → false
	 in1To10(11, true) → true
	 */
	public boolean in1To10(int n, boolean outsideMode) {
		// If n is 1-10; true
		// If outsideMode is true and n <= 1; true
		// If outsideMode is true and n >= 10; true
		if ((n >= 1 && n <= 10) && outsideMode != true) {
			return true;
		}
		if ((n <= 1 || n >= 10) && outsideMode == true) {
			return true;
		}
		return false;
	}

	/*
	 23. We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11.
	 Return true if the given non-negative number is special.
	 (Hint: Think "mod".)
	 specialEleven(22) → true
	 specialEleven(23) → true
	 specialEleven(24) → false
	 */
	// multiple of 11 = true
	// multiple of 11 + 1 = true
	public boolean specialEleven(int n) {
		if (n%11 == 0) {
			return true;
		}
		if (n%11 == 1) {
			return true;
		}
		return false;
	}

	/*
	 24. Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
	 (Hint: Think "mod".)
	 more20(20) → false
	 more20(21) → true
	 more20(22) → true
	 */
	public boolean more20(int n) {
		if (n%20 == 1) {
			return true;
		}
		if (n%20 == 2) {
			return true;
		}
		return false;
	}

	/*
	 25. Return true if the given non-negative number is a multiple of 3 or 5, but not both.
	 (Hint: Think "mod".)
	 old35(3) → true
	 old35(10) → true
	 old35(15) → false
	 */
	public boolean old35(int n) {
		if ((n%3 == 0) ^ (n%5 == 0)) {
			return true;
		}
		return false;
	}

	/*
	 26. Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38
	 and 39 return true, but 40 returns false.
	 (Hint: Think "mod".)
	 less20(18) → true
	 less20(19) → true
	 less20(20) → false
	 */
	public boolean less20(int n) {
		if ((n + 1)%20 == 0) {
			return true;
		}
		if ((n + 2)%20 == 0) {
			return true;
		}
		return false;
	}

	/*
	 27. Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b)
	 is the remainder of dividing a by b, so (7 % 5) is 2.
	 nearTen(12) → true
	 nearTen(17) → false
	 nearTen(19) → true
	 */
	public boolean nearTen(int num) {
		if (num%10 == 0) {
			return true;
		}
		if ((num%10 == 1) || (num%10 == 2)) {
			return true;
		}
		if (((num + 1)%10 == 0) || ((num + 2)%10 == 0)) {
			return true;
		}
		return false;
	}

	/*
	 28. Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are
	 extra lucky. So if either value is a teen, just return 19.
	 teenSum(3, 4) → 7
	 teenSum(10, 13) → 19
	 teenSum(13, 2) → 19
	 */
	// a+b
	// teen= 13-19 so return 19 if a or b are 13-19
	public int teenSum(int a, int b) {
		if ((a < 13 || a > 19) && (b < 13 || b > 19)) {
			return a + b;
		}
		return 19;
	}

	/*
	 29. Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning
	 you only answer if it is your mom calling. In all cases, if you are asleep, you do not answer.
	 answerCell(false, false, false) → true
	 answerCell(false, false, true) → false
	 answerCell(true, false, false) → false
	 */
	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		// If morning and mom; true
		// If morning and not mom; false
		// If asleep; false
		// Otherwise; true
		if (isMorning == true && isMom == true && isAsleep != true) {
			return true;
		}
		if (isMorning == true && isMom != true && isAsleep != true) {
			return false;
		}
		if (isMorning != true && isAsleep != true) {
			return true;
		}
		return false;
	}

	/*
	 30. We are having a party with amounts of tea and candy. Return the int outcome of the party encoded as
	 0=bad, 1=good, or 2=great. A party is good (1) if both tea and candy are at least 5. However, if
	 either tea or candy is at least double the amount of the other one, the party is great (2). However,
	 in all cases, if either tea or candy is less than 5, the party is always bad (0).
	 teaParty(6, 8) → 1
	 teaParty(3, 8) → 0
	 teaParty(20, 6) → 2
	 */
	public int teaParty(int tea, int candy) {
		// bad=0 good=1 great=2
		// good(1)=if tea and candy are >= 5
		// if tea or candy is *2 the other; great(2)
		// bad(0) if tea or candy < 5
		
		if ((tea >= candy * 2) || (candy >= tea * 2) && (tea >= 5 && candy >= 5)) {
			return 2;
		}
		if (tea >= 5 && candy >= 5) {
			return 1;
		}
		return 0;
	}

	/*
	 31. Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
	 twoAsOne(1, 2, 3) → true
	 twoAsOne(3, 1, 2) → true
	 twoAsOne(3, 2, 2) → false
	 */
	public boolean twoAsOne(int a, int b, int c) {
		if (a + b == c) {
			return true;
	
		}
		if (b + c == a) {
			return true;
		
		}
		if (c + a == b) {
			return true;
	
		}
		return false;
	}

	/*
	 32. Given three ints, a b c, return true if b is greater than a, and c is greater than b. However, with
	 the exception that if "bOk" is true, b does not need to be greater than a.
	 inOrder(1, 2, 4, false) → true
	 inOrder(1, 2, 1, false) → false
	 inOrder(1, 1, 2, true) → true
	 */
	public boolean inOrder(int a, int b, int c, boolean bOk) {
		// If b>a && c>b
		// But if bOk is true, only c>b
		if (b > a && c > b) {
			return true;
		}
		if (c > b && bOk == true) {
			return true;
		}
		return false;
	}

	/*
	 33. Given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11,
	 or 5 6 7, but not 6 5 7 or 5 5 7. However, with the exception that if "equalOk" is true, equality
	 is allowed, such as 5 5 7 or 5 5 5.
	 inOrderEqual(2, 5, 11, false) → true
	 inOrderEqual(5, 7, 6, false) → false
	 inOrderEqual(5, 5, 7, true) → true
	 */
	// a > b > c if equalOk != true
	// a >= b >= c if equalOk == true
	public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		if ((a < b) && (b < c) && equalOk != true) {
			return true;
		}
		if ((a <= b) && (b <= c) && equalOk == true) {
			return true;
		}
		return false;
	}

	/*
	 34. Given 3 int values, a b c, return their sum. However, if one of the values is the same as another
	 of the values, it does not count towards the sum.
	 loneSum(1, 2, 3) → 6
	 loneSum(3, 2, 3) → 2
	 loneSum(3, 3, 3) → 0
	 */
	// a+b+c
	// if a=b do not add a
	// if b=c do not add b
	// if c=a do not add c
	public int loneSum(int a, int b, int c) {
		if ((a != b) && (b != c) && (c != a)) {
			return a + b + c;
		}
	if ((a == b) && (b != c) && (c != a)) {
		return c;
	}
	if ((a != b) && (b == c) && (c != a)) {
		return a;
	}
	if ((a != b) && (b != c) && (c == a)) {
		return b;
	}
		return 0;
	}

	/*
	 35. Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not
	 count towards the sum and values to its immediate right do not count. So for example, if b is 13, then both
	 b and c do not count.
	 luckySum(1, 2, 3) → 6
	 luckySum(1, 2, 13) → 3
	 luckySum(1, 13, 3) → 1
	 luckySum(13, 1, 3) → 3
	 luckySum(13, 13, 3) → 0
	 */
	// a+b+c
	// a,b,c is 13; it does not count and right number does not count
	public int luckySum(int a, int b, int c) {
		if ((a != 13) && (b != 13) && (c != 13)) {
			return a + b + c;
		}
		if ((a == 13) && (b != 13) && (c != 13)) {
			return c;
		}
		if ((a != 13) && (b == 13) && (c != 13)) {
			return a;
		}
		if ((a != 13) && (b != 13) && (c == 13)) {
			return a + b;
		}
		return 0;
	}

}
