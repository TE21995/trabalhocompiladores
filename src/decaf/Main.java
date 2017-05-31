package decaf;

import java.io.*;
//import antlr.Token;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import java6035.tools.CLI.*;

class Main {
    public static void main(String[] args) {
        try {
        	CLI.parse (args, new String[0]);

        	InputStream inputStream = args.length == 0 ?
                    System.in : new java.io.FileInputStream(CLI.infile);

        	if (CLI.target == CLI.SCAN)
        	{
        		DecafLexer lexer = new DecafLexer(new ANTLRInputStream(inputStream));
        		Token token;
        		boolean done = false;
        		while (!done)
        		{
        			try
        			{
		        		for (token=lexer.nextToken(); token.getType()!=Token.EOF; token=lexer.nextToken())
		        		{
		        			String type = "";
		        			String text = token.getText();

		        			switch (token.getType())
		        			{
                                                case DecafLexer.CHARLIT:
                                                        type = " CHARLITERAL";
                                                        break;
                                                case DecafLexer.STRINGLIT:
                                                        type = " STRINGLITERAL";
                                                        break;
                                                case DecafLexer.ID:
		        				type = " IDENTIFIER";
		        				break;
                                                case DecafLexer.INTLIT:
                                                        type = " INTLITERAL";
                                                        break;
                                                case DecafLexer.BOOLEANLITERAL:
                                                        type = " BOOLEANLITERAL";
                                                        break;
                                               	case DecafLexer.MULT:
                                                       	type = " ";
                                                       	break;
                                                case DecafLexer.DIVI:
                                                        type = " ";
                                                        break;
                                                case DecafLexer.SOMA:
                                                        type = " ";
                                                        break;
                                                case DecafLexer.SUBT:
                                                        type = " ";
                                                        break;
                                                case DecafLexer.REMA:
                                                        type = " ";
                                                        break;
                                                case DecafLexer.BGTOP:
                                                        type = " ";
                                                        break;
                                                case DecafLexer.SMTOP:
                                                        type = " ";
                                                        break;
                                                case DecafLexer.BGEQTOP:
                                                        type = " ";
                                                        break;
                                                case DecafLexer.SMEQTOP:
                                                        type = " ";
                                                        break;
                                                case DecafLexer.ISEQUAL:
                                                        type = " ";
                                                        break;
                                                case DecafLexer.NOTEQUAL:
                                                        type = " ";
                                                        break;
                                                case DecafLexer.CONDAND:
                                                        type = " ";
                                                        break;
                                                case DecafLexer.CONDOR:
                                                        type = " ";
                                                        break;
                                                case DecafLexer.EQU:
                                                        type = " ";
                                                        break;
                                                case DecafLexer.MOREQU:
                                                        type = " ";
                                                        break;
                                                case DecafLexer.LESSEQU:
                                                        type = " ";
                                                        break;
                                               case DecafLexer.LCURLY:
                                                        type = " ";
                                                        break;
                                               case DecafLexer.RCURLY:
                                                        type = " ";
                                                        break;
                                               case DecafLexer.LBAR:
                                                        type = " ";
                                                        break;
                                               case DecafLexer.RBAR:
                                                        type = " ";
                                                        break;
                                               case DecafLexer.LPA:
                                                        type = " ";
                                                        break;
                                               case DecafLexer.RPA:
                                                        type = " ";
                                                        break;
                                               case DecafLexer.PV:
                                                        type = " ";
                                                        break;
                                               case DecafLexer.VIG:
                                                        type = " ";
                                                        break;
                                               case DecafLexer.TKCLASS:
                                                        type = " ";
                                                        break;
                                               case DecafLexer.BOOLEAN:
                                                        type = " ";
                                                        break;
                                               case DecafLexer.BREAK:
                                                        type = " ";
                                                        break;
                                               case DecafLexer.CALLOUT:
                                                        type = " ";
                                                        break;
                                               case DecafLexer.CLASS:
                                                        type = " ";
                                                        break;
                                               case DecafLexer.CONTINUE:
                                                        type = " ";
                                                        break;
                                               case DecafLexer.ELSE:
                                                        type = " ";
                                                        break;
                                               case DecafLexer.FOR:
                                                        type = " ";
                                                        break;
                                               case DecafLexer.INT:
                                                        type = " ";
                                                        break;
                                               case DecafLexer.RETURN:
                                                        type = " ";
                                                        break;
                                               case DecafLexer.VOID:
                                                        type = " ";
                                                        break;
                                               case DecafLexer.IF:
                                                        type = " ";
                                                        break;
                                               case DecafLexer.FALSE:
                                                        type = " ";
                                                        break;
                                               case DecafLexer.TRUE:
                                                        type = " ";
                                                        break;
                                               case DecafLexer.FORPAR:
                                                        type = " ";
                                                        break;
                                               case DecafLexer.EXC:
                                                        type = " ";
                                                        break;

                                                case DecafLexer.LCOMMENT:
                                                        type = " LCOMMENT";
                                                        break;
                                                case DecafLexer.SCOMMENT:
                                                        type = " SCOMMENT";
                                                        break;
                                                case DecafLexer.WS:
                                                        type = " WS";
                                                        break;
						default:
							type = " saagagsag";
							break;

		        			}
		        			System.out.println (token.getLine() + type + " " + text);
		        		}
		        		done = true;
        			} catch(Exception e) {
        	        	// print the error:
        	            System.out.println(CLI.infile+" "+e);
        	            lexer.skip();
        	        }
        		}
        	}
        	else if (CLI.target == CLI.PARSE || CLI.target == CLI.DEFAULT)
        	{
        		DecafLexer lexer = new DecafLexer(new ANTLRInputStream(inputStream));
				CommonTokenStream tokens = new CommonTokenStream(lexer);
        		DecafParser parser = new DecafParser(tokens);
                parser.program();
        	}
        	
        } catch(Exception e) {
        	// print the error:
            System.out.println(CLI.infile+" "+e);
        }
    }
}
