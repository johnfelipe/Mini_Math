class Numcoll{

private static int holdNum1 = 0; private static int holdNum2 = 0; // Random Number Holders
private static int holdAddAns = 0 ; private static int holdSubAns = 0 ; // Entered Answer Holders

public static void Num1( ){ holdNum1 = rannum(); }
public static void Num2( ){ holdNum2 = rannum(); }
public static int retNum1(){
int num = holdNum1 ;
return num ;
}
public static int retNum2(){
int num = holdNum2 ;
return num ;
}

public static void storeAddEntered( int number ){
holdAddAns = number ;
}
public static void storeSubEntered( int number ){
holdSubAns = number ;
}

public static int retAddEntered(){
int num = holdAddAns ;
return num ;
}
public static int retSubEntered(){
int num = holdSubAns ;
return num ;
}

public static int retAddAns(){
int num = (holdNum1 + holdNum2) ;
return num ;
}
public static int retSubAns(){
int num = (holdNum1 - holdNum2) ;
return num ;
}


// Multiplication
private static int holdMul1 = 0; private static int holdMul2 = 0; private static int holdMulAns = 0;

public static void mulNum1(){ holdMul1 = rannum(); }
public static void mulNum2(){ holdMul2 = rannumlow(); }
public static int retMul1(){ int num = holdMul1; return num; }
public static int retMul2(){ int num = holdMul2; return num; }

public static void storeMulEntered( int number ){ holdMulAns = number; }
public static int retMulEntered(){ int num = holdMulAns ; return num; }
public static int retMulAns(){ int num = (holdMul1 * holdMul2); return num; }

// Division
private static int holdDiv1 = 0; private static int holdDiv2 = 0; private static int holdDivAns = 0;

public static void divNum1(){ holdDiv1 = rannum(); }
public static void divNum2(){ holdDiv2 = rannumdiv(); }
public static void divNums(){
while( ((holdDiv1 % holdDiv2) != 0 ) || (holdDiv2 < 3) || (holdDiv1 == holdDiv2) )
{holdDiv1 = rannum(); holdDiv2 = rannumdiv();}
}
public static int retDiv1(){ int num = holdDiv1; return num; }
public static int retDiv2(){ int num = holdDiv2; return num; }

public static void storeDivEntered( int number ){ holdDivAns = number; }
public static int retDivEntered(){ int num = holdDivAns; return num; }
public static int retDivAns(){ int num = (holdDiv1 / holdDiv2); return num; }



public static int rannum(){ // Random Number Generated
int number = (int) Math.ceil((Math.random() * 100 ));
return number ;
}
public static int rannumlow(){ // Low Number Generated
int number = (int) Math.ceil((Math.random() * 30 ));
return number ;
}
public static int rannumdiv(){ // Div Number Generated
int number = (int) Math.ceil((Math.random() * 50 ));
return number ;
}


// Score Section

private static int scoreNum = 0; private static int streakNum = 0;

public static int getScore(){ int num = scoreNum; return num; }
public static int getStreak(){ int num = streakNum; return num; }

public static void addToScore( int num ){ scoreNum += num; }
public static void addToStreak( int num ){ streakNum += num; } 
public static void resetStreak(){ streakNum = 0; }

}