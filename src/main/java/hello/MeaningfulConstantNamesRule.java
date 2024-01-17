package hello;

import net.sourceforge.pmd.lang.java.ast.ASTFieldDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTVariableDeclaratorId;
import net.sourceforge.pmd.lang.java.rule.AbstractJavaRule;

public class MeaningfulConstantNamesRule extends AbstractJavaRule {

    @Override
    public Object visit(ASTFieldDeclaration node, Object data) {
        if (isConstant(node) && hasMeaninglessName(node)) {
            addViolation(data, node);
        }
        return super.visit(node, data);
    }

    private boolean isConstant(ASTFieldDeclaration node) {
        return node.isStatic() && node.isFinal();
    }

    private boolean hasMeaninglessName(ASTFieldDeclaration node) {
        ASTVariableDeclaratorId variableDeclaratorId = node.getFirstDescendantOfType(ASTVariableDeclaratorId.class);
        String constantName = variableDeclaratorId.getImage();
        String constantValue = "";//variableDeclaratorId.getType().jjtGetChild(0).getImage();

        return constantName.equalsIgnoreCase(constantValue);
    }
}
