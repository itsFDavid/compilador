/* The following code was generated by JFlex 1.4.3 on 13/12/24, 11:18 a.m. */

package analizara;
import static analizara.Token.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 13/12/24, 11:18 a.m. from the specification file
 * <tt>C:/Users/PAKO031147/Desktop/compilador/analizara/src/analizara/lexer.flex</tt>
 */
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
    "\11\0\1\3\1\33\2\0\1\3\22\0\1\3\1\56\3\0\1\43"+
    "\1\0\1\55\1\35\1\34\1\41\1\37\1\3\1\40\1\53\1\32"+
    "\12\2\1\54\1\44\1\45\1\36\1\46\2\0\32\1\1\51\1\0"+
    "\1\52\1\42\1\1\1\0\1\15\1\6\1\11\1\16\1\20\1\23"+
    "\1\21\1\27\1\10\1\1\1\26\1\7\1\25\1\22\1\12\1\4"+
    "\1\1\1\13\1\24\1\17\1\5\1\14\1\1\1\30\1\31\1\1"+
    "\1\47\1\0\1\50\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\4\2\1\5\11\2"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\1\24\2\1\33"+
    "\2\2\1\4\1\0\1\34\1\35\1\36\1\37\33\2"+
    "\1\0\15\2\1\40\11\2\1\41\5\2\1\3\4\2"+
    "\1\42\5\2\1\43\5\2\1\44\1\2\1\45\4\2"+
    "\1\46\1\2\1\47\1\2\1\50\13\2\1\51\1\52"+
    "\3\2\1\53\4\2\1\54\1\55\11\2\1\56\7\2"+
    "\1\57\1\2\1\60\1\2\1\61\1\62\1\63\1\64"+
    "\2\2\1\65\1\66\1\67\1\70\1\71\1\72\1\2"+
    "\1\73\1\2\1\74\1\75";

  private static int [] zzUnpackAction() {
    int [] result = new int[217];
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
    "\0\0\0\57\0\136\0\215\0\57\0\274\0\353\0\u011a"+
    "\0\u0149\0\u0178\0\u01a7\0\u01d6\0\u0205\0\u0234\0\u0263\0\u0292"+
    "\0\u02c1\0\u02f0\0\u031f\0\136\0\u034e\0\57\0\57\0\u037d"+
    "\0\u03ac\0\57\0\57\0\57\0\57\0\57\0\57\0\u03db"+
    "\0\u040a\0\57\0\57\0\57\0\57\0\57\0\57\0\57"+
    "\0\u0439\0\u0468\0\u0497\0\u04c6\0\u04f5\0\u0524\0\u0553\0\u0582"+
    "\0\u05b1\0\u05e0\0\u060f\0\u063e\0\u066d\0\u069c\0\u06cb\0\u06fa"+
    "\0\u0729\0\u0758\0\u0787\0\u07b6\0\u07e5\0\136\0\u0814\0\u0843"+
    "\0\u0872\0\u08a1\0\57\0\57\0\57\0\57\0\u08d0\0\u08ff"+
    "\0\u092e\0\u095d\0\u098c\0\u09bb\0\u09ea\0\u0a19\0\u0a48\0\u0a77"+
    "\0\u0aa6\0\u0ad5\0\u0b04\0\u0b33\0\u0b62\0\u0b91\0\u0bc0\0\u0bef"+
    "\0\u0c1e\0\u0c4d\0\u0c7c\0\u0cab\0\u0cda\0\u0d09\0\u0d38\0\u0d67"+
    "\0\u0d96\0\u0dc5\0\u0df4\0\u0e23\0\u0e52\0\u0e81\0\u0eb0\0\u0edf"+
    "\0\u0f0e\0\u0f3d\0\u0f6c\0\u0f9b\0\u0fca\0\u0ff9\0\u1028\0\136"+
    "\0\u1057\0\u1086\0\u10b5\0\u10e4\0\u1113\0\u1142\0\u1171\0\u11a0"+
    "\0\u11cf\0\136\0\u11fe\0\u122d\0\u125c\0\u128b\0\u12ba\0\57"+
    "\0\u12e9\0\u1318\0\u1347\0\u1376\0\136\0\u13a5\0\u13d4\0\u1403"+
    "\0\u1432\0\u1461\0\136\0\u1490\0\u14bf\0\u14ee\0\u151d\0\u154c"+
    "\0\136\0\u157b\0\136\0\u15aa\0\u15d9\0\u1608\0\u1637\0\136"+
    "\0\u1666\0\136\0\u1695\0\136\0\u16c4\0\u16f3\0\u1722\0\u1751"+
    "\0\u1780\0\u17af\0\u17de\0\u180d\0\u183c\0\u186b\0\u189a\0\136"+
    "\0\136\0\u18c9\0\u18f8\0\u1927\0\136\0\u1956\0\u1985\0\u19b4"+
    "\0\u19e3\0\136\0\136\0\u1a12\0\u1a41\0\u1a70\0\u1a9f\0\u1ace"+
    "\0\u1afd\0\u1b2c\0\u1b5b\0\u1b8a\0\136\0\u1bb9\0\u1be8\0\u1c17"+
    "\0\u1c46\0\u1c75\0\u1ca4\0\u1cd3\0\136\0\u1d02\0\136\0\u1d31"+
    "\0\136\0\136\0\136\0\136\0\u1d60\0\u1d8f\0\136\0\136"+
    "\0\136\0\136\0\136\0\136\0\u1dbe\0\136\0\u1ded\0\136"+
    "\0\136";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[217];
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
    "\1\16\1\3\1\17\1\20\1\21\1\22\1\3\1\23"+
    "\1\3\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\1\46\1\47\1\50\1\51\60\0"+
    "\2\3\1\0\26\3\27\0\1\4\55\0\2\3\1\0"+
    "\1\3\1\52\5\3\1\53\16\3\26\0\2\3\1\0"+
    "\6\3\1\54\1\55\16\3\26\0\2\3\1\0\16\3"+
    "\1\56\2\3\1\57\4\3\26\0\2\3\1\0\3\3"+
    "\1\60\5\3\1\61\14\3\26\0\2\3\1\0\1\62"+
    "\25\3\26\0\2\3\1\0\14\3\1\63\11\3\26\0"+
    "\2\3\1\0\11\3\1\64\2\3\1\65\11\3\26\0"+
    "\2\3\1\0\6\3\1\66\5\3\1\67\11\3\26\0"+
    "\2\3\1\0\16\3\1\70\1\3\1\71\3\3\1\72"+
    "\1\3\26\0\2\3\1\0\1\3\1\73\24\3\26\0"+
    "\2\3\1\0\3\3\1\74\5\3\1\75\14\3\26\0"+
    "\2\3\1\0\4\3\1\76\21\3\26\0\2\3\1\0"+
    "\4\3\1\77\21\3\26\0\2\3\1\0\11\3\1\100"+
    "\14\3\57\0\1\101\64\0\1\102\54\0\1\103\56\0"+
    "\1\104\56\0\1\105\56\0\1\106\21\0\2\3\1\0"+
    "\2\3\1\107\23\3\26\0\2\3\1\0\4\3\1\110"+
    "\1\3\1\111\17\3\26\0\2\3\1\0\6\3\1\112"+
    "\17\3\26\0\2\3\1\0\14\3\1\113\11\3\26\0"+
    "\2\3\1\0\13\3\1\114\12\3\26\0\2\3\1\0"+
    "\1\115\25\3\26\0\2\3\1\0\11\3\1\116\14\3"+
    "\26\0\2\3\1\0\1\117\6\3\1\120\2\3\1\121"+
    "\5\3\1\122\5\3\26\0\2\3\1\0\5\3\1\123"+
    "\20\3\26\0\2\3\1\0\13\3\1\124\12\3\26\0"+
    "\2\3\1\0\5\3\1\125\20\3\26\0\2\3\1\0"+
    "\7\3\1\126\16\3\26\0\2\3\1\0\2\3\1\127"+
    "\23\3\26\0\2\3\1\0\6\3\1\130\17\3\26\0"+
    "\2\3\1\0\13\3\1\131\12\3\26\0\2\3\1\0"+
    "\13\3\1\132\12\3\26\0\2\3\1\0\13\3\1\133"+
    "\12\3\26\0\2\3\1\0\3\3\1\134\10\3\1\135"+
    "\11\3\26\0\2\3\1\0\6\3\1\136\17\3\26\0"+
    "\2\3\1\0\3\3\1\137\22\3\26\0\2\3\1\0"+
    "\14\3\1\140\11\3\26\0\2\3\1\0\5\3\1\141"+
    "\20\3\25\0\33\101\1\0\23\101\2\0\1\142\55\0"+
    "\2\3\1\0\3\3\1\143\22\3\26\0\2\3\1\0"+
    "\10\3\1\144\15\3\26\0\2\3\1\0\13\3\1\145"+
    "\12\3\26\0\2\3\1\0\3\3\1\146\22\3\26\0"+
    "\2\3\1\0\11\3\1\147\14\3\26\0\2\3\1\0"+
    "\14\3\1\150\11\3\26\0\2\3\1\0\3\3\1\151"+
    "\2\3\1\152\1\153\16\3\26\0\2\3\1\0\20\3"+
    "\1\154\5\3\26\0\2\3\1\0\13\3\1\155\12\3"+
    "\26\0\2\3\1\0\11\3\1\156\14\3\26\0\2\3"+
    "\1\0\14\3\1\157\11\3\26\0\2\3\1\0\6\3"+
    "\1\160\17\3\26\0\2\3\1\0\4\3\1\161\21\3"+
    "\26\0\2\3\1\0\6\3\1\162\17\3\26\0\2\3"+
    "\1\0\4\3\1\163\21\3\26\0\2\3\1\0\12\3"+
    "\1\164\13\3\26\0\2\3\1\0\3\3\1\165\22\3"+
    "\26\0\2\3\1\0\13\3\1\166\12\3\26\0\2\3"+
    "\1\0\14\3\1\167\11\3\26\0\2\3\1\0\11\3"+
    "\1\170\14\3\26\0\2\3\1\0\4\3\1\171\21\3"+
    "\26\0\2\3\1\0\6\3\1\172\17\3\26\0\2\3"+
    "\1\0\10\3\1\173\15\3\26\0\2\3\1\0\13\3"+
    "\1\174\12\3\26\0\2\3\1\0\20\3\1\175\5\3"+
    "\26\0\2\3\1\0\16\3\1\176\7\3\26\0\2\3"+
    "\1\0\14\3\1\177\11\3\27\0\1\142\31\0\1\200"+
    "\23\0\2\3\1\0\4\3\1\201\21\3\26\0\2\3"+
    "\1\0\11\3\1\202\14\3\26\0\2\3\1\0\14\3"+
    "\1\203\11\3\26\0\2\3\1\0\14\3\1\204\11\3"+
    "\26\0\2\3\1\0\22\3\1\205\3\3\26\0\2\3"+
    "\1\0\7\3\1\206\6\3\1\207\7\3\26\0\2\3"+
    "\1\0\14\3\1\210\11\3\26\0\2\3\1\0\7\3"+
    "\1\211\16\3\26\0\2\3\1\0\4\3\1\212\21\3"+
    "\26\0\2\3\1\0\14\3\1\213\11\3\26\0\2\3"+
    "\1\0\1\3\1\214\24\3\26\0\2\3\1\0\5\3"+
    "\1\215\20\3\26\0\2\3\1\0\16\3\1\216\7\3"+
    "\26\0\2\3\1\0\6\3\1\217\17\3\26\0\2\3"+
    "\1\0\7\3\1\220\16\3\26\0\2\3\1\0\6\3"+
    "\1\221\17\3\26\0\2\3\1\0\11\3\1\222\14\3"+
    "\26\0\2\3\1\0\14\3\1\223\11\3\26\0\2\3"+
    "\1\0\7\3\1\224\16\3\26\0\2\3\1\0\7\3"+
    "\1\225\16\3\26\0\2\3\1\0\13\3\1\226\12\3"+
    "\26\0\2\3\1\0\14\3\1\227\11\3\26\0\2\3"+
    "\1\0\6\3\1\230\17\3\26\0\2\3\1\0\11\3"+
    "\1\231\14\3\26\0\2\3\1\0\6\3\1\232\17\3"+
    "\26\0\2\3\1\0\13\3\1\233\12\3\26\0\2\3"+
    "\1\0\7\3\1\234\16\3\26\0\2\3\1\0\5\3"+
    "\1\235\20\3\26\0\2\3\1\0\12\3\1\236\13\3"+
    "\26\0\2\3\1\0\15\3\1\237\10\3\26\0\2\3"+
    "\1\0\11\3\1\240\14\3\26\0\2\3\1\0\17\3"+
    "\1\241\6\3\26\0\2\3\1\0\13\3\1\242\12\3"+
    "\26\0\2\3\1\0\21\3\1\243\4\3\26\0\2\3"+
    "\1\0\13\3\1\244\12\3\26\0\2\3\1\0\21\3"+
    "\1\245\4\3\26\0\2\3\1\0\7\3\1\246\16\3"+
    "\26\0\2\3\1\0\13\3\1\247\12\3\26\0\2\3"+
    "\1\0\11\3\1\250\14\3\26\0\2\3\1\0\16\3"+
    "\1\251\7\3\26\0\2\3\1\0\16\3\1\252\7\3"+
    "\26\0\2\3\1\0\12\3\1\253\13\3\26\0\2\3"+
    "\1\0\6\3\1\254\17\3\26\0\2\3\1\0\6\3"+
    "\1\255\17\3\26\0\2\3\1\0\4\3\1\256\21\3"+
    "\26\0\2\3\1\0\16\3\1\257\7\3\26\0\2\3"+
    "\1\0\16\3\1\260\7\3\26\0\2\3\1\0\7\3"+
    "\1\261\16\3\26\0\2\3\1\0\6\3\1\262\17\3"+
    "\26\0\2\3\1\0\6\3\1\263\17\3\26\0\2\3"+
    "\1\0\4\3\1\264\21\3\26\0\2\3\1\0\16\3"+
    "\1\265\7\3\26\0\2\3\1\0\11\3\1\266\14\3"+
    "\26\0\2\3\1\0\11\3\1\267\14\3\26\0\2\3"+
    "\1\0\14\3\1\270\11\3\26\0\2\3\1\0\11\3"+
    "\1\271\14\3\26\0\2\3\1\0\4\3\1\272\21\3"+
    "\26\0\2\3\1\0\11\3\1\273\14\3\26\0\2\3"+
    "\1\0\14\3\1\274\11\3\26\0\2\3\1\0\6\3"+
    "\1\275\17\3\26\0\2\3\1\0\14\3\1\276\11\3"+
    "\26\0\2\3\1\0\21\3\1\277\4\3\26\0\2\3"+
    "\1\0\5\3\1\300\20\3\26\0\2\3\1\0\12\3"+
    "\1\301\13\3\26\0\2\3\1\0\13\3\1\302\12\3"+
    "\26\0\2\3\1\0\11\3\1\303\14\3\26\0\2\3"+
    "\1\0\12\3\1\304\13\3\26\0\2\3\1\0\6\3"+
    "\1\305\17\3\26\0\2\3\1\0\5\3\1\306\20\3"+
    "\26\0\2\3\1\0\7\3\1\307\16\3\26\0\2\3"+
    "\1\0\16\3\1\310\7\3\26\0\2\3\1\0\7\3"+
    "\1\311\16\3\26\0\2\3\1\0\7\3\1\312\16\3"+
    "\26\0\2\3\1\0\7\3\1\313\16\3\26\0\2\3"+
    "\1\0\7\3\1\314\16\3\26\0\2\3\1\0\7\3"+
    "\1\315\16\3\26\0\2\3\1\0\6\3\1\316\17\3"+
    "\26\0\2\3\1\0\6\3\1\317\17\3\26\0\2\3"+
    "\1\0\14\3\1\320\11\3\26\0\2\3\1\0\14\3"+
    "\1\321\11\3\26\0\2\3\1\0\20\3\1\322\5\3"+
    "\26\0\2\3\1\0\6\3\1\323\17\3\26\0\2\3"+
    "\1\0\14\3\1\324\11\3\26\0\2\3\1\0\13\3"+
    "\1\325\12\3\26\0\2\3\1\0\6\3\1\326\17\3"+
    "\26\0\2\3\1\0\12\3\1\327\13\3\26\0\2\3"+
    "\1\0\11\3\1\330\14\3\26\0\2\3\1\0\6\3"+
    "\1\331\17\3\25\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7708];
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
    "\1\0\1\11\2\1\1\11\20\1\2\11\2\1\6\11"+
    "\2\1\7\11\31\1\1\0\4\11\33\1\1\0\35\1"+
    "\1\11\131\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[217];
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
    while (i < 128) {
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
        case 61: 
          { tipo=yytext(); return De_otro_modo;
          }
        case 62: break;
        case 54: 
          { tipo=yytext(); return Extiende;
          }
        case 63: break;
        case 17: 
          { return PUNTO_COMA;
          }
        case 64: break;
        case 34: 
          { tipo=yytext(); return Break;
          }
        case 65: break;
        case 30: 
          { return MAYOR_IGUAL;
          }
        case 66: break;
        case 56: 
          { tipo=yytext(); return Mientras;
          }
        case 67: break;
        case 53: 
          { tipo=yytext(); return Estatico;
          }
        case 68: break;
        case 46: 
          { tipo=yytext(); return Retorno;
          }
        case 69: break;
        case 44: 
          { tipo=yytext(); return Publico;
          }
        case 70: break;
        case 27: 
          { tipo=yytext(); return Si;
          }
        case 71: break;
        case 57: 
          { tipo=yytext(); return Protegido;
          }
        case 72: break;
        case 5: 
          { tipo=yytext(); return O;
          }
        case 73: break;
        case 8: 
          { return Linea;
          }
        case 74: break;
        case 43: 
          { tipo=yytext(); return Entero;
          }
        case 75: break;
        case 40: 
          { tipo=yytext(); return Hacer;
          }
        case 76: break;
        case 42: 
          { tipo=yytext(); return Opcion;
          }
        case 77: break;
        case 39: 
          { tipo=yytext(); return Falso;
          }
        case 78: break;
        case 14: 
          { return MULTIPLICACION;
          }
        case 79: break;
        case 25: 
          { return DOS_PUNTOS;
          }
        case 80: break;
        case 37: 
          { tipo=yytext(); return Doble;
          }
        case 81: break;
        case 51: 
          { tipo=yytext(); return Capturar;
          }
        case 82: break;
        case 55: 
          { tipo=yytext(); return Flotante;
          }
        case 83: break;
        case 22: 
          { return CORCHETE_IZQ;
          }
        case 84: break;
        case 24: 
          { return PUNTO;
          }
        case 85: break;
        case 35: 
          { tipo=yytext(); return Clase;
          }
        case 86: break;
        case 23: 
          { return CORCHETE_DER;
          }
        case 87: break;
        case 13: 
          { return RESTA;
          }
        case 88: break;
        case 19: 
          { return MAYOR;
          }
        case 89: break;
        case 58: 
          { tipo=yytext(); return Interface;
          }
        case 90: break;
        case 32: 
          { tipo=yytext(); return Caso;
          }
        case 91: break;
        case 33: 
          { tipo=yytext(); return Nulo;
          }
        case 92: break;
        case 50: 
          { return METODO_IMPRIMIR;
          }
        case 93: break;
        case 12: 
          { return SUMA;
          }
        case 94: break;
        case 29: 
          { return MENOR_IGUAL;
          }
        case 95: break;
        case 59: 
          { tipo=yytext(); return Verdadero;
          }
        case 96: break;
        case 7: 
          { return DIVISION;
          }
        case 97: break;
        case 16: 
          { return MODULO;
          }
        case 98: break;
        case 45: 
          { tipo=yytext(); return Privado;
          }
        case 99: break;
        case 11: 
          { return ASIGNAR;
          }
        case 100: break;
        case 26: 
          { return COMILLA_SIMPLE;
          }
        case 101: break;
        case 38: 
          { tipo=yytext(); return Nuevo;
          }
        case 102: break;
        case 28: 
          { return IGUAL;
          }
        case 103: break;
        case 3: 
          { tipo=yytext(); return VALOR_NUMERICO;
          }
        case 104: break;
        case 31: 
          { return DIFERENTE;
          }
        case 105: break;
        case 2: 
          { tipo=yytext(); return IDENTIFICADOR;
          }
        case 106: break;
        case 47: 
          { tipo=yytext(); return Booleano;
          }
        case 107: break;
        case 1: 
          { return ERROR;
          }
        case 108: break;
        case 60: 
          { tipo=yytext(); return Implementa;
          }
        case 109: break;
        case 10: 
          { return PARENTESIS_IZQ;
          }
        case 110: break;
        case 18: 
          { return MENOR;
          }
        case 111: break;
        case 52: 
          { tipo=yytext(); return Caracter;
          }
        case 112: break;
        case 4: 
          { /*Ignore*/
          }
        case 113: break;
        case 9: 
          { return PARENTESIS_DER;
          }
        case 114: break;
        case 20: 
          { return LLAVE_IZQ;
          }
        case 115: break;
        case 41: 
          { tipo=yytext(); return Cadena;
          }
        case 116: break;
        case 6: 
          { tipo=yytext(); return Y;
          }
        case 117: break;
        case 49: 
          { tipo=yytext(); return Importar;
          }
        case 118: break;
        case 21: 
          { return LLAVE_DER;
          }
        case 119: break;
        case 48: 
          { tipo=yytext(); return Intentar;
          }
        case 120: break;
        case 15: 
          { return POTENCIA;
          }
        case 121: break;
        case 36: 
          { tipo=yytext(); return Vacio;
          }
        case 122: break;
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
