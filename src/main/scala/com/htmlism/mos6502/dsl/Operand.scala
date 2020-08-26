package com.htmlism.mos6502.dsl

trait Operand[A] {
  self =>

  def toAddressLiteral(x: A): String

  /**
    * Suitable for comments
    */
  def toShow(x: A): String

  def operandType: OperandType

  /**
    * The value as presented in a `define` declaration (i.e. where no alias is possible)
    */
  def toDefinitionLiteral(x: A): String
}

object Operand {
  implicit val operandInt: Operand[Int] =
    new Operand[Int] {
      val operandType: OperandType =
        ValueLiteral

      def toShow(x: Int): String =
        x.toString

      def toDefinitionLiteral(x: Int): String =
        x.toString

      def toAddressLiteral(x: Int): String =
        String.format("#$%02x", x)
    }
}
