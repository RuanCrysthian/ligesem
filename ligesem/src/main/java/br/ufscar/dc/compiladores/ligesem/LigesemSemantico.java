package br.ufscar.dc.compiladores.ligesem;

public class LigesemSemantico extends LigesemBaseVisitor<Void> {
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
            LigesemType.adicionarErroSemantico(ctx.stop, " numero de atribuicoes insuficientes para informacoes de pessoais proximo a: "+ctx.stop.getText());
        }
        return null;
    }

    public Void visitBloco_disciplina(LigesemParser.Bloco_disciplinaContext ctx) {
        if (ctx.disciplina() != null) {
            for (var t : ctx.disciplina()) {
                if (t.NOME_DISCIPLINAS() == null) {
                    LigesemType.adicionarErroSemantico(ctx.stop, " disciplina definido de maneira incorreta proximo a: "+ctx.stop.getText());
                }
            }
        }

        return null;
    }
}
