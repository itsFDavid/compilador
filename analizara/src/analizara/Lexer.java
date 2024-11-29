
package analizara;
import static analizara.Token.*;

class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\34\2\0\1\3\22\0\1\3\1\60\3\0\1\44"+
    "\1\0\1\57\1\36\1\35\1\42\1\40\1\54\1\41\1\55\1\33"+
    "\12\2\1\56\1\45\1\46\1\37\1\47\2\0\2\1\1\22\27\1"+
    "\1\52\1\0\1\53\1\43\1\1\1\0\1\15\1\6\1\11\1\16"+
    "\1\20\1\24\1\21\1\30\1\10\1\1\1\27\1\7\1\26\1\23"+
    "\1\12\1\4\1\1\1\13\1\25\1\17\1\5\1\14\1\1\1\31"+
    "\1\32\1\1\1\50\1\0\1\51\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\4\2\1\5\12\2"+
    "\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\1\27\2\1\4"+
    "\1\0\1\32\1\33\1\34\1\35\32\2\1\0\27\2"+
    "\1\3\41\2\1\36";

  private static int [] zzUnpackAction() {
    int [] result = new int[156];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\61\0\142\0\223\0\61\0\304\0\365\0\u0126"+
    "\0\u0157\0\u0188\0\u01b9\0\u01ea\0\u021b\0\u024c\0\u027d\0\u02ae"+
    "\0\u02df\0\u0310\0\u0341\0\u0372\0\142\0\u03a3\0\61\0\u03d4"+
    "\0\u0405\0\61\0\61\0\61\0\61\0\61\0\61\0\u0436"+
    "\0\u0467\0\61\0\61\0\61\0\61\0\61\0\61\0\61"+
    "\0\61\0\u0498\0\u04c9\0\u04fa\0\u052b\0\u055c\0\u058d\0\u05be"+
    "\0\u05ef\0\u0620\0\u0651\0\u0682\0\u06b3\0\u06e4\0\u0715\0\u0746"+
    "\0\u0777\0\u07a8\0\u07d9\0\u080a\0\u083b\0\u086c\0\u089d\0\u08ce"+
    "\0\u08ff\0\u0930\0\u0961\0\61\0\61\0\61\0\61\0\u0992"+
    "\0\u09c3\0\u09f4\0\u0a25\0\u0a56\0\u0a87\0\u0ab8\0\u0ae9\0\u0b1a"+
    "\0\u0b4b\0\u0b7c\0\u0bad\0\u0bde\0\u0c0f\0\u0c40\0\u0c71\0\u0ca2"+
    "\0\u0cd3\0\u0d04\0\u0d35\0\u0d66\0\u0d97\0\u0dc8\0\u0df9\0\u0e2a"+
    "\0\u0e5b\0\u0e8c\0\u0ebd\0\u0eee\0\u0f1f\0\u0f50\0\u0f81\0\u0fb2"+
    "\0\u0fe3\0\u1014\0\u1045\0\u1076\0\u10a7\0\u10d8\0\u1109\0\u113a"+
    "\0\u116b\0\u119c\0\u11cd\0\u11fe\0\u122f\0\u1260\0\u1291\0\u12c2"+
    "\0\u12f3\0\61\0\u1324\0\u1355\0\u1386\0\u13b7\0\u13e8\0\u1419"+
    "\0\u144a\0\u147b\0\u14ac\0\u14dd\0\u150e\0\u153f\0\u1570\0\u15a1"+
    "\0\u15d2\0\u1603\0\u1634\0\u1665\0\u1696\0\u16c7\0\u16f8\0\u1729"+
    "\0\u175a\0\u178b\0\u17bc\0\u17ed\0\u181e\0\u184f\0\u1880\0\u18b1"+
    "\0\u18e2\0\u1913\0\u1944\0\142";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[156];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\3\1\7\1\3"+
    "\1\10\1\11\1\12\1\13\1\14\1\3\1\15\1\3"+
    "\1\16\1\3\1\17\1\20\1\21\1\22\1\23\1\3"+
    "\1\24\1\3\1\25\1\26\1\5\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51"+
    "\1\52\62\0\2\3\1\0\27\3\30\0\1\4\57\0"+
    "\2\3\1\0\1\3\1\53\5\3\1\54\17\3\27\0"+
    "\2\3\1\0\6\3\1\55\1\56\17\3\27\0\2\3"+
    "\1\0\17\3\1\57\2\3\1\60\4\3\27\0\2\3"+
    "\1\0\3\3\1\61\5\3\1\62\15\3\27\0\2\3"+
    "\1\0\1\63\26\3\27\0\2\3\1\0\14\3\1\64"+
    "\12\3\27\0\2\3\1\0\11\3\1\65\2\3\1\66"+
    "\12\3\27\0\2\3\1\0\6\3\1\67\5\3\1\70"+
    "\12\3\27\0\2\3\1\0\17\3\1\71\1\3\1\72"+
    "\3\3\1\73\1\3\27\0\2\3\1\0\11\3\1\74"+
    "\15\3\27\0\2\3\1\0\1\3\1\75\25\3\27\0"+
    "\2\3\1\0\3\3\1\76\5\3\1\77\15\3\27\0"+
    "\2\3\1\0\4\3\1\25\22\3\27\0\2\3\1\0"+
    "\4\3\1\100\22\3\27\0\2\3\1\0\11\3\1\101"+
    "\15\3\61\0\1\102\66\0\1\103\56\0\1\104\60\0"+
    "\1\105\60\0\1\106\60\0\1\107\22\0\2\3\1\0"+
    "\2\3\1\110\24\3\27\0\2\3\1\0\4\3\1\111"+
    "\1\3\1\112\20\3\27\0\2\3\1\0\6\3\1\113"+
    "\20\3\27\0\2\3\1\0\14\3\1\114\12\3\27\0"+
    "\2\3\1\0\13\3\1\115\13\3\27\0\2\3\1\0"+
    "\1\116\26\3\27\0\2\3\1\0\11\3\1\117\15\3"+
    "\27\0\2\3\1\0\1\120\6\3\1\121\11\3\1\122"+
    "\5\3\27\0\2\3\1\0\5\3\1\123\21\3\27\0"+
    "\2\3\1\0\13\3\1\124\13\3\27\0\2\3\1\0"+
    "\5\3\1\125\21\3\27\0\2\3\1\0\7\3\1\126"+
    "\17\3\27\0\2\3\1\0\2\3\1\127\24\3\27\0"+
    "\2\3\1\0\6\3\1\130\20\3\27\0\2\3\1\0"+
    "\13\3\1\131\13\3\27\0\2\3\1\0\13\3\1\132"+
    "\13\3\27\0\2\3\1\0\13\3\1\133\13\3\27\0"+
    "\2\3\1\0\12\3\1\134\14\3\27\0\2\3\1\0"+
    "\3\3\1\122\10\3\1\135\12\3\27\0\2\3\1\0"+
    "\6\3\1\136\20\3\27\0\2\3\1\0\3\3\1\137"+
    "\23\3\27\0\2\3\1\0\14\3\1\140\12\3\27\0"+
    "\2\3\1\0\5\3\1\141\21\3\26\0\34\102\1\0"+
    "\24\102\2\0\1\142\57\0\2\3\1\0\3\3\1\143"+
    "\23\3\27\0\2\3\1\0\10\3\1\144\16\3\27\0"+
    "\2\3\1\0\13\3\1\145\13\3\27\0\2\3\1\0"+
    "\3\3\1\146\23\3\27\0\2\3\1\0\11\3\1\147"+
    "\15\3\27\0\2\3\1\0\14\3\1\150\12\3\27\0"+
    "\2\3\1\0\3\3\1\151\2\3\1\152\1\153\17\3"+
    "\27\0\2\3\1\0\21\3\1\154\5\3\27\0\2\3"+
    "\1\0\13\3\1\155\13\3\27\0\2\3\1\0\11\3"+
    "\1\156\15\3\27\0\2\3\1\0\6\3\1\25\20\3"+
    "\27\0\2\3\1\0\4\3\1\157\22\3\27\0\2\3"+
    "\1\0\6\3\1\160\20\3\27\0\2\3\1\0\4\3"+
    "\1\122\22\3\27\0\2\3\1\0\12\3\1\161\14\3"+
    "\27\0\2\3\1\0\3\3\1\154\23\3\27\0\2\3"+
    "\1\0\13\3\1\162\13\3\27\0\2\3\1\0\14\3"+
    "\1\163\12\3\27\0\2\3\1\0\11\3\1\164\15\3"+
    "\27\0\2\3\1\0\4\3\1\165\22\3\27\0\2\3"+
    "\1\0\14\3\1\166\12\3\27\0\2\3\1\0\10\3"+
    "\1\122\16\3\27\0\2\3\1\0\13\3\1\167\13\3"+
    "\27\0\2\3\1\0\21\3\1\122\5\3\27\0\2\3"+
    "\1\0\17\3\1\170\7\3\27\0\2\3\1\0\14\3"+
    "\1\171\12\3\30\0\1\142\32\0\1\172\24\0\2\3"+
    "\1\0\4\3\1\173\22\3\27\0\2\3\1\0\11\3"+
    "\1\174\15\3\27\0\2\3\1\0\14\3\1\175\12\3"+
    "\27\0\2\3\1\0\14\3\1\176\12\3\27\0\2\3"+
    "\1\0\23\3\1\25\3\3\27\0\2\3\1\0\7\3"+
    "\1\177\7\3\1\200\7\3\27\0\2\3\1\0\14\3"+
    "\1\201\12\3\27\0\2\3\1\0\7\3\1\200\17\3"+
    "\27\0\2\3\1\0\4\3\1\202\22\3\27\0\2\3"+
    "\1\0\14\3\1\25\12\3\27\0\2\3\1\0\1\3"+
    "\1\203\25\3\27\0\2\3\1\0\5\3\1\204\21\3"+
    "\27\0\2\3\1\0\6\3\1\205\20\3\27\0\2\3"+
    "\1\0\7\3\1\206\17\3\27\0\2\3\1\0\11\3"+
    "\1\207\15\3\27\0\2\3\1\0\7\3\1\210\17\3"+
    "\27\0\2\3\1\0\7\3\1\122\17\3\27\0\2\3"+
    "\1\0\13\3\1\143\13\3\27\0\2\3\1\0\14\3"+
    "\1\211\12\3\27\0\2\3\1\0\17\3\1\212\7\3"+
    "\27\0\2\3\1\0\11\3\1\213\15\3\27\0\2\3"+
    "\1\0\13\3\1\214\13\3\27\0\2\3\1\0\7\3"+
    "\1\25\17\3\27\0\2\3\1\0\5\3\1\122\21\3"+
    "\27\0\2\3\1\0\12\3\1\122\14\3\27\0\2\3"+
    "\1\0\15\3\1\215\11\3\27\0\2\3\1\0\11\3"+
    "\1\206\15\3\27\0\2\3\1\0\20\3\1\216\6\3"+
    "\27\0\2\3\1\0\13\3\1\217\13\3\27\0\2\3"+
    "\1\0\22\3\1\220\4\3\27\0\2\3\1\0\22\3"+
    "\1\221\4\3\27\0\2\3\1\0\7\3\1\217\17\3"+
    "\27\0\2\3\1\0\13\3\1\141\13\3\27\0\2\3"+
    "\1\0\17\3\1\25\7\3\27\0\2\3\1\0\17\3"+
    "\1\122\7\3\27\0\2\3\1\0\12\3\1\131\14\3"+
    "\27\0\2\3\1\0\6\3\1\222\20\3\27\0\2\3"+
    "\1\0\17\3\1\223\7\3\27\0\2\3\1\0\11\3"+
    "\1\25\15\3\27\0\2\3\1\0\17\3\1\224\7\3"+
    "\27\0\2\3\1\0\7\3\1\225\17\3\27\0\2\3"+
    "\1\0\4\3\1\174\22\3\27\0\2\3\1\0\11\3"+
    "\1\226\15\3\27\0\2\3\1\0\11\3\1\171\15\3"+
    "\27\0\2\3\1\0\14\3\1\227\12\3\27\0\2\3"+
    "\1\0\4\3\1\230\22\3\27\0\2\3\1\0\22\3"+
    "\1\231\4\3\27\0\2\3\1\0\12\3\1\154\14\3"+
    "\27\0\2\3\1\0\13\3\1\154\13\3\27\0\2\3"+
    "\1\0\11\3\1\232\15\3\27\0\2\3\1\0\5\3"+
    "\1\154\21\3\27\0\2\3\1\0\17\3\1\233\7\3"+
    "\27\0\2\3\1\0\7\3\1\234\17\3\27\0\2\3"+
    "\1\0\6\3\1\174\20\3\27\0\2\3\1\0\21\3"+
    "\1\25\5\3\27\0\2\3\1\0\13\3\1\212\13\3"+
    "\26\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6517];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\1\11\21\1\1\11\2\1\6\11"+
    "\2\1\10\11\31\1\1\0\4\11\32\1\1\0\27\1"+
    "\1\11\42\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[156];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
public String tipo;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 132) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 15: 
          { return PUNTO_COMA;
          }
        case 31: break;
        case 19: 
          { return LLAVE_DER;
          }
        case 32: break;
        case 18: 
          { return LLAVE_IZQ;
          }
        case 33: break;
        case 9: 
          { return ASIGNAR;
          }
        case 34: break;
        case 5: 
          { tipo=yytext(); return RESERVADAS;
          }
        case 35: break;
        case 26: 
          { return IGUAL;
          }
        case 36: break;
        case 13: 
          { return POTENCIA;
          }
        case 37: break;
        case 28: 
          { return MAYOR_IGUAL;
          }
        case 38: break;
        case 23: 
          { return PUNTO;
          }
        case 39: break;
        case 16: 
          { return MENOR;
          }
        case 40: break;
        case 22: 
          { return COMA;
          }
        case 41: break;
        case 24: 
          { return DOS_PUNTOS;
          }
        case 42: break;
        case 14: 
          { return MODULO;
          }
        case 43: break;
        case 21: 
          { return CORCHETE_DER;
          }
        case 44: break;
        case 12: 
          { return MULTIPLICACION;
          }
        case 45: break;
        case 20: 
          { return CORCHETE_IZQ;
          }
        case 46: break;
        case 17: 
          { return MAYOR;
          }
        case 47: break;
        case 27: 
          { return MENOR_IGUAL;
          }
        case 48: break;
        case 7: 
          { return PARENTESIS_DER;
          }
        case 49: break;
        case 6: 
          { return DIVISION;
          }
        case 50: break;
        case 8: 
          { return PARENTESIS_IZQ;
          }
        case 51: break;
        case 11: 
          { return RESTA;
          }
        case 52: break;
        case 2: 
          { tipo=yytext(); return IDENTIFICADOR;
          }
        case 53: break;
        case 30: 
          { return METODO_IMPRIMIR;
          }
        case 54: break;
        case 25: 
          { return COMILLA_SIMPLE;
          }
        case 55: break;
        case 3: 
          { tipo=yytext(); return VALOR_NUMERICO;
          }
        case 56: break;
        case 1: 
          { return ERROR;
          }
        case 57: break;
        case 4: 
          { /*Ignore*/
          }
        case 58: break;
        case 29: 
          { return DIFERENTE;
          }
        case 59: break;
        case 10: 
          { return SUMA;
          }
        case 60: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
