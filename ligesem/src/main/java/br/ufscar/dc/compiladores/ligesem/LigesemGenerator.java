package br.ufscar.dc.compiladores.ligesem;

public class LigesemGenerator extends LigesemBaseVisitor<Void> {
    StringBuilder out;

    public LigesemGenerator() {
        this.out = new StringBuilder();
    }

    // Main visitor
    @Override
    public Void visitProgram(LigesemParser.ProgramContext ctx) {
        out.append("<html>\n" +
                "    <head>\n" +
                "        <title>Disciplinas</title>\n" +
                "        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n" +
                "<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n" +
                "<link href=\"https://fonts.googleapis.com/css2?family=Inconsolata:wght@500&display=swap\" rel=\"stylesheet\">\n" +
                "        <style>\n" +
                "            body {\n" +
                "                background-color: #171714;\n" +
                "                font-family: Inconsolata,monospace;\n" +
                "                letter-spacing: 0!important;\n" +
                "                color: white;\n" +
                "            }\n" +
                "            #page-container {\n" +
                "                padding: 10px;\n" +
                "            }\n" +
                "            .info, .treino-info {\n" +
                "                padding: 5px;\n" +
                "            }\n" +
                "            .info-title, .exercise-title {\n" +
                "                color: #ffd801;\n" +
                "            }\n" +
                "            .exercise-title {\n" +
                "                margin-bottom: 5px;\n" +
                "            }\n" +
                "            .exercise-info,  .type-title {\n" +
                "                color: #ea652c;\n" +
                "            }\n" +
                "            .info-value, .exercise-value, .type-value {\n" +
                "                color: #fffbec;\n" +
                "            }\n" +
                "\n" +
                "            #treino-container {\n" +
                "                margin-top: 30px;\n" +
                "            }\n" +
                "\n" +
                "            .exercise-info {\n" +
                "                margin-left: 30px;\n" +
                "            }\n" +
                "\n" +
                "            .exercicio {\n" +
                "                margin-top: 10px;\n" +
                "            }\n" +
                "        </style>\n" +
                "    </head>\n" +
                "    <body>\n" +
                "        <div id=\"page-container\">\n" +
                "            <div id=\"info-container\">\n" +
                "                <div class=\"info\">\n" +
                "                    <span class=\"info-title\"><strong>Nome</strong>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>");


        visitBody(ctx.body());

        out.append("        </div>\n" +
                "    </body>\n" +
                "</html>");

        return null;
    }

    @Override
    public Void visitBody(LigesemParser.BodyContext ctx) {

        if (ctx.info() != null) {
            visitInfo(ctx.info());
        }

        if (!ctx.bloco_disciplina().isEmpty()) {

            out.append("            <div id=\"treino-container\">\n" +
                    "                <div class=\"treino\">");

            for (var b : ctx.bloco_disciplina()) {
                visitBloco_disciplina(b);
            }

            out.append("                </div>\n" +
                    "            </div>");
        }
        return null;
    }

    @Override
    public Void visitInfo(LigesemParser.InfoContext ctx) {

        out.append("                    <span class=\"info-value\">"+ctx.TEXTO(0).getText()+"</span>\n" +
                "                </div>\n" +
                "                <div class=\"info\">\n" +
                "                    <span class=\"info-title\"><strong>Universidade</strong>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>\n" +
                "                    <span class=\"info-value\">"+ctx.TEXTO(1).getText()+"</span>\n" +
                "                </div>\n" +
                "                <div class=\"info\">\n" +
                "                    <span class=\"info-title\"><strong>Semestre</strong>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>\n" +
                "                    <span class=\"info-value\">"+ctx.NUMINT().getText()+"</span>\n" +
                "                </div>\n" +
                "                <div class=\"info\">\n" +
                "                    <span class=\"info-title\"><strong>Data</strong>&nbsp;&nbsp;</span>\n" +
                "                    <span class=\"info-value\">"+ctx.DATA().getText()+"</span>\n" +
                "                </div>\n" +
                "            </div>");

        return null;
    }

    @Override
    public Void visitBloco_disciplina(LigesemParser.Bloco_disciplinaContext ctx) {

        out.append("            <div id=\"treino-container\">\n" +
                "                <div class=\"treino\">");

        out.append("                    <div class=\"tipo\">\n" +
                "                        <div class=\"treino-info\">\n" +
                "                        </div>\n" +
                "                    </div>");

        if (!ctx.disciplina().isEmpty()) {

            for (var t: ctx.disciplina()) {
                out.append("                    <div class=\"exercicio\">\n" +
                        "                        <div class=\"treino-info\">\n" +
                        "                            <span class=\"exercise-title\">\n" +
                        "                                <strong>"+t.NOME_DISCIPLINAS().getText()+"</strong>\n" +
                        "                            </span>\n" +
                        "                        </div>\n" +
                        "                        <div class=\"treino-info\">\n" +
                        "                            <span class=\"exercise-info\">\n" +
                        "                                <strong>Docente</strong>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n" +
                        "                            </span>\n" +
                        "                            <span class=\"exercise-value\">"+t.TEXTO(0).getText()+"</span>\n" +
                        "                        </div>\n" +
                        "                        <div class=\"treino-info\">\n" +
                        "                            <span class=\"exercise-info\">\n" +
                        "                                <strong>Creditos</strong>&nbsp;&nbsp;&nbsp;&nbsp;\n" +
                        "                            </span>\n" +
                        "                            <span class=\"exercise-value\">"+t.NUMINT().getText()+"</span>\n" +
                        "                        </div>\n" +
                        "                        <div class=\"treino-info\">   \n" +
                        "                            <span class=\"exercise-info\">\n" +
                        "                                <strong>Tipo</strong>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n" +
                        "                            </span>\n" +
                        "                            <span class=\"exercise-value\">"+t.TEXTO(1).getText()+"</span>\n" +
                        "                        </div>\n" +
                        "                    </div>");
            }

            out.append("</div>");
        }



        out.append("                </div>\n" +
                "            </div>");

        return null;
    }
}
