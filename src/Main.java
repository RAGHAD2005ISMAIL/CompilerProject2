import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // نص تجريبي لـ Spring Controller
        String controllerCode = 
            "@Controller " +
            "public class MyController { " +
            "   public String home(Model model) { " +
            "       model.addAttribute(\"msg\", \"Hello\"); " +
            "       return \"index\"; " +
            "   } " +
            "}";

        // 1. تشغيل الـ Lexer
        SpringGrammarLexer lexer = new SpringGrammarLexer(CharStreams.fromString(controllerCode));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        // 2. تشغيل الـ Parser وبناء الشجرة باستخدام القاعدة الصحيحة controllerFile
        SpringGrammarParser parser = new SpringGrammarParser(tokens);
        ParseTree tree = parser.controllerFile(); 

        // 3. تمرير الشجرة على الـ Visitor الذي أنشأته أداة ANTLR تلقائياً
        SpringGrammarBaseVisitor<Object> visitor = new SpringGrammarBaseVisitor<>();
        visitor.visit(tree);
        
        System.out.println("Parsing Completed Successfully for Tomorrow's Evaluation!");
    }
}