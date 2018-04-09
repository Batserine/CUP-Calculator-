
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sat Apr 07 12:30:18 ICT 2018
//----------------------------------------------------

package src;


/** CUP v0.11a beta 20060608 generated parser.
  * @version Sat Apr 07 12:30:18 ICT 2018
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\037\000\002\002\003\000\002\002\004\000\002\003" +
    "\005\000\002\003\005\000\002\003\006\000\002\003\006" +
    "\000\002\003\006\000\002\003\006\000\002\003\003\000" +
    "\002\004\005\000\002\004\005\000\002\004\005\000\002" +
    "\004\003\000\002\005\005\000\002\005\003\000\002\002" +
    "\003\000\002\006\005\000\002\006\005\000\002\006\005" +
    "\000\002\006\005\000\002\006\005\000\002\007\003\000" +
    "\002\007\003\000\002\002\003\000\002\010\005\000\002" +
    "\010\005\000\002\010\005\000\002\010\005\000\002\010" +
    "\005\000\002\011\003\000\002\011\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\074\000\016\004\013\005\004\006\015\007\006\010" +
    "\016\013\011\001\002\000\016\004\013\005\004\006\015" +
    "\007\006\010\054\013\053\001\002\000\004\002\uffea\001" +
    "\002\000\016\004\013\005\004\006\015\007\006\010\054" +
    "\013\053\001\002\000\006\010\065\013\064\001\002\000" +
    "\010\002\ufff2\010\uffec\013\uffec\001\002\000\024\002\ufff3" +
    "\004\ufff3\005\ufff3\006\ufff3\007\ufff3\010\uffeb\011\ufff3\012" +
    "\ufff3\013\uffeb\001\002\000\020\002\ufff9\004\ufff9\005\ufff9" +
    "\006\035\007\034\011\ufff9\012\033\001\002\000\016\004" +
    "\013\005\004\006\015\007\006\010\054\013\053\001\002" +
    "\000\004\002\060\001\002\000\016\004\013\005\004\006" +
    "\015\007\006\010\054\013\053\001\002\000\016\004\013" +
    "\005\004\006\015\007\006\010\016\013\011\001\002\000" +
    "\020\002\ufff5\004\ufff5\005\ufff5\006\ufff5\007\ufff5\011\ufff5" +
    "\012\ufff5\001\002\000\010\002\001\004\021\005\022\001" +
    "\002\000\012\004\043\005\044\010\027\013\025\001\002" +
    "\000\012\004\024\005\026\010\027\013\025\001\002\000" +
    "\020\002\uffff\004\uffff\005\uffff\006\035\007\034\011\uffff" +
    "\012\033\001\002\000\006\010\027\013\025\001\002\000" +
    "\020\002\ufff3\004\ufff3\005\ufff3\006\ufff3\007\ufff3\011\ufff3" +
    "\012\ufff3\001\002\000\006\010\027\013\025\001\002\000" +
    "\006\010\027\013\025\001\002\000\010\004\021\005\022" +
    "\011\031\001\002\000\020\002\ufff4\004\ufff4\005\ufff4\006" +
    "\ufff4\007\ufff4\011\ufff4\012\ufff4\001\002\000\020\002\ufffc" +
    "\004\ufffc\005\ufffc\006\035\007\034\011\ufffc\012\033\001" +
    "\002\000\006\010\027\013\025\001\002\000\006\010\027" +
    "\013\025\001\002\000\006\010\027\013\025\001\002\000" +
    "\020\002\ufff7\004\ufff7\005\ufff7\006\ufff7\007\ufff7\011\ufff7" +
    "\012\ufff7\001\002\000\020\002\ufff8\004\ufff8\005\ufff8\006" +
    "\ufff8\007\ufff8\011\ufff8\012\ufff8\001\002\000\020\002\ufff6" +
    "\004\ufff6\005\ufff6\006\ufff6\007\ufff6\011\ufff6\012\ufff6\001" +
    "\002\000\020\002\ufffa\004\ufffa\005\ufffa\006\035\007\034" +
    "\011\ufffa\012\033\001\002\000\020\002\ufffe\004\ufffe\005" +
    "\ufffe\006\035\007\034\011\ufffe\012\033\001\002\000\006" +
    "\010\027\013\025\001\002\000\006\010\027\013\025\001" +
    "\002\000\020\002\ufffb\004\ufffb\005\ufffb\006\035\007\034" +
    "\011\ufffb\012\033\001\002\000\020\002\ufffd\004\ufffd\005" +
    "\ufffd\006\035\007\034\011\ufffd\012\033\001\002\000\004" +
    "\011\052\001\002\000\010\010\uffec\011\051\013\uffec\001" +
    "\002\000\022\002\uffed\004\uffed\005\uffed\006\uffed\007\uffed" +
    "\010\uffed\011\uffed\013\uffed\001\002\000\022\002\uffe5\004" +
    "\uffe5\005\uffe5\006\uffe5\007\uffe5\010\uffe5\011\uffe5\013\uffe5" +
    "\001\002\000\022\002\uffe3\004\uffe3\005\uffe3\006\uffe3\007" +
    "\uffe3\010\uffe3\011\uffe3\013\uffe3\001\002\000\014\004\013" +
    "\005\004\006\015\007\006\010\054\001\002\000\016\004" +
    "\013\005\004\006\015\007\006\010\054\013\053\001\002" +
    "\000\022\002\uffe4\004\uffe4\005\uffe4\006\uffe4\007\uffe4\010" +
    "\uffe4\011\uffe4\013\uffe4\001\002\000\022\002\uffe7\004\uffe7" +
    "\005\uffe7\006\uffe7\007\uffe7\010\uffe7\011\uffe7\013\uffe7\001" +
    "\002\000\004\002\000\001\002\000\016\004\013\005\004" +
    "\006\015\007\006\010\054\013\053\001\002\000\022\002" +
    "\uffe9\004\uffe9\005\uffe9\006\uffe9\007\uffe9\010\uffe9\011\uffe9" +
    "\013\uffe9\001\002\000\016\004\uffec\005\uffec\006\uffec\007" +
    "\uffec\010\uffec\013\uffec\001\002\000\016\004\uffeb\005\uffeb" +
    "\006\uffeb\007\uffeb\010\uffeb\013\uffeb\001\002\000\006\010" +
    "\065\013\064\001\002\000\016\004\067\005\070\006\072" +
    "\007\071\010\065\013\064\001\002\000\022\002\ufff1\004" +
    "\ufff1\005\ufff1\006\ufff1\007\ufff1\010\ufff1\011\ufff1\013\ufff1" +
    "\001\002\000\022\002\ufff0\004\ufff0\005\ufff0\006\ufff0\007" +
    "\ufff0\010\ufff0\011\ufff0\013\ufff0\001\002\000\022\002\uffee" +
    "\004\uffee\005\uffee\006\uffee\007\uffee\010\uffee\011\uffee\013" +
    "\uffee\001\002\000\022\002\uffef\004\uffef\005\uffef\006\uffef" +
    "\007\uffef\010\uffef\011\uffef\013\uffef\001\002\000\016\004" +
    "\013\005\004\006\015\007\006\010\054\013\053\001\002" +
    "\000\022\002\uffe6\004\uffe6\005\uffe6\006\uffe6\007\uffe6\010" +
    "\uffe6\011\uffe6\013\uffe6\001\002\000\016\004\013\005\004" +
    "\006\015\007\006\010\054\013\053\001\002\000\022\002" +
    "\uffe8\004\uffe8\005\uffe8\006\uffe8\007\uffe8\010\uffe8\011\uffe8" +
    "\013\uffe8\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\074\000\020\002\013\003\017\004\011\005\016\006" +
    "\007\007\006\010\004\001\001\000\006\010\055\011\074" +
    "\001\001\000\002\001\001\000\006\010\055\011\072\001" +
    "\001\000\006\006\062\007\065\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\010\055\011" +
    "\060\001\001\000\002\001\001\000\006\010\055\011\054" +
    "\001\001\000\016\003\027\004\011\005\016\006\047\007" +
    "\006\010\046\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\004\041\005\016\001\001\000\006\004\022\005" +
    "\016\001\001\000\002\001\001\000\006\004\040\005\016" +
    "\001\001\000\002\001\001\000\006\004\031\005\016\001" +
    "\001\000\010\003\027\004\011\005\016\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\005" +
    "\037\001\001\000\004\005\036\001\001\000\004\005\035" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\004\045" +
    "\005\016\001\001\000\006\004\044\005\016\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\010\046\001\001\000\006\010\055\011\056" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\010\055\011\061\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\006\047\007" +
    "\006\001\001\000\006\006\062\007\065\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\010\055\011\073\001\001\000\002\001\001" +
    "\000\006\010\055\011\075\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // D ::= NUMBER 
            {
              Token RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double n = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  
          RESULT = new Token(n, "",n.toString()
                                , n.toString());
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("D",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // D ::= C 
            {
              Token RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Token c = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
          RESULT = c;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("D",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // C ::= LPAREN C RPAREN 
            {
              Token RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Token c = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
            RESULT = c;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("C",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // C ::= DIVIDE D D 
            {
              Token RESULT =null;
		int d1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int d1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Token d1 = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int d2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int d2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Token d2 = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
            RESULT = new Token(d1.value/d2.value,
                                 "","("+d1.postfix+" "+d2.postfix+ ") /"
                                ,"( "+ d1.infix+ " / "+d2.infix+ " )");
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("C",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // C ::= TIMES D D 
            {
              Token RESULT =null;
		int d1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int d1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Token d1 = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int d2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int d2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Token d2 = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
            RESULT = new Token(d1.value*d2.value,
                                 "","("+d1.postfix+" "+d2.postfix+ ") *"
                                ,"( "+ d1.infix+ " * "+d2.infix+ " )");
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("C",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // C ::= MINUS D D 
            {
              Token RESULT =null;
		int d1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int d1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Token d1 = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int d2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int d2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Token d2 = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
            RESULT = new Token(d1.value-d2.value,
                                 "",d1.postfix+" "+d2.postfix+ " -"
                                ,"( "+ d1.infix+ " - "+d2.infix+ " )");
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("C",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // C ::= PLUS D D 
            {
              Token RESULT =null;
		int d1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int d1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Token d1 = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int d2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int d2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Token d2 = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  
            RESULT = new Token(d1.value+d2.value,
                                 "",d1.postfix+" "+d2.postfix+ " +"
                                ,"( "+ d1.infix+ " + "+d2.infix+ " )");
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("C",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // P ::= C 
            {
              Token RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Token c = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
            System.out.println("Evaluation result = " + c.value); 
            System.out.println("Postfix Exp = " + c.postfix);
            System.out.println("Infix Exp = " + c.infix);
            RESULT = c;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("P",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // B ::= NUMBER 
            {
              Token RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double n = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  
          RESULT = new Token(n, n.toString(),""
                                , n.toString());
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("B",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // B ::= A 
            {
              Token RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Token a = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
          RESULT = a;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("B",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // A ::= LPAREN A RPAREN 
            {
              Token RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Token a = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
            RESULT = a;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("A",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // A ::= B B DIVIDE 
            {
              Token RESULT =null;
		int b1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int b1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Token b1 = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int b2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int b2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Token b2 = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
            RESULT = new Token(b1.value/b2.value,
                                 "/ ("+b1.prefix+" "+b2.prefix+")",""
                                ,"( "+ b1.infix+ " / "+b2.infix+ " )");
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("A",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // A ::= B B TIMES 
            {
              Token RESULT =null;
		int b1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int b1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Token b1 = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int b2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int b2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Token b2 = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
            RESULT = new Token(b1.value*b2.value,
                                 "*( "+b1.prefix+" "+b2.prefix+")",""
                                ,"( "+ b1.infix+ " * "+b2.infix+ " )");
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("A",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // A ::= B B MINUS 
            {
              Token RESULT =null;
		int b1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int b1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Token b1 = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int b2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int b2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Token b2 = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
            RESULT = new Token(b1.value-b2.value,
                                 "- "+b1.prefix+" "+b2.prefix,""
                                ,"( "+ b1.infix+ " - "+b2.infix + " )");
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("A",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // A ::= B B PLUS 
            {
              Token RESULT =null;
		int b1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int b1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Token b1 = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int b2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int b2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Token b2 = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		  
            RESULT = new Token(b1.value+b2.value, 
                                "+ "+b1.prefix+" "+b2.prefix,""
                                ,"( "+ b1.infix+ " + "+b2.infix+" )");
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("A",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // P ::= A 
            {
              Token RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Token a = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
            System.out.println("Evaluation result = " + a.value); 
            System.out.println("Prefix Exp = " + a.prefix);
            System.out.println("Infix Exp = " + a.infix);
            RESULT = a;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("P",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // F ::= NUMBER 
            {
              Token RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double n = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
            RESULT = new Token(n, n.toString(), n.toString(), "");
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("F",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // F ::= LPAREN E RPAREN 
            {
              Token RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Token e = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
            RESULT = e;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("F",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // T ::= F 
            {
              Token RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Token f = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
            RESULT = f;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("T",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // T ::= T AT F 
            {
              Token RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Token t = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Token f = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
           
          RESULT = new Token((2*t.value +(t.value - f.value)), "@ " +t.prefix+ " " +f.prefix,t.postfix+" "+f.postfix+ " @","");
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("T",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // T ::= T TIMES F 
            {
              Token RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Token t = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Token f = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
          RESULT = new Token(t.value * f.value, "(* " +t.prefix+ " " +f.prefix+")",
          "("+t.postfix+" "+f.postfix+ " *)","");
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("T",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // T ::= T DIVIDE F 
            {
              Token RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Token t = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Token f = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
          RESULT = new Token(t.value / f.value, "(/ " +t.prefix+ " " +f.prefix+ ")",
          "("+t.postfix+" "+f.postfix+ " /)","");
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("T",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // E ::= T 
            {
              Token RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Token t = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
            RESULT = t;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("E",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // E ::= E MINUS PLUS T 
            {
              Token RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Token e = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Token t = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
          RESULT = new Token(e.value - t.value, "- " +e.prefix+ " " +t.prefix,
          e.postfix+" "+t.postfix+ " -","");    
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("E",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // E ::= E PLUS MINUS T 
            {
              Token RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Token e = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Token t = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
          RESULT = new Token(e.value - t.value, "- " +e.prefix+ " " +t.prefix,
          e.postfix+" "+t.postfix+ " -","");    
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("E",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // E ::= E MINUS MINUS T 
            {
              Token RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Token e = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Token t = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
          RESULT = new Token(e.value + t.value,
         "+ " +e.prefix+ " " +t.prefix,
          e.postfix+" "+t.postfix+ " +","");  
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("E",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // E ::= E PLUS PLUS T 
            {
              Token RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Token e = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Token t = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
          RESULT = new Token(e.value + t.value, 
          "+ " +e.prefix+ " " +t.prefix,
          e.postfix+" "+t.postfix+ " +","");  
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("E",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // E ::= E PLUS T 
            {
              Token RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Token e = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Token t = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
          RESULT = new Token(e.value + t.value, "+ " +e.prefix+ " " +t.prefix,
          e.postfix+" "+t.postfix+ " +","");  
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("E",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // E ::= E MINUS T 
            {
              Token RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Token e = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Token t = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
          RESULT = new Token(e.value - t.value, "- " +e.prefix+ " " +t.prefix,
          e.postfix+" "+t.postfix+ " -","");    
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("E",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= P EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Token start_val = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // P ::= E 
            {
              Token RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Token e = (Token)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  System.out.println();
            System.out.println("Evaluation result = " + e.value); 
            System.out.println("Prefix Exp = " + e.prefix);
            System.out.println("Posfix Exp = " + e.postfix);
            System.out.println("Infix Exp = " + e.infix);
            RESULT = e;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("P",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

