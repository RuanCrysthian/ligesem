package br.ufscar.dc.compiladores.ligesem;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class App {
  public static void main(String args[]) throws IOException {
    try (PrintWriter pw = new PrintWriter(new File(args[1]))) {
      CharStream cs = CharStreams.fromFileName(args[0]);
      LigesemLexer lexer = new LigesemLexer(cs);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      LigesemParser parser = new LigesemParser(tokens);

      // Instantiate our own custom handler
      parser.removeErrorListeners();
      ErrorHandler mcel = new ErrorHandler(pw);
      parser.addErrorListener(mcel);

      // Parse the code
      LigesemParser.ProgramContext ast = parser.program();
      LigesemSemantico las = new LigesemSemantico();
      las.visitProgram(ast);
      LigesemType.semanticError.forEach(pw::println);

      // generate code
      if (!LigesemType.semanticError.isEmpty()) {
        pw.println("Fim da compilacao");
      } else {
        LigesemGenerator lac = new LigesemGenerator();
        lac.visitProgram(ast);
        try (PrintWriter pwc = new PrintWriter(args[1])) {
          pw.println(lac.out.toString());
        }
      }
    }
  }
}
