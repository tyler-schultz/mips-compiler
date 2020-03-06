import syntaxtree.Goal;
import visitor.PrettyPrinterVisitor;

public class Typecheck {

  public static void main(String args[]) throws ParseException {

    MiniJavaParser parser = new MiniJavaParser(System.in);
    Goal tree = parser.Goal();
    PrettyPrinterVisitor printer = new PrettyPrinterVisitor();
    printer.visit(tree);
    System.out.println("Program type checked successfully");

  }

}
