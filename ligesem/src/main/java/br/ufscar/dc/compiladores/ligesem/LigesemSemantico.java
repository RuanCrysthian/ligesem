package br.ufscar.dc.compiladores.ligesem;

public class LigesemSemantico extends LigesemBaseVisitor<Void> {

    int maximoCreditos = 32;
    int totalCreditos = 0;
    int credito = 0;

    @Override
    public Void visitProgram(LigesemParser.ProgramContext ctx) {

        visitBody(ctx.body());
        return null;
    }

    @Override
    public Void visitBody(LigesemParser.BodyContext ctx) {

        if (ctx.info() != null) {
            visitInfo(ctx.info());
        }

        if (!ctx.bloco_disciplina().isEmpty()) {
            for (var b : ctx.bloco_disciplina()) {
                visitBloco_disciplina(b);
            }
        }
        return null;
    }

    @Override
    public Void visitInfo(LigesemParser.InfoContext ctx) {
        if (ctx.TEXTO().size() < 2) {
            LigesemType.adicionarErroSemantico(ctx.stop, " numero de atribuicoes insuficientes para informacoes pessoais proximo a: "+ctx.stop.getText());
        }
        if (Integer.parseInt((ctx.NUMINT().getText())) <= 0 )
            LigesemType.adicionarErroSemantico(ctx.stop, " numero do PERFIL nao pode ser negativo ou igual a zero, proximo a: "+ctx.stop.getText());
        if(ctx.DATA() == null) {
            LigesemType.adicionarErroSemantico(ctx.stop, " necessario informar a DATA, proximo a: "+ctx.stop.getText());
        }
        return null;
    }

    public Void visitBloco_disciplina(LigesemParser.Bloco_disciplinaContext ctx) {
        if (ctx.disciplina() != null) {
            for (var disciplina : ctx.disciplina()) {
                String numintText = disciplina.NUMINT().getText();
                credito = Integer.parseInt(numintText);
            }
        }
        totalCreditos = totalCreditos + credito;
        if (totalCreditos > maximoCreditos) {
            LigesemType.adicionarErroSemantico(ctx.stop, " maximo de creditos atingido proximo a: " + ctx.stop.getText());
        }
        return null;
    }
}
