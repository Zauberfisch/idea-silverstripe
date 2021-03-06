// This is a generated file. Not intended for manual editing.
package com.raket.silverstripe.psi;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;

public interface SilverStripeTypes {

  IElementType OUTER_WRAPPER = new SilverStripeElementType("OUTER_WRAPPER");
  IElementType SS_BAD_BLOCK_STATEMENT = new SilverStripeElementType("SS_BAD_BLOCK_STATEMENT");
  IElementType SS_BLOCK_CONTINUE_STATEMENT = new SilverStripeElementType("SS_BLOCK_CONTINUE_STATEMENT");
  IElementType SS_BLOCK_END_STATEMENT = new SilverStripeElementType("SS_BLOCK_END_STATEMENT");
  IElementType SS_BLOCK_SIMPLE_STATEMENT = new SilverStripeElementType("SS_BLOCK_SIMPLE_STATEMENT");
  IElementType SS_BLOCK_START_STATEMENT = new SilverStripeElementType("SS_BLOCK_START_STATEMENT");
  IElementType SS_BLOCK_STATEMENT = new SilverStripeElementType("SS_BLOCK_STATEMENT");
  IElementType SS_COMMENT_STATEMENT = new SilverStripeElementType("SS_COMMENT_STATEMENT");
  IElementType SS_FRAGMENT = new SilverStripeElementType("SS_FRAGMENT");
  IElementType SS_VAR_STATEMENT = new SilverStripeElementType("SS_VAR_STATEMENT");

  IElementType COMMENT = new SilverStripeTokenType("COMMENT");
  IElementType CONTENT = new SilverStripeTokenType("CONTENT");
  IElementType CRLF = new SilverStripeTokenType("CRLF");
  IElementType SS_BAD_VAR = new SilverStripeTokenType("SS_BAD_VAR");
  IElementType SS_BLOCK_END = new SilverStripeTokenType("SS_BLOCK_END");
  IElementType SS_BLOCK_END_START = new SilverStripeTokenType("SS_BLOCK_END_START");
  IElementType SS_BLOCK_SIMPLE_START = new SilverStripeTokenType("SS_BLOCK_SIMPLE_START");
  IElementType SS_BLOCK_START = new SilverStripeTokenType("SS_BLOCK_START");
  IElementType SS_BLOCK_START_START = new SilverStripeTokenType("SS_BLOCK_START_START");
  IElementType SS_BLOCK_VAR = new SilverStripeTokenType("SS_BLOCK_VAR");
  IElementType SS_COMMENT_END = new SilverStripeTokenType("SS_COMMENT_END");
  IElementType SS_COMMENT_START = new SilverStripeTokenType("SS_COMMENT_START");
  IElementType SS_END_KEYWORD = new SilverStripeTokenType("SS_END_KEYWORD");
  IElementType SS_IF_KEYWORD = new SilverStripeTokenType("SS_IF_KEYWORD");
  IElementType SS_SIMPLE_KEYWORD = new SilverStripeTokenType("SS_SIMPLE_KEYWORD");
  IElementType SS_START_KEYWORD = new SilverStripeTokenType("SS_START_KEYWORD");
  IElementType SS_VAR = new SilverStripeTokenType("SS_VAR");
  IElementType SS_VAR_END_DELIMITER = new SilverStripeTokenType("SS_VAR_END_DELIMITER");
  IElementType SS_VAR_START_DELIMITER = new SilverStripeTokenType("SS_VAR_START_DELIMITER");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == OUTER_WRAPPER) {
        return new SilverStripeOuterWrapperImpl(node);
      }
      else if (type == SS_BAD_BLOCK_STATEMENT) {
        return new SilverStripeSsBadBlockStatementImpl(node);
      }
      else if (type == SS_BLOCK_CONTINUE_STATEMENT) {
        return new SilverStripeSsBlockContinueStatementImpl(node);
      }
      else if (type == SS_BLOCK_END_STATEMENT) {
        return new SilverStripeSsBlockEndStatementImpl(node);
      }
      else if (type == SS_BLOCK_SIMPLE_STATEMENT) {
        return new SilverStripeSsBlockSimpleStatementImpl(node);
      }
      else if (type == SS_BLOCK_START_STATEMENT) {
        return new SilverStripeSsBlockStartStatementImpl(node);
      }
      else if (type == SS_BLOCK_STATEMENT) {
        return new SilverStripeSsBlockStatementImpl(node);
      }
      else if (type == SS_COMMENT_STATEMENT) {
        return new SilverStripeSsCommentStatementImpl(node);
      }
      else if (type == SS_FRAGMENT) {
        return new SilverStripeSsFragmentImpl(node);
      }
      else if (type == SS_VAR_STATEMENT) {
        return new SilverStripeSsVarStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
