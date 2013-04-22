import javax.swing.*;
import javax.swing.ImageIcon.*;
import java.awt.*;
import java.awt.event.*;

class MiniMain extends JFrame implements ActionListener {

final static String MAINPANEL = "Menu Panel" ; final static String ADDPANEL = "Add Panel" ;
final static String SUBPANEL = "Sub Panel" ; final static String MULPANEL = "Mul Panel" ;
final static String DIVPANEL = "Div Panel" ;

public static void main( String[] args ){

MiniMain mainGui = new MiniMain();

}

//JPanels And Background Info
JPanel mainPnl = new JPanel();
JPanel addPnl = new JPanel();
JPanel subPnl = new JPanel();
JPanel mulPnl = new JPanel();
JPanel divPnl = new JPanel();
JPanel backPnl = new JPanel();
JPanel scorePnl = new JPanel();
JPanel closePnl = new JPanel();

JPanel addHelpPnl = new JPanel(); JPanel subHelpPnl = new JPanel();
JPanel mulHelpPnl = new JPanel(); JPanel divHelpPnl = new JPanel();
JPanel notePnl = new JPanel();

CardLayout cardlayout = new CardLayout();
JPanel cards = new JPanel( cardlayout );
JDesktopPane desk = new JDesktopPane();

ImageIcon backgroundImg = new ImageIcon( getClass().getResource("images/background.png") );

JLabel bgImg = new JLabel( backgroundImg );


//Main Page Content
ImageIcon addImage = new ImageIcon( getClass().getResource("images/buttons/addBtn.png") ); ImageIcon subImage = new ImageIcon( getClass().getResource("/images/buttons/subBtn.png") );
ImageIcon mulImage = new ImageIcon( getClass().getResource("images/buttons/mulBtn.png") ); ImageIcon divImage = new ImageIcon( getClass().getResource("/images/buttons/divBtn.png") );

JLabel mainLogo = new JLabel( new ImageIcon( getClass().getResource("images/mmlogo.png") ) );
JButton addBtn = new JButton( addImage );
JButton subBtn = new JButton( subImage );
JButton mulBtn = new JButton( mulImage );
JButton divBtn = new JButton( divImage );

//Game Page Content
JLabel whatImg = new JLabel( new ImageIcon( getClass().getResource("images/whatis.png") ) ); // Misc Images
ImageIcon submitImg = new ImageIcon( getClass().getResource("images/buttons/submitBtn.png") );
ImageIcon helpImg = new ImageIcon( getClass().getResource("images/buttons/helpBtn.png") );
ImageIcon noteImg = new ImageIcon( getClass().getResource("images/buttons/noteBtn.png") );
ImageIcon menuImg = new ImageIcon( getClass().getResource("images/buttons/menuBtn.png") );

JLabel transImg1 = new JLabel( new ImageIcon( getClass().getResource("images/transparency.png") ) ); 
JLabel transImg2 = new JLabel( new ImageIcon( getClass().getResource("images/transparency.png") ) );
JLabel transImg3 = new JLabel( new ImageIcon( getClass().getResource("images/trans2.png") ) );
JLabel transSmall = new JLabel( new ImageIcon( getClass().getResource("images/trans_small.png") ) );

//Help Page And Note Content
ImageIcon closeImg = new ImageIcon( getClass().getResource( "images/buttons/closeBtn.png" ) );
ImageIcon addingImg = new ImageIcon( getClass().getResource( "images/help/adding.png" ) );
ImageIcon subtractingImg = new ImageIcon( getClass().getResource( "images/help/subtracting.png" ) );
ImageIcon multiplyingImg = new ImageIcon( getClass().getResource( "images/help/multiplying.png" ) );
ImageIcon dividingImg = new ImageIcon( getClass().getResource( "images/help/dividing.png" ) );

JLabel addingLbl = new JLabel( addingImg );
JLabel subtractingLbl = new JLabel( subtractingImg );
JLabel multiplyingLbl = new JLabel( multiplyingImg );
JLabel dividingLbl = new JLabel( dividingImg );

JButton helpCloseBtn = new JButton( closeImg );

JTextArea noteArea = new JTextArea( "" , 5 , 18 );
JScrollPane noteBox = new JScrollPane( noteArea );
//JButton noteCloseBtn = new JButton( closeImg );


Font mainFont = new Font( "SansSerif" , Font.PLAIN , 32 ); // Font Settings
Font scoreFont = new Font( "SansSerif" , Font.BOLD , 15 );
Color mainColour = new Color( 255 , 255 , 255 ); // White Colour For Text

String scoreStr; String streakStr; // For Scoring

private static String addQuestion;
private static String subQuestion;
private static String mulQuestion;
private static String divQuestion;

JTextField addAnsField = new JTextField( "" , 8 ); // Answer Fields
JTextField subAnsField = new JTextField( "" , 8 );
JTextField mulAnsField = new JTextField( "" , 8 );
JTextField divAnsField = new JTextField( "" , 8 );

JButton helpAdd = new JButton( helpImg ); JButton helpSub = new JButton( helpImg ); // Buttons
JButton helpMul = new JButton( helpImg ); JButton helpDiv = new JButton( helpImg );

JButton submitAdd = new JButton( submitImg ); JButton submitSub = new JButton( submitImg ); JButton submitMul = new JButton( submitImg ); JButton submitDiv = new JButton( submitImg );

JButton noteBtn = new JButton( noteImg );
JButton menuAdd = new JButton( menuImg ); JButton menuSub = new JButton( menuImg );
JButton menuMul = new JButton( menuImg ); JButton menuDiv = new JButton( menuImg );

public MiniMain(){

super( "Mini Math" );
setSize( 265 , 420 );
setDefaultCloseOperation( EXIT_ON_CLOSE );
setResizable( false );
setVisible( true );
add( mainPnl ); add( addPnl ); add( subPnl ); add( mulPnl ); add( divPnl ); add( cards ); add( backPnl );
add( scorePnl ); add( addHelpPnl ); add( subHelpPnl ); add( mulHelpPnl ); add( divHelpPnl ); add( notePnl );
add( closePnl );


//Background spec
mainPnl.setBounds( 0 , 20 , 265 , 420 ); mainPnl.setOpaque( false );
addPnl.setBounds( 0 , 20 , 265 , 420 ); addPnl.setOpaque( false );
subPnl.setBounds( 0 , 20 , 265 , 420 ); subPnl.setOpaque( false );
mulPnl.setBounds( 0 , 20 , 265 , 420 ); mulPnl.setOpaque( false );
divPnl.setBounds( 0 , 20 , 265 , 420 ); divPnl.setOpaque( false );
backPnl.setBounds( 0 , -10 , 265 , 420 ); backPnl.setOpaque( false );
cards.setBounds( -4 , 3 , 265 , 420 ); cards.setOpaque( false );
scorePnl.setBounds( 0 , 345 , 265 , 100 ); scorePnl.setOpaque( false );
addHelpPnl.setBounds( 0 , -10 , 265 , 420 );
subHelpPnl.setBounds( 0 , -10 , 265 , 420 );
mulHelpPnl.setBounds( 0 , -10 , 265 , 420 );
divHelpPnl.setBounds( 0 , -10 , 265 , 420 );
notePnl.setBounds( 0 , 20 , 265 , 250 ); notePnl.setOpaque( false );
closePnl.setBounds( 0 , 335 , 265 , 420 ); closePnl.setOpaque( false );

addHelpPnl.setVisible( false ); subHelpPnl.setVisible( false ); // Set Help Pages To Invisible
mulHelpPnl.setVisible( false ); divHelpPnl.setVisible( false ); notePnl.setVisible( false );
closePnl.setVisible( false );


desk.add( backPnl , new Integer( 50 ) );
desk.add( cards , new Integer( 350 ) );
desk.add( scorePnl , new Integer( 400 ) );
desk.add( addHelpPnl , new Integer( 450 ) );
desk.add( subHelpPnl , new Integer( 450 ) );
desk.add( mulHelpPnl , new Integer( 450 ) );
desk.add( divHelpPnl , new Integer( 450 ) );
desk.add( closePnl , new Integer( 500 ) );
desk.add( notePnl , new Integer( 550 ) );
setLayeredPane( desk );

cards.add( mainPnl , MAINPANEL );
cards.add( addPnl , ADDPANEL );
cards.add( subPnl , SUBPANEL );
cards.add( mulPnl , MULPANEL );
cards.add( divPnl , DIVPANEL );


// Main Menu Buttons Spec Design
addBtn.setBorderPainted( false ); addBtn.setContentAreaFilled( false ); addBtn.setOpaque( false );
subBtn.setBorderPainted( false ); subBtn.setContentAreaFilled( false ); subBtn.setOpaque( false );
mulBtn.setBorderPainted( false ); mulBtn.setContentAreaFilled( false ); mulBtn.setOpaque( false );
divBtn.setBorderPainted( false ); divBtn.setContentAreaFilled( false ); divBtn.setOpaque( false );
// Other Buttons Spec Design
helpCloseBtn.setBorderPainted( false ); helpCloseBtn.setContentAreaFilled( false ); helpCloseBtn.setOpaque( false );
//noteCloseBtn.setBorderPainted( false ); noteCloseBtn.setContentAreaFilled( false ); noteCloseBtn.setOpaque( false );
submitAdd.setBorderPainted( false ); submitAdd.setContentAreaFilled( false ); submitAdd.setOpaque( false );
submitSub.setBorderPainted( false ); submitSub.setContentAreaFilled( false ); submitSub.setOpaque( false );
submitMul.setBorderPainted( false ); submitMul.setContentAreaFilled( false ); submitMul.setOpaque( false );
submitDiv.setBorderPainted( false ); submitDiv.setContentAreaFilled( false ); submitDiv.setOpaque( false );
noteBtn.setBorderPainted( false ); noteBtn.setContentAreaFilled( false ); noteBtn.setOpaque( false );
menuAdd.setBorderPainted( false ); menuAdd.setContentAreaFilled( false ); menuAdd.setOpaque( false );
menuSub.setBorderPainted( false ); menuSub.setContentAreaFilled( false ); menuSub.setOpaque( false );
menuMul.setBorderPainted( false ); menuMul.setContentAreaFilled( false ); menuMul.setOpaque( false );
menuDiv.setBorderPainted( false ); menuDiv.setContentAreaFilled( false ); menuDiv.setOpaque( false );
helpAdd.setBorderPainted( false ); helpAdd.setContentAreaFilled( false ); helpAdd.setOpaque( false );
helpSub.setBorderPainted( false ); helpSub.setContentAreaFilled( false ); helpSub.setOpaque( false );
helpMul.setBorderPainted( false ); helpMul.setContentAreaFilled( false ); helpMul.setOpaque( false );
helpDiv.setBorderPainted( false ); helpDiv.setContentAreaFilled( false ); helpDiv.setOpaque( false );

noteArea.setLineWrap( true ); noteArea.setWrapStyleWord( true );
noteBox.setVerticalScrollBarPolicy( JScrollPane.VERTICAL_SCROLLBAR_ALWAYS );

// Misc Pages Setup
addHelpPnl.add( addingLbl ); subHelpPnl.add( subtractingLbl );
mulHelpPnl.add( multiplyingLbl ); divHelpPnl.add( dividingLbl );
closePnl.add( helpCloseBtn );
helpCloseBtn.addActionListener( this );

notePnl.add( noteBox ); notePnl.setVisible( false );
noteBtn.addActionListener( this );

backPnl.add( bgImg );

cardlayout.show( cards , MAINPANEL ); // Main Menu Setup
scorePnl.setVisible( false );

mainPnl.add( mainLogo );
mainPnl.add( transSmall );
mainPnl.add( addBtn ); mainPnl.add( subBtn );
mainPnl.add( mulBtn ); mainPnl.add( divBtn );

addBtn.addActionListener( this );
subBtn.addActionListener( this );
mulBtn.addActionListener( this );
divBtn.addActionListener( this );


}

public void plus(){
cardlayout.show( cards , ADDPANEL );

Numcoll.Num1() ; Numcoll.Num2();
addQuestion = Integer.toString( Numcoll.retNum1() ) + " + " + Integer.toString( Numcoll.retNum2() );
JLabel addQu = new JLabel( addQuestion );
addQu.setForeground( mainColour ); addQu.setFont( mainFont );

addPnl.add( whatImg );
addPnl.add( transImg1 );
addPnl.add( addQu );
addPnl.add( transImg2 );
addPnl.add( addAnsField ); addPnl.add( submitAdd );
addPnl.add( transImg3 );
addPnl.add( helpAdd ); addPnl.add( noteBtn ); addPnl.add( menuAdd );

submitAdd.addActionListener( this );
helpAdd.addActionListener( this );
menuAdd.addActionListener( this );

scorePnl.setVisible( true );
scoreStr = "Score: " + Numcoll.getScore() + "    Streak: " + Numcoll.getStreak();
JLabel scoreLbl = new JLabel( scoreStr );
scorePnl.add( scoreLbl );
scoreLbl.setForeground( mainColour );
scoreLbl.setFont( scoreFont );

revalidate(); repaint();
}

public void take(){
cardlayout.show( cards , SUBPANEL );

Numcoll.Num1() ; Numcoll.Num2();
subQuestion = Integer.toString( Numcoll.retNum1() ) + " - " + Integer.toString( Numcoll.retNum2() );
JLabel subQu = new JLabel( subQuestion );
subQu.setForeground( mainColour ) ; subQu.setFont( mainFont );

subPnl.add( whatImg );
subPnl.add( transImg1 );
subPnl.add( subQu );
subPnl.add( transImg2 );
subPnl.add( subAnsField ); subPnl.add( submitSub );
subPnl.add( transImg3 );
subPnl.add( helpSub ); subPnl.add( noteBtn ); subPnl.add( menuSub );

submitSub.addActionListener( this );
helpSub.addActionListener( this );
menuSub.addActionListener( this );

scorePnl.setVisible( true );
scoreStr = "Score: " + Numcoll.getScore() + "    Streak: " + Numcoll.getStreak();
JLabel scoreLbl = new JLabel( scoreStr );
scorePnl.add( scoreLbl );
scoreLbl.setForeground( mainColour );
scoreLbl.setFont( scoreFont );

revalidate(); repaint();
}

public void times(){
cardlayout.show( cards , MULPANEL );

Numcoll.mulNum1(); Numcoll.mulNum2();
mulQuestion = Integer.toString( Numcoll.retMul1() ) + " x " + Integer.toString( Numcoll.retMul2() ) ;
JLabel mulQu = new JLabel( mulQuestion );
mulQu.setForeground( mainColour ); mulQu.setFont( mainFont );

mulPnl.add( whatImg );
mulPnl.add( transImg1 );
mulPnl.add( mulQu );
mulPnl.add( transImg2 );
mulPnl.add( mulAnsField ); mulPnl.add( submitMul );
mulPnl.add( transImg3 );
mulPnl.add( helpMul ); mulPnl.add( noteBtn ); mulPnl.add( menuMul );

submitMul.addActionListener( this );
helpMul.addActionListener( this );
menuMul.addActionListener( this );

scorePnl.setVisible( true );
scoreStr = "Score: " + Numcoll.getScore() + "    Streak: " + Numcoll.getStreak();
JLabel scoreLbl = new JLabel( scoreStr );
scorePnl.add( scoreLbl );
scoreLbl.setForeground( mainColour );
scoreLbl.setFont( scoreFont );

revalidate(); repaint();
}

public void divide(){
cardlayout.show( cards , DIVPANEL );

Numcoll.divNum1(); Numcoll.divNum2(); Numcoll.divNums();
divQuestion = Integer.toString( Numcoll.retDiv1() ) + " / " + Integer.toString( Numcoll.retDiv2() );
JLabel divQu = new JLabel( divQuestion );
divQu.setForeground( mainColour ); divQu.setFont( mainFont );

divPnl.add( whatImg );
divPnl.add( transImg1 );
divPnl.add( divQu );
divPnl.add( transImg2 );
divPnl.add( divAnsField ); divPnl.add( submitDiv );
divPnl.add( transImg3 );
divPnl.add( helpDiv ); divPnl.add( noteBtn ); divPnl.add( menuDiv );

submitDiv.addActionListener( this );
helpDiv.addActionListener( this );
menuDiv.addActionListener( this );

scorePnl.setVisible( true );
scoreStr = "Score: " + Numcoll.getScore() + "    Streak: " + Numcoll.getStreak();
JLabel scoreLbl = new JLabel( scoreStr );
scorePnl.add( scoreLbl );
scoreLbl.setForeground( mainColour );
scoreLbl.setFont( scoreFont );

revalidate(); repaint();

}


public void actionPerformed( ActionEvent event ){
 
if( event.getSource() == addBtn ) { plus(); }
if( event.getSource() == subBtn ) { take(); }
if( event.getSource() == mulBtn ) { times(); }
if( event.getSource() == divBtn ) { divide(); }
if( event.getSource() == menuAdd ) { cardlayout.show( cards , MAINPANEL ); addPnl.remove( 2 ); scorePnl.removeAll(); Numcoll.resetStreak(); notePnl.setVisible( false ); }
if( event.getSource() == menuSub ) { cardlayout.show( cards , MAINPANEL ); subPnl.remove( 2 ); scorePnl.removeAll(); Numcoll.resetStreak(); notePnl.setVisible( false ); }
if( event.getSource() == menuMul ) { cardlayout.show( cards , MAINPANEL ); mulPnl.remove( 2 ); scorePnl.removeAll(); Numcoll.resetStreak(); notePnl.setVisible( false ); }
if( event.getSource() == menuDiv ) { cardlayout.show( cards , MAINPANEL ); divPnl.remove( 2 ); scorePnl.removeAll(); Numcoll.resetStreak(); notePnl.setVisible( false ); }
if( event.getSource() == helpAdd ) { addHelpPnl.setVisible( true ); closePnl.setVisible( true ); }
if( event.getSource() == helpSub ) { subHelpPnl.setVisible( true ); closePnl.setVisible( true ); }
if( event.getSource() == helpMul ) { mulHelpPnl.setVisible( true ); closePnl.setVisible( true ); }
if( event.getSource() == helpDiv ) { divHelpPnl.setVisible( true ); closePnl.setVisible( true ); }
if( event.getSource() == helpCloseBtn ) { addHelpPnl.setVisible( false ); subHelpPnl.setVisible( false ); mulHelpPnl.setVisible( false ); divHelpPnl.setVisible( false ); closePnl.setVisible( false );}
if( event.getSource() == noteBtn ) { if( notePnl.isShowing() == true ){ notePnl.setVisible( false ); } else { notePnl.setVisible( true ); } }

if( event.getSource() == submitAdd ){

try{
int temp = Integer.parseInt( addAnsField.getText() ) ; Numcoll.storeAddEntered( temp );
}
catch( NumberFormatException e ) { addAnsField.setText( "" ); return; }

if( Numcoll.retAddEntered() == Numcoll.retAddAns() )
{ JOptionPane.showMessageDialog( this , "Next Question..." , "Correct Answer!" , JOptionPane.INFORMATION_MESSAGE ); Numcoll.addToScore( 1 ); Numcoll.addToStreak( 1 ); }
else{ JOptionPane.showMessageDialog( this , "The answer was " + Numcoll.retAddAns() + "." , "Keep Trying!" , JOptionPane.WARNING_MESSAGE ); Numcoll.resetStreak(); }
addAnsField.setText( "" );
addRestart();

}

if( event.getSource() == submitSub){

try{
int temp = Integer.parseInt( subAnsField.getText() ); Numcoll.storeSubEntered( temp );
}
catch( NumberFormatException e ) { subAnsField.setText( "" ); return; }

if( Numcoll.retSubEntered() == Numcoll.retSubAns() )
{ JOptionPane.showMessageDialog( this , "Next Question..." , "Correct Answer!" , JOptionPane.INFORMATION_MESSAGE ); Numcoll.addToScore( 1 ); Numcoll.addToStreak( 1 ); }
else{ JOptionPane.showMessageDialog( this , "The answer was " + Numcoll.retSubAns() + ".", "Keep Trying!" , JOptionPane.WARNING_MESSAGE ); Numcoll.resetStreak(); } 
subAnsField.setText( "" );
subRestart();

}

if( event.getSource() == submitMul){

try{
int temp = Integer.parseInt( mulAnsField.getText() ); Numcoll.storeMulEntered( temp );
}
catch( NumberFormatException e ) { mulAnsField.setText( "" ); return; }

if( Numcoll.retMulEntered() == Numcoll.retMulAns() )
{ JOptionPane.showMessageDialog( this , "Next Question..." , "Correct Answer!" , JOptionPane.INFORMATION_MESSAGE ); Numcoll.addToScore( 1 ); Numcoll.addToStreak( 1 ); }
else{ JOptionPane.showMessageDialog( this , "The answer was " + Numcoll.retMulAns() + "." , "Keep Trying!" , JOptionPane.WARNING_MESSAGE ); Numcoll.resetStreak(); }
mulAnsField.setText( "" );
mulRestart();

}

if( event.getSource() == submitDiv){

try{
int temp = Integer.parseInt( divAnsField.getText() ); Numcoll.storeDivEntered( temp );
}
catch( NumberFormatException e ) { divAnsField.setText( "" ); return; }

if( Numcoll.retDivEntered() == Numcoll.retDivAns() )
{ JOptionPane.showMessageDialog( this , "Next Question..." , "Correct Answer!" , JOptionPane.INFORMATION_MESSAGE ); Numcoll.addToScore( 1 ); Numcoll.addToStreak( 1 ); }
else { JOptionPane.showMessageDialog( this , "The answer was " + Numcoll.retDivAns() + "." , "Keep Trying!" , JOptionPane.WARNING_MESSAGE ); Numcoll.resetStreak(); }
divAnsField.setText( "" );
divRestart();

}


}

public void addRestart() { Numcoll.Num1() ; Numcoll.Num2(); addPnl.remove( 2 ); scorePnl.removeAll(); plus(); }
public void subRestart() { Numcoll.Num1() ; Numcoll.Num2(); subPnl.remove( 2 ); scorePnl.removeAll(); take(); }
public void mulRestart() { Numcoll.mulNum1() ; Numcoll.mulNum2(); mulPnl.remove( 2 ); scorePnl.removeAll(); times(); }
public void divRestart() { Numcoll.divNum1() ; Numcoll.divNum2(); divPnl.remove( 2 ); scorePnl.removeAll(); divide(); }


}