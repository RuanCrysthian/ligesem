package br.ufscar.dc.compiladores.ligesem;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;

public class LigesemType {
  public static List<String> semanticError = new ArrayList<>();

  public static void adicionarErroSemantico(Token t, String mensagem) {
    int linha = t.getLine();
    semanticError.add(String.format("Linha %d: %s", linha, mensagem));
  }
}
